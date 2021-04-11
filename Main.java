package Actor;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner so=new Scanner(System.in);
		System.out.println("--------游戏开始----------");
		System.out.println("-------选择游戏模式---------");
		System.out.println("无限对抗：1--------10局对抗：2");
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
