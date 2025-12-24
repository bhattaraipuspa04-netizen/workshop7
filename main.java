package workshop7;
import java.util.Map;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
   public static void main(String[] args){
       System.out.println("\nquestion1");
       classbook1 book1 = new classbook1();
       book1.title="python";
       book1.author="james";
       book1.price=899;
       
       classbook1 book2 = new classbook1();
       book2.title="java";
       book2.author="charles";
       book2.price=799;
        System.out.println("title "+ book1.title);
        System.out.println("author "+ book1.author);
        System.out.println("price "+ book1.price);
        System.out.println("title "+ book2.title);
        System.out.println("author "+ book2.author);
        System.out.println("price "+ book2.price);
               System.out.println("\nquestion2");

        rectangle a= new rectangle();
        a.length=34.3;
        a.breadth=43.98;
        System.out.println("lenght is "+a.length);
         System.out.println(" breadth is "+a.breadth);
         double b = a.length * a.breadth;
          System.out.println(b);
                 System.out.println("\nquestion3");

          
          employee c1= new employee();
          c1.name="james";
          c1.id=987;
          c1.salary=987.654;
          
          employee c2= new employee();
          c2.name="john";
          c2.id=986;
          c2.salary=983447.654;
          System.out.println("name is "+ c2.name);
          System.out.println("id is " +c2.id);
          System.out.println("salary is" + c2.salary);
           
          
          
          System.out.println("name is "+ c1.name);
          System.out.println("id is " +c1.id);
          System.out.println("salary is" + c1.salary);
          
          employee c3= new employee();
          c3.name="charles";
          c3.id=96;
          c3.salary=3447.654;
          System.out.println("name is "+ c3.name);
          System.out.println("id is " +c3.id);
          System.out.println("salary is" + c3.salary);
            if (c1.salary>c2.salary && c1.salary>c3.salary){
           System.out.println(c1.name +"has highest salary");
        }
        else if(c2.salary>c1.salary && c2.salary>c3.salary)
        {
           System.out.println(c2.name +" has highest salary");
        }
        
        
               System.out.println("\nquestion4");

        
        laptop d1 =new laptop("apple",8,19999);
        
        laptop d2 = new laptop("asus",24,5677889);
        
        
        laptop d3 = new laptop("lenovo",4,8765);
            d1.display();
        d2.display();
        d3.display();
        
        
         if(d1.ram>8){
             System.out.println(d1.brand +" has ram greater than 8");
         }
         else if(d2.ram>8){
             System.out.println(d2.brand +" has ram greater than 8");
         }
         else if (d3.ram>8){
             System.out.println(d1.brand +" has ram greater than 8");
         }
         
        
        

        
         System.out.println("\nquestion5");
         
         mobile e1=new mobile("apple",199999);
    
        mobile e2 = new mobile("samsung",77889);
        
        
        mobile e3 = new mobile("pixel",88765);
         
        e1.affordable();
        e2.affordable();
        e3.affordable();
        
        
        
        System. out. println("\nQuestion 6");
        result student1=new result (80,90,95.5);
        result student2=new result (100,100,100) ;
        student1.calc();
        student2.calc();
        student2.display();
        student2.display();
        
        
        
        //scenarioassignment 
        System.out.println("\nscenario assignment");
        bankaccount account1=new bankaccount(999,"puspa",890);
        bankaccount account2=new bankaccount(101,"Sita",30000);
        
        
        
         System.out.println("For account number "+account1.number);
         account1.deposit();
         
         System.out.println("For account number "+account2.number);
         account2.deposit();
         
         System.out.println("For account number "+account1.number);
         account1.withdraw();
         
         System.out.println("For account number "+account2.number);
         account2.withdraw();
         
         
         
         
         account1.display();
         account2.display();
         
     }        
        
        }
          
          
          
          
          
         
         
         

        
       
