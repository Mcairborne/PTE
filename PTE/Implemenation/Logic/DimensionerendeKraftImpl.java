package Logic;

class DimensionerendeKraftImpl implements DimensionerendeKraft {

	private double dimensionerendeKraft = 0;
	private double vaegt;
	private double tyngdekraft;

	public DimensionerendeKraftImpl(double vaegt, double tyngdekraft){
		this.vaegt = vaegt;
		this.tyngdekraft = tyngdekraft;
	}
	
	
	@Override
	public double getDimensionerendeKraft() {
		dimensionerendeKraft = vaegt * tyngdekraft;
		return dimensionerendeKraft;
	} 

	@Override
	public void setDimensionerendeKraft(double dimensionerendeKraft) {
		this.dimensionerendeKraft = dimensionerendeKraft;
	}

	@Override
	public void nulstil() {
		vaegt = 0;
		tyngdekraft = 0;
	}

}
