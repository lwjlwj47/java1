package Actor;

import java.util.Random;
import java.util.Scanner;

//有10次机会，防守没有伤害
//攻击和防守各有5次；
//若能提前将对方杀死则获得胜利，如果不能则对10轮过后的血量进行判定，血量高的获得胜利。
public class Game2 extends Game {
    Game2()
    {}
    void play()
    {
    	Scanner so=new Scanner(System.in);
		System.out.println("-------游戏开始---------");
		System.out.println("请选择角色：Warrior,Master或者Middle");
		String name=so.next();
		super.setActor(name);
		super.randomActor();
		int counts=10;
		int a1Attack=5;
		int a2Attack=5;
		for(;counts>0;counts--)
		{
			System.out.println("你还剩下"+a1Attack+"次攻击机会\n你还剩下"+(counts-a1Attack)+"次防守机会");
			System.out.println("请选择操作：Defense或者Attack");
			String actor=so.next();
			Random random=new Random();
			int IF=Math.abs(random.nextInt()%2);
			if(IF==0)
			{
				if(counts==a2Attack)
				{
					IF=1;
				}
				else
				{
				super.a2.defense();
				if(actor.equals("Attack"))
				{
					System.out.println("1");
					super.a1.attack(a2);
					a1Attack--;
				}
				}
			}
			if(IF==1)
			{	
				if(a2Attack==0)
				{
					super.a2.defense();
					if(actor.equals("Attack"))
					{
						super.a1.attack(a2);
						a1Attack--;
					}
					
				}
				else
				{
				super.a2.attack();
			    if(actor.equals("Defense"))
			    {
			    	super.a1.defense();
			    	super.a2.attack(a1);
			    	a2Attack--;
			    }
			    else
			    {
			    	a1.attack();
			    	a1.attack(a2);
			    	a2.attack(a1);
			    	a2Attack--;
			    	a1Attack--;
			    }
		     }
			}
			System.out.println("我的血量："+super.a1.getblood()+"电脑的血量："+super.a2.getblood());
			if(!super.a1.falure()&&!super.a2.falure())
				{
				System.out.println("---------平局--------");
				break;
				}
			else
				if(!super.a1.falure())
					{
					System.out.println("----------你输了--------");
					break;
					}
					else
						if(!super.a2.falure())
						{
							System.out.println("---------你赢了--------");
							break;
						}
			}
		if(a1.getblood()>a2.getblood())
			System.out.println("---------你赢了--------");
		if(a1.getblood()==a2.getblood())
			System.out.println("---------平局--------");
		else
			System.out.println("----------你输了--------");
    }
}
