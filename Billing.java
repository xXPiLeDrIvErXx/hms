public class Billing {
   
   double amount;

	static double[] computePaymentAmount(Patient patient, double amount) {
		double [] payments = new double[2];
		
		HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();
		
		
		
		payments[0] = amount * patientInsurancePlan.getCoverage();
		payments[1] = (amount - payments[0])-patientInsurancePlan.getDiscount();
	
		return payments;
	}

}