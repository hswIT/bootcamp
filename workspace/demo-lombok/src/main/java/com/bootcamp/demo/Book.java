package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Java Developer: Have to 100% understand the generated code after compile

// Maven 
  // re-define compile process:
  // 1. "mvn clean compile" -> check if any External annotation (outside JDK) is used
  // 2. if yes, re-generate the java source code (java file)
  // 3. Compile class file (byte code)

@Getter // class level annotation, apply for all attributes
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@ToString(exclude = {"author", "price"})
@ToString
@EqualsAndHashCode(exclude = {"id", "author"})
public class Book {

 
  private int id;
  private String author;
  private double price;

  public static void main(String[] args) {

    Book book = new Book(1, "John", 99.9);
    System.out.println(book);
    Book bookBraden = Book.builder()
        .author("Braden")
        .id(2)
        .price(99.9)
        .build();
    System.out.println(bookBraden);
    System.out.println(book.hashCode() == bookBraden.hashCode());

  }

}