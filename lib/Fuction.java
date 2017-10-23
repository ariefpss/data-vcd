package lib;

import java.util.ArrayList;
import src.Data;
import java.util.Scanner;

public class Fuction{
	public void masukdata(ArrayList<Data> data){
		Scanner input = new Scanner(System.in);
		char l;
		int n=0;
		System.out.println("");
		System.out.println("1. Memasukkan Data");
		do{
			Data d = new Data();
			System.out.println("Input data ke-"+(n+1));
			System.out.print("Input judul    : "); d.judul=input.next();
			System.out.print("Input kategori : "); d.kategori=input.next();
			System.out.print("Input pemeran  : "); d.pemeran=input.next();
			System.out.print("Input jumlah   : "); d.jumlah=input.nextInt();
			data.add(d);
			System.out.print("Input Lagi? : ");	l = input.next().charAt(0);
			n++;
		}while(l=='y');
	}

	public void showalldata(ArrayList<Data> data){
		System.out.println("2.1 Menampilkan semua data");
		System.out.println("=========================================================");
		System.out.println("NO\tJUDUL\tKETOGORI\tPEMERAN\t\tJUMLAH");		
		System.out.println("=========================================================");
		for(int i=0;i<data.size();i++){
			System.out.print((i+1)+"\t");
			System.out.print(data.get(i).judul+"\t");
			System.out.print(data.get(i).kategori+"\t");
			System.out.print(data.get(i).pemeran+"\t");
			System.out.println(data.get(i).jumlah+"\t");
		}		
	}
}