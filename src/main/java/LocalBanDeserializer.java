import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tmobile.b2b.experienceadapter.kafkatopics.outbound.GenericBanDetails;
import org.apache.kafka.common.serialization.Serializer;

import java.io.IOException;
import java.util.Map;

public class LocalBanDeserializer implements Serializer<LocalGenericBanDetails> {


    public LocalGenericBanDetails deserialize(String arg0, byte[] arg1) {
        ObjectMapper mapper = new ObjectMapper();
        LocalGenericBanDetails genericBanDetails = null;
        try {
            genericBanDetails = mapper.readValue(arg1, LocalGenericBanDetails.class);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return genericBanDetails;
    }


    public void configure(Map<String, ?> map, boolean b) {

    }

    public byte[] serialize(String s, LocalGenericBanDetails genericBanDetails) {
        byte[] retVal = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            retVal = objectMapper.writeValueAsString(genericBanDetails).getBytes();
            dese(retVal);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retVal;
    }

    public void close() {

    }

    private void dese(byte[] data) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            objectMapper.readerFor(LocalGenericBanDetails.class).readValue(data);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }

    }
}