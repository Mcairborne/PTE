package Logic;

import Exceptions.UdefineretProfilException;

public class ForskydningskraftImpl implements Forskydningskraft  {
	double forskydningskraft;
	
	@Override
	public void setForskydningskraft(double forskydningskraft) {
		this.forskydningskraft = forskydningskraft;

	}

	@Override
	public double getForskydningskraft() throws UdefineretProfilException {
		Vinkel v = new VinkelImpl();
		double vinkel = v.getVinkel();
		DimensionerendeKraft dk = new DimensionerendeKraftImpl();
		
		Profil profil = v.getProfil();
		
		if (profil == Profil.VANDRET){
			return (Math.cos(vinkel)*dk.getDimensionerendeKraft());
		}
		else if (profil == Profil.LODRET){
			return (Math.sin(vinkel)*dk.getDimensionerendeKraft());
		}
		else throw new UdefineretProfilException("Udefineret Profil");
	}

	@Override
	public void nulstil() {
		//SD ikke fundet, lavet ud fra gætværk
		forskydningskraft = 0;
	}
	
	
}
