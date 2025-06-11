public class Kalango extends Personagem implements IArmamento{

    public Kalango (String nome){
        super(nome);
        System.out.println("OLÁ! me chamo " + this.nome);
    }
    @Override
    public void mover(){
        energia-=3;
        System.out.println(nome + " esta correndo com velocidade");
        if (energia <0){
            energia=0;
            System.out.println(nome +" Sem energia ação não executada");
        }
        energiaAtual();
    }
    @Override
    public void som(){
        System.out.println("Tssss");
    }
    @Override
    public void comer(){
        energia+=4;
        System.out.println("Nham Nham ");
        energiaAtual();
    }
    @Override
    public void atacar() {
        System.err.println(nome + " ataca de 3 formas");
    }
    
}
