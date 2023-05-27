import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {

        TelasConversorMoedas menuPrincipal = new TelasConversorMoedas();
        String input = menuPrincipal.MenuPrincipal();
        
        switch (input) {
            case "Conversor de Moeda":
                TelasConversorMoedas novoValor = new TelasConversorMoedas();
                novoValor.InputValor();
                break;
            case "Conversor de Temperatura":
                // chama método para conversão de temperatura
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
}
