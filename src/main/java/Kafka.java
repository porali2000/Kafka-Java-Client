public enum Kafka {
    TfbBan("TfbBan"),
    TfbMsisdn("TfbMsisdn"),
    Cluster("10.65.61.174:9092");
    Kafka(String value){
        this.value = value;
    }
    String key;
    String value;
}
