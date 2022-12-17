public class ExampleClass {
    public static void main(String[] args) {

        Countries countries = new Countries();
        countries.setCountry("countries");

        America america = new America();
        america.setKey("americakey");
        america.setValue("americaValue");
        countries.setAmerica(america);

        Africa africa = new Africa();
        america.setKey("africakey");
        america.setValue("africavalue");
        countries.setAfrica(africa);

        India india = new India();
        india.setKey("indiakey");
        india.setValue("indiavalue");
        countries.setIndia(india);

        System.out.println(countries);

    }
}
