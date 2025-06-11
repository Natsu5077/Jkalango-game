public class PersonagemNaoJogavel extends Personagem{

@Override
public void mover(){
      
}
@Override
public void som() {
      
      throw new UnsupportedOperationException("Unimplemented method 'som'");
}
@Override
public void comer() {
     
      throw new UnsupportedOperationException("Unimplemented method 'comer'");
}
}
