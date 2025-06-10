public abstract class Personagem {
    protected int energia =10;
    protected String nome;
public abstract void mover();
public abstract void som();
public abstract void atacar();
public abstract void cansado();
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
}
