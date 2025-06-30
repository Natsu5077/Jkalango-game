import br.com.Jkalango.view.JCadastroJogador;
import br.com.Jkalango.view.JIntro;
import br.com.Jkalango.view.JMissaoobjeto;
import br.com.Jkalango.view.JSplash;


public class App {
    public static void main(String[] args) throws Exception {
        new JIntro();
        new JSplash();
        new JMissaoobjeto();
        new JCadastroJogador();
        
        Formiga f = new Formiga ("Açucarado");
        f.mover();
        f.mover();
        f.mover();
        f.som();
        f.dormir();
        f.mover();
        f.atacar();
        f.comer();
        f.atacar();
        f.energiaAtual();
        f.cansado();

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
        k.cansado();

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
        a.cansado();
    }

}
