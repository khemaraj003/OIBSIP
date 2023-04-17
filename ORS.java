//KHEMARAJ MHAHAJAN
import java.util.Scanner;
class railway {
    int id=123456;
    int pass=4321;
    int seat = 50;
    int amt = 300;
    int amount;
    int seats;
    int flag;

     public void login(){
        System.out.println("enter your id");
        Scanner sc=new Scanner(System.in);
        int iid=sc.nextInt();
        System.out.println("enter your password");
        int passw= sc.nextInt();
        if(id==iid && pass==passw ){
            flag=1;
        }
        else {
            flag=0;
        }

    }

    public void enquiry() {
        System.out.println("***purple travels***");
        System.out.println("From Jalgaon to Pune");
        System.out.println("Available Seats: " + seat);
        System.out.println("price per seat: " + amt);
        Booking();

    }

    public void Booking() {
        System.out.println("Enter no. of seats : ");
        Scanner sc = new Scanner(System.in);
         seats = sc.nextInt();
        int temp = seat - seats;
         amount = seats * amt;
        if (temp >= 0) {
            System.out.println("Seats are available \n process for payment gateway");
            System.out.println("your total payment:" + amount);
            payment();
        } else {
            System.out.println("seats are not available!!!");
        }

    }
    public void payment(){
        System.out.println("enter amount to be paid");
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        if(temp==amount){
            System.out.println("payment done successfully!!");
            billing();
        }
        else {
            System.out.println("tansection failed");
        }

    }
    public void billing(){
        System.out.println();
        System.out.println();
        System.out.println("                               ***purple travels***");
        System.out.println("                               no of seats="+seats);
        System.out.println("                               total price="+amount);
        System.out.println("                               thank you!!!");
        System.out.println();
        System.out.println();
    }
}
    public class ORS {

        public static void main(String[] args) {
            int ch=0;
            railway obj=new railway();
            obj.login();
            do{
                if(obj.flag==1) {
                    obj.enquiry();
                   System.out.println("do you want continue 1/0");
                    Scanner sc = new Scanner(System.in);
                    ch = sc.nextInt();
                }
                 else {
                    System.out.println("pls enter valid details");
                    obj.login();
                }

            }
            while (ch==1);

        }

    }




