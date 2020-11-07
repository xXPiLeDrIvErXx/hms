public class HealthInsurancePlan {
    private InsuranceBrand offeredBy;
	double coverage ;
	int discount;
	
	//coverage
	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}
	
	public double getCoverage () {
		return coverage;
	}
	
	//discount
	public void setDiscount(int discount) {
		this.discount = 20;
	}
	
	public int getDiscount () {
		return discount;
	}
	
	//Insurancebrand	
	public InsuranceBrand getOfferedBy() {
			
		return offeredBy;
	}
	
	public void setOfferedBy (InsuranceBrand offeredBy) {
		this.offeredBy = offeredBy;
	}
}