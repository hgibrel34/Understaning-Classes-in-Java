// peer review code
public class Destination {
    private String city, state;
    private int zipcode;

    public Destination(String city, String state, int zipcode) { this.city = city; this.state = state; this.zipcode = zipcode; }
    public Destination() { this("Annandale", "Virginia", 22003); }

    public String getCity() { return city; }
    public String getState() { return state; }
    public int getZipcode() { return zipcode; }

    public void setCity(String c) { city = c; }
    public void setState(String s) { state = s; }
    public void setZipcode(int z) { zipcode = z; }

    // Equal if same city, state, and zipcode
    public boolean equals(Destination other) { return city.equals(other.city) && state.equals(other.state) && zipcode == other.zipcode; }

    public String toString() { return city + ", " + state + ", " + zipcode; }
}
