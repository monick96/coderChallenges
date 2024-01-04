package practice;

import java.util.ArrayList;
import java.util.List;

//Creación, llenado y recorrido de una lista
/*

Generar un programa que cree una lista, se complete con 10 números aleatorios y la recorra hasta el final
 o hasta que encuentre un número múltiplo de 3.
Se recomienda utilizar los temas vistos en las clases pasadas sobre datos aleatorios y operadores aritméticos.
El objetivo es que puedan aprender a manipular listas.

*/
public class listManipulation {
    public static void main(String[] args) {
        //declare the list empty
        List<Integer> numList= new ArrayList<>();

        //declare random to add nums to numList
        // Define the range
        int startRange = 1;
        int endRange = 100;

        // Calculate a random integer in the range [startrange, endrange]
        while (numList.size() < 10){
            int randomNumber = (int) (Math.random() * (endRange - startRange + 1)) + startRange;
            numList.add(randomNumber);
        }

        //print results
        for(int num:numList){
            if (num % 3 == 0){
                System.out.println(num + " is a multiple of 3" );
                break;
            }else {
                System.out.println(num);
            }

        }

    }
}
