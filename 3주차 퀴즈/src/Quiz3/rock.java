package Quiz3;
import java.util.Scanner;
public class rock {
   public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
      String str[]= {"가위","바위","보"};
      do {
         int n=(int)(Math.random()*3);
         System.out.print("가위 바위 보! >> ");
         String user=s.next();
         
         if(user.equals("그만")) {
            System.out.print("게임을 종료합니다...\n");
            break;
         }
         else if(user.equals(str[n])) {
            System.out.print("사용자="+user+", 컴퓨터="+str[n]+" 비겼습니다.\n");
         }
         else if(user.equals("가위")) {
            if(n==1)
               System.out.print("사용자="+user+", 컴퓨터="+str[n]+" 사용자가 졌습니다.\n");
            else
               System.out.print("사용자="+user+", 컴퓨터="+str[n]+" 사용자가 이겼습니다.\n");   
         }
         else if(user.equals("바위")) {
            if(n==0)
               System.out.print("사용자="+user+", 컴퓨터="+str[n]+" 사용자가 이겼습니다.\n");
            else
               System.out.print("사용자="+user+", 컴퓨터="+str[n]+" 사용자가 졌습니다.\n");   
         }
         else {
            if(n==0)
               System.out.print("사용자="+user+", 컴퓨터="+str[n]+" 사용자가 졌습니다.\n");
            else
               System.out.print("사용자="+user+", 컴퓨터="+str[n]+" 사용자가 이겼습니다.\n");   
         }
      
      }while(true);
   }
}