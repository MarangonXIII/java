package login;

import view.jfrLogin;

public class Login {

    public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(() -> {
          new jfrLogin().setVisible(true);
        });
    }
}
