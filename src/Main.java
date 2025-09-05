import java.util.*;

public class Main {

    public static void main(String[] args) {

        menu();

    }

    public static void menu(){

        Scanner scn=new Scanner(System.in);
        boolean estado=true;
        while(estado){

            System.out.println("Ingrese el numero del ejercicio que desea ejecutar\n1. juego de dos dados\n2. juego de tres dados\n3. Indice de masa corporal\n6.salir");

            int opcion=scn.nextInt();



            switch (opcion){

                case 1:

                    dosdados();

                    break;

                case 2:

                    tresdados();

                    break;

                case 3:

                    System.out.println(indice());

                    break;

                case 6:
                    estado=false;
                    break;

            }

        }



    }

    public static void dosdados(){
        System.out.println("entro en el juego de 2 dados");

        Random random =new Random();

        int dado1,dado2,sum1,sum2;

        sum1=0;
        sum2=0;

        for(int i=1;i<=20;i++){

            dado1 = random.nextInt((6 - 1)+1)+1;
            sum1=sum1+dado1;


            dado2 = random.nextInt((6 - 1)+1)+1;
            sum2=sum2+dado2;

        }

        if(sum1==sum2){
            System.out.println("es un empate");
            System.out.println("la suma del dado1 es:"+sum1);
            System.out.println("la suma del dado2 es:"+sum2);
        }

        else if(sum1>sum2){
            System.out.println("el dado uno gana");
            System.out.println("la suma del dado1 es:"+sum1);
            System.out.println("la suma del dado2 es:"+sum2);
        }
        else{
            System.out.println("el dado dos gana ");
            System.out.println("la suma del dado1 es:"+sum1);
            System.out.println("la suma del dado2 es:"+sum2);
        }


    }

    public static void tresdados(){

        Random random =new Random();

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

    public static  String indice(){

        Scanner scn=new Scanner(System.in);

        double altura,peso,imc;

        System.out.println("ingrese el peso de la persona (Kg)");
        peso=scn.nextDouble();

        System.out.println("ingrese el altura de la persona (M)");
        altura=scn.nextDouble();

        imc=peso/(Math.pow(altura,2));

        if (imc<18.5){
            return"la cituacion des de bajo peso";
        }
        else if(imc>=18.5 && imc<=24.9){
            return"la cituacion des de peso normal";
        }

        else if(imc>=25 && imc<=26.9){
            return"la cituacion des de sobre peso de grado 1";
        }

        else if(imc>=27 && imc<=29.9){
            return"la cituacion des de sobre peso de grado 2";
        }

        else if(imc>=30 && imc<=34.9){
            return "la cituacion des de obecidad de grado 1";
        }
        else if(imc>=35 && imc<=39.9){
            return "la cituacion des de obecidad de grado 2";
        }
        else if(imc>=40 && imc<=49.9){
            return "la cituacion des de obecidad de grado 3(obecidad morvida)";
        }
        else{
            return "la cituacion des de obecidad de grado 4(obecidad extrema)";
        }


    }

}