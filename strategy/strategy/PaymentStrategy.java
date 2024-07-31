package strategy.strategy;

public interface PaymentStrategy {
    void collectPayementDetails();

    boolean validatePaymentdetails();

    void pay(int amount);
}
