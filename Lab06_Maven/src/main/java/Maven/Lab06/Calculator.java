package Maven.Lab06;

public class Calculator{
	public int add(int i, int j){
		return i + j;
	}
	public int sub(int i, int j){
		if(i > j){
			return i - j;
		}
		else
			return j - i;
	}
}

