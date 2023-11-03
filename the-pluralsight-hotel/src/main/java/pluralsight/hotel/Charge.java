package pluralsight.hotel;

public class Charge {
    double amount;
    String description;

    public Charge(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Charge{" +
                "amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}
