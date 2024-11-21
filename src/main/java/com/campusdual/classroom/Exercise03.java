package com.campusdual.classroom;

public class Exercise03 {

    // Esto es una funcion, ya que devuelve un valor
    // TODO ↓: Tiene que devolver el siguiente mensaje: "Hola. Bienvenido " y la cadena de textos que se le pasa por parámetro.
    public static String greetings(String name) {
        String txt = "Hola. Bienvenido " + name;
        return txt;
    }

    // Esto es una funcion, ya que devuelve un valor
    // TODO ↓: Tiene que devolver el siguiente mensaje: "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " y la cadena de texto que se le pasa por parámetro
    public static String error(String nombre) {
        String txt = "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " + nombre;
        return txt;
    }

    //Esto es un procedimiento, ya que no devuelve un valor
    // TODO ↓: Tiene que comprobar si el usuario que recibe por parámetro es "Sebas" y su contraseña es "sebas01". Si es correcto, que muestre el mensaje de la función greetings() y si no que muestre el mensaje de la función error()
    public static void checkUser(String user, String pass) {
        if(user == "Sebas" && pass == "sebas01"){
            System.out.println(greetings(user));
        } else {
            System.out.println(error(user));
        }
    }


    public static void main(String[] args) {
        String name = "Vero";
        System.out.println(greetings(name));

        String nombre = "Pepito";
        System.out.println(error(nombre));

        String user = "Sebas";
        String pass = "sebas01";
        checkUser(user,pass);

    }
}
