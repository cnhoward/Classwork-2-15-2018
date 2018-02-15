
public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

boolean c = isEven(4);

boolean b = isEven(31);

boolean d = isEven(58);

boolean e = isEven(49);

System.out.println(c);

System.out.println(b);

System.out.println(d);

System.out.println(e);
	}
	
public static boolean isEven(int a){
	if (a % 2 == 0)
	{
	return true;
	}
	else{
	return false;
	}
	
}
}
