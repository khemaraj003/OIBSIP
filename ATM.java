//KHEMARAJ MAHAJAN
import java.util.Scanner;
class machine{
   // public
    int []arr=new int[20];
    int i=0;
    public int spin=1234;
    public int temp;
    public int choice;
    public int ch;
    public int deposite;
    public int withdraw;
    public int balance=100000;
    public void transaction(){
        System.out.println("your transactions are ---");
        for(int j=0;j<i;j++){
            System.out.println(arr[j]);
        }
    }
    public void check_balance(){
        System.out.println("your balance is"+balance);
    }
    public void cash_withdraw(){
        System.out.println("enter amount to be withdrawn");

        Scanner sc=new Scanner(System.in);
        withdraw=sc.nextInt();
        temp=balance-withdraw;


            if(temp>1500){
                balance=balance-withdraw;
                System.out.println("check your cash!!");
                arr[i]=-withdraw;
                i++;
            }
            else{
                System.out.println("transection failed");
            }
        }

    public void cash_deposit(){
        System.out.println("enter amoount to be deposite");
        Scanner scan=new Scanner(System.in);
        deposite=scan.nextInt();
        balance=balance+deposite;
        arr[i]=+deposite;
        i++;
    }



}

public class ATM {
    public static void main(String[] args){
        machine obj=new machine();


        System.out.println("enter your pin");
        Scanner sc=new Scanner(System.in);
        int pin=sc.nextInt();
        if(obj.spin==pin){
            do{
                System.out.println("===========================");
                System.out.println("****WELCOME TO ATM****");
                System.out.println("===========================");
                System.out.println("1.CHECk BALANCE");
                System.out.println("2. CASH WITHDRAW");
                System.out.println("3.CASH DEPOSITE");
                System.out.println("4.TRANSACTION history");
                System.out.println("5.EXIT");
                System.out.println("***enter your choice***");
                obj.ch=sc.nextInt();
                switch (obj.ch){
                    case 1:
                        obj.check_balance();
                        break;

                    case 2:
                        obj.cash_withdraw();
                        break;
                    case 3:
                        obj.cash_deposit();
                        break;
                    case 4:
                        obj.transaction();
                        break;

                    case 5:
                        System.out.println("***THANK YOU VISIT AGAIN*** ");
                        break;
                }
                System.out.println("do you want continue 1/0");
                obj.choice=sc.nextInt();
            }
            while (obj.choice==1 );
        }
        else{
            System.out.println("INVALIDE PIN");
        }

    }

}
