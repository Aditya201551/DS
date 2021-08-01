import java.util.*;
public class ExceptionHandling {
    
    String name;
    int roll;

    void getAll()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name: ");
        name=sc.nextLine();
        try{
            System.out.print("Enter the roll: ");
            roll=sc.nextInt();
        }
        catch(Exception e){
            System.out.println("You have entered invalid data, please enter a valid number");
        }
        finally{
            System.out.println("This will execute no matter what!");
        }

        sc.close();
       
    }

    void show() throws ArrayIndexOutOfBoundsException
    {
        String x="10";
        System.out.println("Name: "+name+"\nRoll: "+roll);
    }

    public static void main(String[] args) {
        ExceptionHandling ob=new ExceptionHandling();
        ob.getAll();
        ob.show();
    }
}
