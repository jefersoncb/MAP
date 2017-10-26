public abstract class CapitalStrategy 
{	
	private double duration;
	private double riskFactorFor;
	
	public double duration(Loan loan) 
    {
		return duration;
	}
	
	protected double riskFactorFor(Loan loan)
    {
		 return riskFactorFor;
	}
	
	public abstract double capital(Loan loan);
}