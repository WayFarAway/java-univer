
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		a = 159;
		int b;
		b = 2;
		int c = 3;
		
		float f1 = 2.2222222222f;
		float f2 = 2.2222222229f;
		//проверка на равенство
		boolean isEquals = Math.abs(f1-f2)<0.0001;
		
		
		double res = (double)(a + b)/c;

		System.out.print(isEquals);
		System.out.println(" people");

	}

}
