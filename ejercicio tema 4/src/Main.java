public class Main {
    public static void main(String[] args) {
        var numerolf = 0;
        if(numerolf >0){
            System.out.println("El numero es positivo" );

        } else if (numerolf<0) {
            System.out.println("El numero es negativo" );

        }else{
            System.out.println("El numero es cero " );
        }

        var numeroWhile = 0;
        while(numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }


        var numeroWhileDo = 2;
        do{
            System.out.println(numeroWhileDo);
            numeroWhileDo++;
        }while (numeroWhileDo<3);


        for(var numeroFor =0; numeroFor <=3; numeroFor++){
            System.out.println(numeroFor);
        }

        var estacion = "verano";
        switch (estacion){
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }


}