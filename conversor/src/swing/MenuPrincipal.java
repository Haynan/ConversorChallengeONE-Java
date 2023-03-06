package swing;

import javax.swing.JOptionPane;

public class MenuPrincipal {
    public static void main(String[] args) {

        String[] conversoes = {"Conversor de Moeda", "Conversor de Temperatura"};
        String conversaoEscolhida = (String) JOptionPane.showInputDialog(
            null,
            "Escolha uma opção",
            "Menu",
            JOptionPane.PLAIN_MESSAGE,
            null,
            conversoes,
            conversoes[0]);
        
        switch (conversaoEscolhida) {
        case "Conversor de Moeda":

            ConversorDeMoeda moeda = new ConversorDeMoeda();
            moeda.mostrarConversorDeMoeda();

            break;
        case "Conversor de Temperatura":
            // chama método para conversão de temperatura
            break;
        default:
            // exibe mensagem de erro para opção inválida
            JOptionPane.showMessageDialog(null, "Opção inválida selecionada.", "Erro", JOptionPane.ERROR_MESSAGE);
            break;
        }
    }
}
