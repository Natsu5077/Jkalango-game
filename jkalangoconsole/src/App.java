import br.com.jkalango.view.JSplash;
import br.com.jkalango.view.JCadastroJogadorGabarito; 

public class App {
    public static void main(String[] args) throws Exception {
        new JSplash();

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JCadastroJogadorGabarito(); 
            }
        });

        Formiga f = new Formiga();
        f.mover();
        f.atacar();
    }
}