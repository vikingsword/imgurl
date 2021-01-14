package 控制流程;
import java.util.Scanner;

public class control_while {
	public static void main(String[] args) {
		
		/*
		int i = 0;
		while(i<5){
			System.out.println(i++);
		}
		*/
		
		
		/*
		//打印0到4
		//与while的区别是，无论是否成立，先执行一次，再进行判断
		int i = 0;
		do{
			System.out.println(i);
			i++;			
		} while(i<5);
		*/
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n = s.nextInt();
		int N = 1;
		while(n>0){
			N *= n;
			n--;
		}
		System.out.println("阶乘是"+N);
		s.close();
		
		
		
		
		
		
	}
}
