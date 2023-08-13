package telran.measure;

public enum LengthUnit {
	MM(1.0f), CM(10.0f), IN(25.4f), FT(304.8f), M(1000.0f), KM(1_000_000.0f);
	
	private float value;

	LengthUnit(float value) {
		this.value = value;
	}


	public float getValue() {
		return value;
	}
	
	public Length between(Length length1, Length length2) {
		if (length1.getUnit() != this || length2.getUnit() != this) {
			length1 = length1.convert(this);	
			length2 = length2.convert(this);	
		}
		return new Length(Math.abs(length1.getAmount() - length2.getAmount()), length1.getUnit());
	}

}
