package telran.measure;

public enum WeightUnit {
	GR(1.0f), LBS(453.592f), KG(1000.0f), CN(100_000.0f), TN(1_000_000.0f);
	
	float value;
	
	WeightUnit(float nGrams) {
		value = nGrams;
	}
	
	public float convert(WeightUnit to, float amount) {
		return value * amount / to.value;
	}

}
