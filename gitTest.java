package HomeWork;

import java.util.Scanner;

public class HomeWork03_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int guessNum = (int)(Math.random()*100);
		
		int guessNum = (int)(Math.random()*100);
		while(true){
			int inputNum = sc.nextInt();
			if(inputNum>guessNum) {
				System.out.println("錯了，在小一點 !");
			}else if(inputNum<guessNum) {
				System.out.println("錯了，在大一點 !");
			}else{
				System.out.println("恭喜你答對了!!!");
				break;
			}
		}
	}
}