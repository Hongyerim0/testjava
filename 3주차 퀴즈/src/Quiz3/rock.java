package Quiz3;
import java.util.Scanner;
public class rock {
   public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
      String str[]= {"����","����","��"};
      do {
         int n=(int)(Math.random()*3);
         System.out.print("���� ���� ��! >> ");
         String user=s.next();
         
         if(user.equals("�׸�")) {
            System.out.print("������ �����մϴ�...\n");
            break;
         }
         else if(user.equals(str[n])) {
            System.out.print("�����="+user+", ��ǻ��="+str[n]+" �����ϴ�.\n");
         }
         else if(user.equals("����")) {
            if(n==1)
               System.out.print("�����="+user+", ��ǻ��="+str[n]+" ����ڰ� �����ϴ�.\n");
            else
               System.out.print("�����="+user+", ��ǻ��="+str[n]+" ����ڰ� �̰���ϴ�.\n");   
         }
         else if(user.equals("����")) {
            if(n==0)
               System.out.print("�����="+user+", ��ǻ��="+str[n]+" ����ڰ� �̰���ϴ�.\n");
            else
               System.out.print("�����="+user+", ��ǻ��="+str[n]+" ����ڰ� �����ϴ�.\n");   
         }
         else {
            if(n==0)
               System.out.print("�����="+user+", ��ǻ��="+str[n]+" ����ڰ� �����ϴ�.\n");
            else
               System.out.print("�����="+user+", ��ǻ��="+str[n]+" ����ڰ� �̰���ϴ�.\n");   
         }
      
      }while(true);
   }
}