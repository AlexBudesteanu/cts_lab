package ro.ase.cts.refactoring;

public enum TipProdus {
NOU(0),
DISCOUNT(0.1f),
STOC_LIMITAT(0.25f),
SFARSIT_DE_SEZON(0.35f),
CATEGORIE_NOUA(0.45f);

	private float discount;
	
	TipProdus(float discount) {
		this.discount = discount;
	}

	public float getDiscount() {
		return discount;
	}
}
