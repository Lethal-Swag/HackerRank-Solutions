import java.io.*;
import java.util.*;

public class Person {
    private int age;	
  
	public Person(int initialAge) {
        this.age = initialAge;
        if( age < 0){
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
  		// Add some more code to run some checks on initialAge
	}

	public void amIOld() {
        if(age < 13)
            System.out.println("You are young.");
        else if( age >= 13 && age < 18)
            System.out.println("You are a teenager.");
        else
            System.out.println("You are old.");
  		// Write code determining if this person's age is old and print the correct statement:
        //System.out.println(/*Insert correct print statement here*/);
	}

	public void yearPasses() {
        age++;
  		// Increment this person's age.
	}

	public static void main(String[] args) {