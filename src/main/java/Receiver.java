import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Arrays;
import java.util.Properties;

public class Receiver {

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers", Kafka.Cluster.value);
        props.put("group.id", "EntitlementDevConsumerClient");
        props.put("enable.auto.commit", "true");
        props.put("auto.commit.interval.ms", "1000");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        KafkaConsumer<String, String> consumer = new KafkaConsumer(props);
        consumer.subscribe(Arrays.asList(Kafka.TfbMsisdn.value));
        if (null == consumer) {throw new RuntimeException("Unable to create Receiver");}
        System.out.println("Got Receiver");

        try {
            while (true) {
                System.out.print("-");
                ConsumerRecords<String, String> records = consumer.poll(1000);
                if (records.count() > 0 ) {
                    for (ConsumerRecord<String, String> record : records) {
                        System.out.println();
                        System.out.printf("offset = %d, key = %s, value = %s%n", record.offset(), record.key(), record.value());
                    }
                }
            }
        }catch (Exception e){
            System.out.println("Receiver Failed");
            e.printStackTrace();
        }finally {
            consumer.close();
            System.out.println("Terminated Receiver");
        }
    }
}
