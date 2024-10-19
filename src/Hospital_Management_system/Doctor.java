package Hospital_Management_system;

public class Doctor {
	protected String name;
    protected String specialization;
    protected int experience;

    // Constructor
    public Doctor(String name, String specialization, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
    }
    public void diagnose() {
        System.out.println(name + " is diagnosing a patient.");
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getExperience() {
        return experience;
    }
}
