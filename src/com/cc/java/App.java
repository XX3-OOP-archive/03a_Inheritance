package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat = new Cat("Grizabella", "white", 29); // Klasse --> Objekt / Instanz
        
        output("Name: " + cat.getStringAttributes("#name"));
        output("Fellfarbe: " + cat.getStringAttributes("#color"));

        output("Alter: " + cat.getAge());
        output("Alter: " + cat.getAge());
        output("Alter: " + cat.getAge());
        output("Alter: " + cat.getAge());

        output("------------------------");

        Tomcat tomcat = new Tomcat("Alonzo", "black", 35); // Klasse --> Objekt / Instanz
   
        output("Name: " + tomcat.getStringAttributes("#name"));
        output("Fellfarbe: " + tomcat.getStringAttributes("#color"));

        output("Alter: " + tomcat.getAge());

    }

    public static void output(String outputStr){
        System.out.println(outputStr);
    }

}
