
package hw4;

public class Hw4 {

    public static void main(String[] args) {
      
        WorkshopRegistration workshop = new WorkshopRegistration();
        
        try {
            workshop.checkAge("Ahmed", 16);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
