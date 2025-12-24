package workshop7;
import java.util.Scanner;


/**
 * Write a description of class bankaccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bankaccount
{
    int number;
    String name;
    double balance;
    bankaccount(int n,String na, double b){
        this.number=n;
        this.name=na;
        this.balance=b;
    }
    
    void deposit(){
        Scanner scanner=new Scanner(System.in);
          System.out.println("Deposit money");
      double tmp=scanner.nextDouble();
      this.balance=this.balance+tmp;
  }
  
   void withdraw(){
      Scanner scanner=new Scanner(System.in);
      System.out.println("How much do you want to withdraw");
      double tmp=scanner.nextDouble();
      this.balance=this.balance-tmp;
  }
  
  void display(){
      System.out.println(this.name+" your current balance is="+this.balance);
  }
}
    
    
  
    
    