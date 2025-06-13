//importação do pacote grafico 
package br.com.Jkalango.view;

//importação da parte grafica 

import javax.swing.JFrame;//janela principal
import javax.swing.JButton;// botao interativo
import javax.swing.JLabel;//exibir textos e imagems
import javax.swing.ImageIcon;// carregar imagens e 
import javax.swing.JOptionPane;//caixa de dialogo simples

//parte dos eventos, importação dos eventos 

import java.awt.FlowLayout;//gerenciar layouts para componentes
import java.awt.event.ActionEvent;//evento de ação
import java.awt.event.ActionListener;//interface para lidar com evento de ação

public class JSplash extends JFrame {
      
//criar o formulario
//fazer aparecer o formulario
//criar um botãso de start
//criar um evento que ao clicar apareça Jkalango
//colocar a imagem do kalango (sem animação)

public JSplash(){
      //criando o formulario 
      setTitle("JKalango Splash Screen");
      setSize(400,300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setLayout(new FlowLayout());

      //adcionar o botão e criar 

      JButton startButton = new JButton("Iniciar o jogo");
      add(startButton);
      //aparecer o JKalango 
      startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              new JIntro();
                 dispose();
            }
      });
      //deixar visisvel
            setVisible(true);
}



}
