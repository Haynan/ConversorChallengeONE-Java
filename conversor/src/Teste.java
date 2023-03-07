import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {

        Telas menuPrincipal = new Telas();
        String input = menuPrincipal.MenuPrincipal();
        
        switch (input) {
            case "Conversor de Moeda":
                Telas novoValor = new Telas();
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
