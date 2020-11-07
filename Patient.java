public class Patient {
HealthInsurancePlan insurancePlan;
private long patientId;
private boolean insured;

//patientID
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

//insured
	public boolean isInsured() {
		return true;
	}
	public void setInsured(boolean a) {
		a = true;
	}
	
//setter

void setInsurancePlan(HealthInsurancePlan insurancePlan) {
	this.insurancePlan = insurancePlan;
}

//getter
HealthInsurancePlan getInsurancePlan() {
	return insurancePlan;
}

public static void main(String[] args) {
	
	HealthInsurancePlan insurancePlan = new PlatinumPlan();
	
	Patient patient = new Patient();
	patient.setInsurancePlan(insurancePlan);
	insurancePlan.setCoverage(0);
	insurancePlan.setDiscount(0);
	
	double[] payments = Billing.computePaymentAmount(patient, 5000.0);
	
	
	System.out.println("Patient pays - $"+payments[1]);
	//System.out.println("discounted amount - $"+patientInsurancePlan.getDiscount());
	System.out.println("Insurance company pays - $"+payments[0]);
	
}
}