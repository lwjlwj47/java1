package Actor;
import java.util.Random;
// 该类为角色基类
//该类定义了血量，攻击指数，防守指数和Actor_ID;

public class Actor implements Canplay{
       int blood;
       int id;//不同的角色类
       String name;
       int[] attacknum;
       int[] defensefactor;
       boolean state;//是否为防御状态
       Actor(int blood,int id,String name,int[] attacknum,int[] defensefactor)
       {
    	   this.blood=blood;
    	   this.id=id;
    	   this.name=name;
    	   this.attacknum=attacknum;
    	   this.defensefactor=defensefactor;
       }
      public void attack(Actor a)//对Actor a进行攻击
      {
    	  Random random=new Random();
    	  int attack=attacknum[Math.abs(random.nextInt()%3)];
    	  if(a.state)
    		  a.asubblood(attack);
    	  else
    		  a.dsubblood(attack);
      }
      public void Defense(Actor a)
      {
    	  Random random=new Random();
    	  int attack=defensefactor[Math.abs(random.nextInt()%3)];
    	  if(a.state)
    		  a.asubblood(attack);
    	  else
    		  a.dsubblood(attack);
      }
      void attack()
      {
    	  state=true;
      }
      public void defense() 
      {
    	  state=false;
      };//进行防御，将state变成防御状态。
      int getblood()//返回血量
      {
    	  return blood;
      }
      void asubblood(int x)
      {
    	  blood=blood-x;
      }
      void dsubblood(int x)
      {
    	  Random random=new Random();
	      int defense=defensefactor[Math.abs(random.nextInt()%3)];
    	  blood=blood-x+defense;
      }
      boolean falure()
      {
    	  return blood>0;
      }
}
