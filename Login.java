import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    private JPanel panel1;
    private JPanel sidePanel;
    private JPanel mainPanel;
    private JPasswordField fpassword;
    private JTextField tfUsername;
    private JButton btnLogin;
    private JLabel username;
    private JLabel password;

    public Login() {
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = tfUsername.getText();
                String password = new String(fpassword.getPassword());

                if (authenticateUser(username, password)) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    // Proceed with the desired action after successful login
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password!");
                }
            }
        });
    }

    private boolean authenticateUser(String username, String password) {
        String url = "jdbc:mysql://######/####";
        String dbUsername = "#######";
        String dbPassword = "########!";

        try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword)) {
            String query = "SELECT * FROM Login WHERE username = ? AND password = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}