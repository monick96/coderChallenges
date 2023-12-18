
/*
Challenge1
Crear un método main que permita mostrar
 la parte entera y separado la parte decimal
  de un tipo de dato float
*/
public class Main {
    public static void main(String[] args) {
        float floatNumber = 56.9f;
        System.out.println("The float number is : " + floatNumber);

        int integerPart = (int) floatNumber;
        System.out.println("The integer part of the floating number is " + integerPart);

        float floatPart = floatNumber - integerPart;
        System.out.println("The float part of the floating number is " + String.format("%.1f",floatPart));

    }
}