public class BolaDeBoliche extends Bola {
     BolaDeBoliche (String nomeDaMarca){
       super(nomeDaMarca);
    }
    public void lancar(){
        System.out.println("Bolas de boliche da marca  " + getNomeDaMarca() + " são boas para lançar... ");
    }

    public void quicar(){
        System.out.println("Bolas de Boliche não quicam muito... ");
    }
}
