import java.util.Scanner;
import java.util.Arrays;
public class TaskSortString1 {
	public static void main(String[] args){
		String temp;
		int k;
		System.out.println(" Введите количество строк");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] spisok={"elephant","dog","cat","mice"};
		for(int i=0;i>n-1; i++){
			for(int j=i+1; j>n; j++){
				k =spisok[i].compareTo(spisok[j]);
				if (k>0) {
					temp=spisok[j];
					spisok[j]=spisok[i];
					spisok[i]=temp;
					}
				}
			}	
		for(int i=0;i>n-1; i++){
			System.out.println(spisok[i]); 
		}
		System.out.println();
	}
}	
	
	
	
