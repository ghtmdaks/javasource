package exam;

import java.util.Scanner;

public class Degrees {
	public static void main(String[] args) {
		// È­¾¾ => ¼·¾¾
		
		//Á¶°Ç
		// È­¾¾¿Âµµ ÀÌ·Æ¹Þ±â(Á¤¼ö)
		// ¹ÞÀº È­¾¾ ¿Âµµ => ¼·¾¾¿Âµµ·Î º¯È¯ ÈÄ Ãâ·Â
		// (È­¾¾-32)*5/9
		Scanner k = new Scanner(System.in);
		System.out.print("È­¾¾¿Âµµ : ");
		int f = k.nextInt();
		System.out.println("-------");
		
		double c = (f-32)*5/9.0;
		System.out.printf("¼·¾¾¿Âµµ : %.1fµµ\n", c);
		
		//Scanner sc = new Scanner(System.in);
		//System.out.print("È­¾¾¿Âµµ : ");
		//int fahr = sc.nextInt();
		//double=(fahr-32)*5/9;
		//sysoln("¼·¾¾¿Âµµ: "+cels);
		//sysof("¼·¾¾¿Âµµ : %.4f",cels);
	}

}
