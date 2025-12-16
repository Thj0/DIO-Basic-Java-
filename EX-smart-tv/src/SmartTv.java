public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 13;


    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void canalPosterior() {
        //canal = canal +1;
        canal++;
    }

    public void canalAnterior(){
        //canal = canal -1;
        canal--;
    }

    public void aumentarVolume() {
        //volume = volume + 1;
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void dimunuirVolume() {
        //volume = volume -1;
        volume--;
        System.out.println("Diminuindo o voluma para : " + volume);
    }

    public void ligar() {
        ligada = true;
    } 
    public void desligar() {
        ligada = false;
    }
    
}
