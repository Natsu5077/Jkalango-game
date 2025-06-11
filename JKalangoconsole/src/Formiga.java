public class Formiga extends Personagem implements IArmamento{
    
    public Formiga (String nome){
        super(nome);
        System.out.println("OLÁ me chamo " + this.nome);
    }
    @Override
    public void mover() {
        energia-=2;
        System.out.println( nome +" esta andando para frente... se perder o caminho game-over");
        if (energia <0){
            energia=0;
            System.out.println(nome +" esta sem energia ação não executada");
        }
        energiaAtual();
    }
    @Override
    public void som(){
        System.out.println("Fzzzz");
    }
    @Override
    public void comer(){
        energia+=1;
        System.out.println("Nham Nham ");
        energiaAtual();
    }
    @Override
    public void atacar() {
       System.err.println(nome + " Ataca com quatro formas ");
    }

}
