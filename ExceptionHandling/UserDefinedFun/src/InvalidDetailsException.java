public class InvalidDetailsException extends Exception {

    String msg;

    public InvalidDetailsException (String msg) {
        super(msg);

        this.msg = msg;
    }


    //Override getMessage method of Throwable class
     @Override
    public String getMessage() {
        return msg;
    }
}
