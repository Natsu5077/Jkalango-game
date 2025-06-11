public class Abelinha extends Personagem implements IArmamento{
    
  public Abelinha(String nome){
    super(nome);
    System.out.println("OLÁ me chamo " + this.nome);
  }
    @Override
    public void mover() {
        energia-=1;
      System.out.println(nome + " está voando em  360... na doida, se perder o polém game-over");
      if (energia <0){
        energia=0;
        System.out.println(nome + " Sem energia ação não executada");
      }
      energiaAtual();
    }
    @Override
    public void som(){
        System.out.println("BzzzBZZZ");
    }
    @Override
    public void comer(){
        energia+=2;
        System.out.println("Nham Nham ");
        energiaAtual();
    }
    @Override
    public void atacar() {
      System.err.println(nome + " ataca de duas formas ");
    }
}
