import javax.swing.JOptionPane;

public class Telas {

    String moeda;
    String input;
    double valor;

    public String MenuPrincipal() {

        JOptionPane.showInputDialog(
            null,
            "Escolha uma opção",
            "Menu",
            JOptionPane.PLAIN_MESSAGE,
            null,
            ListasSuspensas.getConversoes(),
            ListasSuspensas.getConversoes()[0]
        );
        return null;        
    }

    public String ConversorDeMoeda() {        
        
        moeda = (String) JOptionPane.showInputDialog(
            null,
            "Escolha a moeda para a qual você deseja girar o seu dinheiro",
            "Moedas",
            JOptionPane.PLAIN_MESSAGE,
            null,
            ListasSuspensas.getOpcoesMoedas(),
            ListasSuspensas.getOpcoesMoedas()[0]
        );

        if (moeda != null) {
            switch (moeda) {
                case "De reais a Dólares":
                    // Lógica
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
                    JOptionPane.showMessageDialog(
                        null,
                        "Opção inválida selecionada.",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                    );
                    break;
            }
        }

        return null;

    }

    public String InputValor() {

        input = JOptionPane.showInputDialog(
            null,
            "Insira um valor:",
            "Input",
            JOptionPane.QUESTION_MESSAGE
        );

        try {
            Double.parseDouble(input);
        } catch (NumberFormatException e) {
            return ValorInvalido();
        }

        return ConversorDeMoeda();
        
    }

    public String ValorConvertido() {

        JOptionPane.showMessageDialog(
            null,
            "O valor convertido é: " + moeda,
            "Resultado",
            JOptionPane.INFORMATION_MESSAGE
        );
        return DesejaContinuar();
    }

    public String ValorInvalido() {
        JOptionPane.showMessageDialog(
            null,
            "Valor inválido. Insira um número"
        );
        return InputValor();
    }

    public String DesejaContinuar() {

        int opcao = JOptionPane.showConfirmDialog(
            null,
            "Deseja continuar?",
            "Confirmação",
            JOptionPane.YES_NO_CANCEL_OPTION
        );

        if (opcao == JOptionPane.YES_OPTION) {
            Teste.main(null);
        } else if (opcao == JOptionPane.NO_OPTION) {
            return ProgramaFinalizado();
        } else if (opcao == JOptionPane.CANCEL_OPTION) {
            return ProgramaFinalizado();
        }
        return null;

    }

    public String ProgramaFinalizado() {

        JOptionPane.showMessageDialog(
            null,
            "Programa finalizado"
        );
        return null;
    }
}
