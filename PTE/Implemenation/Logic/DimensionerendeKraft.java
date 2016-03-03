package Logic;

class DimensionerendeKraftImpl implements DimensionerendeKraft {

	@Override
	public double getDimensionerendeKraft() {
		Vaegt vaegt = new VaegtImpl();
		
		double dimensionerende = vaegt.getVaegt() * Tyngdekraft.getTyngdekraft();
		
		return dimensionerende;
	}

	@Override
	public void setDimensionerendeKraft(double dimensionerendeKraft) {
		
	}

	@Override
	public void nulstil() {
		
	}

	
	
}
