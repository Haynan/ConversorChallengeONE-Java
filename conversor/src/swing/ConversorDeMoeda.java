package swing;

import javax.swing.JOptionPane;

public class ConversorDeMoeda {
    public void mostrarConversorDeMoeda() {
        
        String[] opcoesMoedas = {
            "De reais a Dólares",
            "De reais a Euros",
            "De reais a Libras",
            "De reais a Yenes",
            "De reais a Won Coreano",
            "De Dólares a Reais",
            "De Euros a Reais",
            "De Libras a Reais",
            "De Yenes a Reais",
            "De Won Coreano a Reais"
        };
        
        String opcaoSelecionada = (String) JOptionPane.showInputDialog(
            null,
            "Escolha a moeda para a qual você deseja girar o seu dinheiro",
            "Moedas",
            JOptionPane.PLAIN_MESSAGE,
            null,
            opcoesMoedas,
            opcoesMoedas[0]
        );

        if (opcaoSelecionada != null) {
            switch (opcaoSelecionada) {
                case "De reais a Dólares":
                    // Lógica
                    break;
                case "De reais a Euros":
                    // Lógica
                    break;
                case "De reais a Libras":
                    // Lógica
                    break;
                case "De reais a Yenes":
                    // Lógica
                    break;
                case "De reais a Won Coreano":
                    // Lógica
                    break;
                case "De Dólares a Reais":
                    // Lógica
                    break;
                case "De Euros a Reais":
                    // Lógica
                    break;
                case "De Libras a Reais":
                    // Lógica
                    break;
                case "De Yenes a Reais":
                    // Lógica
                    break;
                case "De Won Coreano a Reais":
                    // Lógica
                    break;
            
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida selecionada.", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
