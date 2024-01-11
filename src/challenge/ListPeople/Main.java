package challenge.ListPeople;

import java.util.*;

/* -Deberán crear una segunda clase donde estará el método main como lo conocemos. Creen 5 objetos:
 Personas con nombres y apellidos aleatorios, es importante que sean nombres y apellidos en español.

 -Teniendo los 5 objetos, agregarlos a una lista.

-Crear la lógica para ordenar alfabéticamente la lista y mostrar en consola de acuerdo al siguiente criterio:
    -Ordenado por nombre.
    -Ordenado por apellido.
    -Ordenado inversamente por apellido.
*/


public class Main {
    public static void main(String[] args) {
        //instantiation of the 5 person-type objects
        Person person1 = new Person("Mariano","Ramirez");

        Person person2 = new Person("Marian","Suarez");

        Person person3 = new Person("Fabiana","Rojas");

        Person person4 = new Person("Tomas","Alonzo");

        Person person5 = new Person("Sonia","Perez");

        //add people type objects to a list (listOfPeople)
        List <Person> listOfPeople = new ArrayList<>();

        listOfPeople.add(person1);
        listOfPeople.add(person2);
        listOfPeople.add(person3);
        listOfPeople.add(person4);
        listOfPeople.add(person5);

        // Sort the list alphabetically by name
        listOfPeople.sort(Comparator.comparing(Person::getName));

        //print list order alphabetically by name
        System.out.println("List of people arranged alphabetically by name");

        for (Person person:listOfPeople){
            System.out.println("Name: " + person.getName() + ", LastName: " + person.getLastName());
        }

        // Sort the list alphabetically by lastName
        listOfPeople.sort(Comparator.comparing(Person::getLastName));

        //print list order alphabetically by lastName
        System.out.println(" ");
        System.out.println("List of people arranged alphabetically by lastname");
        for (Person person:listOfPeople){
            System.out.println("Name: " + person.getName() + ", LastName: " + person.getLastName());
        }

        // Sort the list alphabetically inversely by lastName
        listOfPeople.sort(Comparator.comparing(Person::getLastName).reversed());

        //print list order alphabetically inversely by lastName
        System.out.println(" ");
        System.out.println("List of people arranged alphabetically inversely by lastname");
        for (Person person:listOfPeople){
            System.out.println("Name: " + person.getName() + ", LastName: " + person.getLastName());
        }



    }
}
