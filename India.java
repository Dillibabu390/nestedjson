public class India {
    private String key;
    private String value;

    public India(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public India() {

    }

    @Override
    public String toString() {
        return "India{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
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

    public void setValue(String value) {
        this.value = value;
    }
}
