package telran.measure;


public class Length implements Comparable<Length> {
	private float amount;
	private LengthUnit unit;
	
	public Length(float amount, LengthUnit unit) {
		this.amount = amount;
		this.unit = unit;
	}
	
	public Length(Length cur) {
		this.amount = cur.getAmount();
		this.unit = cur.getUnit();
	}
	
	
	public float getAmount() {
		return amount;
	}

	public LengthUnit getUnit() {
		return unit;
	}
	
	@Override
	public String toString() {
		return String.format("%.1f%s", amount, unit.name());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Length other = (Length) obj;
		return this.convert(LengthUnit.MM).getAmount() == other.convert(LengthUnit.MM).getAmount();
	}
	
	public Length convert(LengthUnit unit) {
		return this.getUnit() == unit ? new Length(this) : 
			new Length(getUnit().getValue() * getAmount() / unit.getValue(), unit);	
	}




	@Override
	public int compareTo(Length o) {
		float cur = convert(LengthUnit.MM).getAmount() * 1000;
		float other = o.convert(LengthUnit.MM).getAmount() * 1000;
		
		return (int) (cur - other);
	}

}
