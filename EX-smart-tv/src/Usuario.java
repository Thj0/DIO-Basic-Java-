public class Usuario {
    public static void main(String[] args) throws Exception {
        
 
        SmartTv smartTv = new SmartTv();

        smartTv.dimunuirVolume();
        smartTv.dimunuirVolume();
        smartTv.dimunuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual :" + smartTv.volume);



        System.out.println("TV Ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual :" + smartTv.canal);
        System.out.println("Volume Atual :" + smartTv.volume);


        smartTv.ligar(); 
        System.out.println("A Tv continua ligada?" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("E agora, ainda está ligada?" + smartTv.ligada);


        smartTv.mudarCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);




    }
}
