public class InvalidAmountException extends Throwable {
    public InvalidAmountException(String invalidAmount) {
        super(invalidAmount);
    }
}