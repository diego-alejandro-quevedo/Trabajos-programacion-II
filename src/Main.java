import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random= new Random();

        int dado1,dado2,dado3,sum1,sum2, sum3;

        sum1=0;
        sum2=0;
        sum3=0;

        for(int i=1;i<=20;i++){

            dado1 = random.nextInt((6 - 1)+1)+1;
            sum1=sum1+dado1;


            dado2 = random.nextInt((6 - 1)+1)+1;
            sum2=sum2+dado2;

            dado3 = random.nextInt((6 - 1)+1)+1;
            sum3=sum3+dado3;

        }

         if(sum1>sum2 && sum1>sum3){
            System.out.println("el dado uno es el mayor "+sum1);
            if (sum2>sum3){
                System.out.println("el dado dos es el del medio "+sum2);
                System.out.println("el dado tres es el menor "+sum3);
            }
            else {
                System.out.println("el dado tres es el del medio "+sum3);
                System.out.println("el dado dos es el menor "+sum2);
            }
        }
        else if(sum2>sum3){
             System.out.println("el dado dos es el mayor "+sum2);
             if (sum1>sum3){
                 System.out.println("el dado uno es el del medio "+sum1);
                 System.out.println("el dado tres es el menor "+sum3);
             }
             else {
                 System.out.println("el dado tres es el del medio "+sum3);
                 System.out.println("el dado uno es el menor "+sum1);
             }
        }
        else {
             System.out.println("el dado tres es el mayor "+sum3);
             if (sum1>sum2){
                 System.out.println("el dado uno es el del medio "+sum1);
                 System.out.println("el dado dos es el menor "+sum2);
             }
             else {
                 System.out.println("el dado dos es el del medio "+sum2);
                 System.out.println("el dado uno es el menor "+sum1);
             }
         }


    }
}