public class NumberNotValidException extends Exception {

    public NumberNotValidException(){
        super("Invalid number. It should be between 0 and 20!");

    }

    public NumberNotValidException(String message){
        super(message);
    }


}
