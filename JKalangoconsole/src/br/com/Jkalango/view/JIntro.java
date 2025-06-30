package br.com.Jkalango.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JIntro extends JFrame implements ActionListener {

    private JButton startButton;
    private JButton startMissionButton; // Novo botão para iniciar a missão
    private JPanel mainPanel;
    private JPanel introPanel;

    public JIntro() {
        setTitle("A jornada macabra de Jkalango");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Configuração do Painel Principal
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.BLACK);

        // Configuração do Botão Inicial
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(Color.BLACK);
        startButton = new JButton("MISSÃO 01!");
        startButton.addActionListener(this); // Adiciona listener à própria classe
        buttonPanel.add(startButton);

        // Adiciona o painel do botão ao centro do mainPanel inicialmente
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // Adiciona o mainPanel à JFrame
        add(mainPanel, BorderLayout.CENTER);

        setupIntroPanel(); // Chama o método para configurar o painel de intro

        setVisible(true);
    }

    // Método para configurar o painel de introdução
    private void setupIntroPanel() {
        introPanel = new JPanel();
        introPanel.setBackground(Color.BLACK);
        // Usaremos BorderLayout para o introPanel para colocar o texto no centro e o botão no sul
        introPanel.setLayout(new BorderLayout());
        introPanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));

        JTextPane textPane = new JTextPane();
        textPane.setContentType("text/html");
        textPane.setBackground(Color.BLACK);
        // A cor do texto precisa ser algo visível no fundo preto, como branco ou cinza claro
        textPane.setForeground(Color.RED); // Mantendo o vermelho como você usou no HTML
        textPane.setFont(new Font("Monospaced", Font.PLAIN, 24));
        textPane.setEditable(false);

        String htmlContent = "<html><body style='text-align: justify; color: red; font-family: Monospaced;'>"
                               + "<p>Em um mundo distante, onde o cerrado pulsa com uma energia sobrenatural, "
                               + "<b>Jkalango</b>, um calango de escamas brilhantes e olhos que refletem o luar, "
                               + "carrega o peso de salvar sua espécie da extinção. O outrora vibrante cerrado mágico agora é um lugar de sombras retorcidas, "
                               + "onde o vento sussurra lamentos antigos e o solo parece sangrar sob a luz da lua cheia.</p>"
                               + "<p>Jkalango, ao lado de seus aliados leais, <b>Jformiga</b>, "
                               + "uma formiga com força descomunal e um passado envolto em mistério, e <b>Jabelha</b>, uma abelha cuja picada carrega veneno místico, "
                               + "enfrentará missões aterrorizantes para proteger seu lar. Mas algo maligno despertou nas profundezas do cerrado, e seus inimigos não são apenas obstáculos "
                               + "— são pesadelos vivos que caçam suas almas.</p>"
                               + "</body></html>";

        textPane.setText(htmlContent);

        JScrollPane scrollPane = new JScrollPane(textPane);
        scrollPane.setBorder(null);
        scrollPane.setBackground(Color.BLACK);

        introPanel.add(scrollPane, BorderLayout.CENTER); // Texto no centro do introPanel

        // Adicionando o botão iniciar missão
        startMissionButton = new JButton("Iniciar Missão");
        startMissionButton.addActionListener(this); // A própria JIntro também ouve o clique deste botão

        // Criar um painel para o botão
        JPanel missionButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        missionButtonPanel.setBackground(Color.BLACK);
        missionButtonPanel.add(startMissionButton);

        introPanel.add(missionButtonPanel, BorderLayout.SOUTH);

       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            // Remove o painel atual com o botão MISSÃO 01!
            mainPanel.removeAll();
            // Adiciona o painel de introdução com o botão iniciar
            mainPanel.add(introPanel, BorderLayout.CENTER);
            // Atualiza o layout
            mainPanel.revalidate();
            mainPanel.repaint();
        } else if (e.getSource() == startMissionButton) {
            // Quando o botão "Iniciar Missão" é clicado:
            // 1. Abre a janela de cadastro de jogador
            new JCadastroJogador().setVisible(true); // Garante que a nova janela seja visível
            // 2. Fecha a janela de introdução (JIntro)
            dispose();
       
        }
    }
    
   

        }