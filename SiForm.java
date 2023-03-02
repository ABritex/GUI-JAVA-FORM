import javax.swing.*;

public class SiForm {

    private JFrame F;
    private JPanel P;
    private JLabel Signup, Fname, Lname, Email, Address, Gender, Password;
    private JTextField FNText, LNText, EText, AText, PText;
    private JCheckBox C;
    private JComboBox G;
    private JButton Submit;

    public SiForm() {
        F = new JFrame("Sign up");
        P = new JPanel();
        Signup = new JLabel();
        Fname = new JLabel();
        Lname = new JLabel();
        Email = new JLabel();
        Address = new JLabel();
        Gender = new JLabel();
        Password = new JLabel();
        FNText = new JTextField();
        LNText = new JTextField();
        EText = new JTextField();
        AText = new JTextField();
        PText = new JTextField();
        Submit = new JButton();
        C = new JCheckBox();
        F.setSize(300, 530);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F.add(P);
        P.setLayout(null);
        Signup.setText("Sign Up");
        Signup.setBounds(10, 10, 50, 25);
        P.add(Signup);
        Fname.setText("First Name :");
        Fname.setBounds(10, 60, 200, 25);
        P.add(Fname);
        FNText.setBounds(10, 90, 250, 25);
        P.add(FNText);
        Lname.setText("Last Name :");
        Lname.setBounds(10, 120, 200, 25);
        P.add(Lname);
        LNText.setBounds(10, 150, 250, 25);
        P.add(LNText);
        Email.setText("Email :");
        Email.setBounds(10, 180, 200, 25);
        P.add(Email);
        EText.setBounds(10, 210, 250, 25);
        P.add(EText);
        Address.setText("Address :");
        Address.setBounds(10, 240, 200, 25);
        P.add(Address);
        AText.setBounds(10, 270, 250, 25);
        P.add(AText);
        Gender.setText("Gender :");
        Gender.setBounds(10, 300, 200, 25);
        P.add(Gender);
        String Gender1[] = { "Male", "Female", "Other" };
        G = new JComboBox(Gender1);
        G.setBounds(10, 330, 90, 20);
        P.add(G);
        Password.setText("Password :");
        Password.setBounds(10, 360, 200, 25);
        P.add(Password);
        PText.setBounds(10, 390, 250, 25);
        P.add(PText);
        C.setText("I accept the terms & condition");
        C.setBounds(10, 420, 250, 25);
        P.add(C);
        Submit.setText("Submit");
        Submit.setBounds(10, 460, 250, 25);
        P.add(Submit);
        F.setVisible(true);
    }

    public static void main(String[] args) {
        new SiForm();
    }
}