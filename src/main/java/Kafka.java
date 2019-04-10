public enum Kafka {
    TfbBan("TfbBan"),
    TfbMsisdn("TfbMsisdn"),
    Cluster( "qa3.confluent-kafka1.tfb.ccp.t-mobile.com:9092");
    Kafka(String value){
        this.value = value;
    }
    String key;
    String value;
}
