package Actor;
import java.util.Random;
// ����Ϊ��ɫ����
//���ඨ����Ѫ��������ָ��������ָ����Actor_ID;

public class Actor implements Canplay{
       int blood;
       int id;//��ͬ�Ľ�ɫ��
       String name;
       int[] attacknum;
       int[] defensefactor;
       boolean state;//�Ƿ�Ϊ����״̬
       Actor(int blood,int id,String name,int[] attacknum,int[] defensefactor)
       {
    	   this.blood=blood;
    	   this.id=id;
    	   this.name=name;
    	   this.attacknum=attacknum;
    	   this.defensefactor=defensefactor;
       }
      public void attack(Actor a)//��Actor a���й���
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
      };//���з�������state��ɷ���״̬��
      int getblood()//����Ѫ��
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
