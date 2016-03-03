package Logic;

public class NormalkraftImpl implements Normalkraft {

	private double normalkraft = 0;
	
	@Override
	public double getNormalkraft() {
		DimensionerendeKraft dimensionerendeKraft = new DimensionerendeKraftImpl();
		Vinkel vinkel = new VinkelImpl();

		normalkraft = Math.sin(vinkel.getVinkel()) * dimensionerendeKraft.getDimensionerendeKraft();

		return normalkraft;
	}

	@Override
	public void setNormalkraft(double normalkraft) {
		this.normalkraft = normalkraft;
		
	}
	
	@Override
	public void nulstil() {
		setNormalkraft(0);
		
	}

}
