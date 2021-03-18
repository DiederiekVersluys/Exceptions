import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        try {

            int num = Integer.parseInt(keyboard.next());
            int den = Integer.parseInt(keyboard.next());
            int div = num / den;

            System.out.format("%d/%d=%d", num, den, div);
            keyboard.close();
       }
//
//        catch (NumberFormatException nfe) {
//            System.out.println("Invalid number");
//        }catch (ArithmeticException ae){
//            System.out.println("Division by 0");
//        }


//            catch (RuntimeException re) {
//                System.out.println("Invalid input!");
//            }

        catch (NumberFormatException|ArithmeticException t){
            System.out.println("Invalid Input!");
        }
        finally {
            keyboard.close();
            System.out.println("The end");

        }




    }
}
