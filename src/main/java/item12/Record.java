package item12;

/**
 * Replace Record with Data Class
 * aka POJO
 */
public class Record {
    private final String record;

    public Record(String record) {
        this.record = record;
    }

    public String getRecord() {
        return record;
    }
}
