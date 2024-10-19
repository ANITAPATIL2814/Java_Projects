package Hospital_Management_system;

public class hospital_main {
	 public static void main(String[] args) {
	        Doctor surgeon = new Surgeon("Dr. ABc", "Surgery", 5);
	        Doctor gp = new GeneralPractitioner("PQR", "General Practice", 4);

	        // Polymorphism in action
	        surgeon.diagnose();  
	        gp.diagnose();       

	        // Downcasting to access specific methods
	        if (surgeon instanceof Surgeon) {
	            ((Surgeon) surgeon).performSurgery();  
	        }

	        if (gp instanceof GeneralPractitioner) {
	            ((GeneralPractitioner) gp).provideConsultation();  
	        }
	 }
}
