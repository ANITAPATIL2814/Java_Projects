package Hospital_Management_system;

//GeneralPractitioner subclass inheriting from Doctor

public class GeneralPractitioner extends Doctor {
	// Constructor
    public GeneralPractitioner(String name, String specialization, int experience) {
        super(name, specialization, experience);  // Calling parent class constructor
    }

    public void provideConsultation() {
        System.out.println(name + " is providing a routine consultation.");
    }
}
