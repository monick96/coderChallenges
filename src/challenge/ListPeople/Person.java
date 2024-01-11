package challenge.ListPeople;

/*
Consigna

-Deberán crear la clase persona que tiene como atributos nombre y apellido, ambos de tipo String;
la clase tiene sus métodos getters y setters para cada atributo.

-Deberán crear una segunda clase donde estará el método main como lo conocemos. Creen 5 objetos:
 Personas con nombres y apellidos aleatorios, es importante que sean nombres y apellidos en español.

 -Teniendo los 5 objetos, agregarlos a una lista.

-Crear la lógica para ordenar alfabéticamente la lista y mostrar en consola de acuerdo al siguiente criterio:
    -Ordenado por nombre.
    -Ordenado por apellido.
    -Ordenado inversamente por apellido.

*/
public class Person {
    //properties
    private String name;
    private String lastName;

    //constructor
    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    //accessors
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
