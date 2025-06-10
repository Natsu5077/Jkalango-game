public abstract class Personagem {
    protected int energia =10;
    protected String nome;
public abstract void mover();
public abstract void som();
public abstract void atacar();
public abstract void comer();

public Personagem (String nome){
    this.nome=nome;

}
public void dormir(){
    energia += 10;
    System.out.println(nome + " esta no soninho... ZzZzZz");
    System.out.println(nome + " Recuperou 10 de nergia ");
}
public void energiaAtual (){
    System.out.println("A energia atual do " + nome + " é: " + energia);
}
public void cansado(){
    if (energia <5){
        System.out.println(nome + " Está muito cansado :(");
    }else{
        System.err.println(nome + " Não esta cansado! ");
    }
}
}
