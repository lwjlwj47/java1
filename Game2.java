package Actor;

import java.util.Random;
import java.util.Scanner;

//��10�λ��ᣬ����û���˺�
//�����ͷ��ظ���5�Σ�
//������ǰ���Է�ɱ������ʤ��������������10�ֹ����Ѫ�������ж���Ѫ���ߵĻ��ʤ����
public class Game2 extends Game {
    Game2()
    {}
    void play()
    {
    	Scanner so=new Scanner(System.in);
		System.out.println("-------��Ϸ��ʼ---------");
		System.out.println("��ѡ���ɫ��Warrior,Master����Middle");
		String name=so.next();
		super.setActor(name);
		super.randomActor();
		int counts=10;
		int a1Attack=5;
		int a2Attack=5;
		for(;counts>0;counts--)
		{
			System.out.println("�㻹ʣ��"+a1Attack+"�ι�������\n�㻹ʣ��"+(counts-a1Attack)+"�η��ػ���");
			System.out.println("��ѡ�������Defense����Attack");
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
			System.out.println("�ҵ�Ѫ����"+super.a1.getblood()+"���Ե�Ѫ����"+super.a2.getblood());
			if(!super.a1.falure()&&!super.a2.falure())
				{
				System.out.println("---------ƽ��--------");
				break;
				}
			else
				if(!super.a1.falure())
					{
					System.out.println("----------������--------");
					break;
					}
					else
						if(!super.a2.falure())
						{
							System.out.println("---------��Ӯ��--------");
							break;
						}
			}
		if(a1.getblood()>a2.getblood())
			System.out.println("---------��Ӯ��--------");
		if(a1.getblood()==a2.getblood())
			System.out.println("---------ƽ��--------");
		else
			System.out.println("----------������--------");
    }
}
