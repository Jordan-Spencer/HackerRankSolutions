/* Write a Person class with an instance variable, age, and a constructor
that takes an integer, initialAge, as a parameter. The constructor must
assign initialAge to age after confirming the argument passed as initialAge
is not negative; if a negative argument is passed as initialAge, the
constructor should set age to 0 and print Age is not valid, setting age to 0..

In addition, you must write the following instance methods:
  1. yearPasses() should increase the age instance variable by 1.
  2. amIOld() should perform the following conditional actions:
      a. If age < 13, print You are young..
      b. If age >= 13 and age < 18, print You are a teenager..
      c. Otherwise, print You are old.. */

      public class Person {
          private int age;

      	public Person(int initialAge) {
        		if (initialAge < 0) {
                    age = 0;
                    System.out.println("Age is not valid, setting age to 0.");
                }
              else {
                  age = initialAge;
              }
      	}

      	public void amIOld() {
        		if (age < 13) {
                  System.out.println("You are young.");
                }
              else if (age >= 13 && age < 18) {
                  System.out.println("You are a teenager.");
              }
              else if (age >= 18) {
                  System.out.println("You are old.");
              }
      	}

      	public void yearPasses() {
        		age++;
      	}
