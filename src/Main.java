import java.util.*;

public class Main {

   public static Scanner scn=new Scanner(System.in);
   public static Random random =new Random();

    public static void main(String[] args) {

        menu();

    }

    public static void menu(){


        boolean estado=true;
        while(estado){

            System.out.println("Ingrese el numero del ejercicio que desea ejecutar\n1. juego de dos dados\n2. juego de tres dados\n3. Indice de masa corporal\n4. adivina el numero\n5.juego de diferencia de puntos \n6.salir");

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

                case 4:

                    System.out.println(adivino());

                    break;

                case 5:

                    System.out.println(juegopuntos());

                    break;

                case 6:
                    estado=false;
                    break;

            }

        }



    }

    public static void dosdados(){
        System.out.println("entro en el juego de 2 dados");



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

        double altura,peso,imc;

        System.out.println("ingrese el peso de la persona (Kg)");
        peso=scn.nextDouble();

        System.out.println("ingrese el altura de la persona (M)");
        altura=scn.nextDouble();

        imc=peso/(Math.pow(altura,2));

        if (imc<18.5){
            return"la cituacion es de bajo peso";
        }
        else if(imc>=18.5 && imc<=24.9){
            return"la cituacion es de peso normal";
        }

        else if(imc>=25 && imc<=26.9){
            return"la cituacion es de sobre peso de grado 1";
        }

        else if(imc>=27 && imc<=29.9){
            return"la cituacion es de sobre peso de grado 2";
        }

        else if(imc>=30 && imc<=34.9){
            return "la cituacion es de obecidad de grado 1";
        }
        else if(imc>=35 && imc<=39.9){
            return "la cituacion es de obecidad de grado 2";
        }
        else if(imc>=40 && imc<=49.9){
            return "la cituacion es de obecidad de grado 3(obecidad morvida)";
        }
        else{
            return "la cituacion es de obecidad de grado 4(obecidad extrema)";
        }


    }

    public static  String adivino(){

        int opcion,jugador;

        opcion= random.nextInt((5-1)+1)+1;

        for(int i=1;i<=3;i++){
            System.out.println("Intento: "+i+" de 3");

            System.out.println("ingrece un numero de 1 al 5");
            jugador= scn.nextInt();

            if(jugador==opcion){
                return "Felicidades el nuero coincide \n"+"jugador: "+jugador+"\n"+"Maquina: "+opcion;
            }
            else{
                System.out.println("vuelve a intentar");
            }
        }
            return "fin del juego";
    }

    public static String juegopuntos(){

        int jugador1=0;
        int jugador2=0;
        int dado1,dado2,res;

        boolean act=true;

       while (act){
       //for(int i=1;i<=3;i++){

           dado1=random.nextInt((6-1)+1)+1;
           dado2=random.nextInt((6-1)+1)+1;
           System.out.println("dado1: "+dado1);
           System.out.println("dado2: "+dado2);

           if(dado1==1){
               jugador1=jugador1-dado1;
               System.out.println("puntos1:"+jugador1);
           }
           else if(dado1==6) {
               jugador1=jugador1+6;
               System.out.println("puntos1:"+jugador1);
           }
           else{

               jugador1= jugador1+dado1;
               System.out.println("puntos1:"+jugador1);
           }


           if(dado2==1){
               jugador2=jugador2-dado2;
               System.out.println("puntos2:"+jugador2);
           } else if (dado2==6) {
               jugador2=jugador2+6;
               System.out.println("puntos2:"+jugador2);

           }
           else{

               jugador2= jugador2+dado2;
               System.out.println("puntos2:"+jugador2);
           }

           if (jugador1>jugador2){
               res=jugador1-jugador2;
               System.out.println("resultado1 "+res);
               if (res>=3){
                   System.out.println("el ganador es el jugador1 ");
                   act=false;
               }
           }

           else {
                   res=jugador2-jugador1;
                   System.out.println("resultado2 "+res);
                   if (res>=3){
                       System.out.println("el ganador es el jugador2 ");
                       act=false;
                   }
               }


       }
       return "fin del juego";
    }


}