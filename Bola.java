abstract class Bola {
    
    private String nomeDaMarca;

    public Bola (String nomeDaMarca){
    this.nomeDaMarca = nomeDaMarca;
    }

    public String getNomeDaMarca() {
        return nomeDaMarca;
    }
    
    abstract void quicar();
}
