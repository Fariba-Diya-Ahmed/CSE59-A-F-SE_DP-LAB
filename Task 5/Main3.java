class Patient {
    private String patientName;
    private String nationalId;


    public Patient(String patientName, String nationalId) {

        this.patientName = patientName;
        this.nationalId = nationalId;

    }

    public String getPatientName(){
        return patientName;
    }
     public String getNationalID(){
        return nationalId;
    }
}

class IDvalidator {
    public boolean validateID(String nationalID){
        return nationalID.length() == 10 || nationalID.length() == 17;
    }
}

class SMSservice {
    public boolean sendSMSconfirmation(Patient p){
        System.out.println("Sending SMS confirmation to " + p.getPatientName() + " with ID: " + p.getNationalID());
        return true;
    }
}

public class Main3{
    public static void main(String[] args) {
        
        Patient p1 = new Patient("Fariba", "2321152292");

        IDvalidator validator = new IDvalidator();

        SMSservice sms = new SMSservice();

        if(validator.validateID(p1.getNationalID())){
            sms.sendSMSconfirmation(p1);
        } else {
            System.out.println("Invalid patient ID");
        }
    }
}
