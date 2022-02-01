package Game;
import java.util.Random;
import java.util.Scanner;

    class number{
        int number;
        int n;
        boolean correct=false;
        public number(){

            Random rd=new Random();
            number=rd.nextInt(1,100);

        }public void  call(){
            System.out.println("Enter The number");
            while (!correct){

                Scanner sc=new Scanner(System.in);
                n=sc.nextInt();

                if (n>number){
                    System.out.println("The Number is Greater try again");
                }
                else if (n<number){
                    System.out.println("The Number is Smaller try again");

                }
                else {
                    System.out.println("Number is Same");

                    correct=true;
                }
            }
        }
    }
    public class Games {
        public static void main(String[] args) {
            number g=new number();
            g.call();
        }
    }


