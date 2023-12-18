
/*
Challenge1
Crear un método main que permita mostrar
 la parte entera y separado la parte decimal
  de un tipo de dato float
*/
public class numeroFlotanteMelgarejo {
    public static void main(String[] args) {
        //declare the floating number
        float floatNumber = 56.9f;

        //print floating number
        System.out.println("The float number is : " + floatNumber);

        //separate the integer part of the floating number
        int integerPart = (int) floatNumber;

        //print casting float to integer result
        System.out.println("The integer part of the floating number is " + integerPart);

        //We subtract the integer part from the floating number
        // to obtain the floating part of the number
        float floatPart = floatNumber - integerPart;

        //We print the value of the floating part of the
        // number formatted to show a number after the comma
        System.out.println("The float part of the floating number is " + String.format("%.1f",floatPart));

    }
}