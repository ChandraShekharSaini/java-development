

public class InvalidException extends  Exception {

    //Default Constructor
    public InvalidException() {
        super("Default Exception Message");
    }

    //parameterized constructor
    public InvalidException(String message) {
           super(message);
    }

}
