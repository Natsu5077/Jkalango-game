package br.com.jkalango.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.com.jkalango.dto.NovoJogador; 

public class JCadastroJogadorGabarito extends JFrame {

    public JCadastroJogadorGabarito() {
  
        setTitle("Cadastro de Jogador - JKalango");
        setSize(300, 150); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

   
        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField(20); 
        add(lblNome);
        add(txtNome);
 
        JButton btnCadastrar = new JButton("Cadastrar");
        add(btnCadastrar);


        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           
                String nome = txtNome.getText().trim();

             
                if (nome.isEmpty()) {
                    JOptionPane.showMessageDialog(JCadastroJogadorGabarito.this, "Por favor, preencha o nome.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
                    return; 
                }

                try {
            
                    NovoJogador novoJogador = new NovoJogador(nome);

             
                    String mensagem = "Jogador Cadastrado com Sucesso!\n" +
                                      "Nome: " + novoJogador.getNome();

                    JOptionPane.showMessageDialog(JCadastroJogadorGabarito.this, mensagem, "Cadastro Realizado", JOptionPane.INFORMATION_MESSAGE);

             
                    dispose();

                } catch (IllegalArgumentException ex) {
                   
                    System.err.println("Erro de validação ao cadastrar jogador: " + ex.getMessage());
                } catch (Exception ex) {
                
                    JOptionPane.showMessageDialog(JCadastroJogadorGabarito.this, "Ocorreu um erro ao cadastrar o jogador: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace(); 
                }
            }
        });

      
        setVisible(true);
    }
}