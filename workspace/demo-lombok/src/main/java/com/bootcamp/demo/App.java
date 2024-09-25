package com.bootcamp.demo;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //Stream stream = List.of("abc", "ddd").stream(); // Java 8

        Book book = new Book();
        book.setAuthor("John");
        book.setId(1);
        book.setPrice(10.0);
        System.out.println(book.getAuthor());
        System.out.println(book.getPrice());
        System.out.println(book.getId());

        System.out.println(book); // Book(id=1, author=Vincent, price=30.1)
        Book book2 = new Book(2, "Vincent", 11.99);
        System.out.println(book2);
        Book book3 = Book.builder() //
            .author("Sally") //
            .id(2) //
            .price(99.9) //
            .build();
        System.out.println(book3);
        
    }
}
// What we learn from JDK
// laptop JDK 17 => javac uses JDK 17
// vscode extension JDK => it corresponds to laptop JDK
// laptop Maven -> JDK 17 (which is the default of SDK)
// Maven project pom -> can choose Java compiler 1.5
// if using Maven compiler, need to be at the folder level of where the pom is

// Maven Cycle
// mvn clean -> clear the target folder
// mvn compile -> compile all java files under main folder
// mvn test compile -> include "compile" step, include main and test folders

// Library
// 1) Implicitly imported (JDK java.lang) - i.e. StringBuilder.class
// 2) Explicitly imported (JDK java.util) - i.e. BigDecimal.class
// 3) External Library - Beyond JDK (lombok), i.e. @Getter

// When initializing an maven java project, it preloads JDK Library under java.lang


// Vscode "Run" button
// -> call "javac" command (JDK 17) to compile (to class file under another path)
// -> run the class file by java command
// -> finally, delete the class file under that path
