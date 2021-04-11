package Actor;
import java.util.Random;
public class Game {
	Game()
	{
		
	}
      Actor a1;//人
      Actor a2;//电脑
      int []Attacknum1= {20,18,16};
      int []Defensefactor1={5,4,3};
      int []Attacknum2= {10,9,8};
      int []Defensefactor2={10,9,8};
      int []Attacknum3= {16,14,12};
      int []Defensefactor3={8,7,6};
       class Master extends Actor
       { 
      	 Master()
      	 {
      		 super(100,1, "Master", Attacknum1, Defensefactor1);
      	 }
       }
       class Warrior extends Actor
       {
      	 Warrior()
      	 {
      		 super(100,2,"Warrior",Attacknum2,Defensefactor2);
      	 }
       }
       class Middle extends Actor
       {
      	 Middle()
      	 {
      		 super(100,3,"Middle",Attacknum3,Defensefactor3);
      	 }
       }
      void randomActor()//设置电脑
      {
    	  Random random=new Random();
    	  int which=Math.abs(random.nextInt()%3);
    	  switch(which)
    	  {
    	  case(0):a2=new Master();
    	  break;
    	  case(1):a2=new Warrior();
    	  break;
    	  case(2):a2=new Middle();
    	  break;
    	  }
      }
      void setActor(String type)//人
      {
    	  switch(type)
    	  {
    	  case"Master":a1=new Master();
    	  break;
    	  case"Warrior":a1=new Warrior();
    	  break;
    	  case"Middle":a1=new Middle();
    	  break;
    	  }
      }
}
