
package hw4;

public class WorkshopRegistration {
       public void checkAge(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException(
                "Registration denied for " + name + ": Must be at least 18 years old (provided age: " + age + ")"
            );
        }
        System.out.println("Registration successful for " + name + "!");
    }
}

