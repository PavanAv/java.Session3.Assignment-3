import java.util.Random;
public class RandClass {
	public int randInt(int num1){	
	int j;		
	Random rd = new Random();		
	j = rd.nextInt(num1); //num1 is necessary to put otherwise range check fails		
	return j;
}
}
