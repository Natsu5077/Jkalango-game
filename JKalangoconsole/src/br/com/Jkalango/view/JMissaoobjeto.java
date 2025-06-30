package br.com.Jkalango.view;

import br.com.Jkalango.bo.IColor; // Certifique-se de que esta interface existe
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

public class JMissaoobjeto extends JFrame implements IColor, ActionListener {

    private JButton startButton; // O botão inicial para "A maldição..."
    private JButton startMissionButton; // Botão para iniciar a missão real (dentro do introPanel)
    private JPanel mainPanel;
    private JPanel introPanel;

    public JMissaoobjeto() {
        setTitle("A maldição do cerrado codificado");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Mudei para DISPOSE_ON_CLOSE
                                                          // Se esta for uma tela intermediária e não a principal.
                                                          // Se for a última tela, EXIT_ON_CLOSE pode ser ok.
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.BLACK);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(Color.BLACK);
        startButton = new JButton("A maldição do cerrado codificado");
        startButton.addActionListener(this); // O 'this' aponta para o actionPerformed desta classe
        buttonPanel.add(startButton);

        // Adiciona o painel do botão ao centro do mainPanel inicialmente
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // Adiciona o mainPanel à JFrame
        add(mainPanel, BorderLayout.CENTER);

        setupIntroPanel(); // Chama o método para configurar o painel de introdução (mas ainda não o adiciona ao mainPanel)

        setVisible(true);
    }

    private void setupIntroPanel() {
        introPanel = new JPanel();
        introPanel.setBackground(Color.BLACK);
        introPanel.setLayout(new BorderLayout());
        introPanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));

        JTextPane textPane = new JTextPane();
        textPane.setContentType("text/html");
        textPane.setBackground(Color.BLACK);
        // Corrigido para uma cor visível no fundo preto. Usei RED como no seu HTML.
        textPane.setForeground(Color.RED); 
        textPane.setFont(new Font("Monospaced", Font.PLAIN, 24));
        textPane.setEditable(false);

        String htmlContent = "<html><body style='text-align: justify; color: red; font-family: Monospaced;'> "
                           + "<p> Em uma noite sem estrelas, quando Jkalango sente um erro no Código do Cerrado, um tremor que ameaça apagar sua espécie."
                           + "Ele pode invocar seus aliados -JFormiga e JAbelinha - usando uma Interface chamada Combate, que garante que todos implementem Métodos como atacar() ou partir sozinho neste embate</p></body></html>";
        textPane.setText(htmlContent);

        JScrollPane scrollPane = new JScrollPane(textPane);
        scrollPane.setBorder(null);
        scrollPane.setBackground(Color.BLACK);

        introPanel.add(scrollPane, BorderLayout.CENTER); // Texto no centro do introPanel

        // Adicionando o botão 'Iniciar Missão' dentro do introPanel
        startMissionButton = new JButton("Iniciar Missão"); // Mudei o nome da variável para não confundir com o startButton principal
        startMissionButton.addActionListener(this); // 'this' para o actionPerformed desta classe
        
        JPanel missionButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        missionButtonPanel.setBackground(Color.BLACK);
        missionButtonPanel.add(startMissionButton);
        
        introPanel.add(missionButtonPanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            // Remove o painel inicial com o botão "A maldição do cerrado codificado"
            mainPanel.removeAll();
            // Adiciona o painel de introdução com o texto e o botão "Iniciar Missão"
            mainPanel.add(introPanel, BorderLayout.CENTER);
            // Atualiza o layout
            mainPanel.revalidate();
            mainPanel.repaint();
        } else if (e.getSource() == startMissionButton) {
            // Ação quando o botão "Iniciar Missão" dentro do introPanel é clicado
            JOptionPane.showMessageDialog(this, "Missão iniciada!");
            // Aqui você pode adicionar a lógica para avançar para a próxima etapa do jogo
            // Por exemplo: new ProximaTelaDoJogo().setVisible(true); dispose();
        }
    }

    @Override
    public void mudarfundo(Color newColor) {
        // Implementação da interface IColor.
        // Você pode aplicar a nova cor ao fundo do mainPanel ou de outros componentes.
        mainPanel.setBackground(newColor);
        mainPanel.repaint(); // Garante que a mudança seja desenhada
    }
   
        }
    