package Actor;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner so=new Scanner(System.in);
		System.out.println("--------��Ϸ��ʼ----------");
		System.out.println("-------ѡ����Ϸģʽ---------");
		System.out.println("���޶Կ���1--------10�ֶԿ���2");
		int wegame=so.nextInt();
		if(wegame==1)
		{
			Game1 game=new Game1();
		    game.play();
	    }
		else
		{
			Game2 game=new Game2();
			game.play();
		}
	}
}
