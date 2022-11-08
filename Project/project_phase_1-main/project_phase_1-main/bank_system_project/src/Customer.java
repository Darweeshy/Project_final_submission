import java.util.Date;

public class Customer extends Person {
    public String address;
    public int sourceofincome;

    public Customer() {
    }

    public Customer(String name, int id, String dob, String employment , int sourceofincome , String address) {
        super(name , id , dob , employment);
        this.sourceofincome = sourceofincome;
        this.address = address;

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
