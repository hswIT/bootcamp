package com.bootcamp.demo;

import lombok.NonNull;

public class Staff {
  private String name;
  private Double salary;

  // ! (3) Parameter Annotation => generate exception checking
  // Beware of the compiled class without the field values
  public Staff(@NonNull String name, @NonNull Double salary) {
    this.name = name; // need to write yourself
    this.salary = salary;
  }

  public void work(@NonNull String detail) {
    new Staff("John", 20000.0).work("something");
    new Staff("Peter", 22000.0).work(null); // java.lang.NullPointerException
  }


}
