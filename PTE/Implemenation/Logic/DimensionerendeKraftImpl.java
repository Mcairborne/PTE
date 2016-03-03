package Logic;

class DimensionerendeKraftImpl implements DimensionerendeKraft {

	double dimensionerendeKraft = 0;

	@Override
	public double getDimensionerendeKraft() {
		Vaegt vaegt = new VaegtImpl();
		Tyngdekraft tyngdekraft = new TyngdekraftImpl();

		dimensionerendeKraft = vaegt.getVaegt() * tyngdekraft.getTyngdekraft();

		return dimensionerendeKraft;
	} 

	@Override
	public void setDimensionerendeKraft(double dimensionerendeKraft) {
		this.dimensionerendeKraft = dimensionerendeKraft;
	}

	@Override
	public void nulstil() {
		Vaegt vaegt = new VaegtImpl();
		vaegt.setVaegt(0);

		Tyngdekraft tyngdekraft = new TyngdekraftImpl();
		tyngdekraft.setTyngdekraft(0);
	}

}
