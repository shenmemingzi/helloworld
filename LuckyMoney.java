import java.util.Scanner;
import java.util.Random;

public class LuckyMoney {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Input the money: ");
		float money = input.nextFloat();
		int moneyi = (int)(money * 100);
		
		System.out.print("Input the people number: ");
		int num = input.nextInt();
		
		if(money > 0 && num > 0 && num <= moneyi){
			int i;
			int m = 0;
			System.out.println("The money is:");
			for(i = 0;i < num-1;i++){
				moneyi -= m;
				m = random.nextInt(moneyi - num + i + 1) + 1;
				System.out.println((float)m / 100);
			}//for
			System.out.println((float)(moneyi - m) / 100);
		}//if
	}//main
}