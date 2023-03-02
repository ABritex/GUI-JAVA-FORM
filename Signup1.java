import javax.swing.*;

public class TJ_Signup {

    private JFrame F;
    private JPanel P;
    private JLabel Signup, Firstname, Lastname, Email, Password, CPassword;
    private JTextField FNText, LNText, EText, AText, PText;
    private JPasswordField Pass, CPass;
    private JCheckBox C;
    private JComboBox G;
    private JButton Submit;

    public TJ_Signup() {
        F = new JFrame("Sign up");
        P = new JPanel();
        Signup = new JLabel();
        Firstname = new JLabel();
        Lastname = new JLabel();
        Email = new JLabel();
        Password = new JLabel();
        CPassword = new JLabel();
        CPass = new JPasswordField();
        Pass = new JPasswordField();
        FNText = new JTextField();
        LNText = new JTextField();
        EText = new JTextField();
        AText = new JTextField();
        PText = new JTextField();
        Submit = new JButton();
        C = new JCheckBox();
        F.setSize(300, 480);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F.add(P);
        P.setLayout(null);
        Signup.setText("Sign Up");
        Signup.setBounds(10, 10, 50, 25);
        P.add(Signup);
        Firstname.setText("Your First Name");
        Firstname.setBounds(10, 60, 200, 25);
        P.add(Firstname);
        FNText.setBounds(10, 90, 250, 25);
        P.add(FNText);
        Lastname.setText("Your Last Name");
        Lastname.setBounds(10, 120, 200, 25);
        P.add(Lastname);
        LNText.setBounds(10, 150, 250, 25);
        P.add(LNText);
        Email.setText("Your Email");
        Email.setBounds(10, 180, 200, 25);
        P.add(Email);
        EText.setBounds(10, 210, 250, 25);
        P.add(EText);
        Password.setText("Password");
        Password.setBounds(10, 240, 200, 25);
        P.add(Password);
        Pass.setBounds(10, 270, 250, 25);
        P.add(Pass);

        CPassword.setText("Confirm Password");
        CPassword.setBounds(10, 300, 200, 25);
        P.add(CPassword);
        CPass.setBounds(10, 330, 250, 25);
        P.add(CPass);

        C.setText("I accept the terms & condition");
        C.setBounds(10, 360, 250, 25);
        P.add(C);
        Submit.setText("Submit");
        Submit.setBounds(10, 400, 250, 25);
        P.add(Submit);
        F.setVisible(true);
    }

    public static void main(String[] args) {
        new TJ_Signup();
    }
}