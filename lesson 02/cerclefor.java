
import java.util.Random;
import java.util.Scanner;

public class cerclefor {

		public static void main(String[] args) {
		Random random =new Random();
		Scanner in=new Scanner(System.in);
		int secret=1+random.nextInt(100);
		for(int i=1;i<11; i++){
			System.out.println(" задуманное число -");
			int d = in.nextInt();
			if (d == secret) {
				System.out.println(" вы угадали, задуманное число -" + d);
				System.out.println(" попытка -" + i);
				break;}
			else 
			System.out.println(" вы не угадали, у вас есть следующая попытка");
}
}
}
