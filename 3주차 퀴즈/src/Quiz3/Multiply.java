package Quiz3;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Multiply {
   public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      do {
      System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
      try {
         int n=scanner.nextInt();
         int m=scanner.nextInt();
         System.out.print(n+"x"+m+"="+n*m);
         break;
      }
      catch(InputMismatchException e) {
         System.out.print("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.\n");
         scanner.nextLine();
         continue;
         }
      }while(true);
      
      scanner.close();
   }
}