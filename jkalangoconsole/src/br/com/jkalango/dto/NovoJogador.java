package br.com.jkalango.dto;

import javax.swing.JOptionPane;

public class NovoJogador {
    private String nome;


    public NovoJogador() {
    }

    
    public NovoJogador(String nome) {
        validarNome(nome); 
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String novoNome) {
        validarNome(novoNome); 
        this.nome = novoNome;
    }


    private void validarNome(String nomeParaValidar) {
        if (!nomeParaValidar.toLowerCase().contains("java")) {
            JOptionPane.showMessageDialog(null, "Deve ser Javanes para cadastrar. Adicione Java no nome", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
            throw new IllegalArgumentException("O nome do jogador deve conter a palavra 'java'.");
        }
    }
}