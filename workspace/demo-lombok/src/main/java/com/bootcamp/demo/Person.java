package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;


// !!! (1) Class annotation
@Data // @RequiredArgsConstructor => look for @NonNull
// @AllArgsConstructor // overrider @RequiredArgsConstructor
public class Person {
  // !! (2) Annotation on attribute level 
  @NonNull  // runtime checking on Constructor + Setter
  private String name; // non-nullable

  private String emailAddress; // nullable

  public static void main(String[] args) {

    Person p = new Person("John");
    System.out.println(p); // Person(name=John, emailAddress=null)

    Person p2Person = new Person(null);
    //  java.lang.NullPointerException: name is marked non-null but is null

  }

  
}
