import java.util.Scanner;
import java.util.Arrays;
class TaskSortString {
	String[] spisok;
	int n;
		
	 String[] strsort(int n){
		String temp;
		int k;
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
		}
	 String[] inputmas(int n){
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<n; i++){
			spisok[i]=scan.nextLine();
		}
				}
	void outputmas(int n){	
		for(int i=0;i<n; i++){
			System.out.println(spisok[i]);
		}
		}		
	public static void main(String[] args){
		System.out.println(" Введите количество строк");
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		inputmas(t);
		strsort(t);
		outputmas(t);
		}
}
