package src;
import java.util.Scanner;

public class Menu{
	private int pil;
	public void menu(){
		System.out.println("-::MENU PILIHAN::-");
		System.out.println("1. Memasukan   Data");
		System.out.println("2. Menampilkan Data");
		System.out.println("3. Menambahkan Data");
		System.out.println("4. Mengedit    Data");
		System.out.println("5. Mencari 	   Data");
		System.out.println("6. Menghapus   Data");
		System.out.print("Input Pilihan : ");
		Scanner input = new Scanner(System.in);
		pil = input.nextInt();
	}

	public int getPil(){
		return(pil);
	}
}