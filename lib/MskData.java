package lib;
import src.Data;

import java.util.Scanner;

public class MskData{
	public void masuk(int n){
		Scanner input = new Scanner(System.in);
		Data[] d = new Data[99999];
		char l;
		System.out.println("");
		System.out.println("2. Memasukkan Data");
		do{
			d[n] = new Data();
			System.out.println("Input data ke-"+(n+1));
			System.out.print("Input judul    : "); d[n].judul=input.next();
			System.out.print("Input kategori : "); d[n].kategori=input.next();
			System.out.print("Input pemeran  : "); d[n].pemeran=input.next();
			System.out.print("Input jumlah   : "); d[n].jumlah=input.nextInt();
			System.out.print("Input Lagi? : ");	l = input.next().charAt(0);
			n++;
		}while(l=='y');
	}
}