package Actor;
//游戏进行是进行攻击和防守；
//进攻打进攻   两边互相损失对方攻击指数的血量
//进攻打防守，防守方会损失掉对面攻击指数减去自身防守指数的血量，并且反以防守指数的攻击形式
//防守打防守会导致互相进行防守指数的攻击形势。
import java.util.Scanner;
import java.util.Random;
public class Game1 extends Game {
	Game1()
	{};
	void play()
	{
		Scanner so=new Scanner(System.in);
		System.out.println("-------游戏开始---------");
		System.out.println("请选择角色：Warrior,Master或者Middle");
		String name=so.next();
		super.setActor(name);
		super.randomActor();
		while(super.a1.falure()&&super.a2.falure())
		{
		System.out.println("请选择操作：Defense或者Attack");
		String actor=so.next();
		Random random=new Random();
		int IF=Math.abs(random.nextInt()%2);
		if(IF==0)
			{
			super.a2.defense();
			if(actor.equals("Defense"))	
				
			  {
				super.a1.defense();
				super.a2.Defense(a1);
				super.a1.Defense(a2);
			  }
			else
			{
				super.a1.attack();
				super.a2.Defense(a1);
				super.a1.attack(a2);
			}
			}
		else
		{
			super.a2.attack();
			if(actor.equals("Attack"))
			{
				super.a1.attack();
				super.a2.attack(a1);
				super.a1.attack(a2);
			}
			else
			{
				super.a1.defense();
				super.a1.Defense(a2);
				super.a2.attack(a1);
			}
		}
		System.out.println("我的血量："+super.a1.getblood()+"电脑的血量："+super.a2.getblood());
		
	    }
		if(!super.a1.falure()&&!super.a2.falure())
			System.out.println("---------平局--------");
		else
			if(!super.a1.falure())
				System.out.println("----------你输了--------");
				else
					if(!super.a2.falure())
						System.out.println("---------你赢了--------");
		}
}
