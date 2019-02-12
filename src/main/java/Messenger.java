import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Properties;
import java.util.concurrent.Future;

public class Messenger {

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers", Kafka.Cluster.value);
        props.put("acks", "all");
        props.put("delivery.timeout.ms", 3000);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1500);
        props.put("request.timeout.ms", 1500);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        Producer<String, String> producer = new KafkaProducer(props);
        if (null == producer) {throw new RuntimeException("Unable to create producer");}
        System.out.println("Got Producer");

        try {
            Future<RecordMetadata> send = producer.send(new ProducerRecord<String, String>(Kafka.TfbBan.value, "key", "value"));
            if(send.isDone())
                System.out.println("Message Sent");
            System.out.println("Timestamp : " + send.get().timestamp());
        }catch (Exception e){
            System.out.println("Message Sending Failed");
            e.printStackTrace();
        } finally {
            producer.close();
            System.out.println("Terminated Producer");
        }
    }
}
