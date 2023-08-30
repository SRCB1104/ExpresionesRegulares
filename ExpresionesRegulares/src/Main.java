import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        String cadena = args[0];
        String input = ".*Hola mundo.*";
        String input2 = ".*(?i)Hola mundo.*";
        String input3 = "(Java|Python|Go|Pascal|Perl)";
        String input4 = "^[A-Za-z0-9._%+-]+@(unison\\.mx|uson\\.mx)$";
        String input5 =  "^ISI\\d{4}-(1|2)\\.(txt|csv)$";


        System.out.println("Con cual lo quiere intentar?");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        boolean isMatch;

        switch (n){
            case 1:
                isMatch = Pattern.matches(cadena, input);
                if(isMatch){
                    System.out.println("La cadena es valida.");
                }else {
                    System.out.println("La cadena no es valida");
                }
                break;
            case 2:
                isMatch = Pattern.matches(cadena, input2);
                if(isMatch){
                    System.out.println("La cadena es valida.");
                }else {
                    System.out.println("La cadena no es valida");
                }
                break;
            case 3:
                isMatch = Pattern.matches(cadena, input3);
                if(isMatch){
                    System.out.println("La cadena es valida.");
                }else {
                    System.out.println("La cadena no es valida");
                }
                break;
            case 4:
                isMatch = Pattern.matches(cadena, input4);
                if(isMatch){
                    System.out.println("La cadena es valida.");
                }else {
                    System.out.println("La cadena no es valida");
                }
                break;
            case 5:
                isMatch = Pattern.matches(cadena, input5);
                if(isMatch){
                    System.out.println("La cadena es valida.");
                }else {
                    System.out.println("La cadena no es valida");
                }
                break;
            default:
                System.out.println("Introduce un numero valido");
                break;
        }
    }
}