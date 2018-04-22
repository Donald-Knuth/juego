package numeracionTomos;

public class NumeracionTomos {

	NumeracionTomos(){}
	
	int i;
	public String numeracionDeTomos(int n , String[] l) {
		for (; n > 99; n -= 99)
			i++;
		return l[i] + (n < 10 ? "-0" : "-") + n;
	}
}
