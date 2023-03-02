import javax.swing.*;

public class RegForm {
    private JFrame Frame;
    private JPanel panel;
    private JLabel Title, Firstname, Lastname, Address, Gender, Email, Phone, Username, Password;
    private JTextField FNameText, LNameText, AddText, EmailText, PhoneText, UserText, PassText;
    private JButton Submit;
    private JComboBox GCB;

    RegForm() {
        Frame = new JFrame();
        panel = new JPanel();
        Title = new JLabel();
        Firstname = new JLabel();
        Lastname = new JLabel();
        Address = new JLabel();
        Gender = new JLabel();
        Email = new JLabel();
        Phone = new JLabel();
        Username = new JLabel();
        Password = new JLabel();
        FNameText = new JTextField();
        LNameText = new JTextField();
        AddText = new JTextField();
        EmailText = new JTextField();
        PhoneText = new JTextField();
        UserText = new JTextField();
        PassText = new JTextField();
        Submit = new JButton();

        Frame.setSize(500, 700);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.add(panel);
        panel.setLayout(null);

        Title.setText("REGISTRATION FORM");
        Title.setBounds(170, 20, 200, 25);
        panel.add(Title);

        Firstname.setText("First Name :");
        Firstname.setBounds(60, 60, 200, 25);
        panel.add(Firstname);
        FNameText.setBounds(60, 90, 350, 25);
        panel.add(FNameText);

        Lastname.setText("Last Name :");
        Lastname.setBounds(60, 120, 200, 25);
        panel.add(Lastname);
        LNameText.setBounds(60, 150, 350, 25);
        panel.add(LNameText);

        Address.setText("Address :");
        Address.setBounds(60, 180, 200, 25);
        panel.add(Address);
        AddText.setBounds(60, 210, 350, 25);
        panel.add(AddText);

        Gender.setText("Gender :");
        Gender.setBounds(60, 240, 200, 25);
        panel.add(Gender);
        String Gender[] = { "Male", "Female", "Other" };
        GCB = new JComboBox(Gender);
        GCB.setBounds(60, 270, 90, 20);
        panel.add(GCB);

        Email.setText("Email :");
        Email.setBounds(60, 300, 200, 25);
        panel.add(Email);
        EmailText.setBounds(60, 330, 350, 25);
        panel.add(EmailText);

        Phone.setText("Phone Number :");
        Phone.setBounds(60, 360, 200, 25);
        panel.add(Phone);
        PhoneText.setBounds(60, 390, 350, 25);
        panel.add(PhoneText);

        Username.setText("Username :");
        Username.setBounds(60, 420, 200, 25);
        panel.add(Username);
        UserText.setBounds(60, 450, 350, 25);
        panel.add(UserText);

        Password.setText("Password :");
        Password.setBounds(60, 480, 200, 25);
        panel.add(Password);
        PassText.setBounds(60, 510, 350, 25);
        panel.add(PassText);

        Submit.setText("Submit Registration");
        Submit.setBounds(60, 560, 350, 25);
        panel.add(Submit);

        Frame.setVisible(true);

    }

    public static void main(String[] args) {
        new RegForm();
    }
}
