public class BolaDeFutebol extends Bola {
    public BolaDeFutebol (String nomeDaMarca){
       super(nomeDaMarca);
    }
    void lancar(){
        System.out.println("Bolas de Futebol da marca " + getNomeDaMarca() + "são rápidas... ");
    }

    public void quicar(){
        System.out.println("Bolas de Futebol quicam muito... ");
    }
}
