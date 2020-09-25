package quiz;

import java.util.Scanner;

class Menu{
   private static Scanner rd;
   String [][] seats=new String [3][10];
   
   public Menu() {
      for (int i=0;i<3;i++) {
         for(int j=0;j<10;j++) {
            seats[i][j]="--- ";
         }
      }
   }
   
   public void printSeat(int seatChoice) {
      String SAB =null;
      
      switch (seatChoice) {
      case 1:
         SAB = "S>>";
         break;
      case 2:
         SAB = "A>>";
         break;
      case 3:
         SAB = "B>>";
         break;
      }
      System.out.print(SAB);
      
      for (int i=0;i<10;i++) {
         System.out.print(seats[seatChoice-1][i]);
      }
      System.out.println();
   }
   
   public boolean already(int seatChoice, int seatNum, String name) {
      if(seats[seatChoice-1][seatNum-1].equals("--- ")) {
         seats[seatChoice-1][seatNum-1]=(name+" ");
         return true;
      }
      else
         return false;
   }
   
   public void reserve() {
      rd =new Scanner(System.in);
      
      while(true) {
         System.out.print("좌석 구분 : S(1), A(2), B(3)>>>");
         int choice=rd.nextInt();
         
         try {
            if(choice<1||choice>3)
               throw new Exception();
         }catch(Exception e) {
            System.out.println("다시 선택해주세요.");
            continue;
         }
         
         printSeat(choice);
         
         boolean flag2=true;
         System.out.print("이름>> ");
         String name=rd.next();
         int seatNum = 0;
         
         while(flag2) {
            
            System.out.print("번호>> ");
            seatNum=rd.nextInt();
            if(seatNum<1||seatNum>10)
               System.out.println("번호 범위에서 오류가 발생하였습니다. 다시 입력해주세요.");
            else
               flag2=false;
         }
         
         if(already(choice,seatNum,name)) {
            System.out.println("예약을 완료하였습니다.");
         }
         else {
            System.out.println("이미 예약된 좌석입니다.");
         }
         break;
      }
   }
   
   public void search() {
      for (int i=0;i<3;i++)
         printSeat(i+1);
      System.out.println("조회를 완료하였습니다.");
   }
   
   public void cancel() {
      rd=new Scanner (System.in);
      
      boolean miniflag1=true;
      int choice=0;
      while(miniflag1) {
         System.out.print("좌석구분 : S(1), A(2), B(3) >>> ");
         choice=rd.nextInt();
         if(choice<1||choice>3)
            System.out.println("좌석 범위에서 오류가 발생하였습니다. 다시 입력해주세요.");
         else
            miniflag1=false;
         
      }
      
      printSeat(choice);   
      
      boolean miniflag2=true;
      int count=0;
      while(miniflag2) {
         boolean miniflag3=true;
         System.out.print("이름>> ");
         String name=rd.next();
         
         while(miniflag3) {
            count=0;
            for(int i=0;i<10;i++) {   
               if(seats[choice-1][i].equals(name+" ")) {
                  seats[choice-1][i]="--- ";
                  count=1;
               }
            }
            if (count!=1){
               System.out.println("잘못된 이름을 입력하셨습니다. 다시 선택해주세요");
               miniflag3=false;
            }else if(count==1) {
               System.out.print("취소를 완료하였습니다."+"\n");
               miniflag2=false;
               miniflag3=false;
            }
         }
      }
   }   
}

public class Concert {
   
   private static Scanner rd;

   public static void main(String[] args) {
      rd=new Scanner(System.in);
      Menu m=new Menu();
      int menuNum;
      boolean flag=true;
      
      System.out.println("명품콘서트홀 예약 시스템입니다.");
      
      while(flag) {
         System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
         menuNum=rd.nextInt();
         
         try {
            if (menuNum<1 || menuNum>4)
               throw new Exception();
         }catch (Exception e) {
            System.out.println("다시 선택해주세요.");
            continue;
         }
         
         switch(menuNum) {
         case 1:
            m.reserve();
            break;
         case 2:
            m.search();
            break;
         case 3:
            m.cancel();
            break;
         case 4:
            
            System.out.println("종료합니다.");
            flag=false;
         }
      }
      rd.close();
   }
}
