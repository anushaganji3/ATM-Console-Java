// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class ATMApp {
   static User currentUser = new User();

   public ATMApp() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("=== SIMPLE ATM ===");
      System.out.print("Enter Username: ");
      String var2 = var1.nextLine();
      System.out.print("Enter PIN: ");
      String var3 = var1.nextLine();
      if (var2.equals(currentUser.username) && var3.equals(currentUser.pin)) {
         int var4;
         do {
            System.out.println("\n1.Check Balance\n2.Deposit\n3.Withdraw\n4.Exit");
            var4 = var1.nextInt();
            switch (var4) {
               case 1:
                  System.out.println("Balance: ₹" + currentUser.balance);
                  break;
               case 2:
                  System.out.print("Enter amount: ");
                  double var5 = var1.nextDouble();
                  User var9 = currentUser;
                  var9.balance += var5;
                  System.out.println("Deposit Successful");
                  break;
               case 3:
                  System.out.print("Enter amount: ");
                  double var7 = var1.nextDouble();
                  if (var7 > currentUser.balance) {
                     System.out.println("Insufficient Balance");
                  } else {
                     User var10000 = currentUser;
                     var10000.balance -= var7;
                     System.out.println("Withdrawal Successful");
                  }
            }
         } while(var4 != 4);

         System.out.println("Thank You!");
      } else {
         System.out.println("Invalid Login");
      }
   }

   static class User {
      String username = "admin";
      String pin = "1234";
      double balance = (double)10000.0F;

      User() {
      }
   }
}
