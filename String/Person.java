// Immutable Class Example 

import java.util.Scanner;

public final class Person { 
    private final String name; 
    private final int age; 
 
    // Constructor to initialize fields 
    public Person(String name, int age) { 
        this.name = name; 
        this.age = age; 
    } 
 
    // Getter methods to access fields 
    public String getName() { 
        return name; 
    } 
 
    public int getAge() { 
        return age; 
    } 
 
    // No setter methods, so values can't be changed after object creation
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        Person p = new Person(name,age);
      System.out.println(p.getName());
    }
}