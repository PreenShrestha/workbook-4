package pluralsight.hotel;

import java.time.LocalDate;
import java.util.List;

public class Reservation {
    public Reservation() {
    }

    public Reservation( Guest guest, RoomType roomType, int numberOfNights, boolean isWeekend, Charge price) {
        //this.start = start;
        //this.end = end;
        this.requestedType = roomType;
        this.guest = guest;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.price = price;
    }


    LocalDate start;
    LocalDate end;
    Guest guest;
    RoomType requestedType;

    int numberOfNights;

    boolean isWeekend;

    Charge price;

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public Charge getPrice() {
        return price;
    }

    public RoomType getRequestedType() {
        return requestedType;
    }

    public void setRequestedType(RoomType requestedType) {
        this.requestedType = requestedType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void getReservationTotal(){

        //charge if king and number of nights = total
        //charge if double and number of nights = total

        Charge charge1;
    }

    public static void main(String[] args){

       // LocalDate new = LocalDate.new();
        Reservation r = new Reservation(new Guest("Paul","123 Street"), new RoomType("King"), 5, true, new Charge(500, "something"));
        System.out.println(r);
    }

    // The following fields are assigned when the guest checks in
    Room room = null;
    Folio folio = null;
    List<RoomKey> keys = null;

    @Override
    public String toString() {
        return "Reservation{" +
                "guest=" + guest +
                ", requestedType=" + requestedType +
                ", numberOfNights=" + numberOfNights +
                ", isWeekend=" + isWeekend +
                ", price=" + price +
                '}';
    }
}
