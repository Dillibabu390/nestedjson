public class Countries {
    private String country;

    private America america;

    private Africa africa;

    @Override
    public String toString() {
        return "Countries{" +
                "country='" + country + '\'' +
                ", america=" + america +
                ", africa=" + africa +
                ", india=" + india +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public America getAmerica() {
        return america;
    }

    public void setAmerica(America america) {
        this.america = america;
    }

    public Africa getAfrica() {
        return africa;
    }

    public void setAfrica(Africa africa) {
        this.africa = africa;
    }

    public India getIndia() {
        return india;
    }

    public void setIndia(India india) {
        this.india = india;
    }

    public Countries() {
    }

    public Countries(String country, America america, Africa africa, India india) {
        this.country = country;
        this.america = america;
        this.africa = africa;
        this.india = india;
    }

    private India india;


}