import java.util.Scanner;
import java.util.Arrays;


public class HomeTask7 {
	class Directory {
		String nameDir;
		int level;
		String[] files = null;
		Directory dir = new Directory();
		Directory[] mas = new Directory[1024];
	
		void AddDir(){
			System.out.println ("Enter the name of the directory");  // Введите имя директори
			Scanner scan = new Scanner(System.in);
			String nd=scan.nextLine();
			String nameDir = nd;
			System.out.println ("Enter the level of the directory");  // Введите уровень директори
			int level = scan.nextInt();
			int i = length.mas;			
			mas[i] = nd;
			}
			
		void DelDir(){
			System.out.println ("Enter the name of the directory");  // Введите имя директори
			Scanner scan = new Scanner(System.in);
			String nd=scan.nextLine();
			System.out.println ("Enter the level of the directory");  // Введите уровень директори
			int level=scan.nextInt();
			for (int i = 0;i< length.mas;i++){
			if (mas[i].namedir == nd && mas[i].level == level){
			mas[i] = null; break;}
			else i++;
			}			
			System.out.println ("Direcortory deleted");  // Директория удалена
			}
		}	
	class Files extends Directory {
		String size;		
		void AddFile(){
			System.out.println ("Enter the name of the directory");  // Введите имя директори
			Scanner scan = new Scanner(System.in);
			String nd=scan.nextLine();
			System.out.println ("Enter the level of the directory");  // Введите уровень директори
			int level=scan.nextInt();
			System.out.println ("Enter the name of the file");  // Введите имя файла
			Scanner scan = new Scanner(System.in);
			String nf=scan.nextLine();
			System.out.println ("Enter file size");  // Введите размер файла
			int size=scan.nextInt();
			int i = 0;			 
			for (int i = 0;i< length.mas;i++){
			if (mas[i].namedir == nd && mas[i].level == level){
			break;}
			else i++;
			}
			int j = length.mas[i].files;
			mas[i].files[j] = nf;
			mas[i].files[j+1] =size;
			}
			
		void DelFile(){
			System.out.println ("Enter the name of the directory");  // Введите имя директори
			Scanner scan = new Scanner(System.in);
			String nd=scan.nextLine();
			System.out.println ("Enter the level of the directory");  // Введите уровень директори
			int level=scan.nextInt();
			System.out.println ("Enter the name of the file");  // Введите имя файла
			Scanner scan = new Scanner(System.in);
			String nf=scan.nextLine();
			for (int i = 0;i< length.mas;i++){
			if (mas[i].namedir == nd && mas[i].level == level){
				for (int j = 0; j< length.mas[i].files; j++){
					if (mas[i].files[j] == nf){
					mas[i].files[j] = null;
					mas[i].files[j+1] = null; break;
					}
				else j++;
				}
				break;}
				else i++;
			}
			System.out.println ("File deleted");  // файл удалена
		}
	}	
	
	void Print(){
		for (int l = 0; l< 10 ; l++){
			for(int i = 0; i< length.mas; i++)
				if (mas[i].level == l){
				int k = l+1;
				System.out.print(String.format("%"+k"s",).replace(' ', '-'));
				System.out.println(+ mas[i].namedir);
					if (mas[i].files != null){
						k++;
						for (int j = 0; j< length.mas[i].files; j++){
							System.out.print(String.format("%"+k"s",).replace(' ', '-'));
							System.out.println(+ mas[i].files[j] + ' ' +  mas[i].files[j+1]);
						}
					}	
				}
			}
	}
	void run(){
		System.out.println("Choose an option");  								// Выберите вариант действий
		System.out.println("1 - add directory");  								// 1 - добавить директорию	
		System.out.println("2 - delete directory");  							// 2 - удалить директорию	
		System.out.println("3 - add a file to the specified directory");    	// 3 - добавить файл в указанную директорию	
		System.out.println("4 - delete a file from the specified directory");	// 4 - удалить файл из указанной директории	
		System.out.println("5 - printing the file structure");	                // 5 - печать файловой структуры
		Scanner in = new Scanner (System.in);
		int choise = in.nextInt();
		switch (choise){
		case 1:
				AddDir();
				break;
		case 2:
				DelDir();
				break;
		case 3:
				AddFile();
				break;
		case 4:
				DelFile();
				break;
		case 5:
				Print();
				break;
		default:
				System.out.println("Incorrect menu selection");
				break;
		}	
		
		}
		
	public static void main(String[] args) {
		new HomeTask7().run();
		
		}


}
