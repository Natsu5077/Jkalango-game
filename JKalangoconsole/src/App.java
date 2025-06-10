public class App {
    public static void main(String[] args) throws Exception {
       
        Formiga f = new Formiga ("Açucarado");
        f.mover();
        f.mover();
        f.mover();
        f.som();
        f.dormir();
        f.mover();
        f.atacar();
        f.comer();
        f.energiaAtual();
        Kalango k = new Kalango("Rangonildo");
        k.mover();
        k.mover();
        k.mover();
        k.som();
        k.dormir();
        k.atacar();
        k.comer();
        k.mover();
        k.mover();
        k.mover();
        k.mover();
        k.energiaAtual();
        Abelinha a = new Abelinha("Mel-azedo");
        a.mover();
        a.mover();
        a.mover();
        a.som();
        a.dormir();
        a.atacar();
        a.comer();
        k.mover();
        k.mover();
        a.atacar();  
        a.atacar();
        a.energiaAtual();
    }

}
