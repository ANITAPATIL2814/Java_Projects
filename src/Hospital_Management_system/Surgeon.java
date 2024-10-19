package Hospital_Management_system;
//Surgeon subclass inheriting from Doctor
public class Surgeon extends Doctor{
	// Constructor
    public Surgeon(String name, String specialization, int experience) {
        super(name, specialization, experience);  // Calling parent class constructor
    }
    public void performSurgery() {
        System.out.println(name + " is performing surgery.");
    }
}
