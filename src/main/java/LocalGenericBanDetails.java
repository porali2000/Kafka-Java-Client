//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


import com.fasterxml.jackson.annotation.JsonProperty;

public class LocalGenericBanDetails {
    @JsonProperty("banNumber")
    public String banNumber;
    @JsonProperty("accountType")
    public String accountType;
    @JsonProperty("accountSubType")
    public String accountSubType;
    @JsonProperty("banStatus")
    public String banStatus;
    @JsonProperty("statusDateTime")
    public String statusDateTime;
    @JsonProperty("ccid")
    public String ccid;
    @JsonProperty("lastUpdateDateTime")
    public String lastUpdateDateTime;
    @JsonProperty("sourceRecordDeleted")
    public String sourceRecordDeleted;
    @JsonProperty("eventType")
    public String eventType;
    @JsonProperty("publishDateTime")
    public String publishDateTime;
    @JsonProperty("eventId")
    public String eventId;
    @JsonProperty("eventProducer")
    public String eventProducer;
    @JsonProperty("mccid")
    public String masterccid;

    public LocalGenericBanDetails() {}

    public LocalGenericBanDetails(String banNumber, String accountType, String accountSubType, String banStatus, String statusDateTime, String ccid, String lastUpdateDateTime, String sourceRecordDeleted, String eventType, String publishDateTime, String eventId, String eventProducer, String mccid) {
        this.banNumber = banNumber;
        this.accountType = accountType;
        this.accountSubType = accountSubType;
        this.banStatus = banStatus;
        this.statusDateTime = statusDateTime;
        this.ccid = ccid;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.sourceRecordDeleted = sourceRecordDeleted;
        this.eventType = eventType;
        this.publishDateTime = publishDateTime;
        this.eventId = eventId;
        this.eventProducer = eventProducer;
        this.masterccid = mccid;
    }

}
