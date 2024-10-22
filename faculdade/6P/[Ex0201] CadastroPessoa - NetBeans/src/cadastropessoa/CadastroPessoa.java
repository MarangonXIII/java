package cadastropessoa;

import view.jfrCadastro;

public class CadastroPessoa {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(()->{
            new jfrCadastro().setVisible(true);
        });
    }
}
