public class America {
    private String key;
    private String value;

    public America(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public America() {

    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "America{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public void setValue(String value) {
        this.value = value;
    }
}
