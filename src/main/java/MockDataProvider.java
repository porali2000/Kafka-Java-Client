import com.tmobile.b2b.experienceadapter.kafkatopics.outbound.GenericBanDetails;

public class MockDataProvider {
    public static GenericBanDetails validBanDetails() {
        return  new GenericBanDetails(
               "949680001",
                "B",
                "C",
                "C",
                "2019-02-11T00:00:00Z",
                "1-560X-2518",
                "2019-02-12T02:38:37.933Z",
                "false",
                "accountLinkedtoCCID",
                "2019-02-13T06:36:40.916Z",
                "55280572-d4a1-4d6f-81ec-dca2204d6904",
                "Messenger",
                "1-55-4567"
        );
    }

    public static LocalGenericBanDetails validLocalBanDetails() {
        return  new LocalGenericBanDetails(
                "949680001",
                "B",
                "C",
                "C",
                "2019-02-11T00:00:00Z",
                "1-560X-2518",
                "2019-02-12T02:38:37.933Z",
                "false",
                "accountLinkedtoCCID",
                "2019-02-13T06:36:40.916Z",
                "55280572-d4a1-4d6f-81ec-dca2204d6904",
                "Messenger",
                "1-55-4567"
        );
    }
}
