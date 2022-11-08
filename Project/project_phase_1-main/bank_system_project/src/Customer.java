public class Customer extends Person {
    private String address;
    private int sourceofincome;

    public Customer() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSourceofincome() {
        return sourceofincome;
    }

    public void setSourceofincome(int sourceofincome) {
        this.sourceofincome = sourceofincome;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", sourceofincome=" + sourceofincome +
                '}';
    }
}
