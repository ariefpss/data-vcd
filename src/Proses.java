package src;
import lib.*;

public class Proses{
	public void start(){
		Menu pm = new Menu();
		int n=0;
		do{
			pm.menu();
			switch (pm.getPil()) {
				case 1:
					MskData msk = new MskData();
					msk.masuk(n);
			}
			System.out.println("");
		}while(pm.getPil()!=7);
	}
}