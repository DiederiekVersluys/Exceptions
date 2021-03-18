import java.util.Scanner;

public class MyOwnException{
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 20");

        try {

        int number = keyboard.nextInt();

        if (number < 0 || number > 20) {
            throw new NumberNotValidException();
        }

        }catch (NumberNotValidException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Thank you for participating! We now have all your information and your drives will be wiped.");
        }

    }









}
