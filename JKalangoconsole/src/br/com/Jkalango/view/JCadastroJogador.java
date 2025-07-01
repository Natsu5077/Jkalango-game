package br.com.Jkalango.view;

import java.awt.FlowLayout;
import java.awt.LayoutManager; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JCadastroJogador extends JFrame {

    // construtor inicializa os componentes do formulario
    public JCadastroJogador() {
        // titulo da janela
        setTitle("Faça parte do JKalango");
        // Garante que a aplicação nao seja fechada ao fechar a janela
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // tamanho da janela
        setSize(400, 450);
        // posição da janela
        setLocationRelativeTo(null);

        // Configura o layout manager para FlowLayout
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Cria e adiciona o label e o campo de texto para o nome
        JLabel lblNome = new JLabel("nome");
        JTextField txtNome = new JTextField(30); 
        add(lblNome);
        add(txtNome);

        //criar email no formulario
        JLabel lblEmail = new JLabel("Email");
        JTextField txtEmail = new JTextField(30);
        add(lblEmail);
        add(txtEmail);

        //criar nickname

        JLabel lblNickName = new JLabel("NickName");
        JTextField txtNickName = new JTextField(30);
        add(lblNickName);
        add(txtNickName);

        JLabel lblTelefone = new JLabel("Telefone: ");
        JTextField txtTelefone = new JTextField(30);
        add(lblTelefone);
        add(txtTelefone);

        JLabel lblSenha = new JLabel("Senha:");
        JPasswordField pswSenha = new JPasswordField(30);
        add(lblSenha);
        add(pswSenha);

        // Cria e adiciona o botão de cadastro
        JButton btnCadastrar = new JButton("Cadastrar");
        add(btnCadastrar);

        // Adiciona um ActionListener ao botão
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ação a ser executada quando o botão é clicado
                JOptionPane.showMessageDialog(null, "Jogador cadastrado com sucesso!");
                JCadastroJogador.this.dispose();
            }
        });

        // Torna a janela visível
        setVisible(true);
    }


        };
    