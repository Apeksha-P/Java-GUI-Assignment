import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterForm extends JFrame implements ActionListener {
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel email;
    private JTextField temail;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup genderGroup;
    private JLabel birth;
    private JComboBox day;
    private JComboBox month;
    private JComboBox year;
    private JLabel userName;
    private JTextField tUserName;
    private JLabel password;
    private JPasswordField tpassword;
    private JLabel confirmPassword;
    private JPasswordField tConfirmPassword;
    private JCheckBox robot;
    private JSlider puzzleSlider;
    private JButton sign;
    private final String[] dates ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private final String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    private final String[] years = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};
    public RegisterForm(){
        setTitle("Register Form");
        setBounds(300,40,800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setVisible(true);

        Container c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Register Form");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(300,30);
        title.setLocation(250,30);
        c.add(title);

        name = new JLabel("Name: ");
        name.setFont(new Font("Arial",Font.PLAIN,20));
        name.setSize(100,20);
        name.setLocation(100,100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial",Font.PLAIN,15));
        tname.setSize(200,20);
        tname.setLocation(300,100);
        c.add(tname);

        email = new JLabel("Email: ");
        email.setFont(new Font("Arial",Font.PLAIN,20));
        email.setSize(100,20);
        email.setLocation(100,150);
        c.add(email);

        temail = new JTextField();
        temail.setFont(new Font("Arial",Font.PLAIN,15));
        temail.setSize(200,20);
        temail.setLocation(300,150);
        c.add(temail);

        gender = new JLabel("Gender: ");
        gender.setFont(new Font("Arial",Font.PLAIN,20));
        gender.setSize(100,20);
        gender.setLocation(100,200);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial",Font.PLAIN,20));
        male.setSize(100,15);
        male.setLocation(300,200);
        male.setSelected(true);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial",Font.PLAIN,20));
        female.setSize(100,15);
        female.setLocation(420,200);
        c.add(female);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        birth = new JLabel("Birth Day: ");
        birth.setFont(new Font("Arial",Font.PLAIN,20));
        birth.setSize(100,20);
        birth.setLocation(100,250);
        c.add(birth);

        day = new JComboBox(dates);
        day.setFont(new Font("Arial",Font.PLAIN,15));
        day.setSize(50,20);
        day.setLocation(300,250);
        c.add(day);

        month = new JComboBox(months);
        month.setFont(new Font("Arial",Font.PLAIN,15));
        month.setSize(100,20);
        month.setLocation(350,250);
        c.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial",Font.PLAIN,15));
        year.setSize(100,20);
        year.setLocation(450,250);
        c.add(year);

        userName = new JLabel("User Name: ");
        userName.setFont(new Font("Arial",Font.PLAIN,20));
        userName.setSize(200,20);
        userName.setLocation(100,300);
        c.add(userName);

        tUserName = new JTextField();
        tUserName.setFont(new Font("Arial",Font.PLAIN,15));
        tUserName.setSize(200,20);
        tUserName.setLocation(300,300);
        c.add(tUserName);

        password = new JLabel("Password: ");
        password.setFont(new Font("Arial",Font.PLAIN,20));
        password.setSize(200,20);
        password.setLocation(100,350);
        c.add(password);

        tpassword = new JPasswordField();
        tpassword.setFont(new Font("Arial",Font.PLAIN,20));
        tpassword.setSize(200,20);
        tpassword.setLocation(300,350);
        c.add(tpassword);

        confirmPassword = new JLabel("Confirm Password: ");
        confirmPassword.setFont(new Font("Arial",Font.PLAIN,20));
        confirmPassword.setSize(200,20);
        confirmPassword.setLocation(100,400);
        c.add(confirmPassword);

        tConfirmPassword = new JPasswordField();
        tConfirmPassword.setFont(new Font("Arial",Font.PLAIN,20));
        tConfirmPassword.setSize(200,20);
        tConfirmPassword.setLocation(300,400);
        c.add(tConfirmPassword);

        robot = new JCheckBox("I am not robot.\n Drag this cursor to the middle.");
        robot.setFont(new Font("Arial",Font.PLAIN,20));
        robot.setSize(500,20);
        robot.setLocation(100,500);
        c.add(robot);

        puzzleSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        puzzleSlider.setPaintTicks(true);
        puzzleSlider.setMajorTickSpacing(25);
        puzzleSlider.setMinorTickSpacing(5);
        puzzleSlider.setSize(300, 50);
        puzzleSlider.setLocation(200, 550);
        c.add(puzzleSlider);

        sign = new JButton("Sign Up");
        sign.setSize(300,50);
        sign.setLocation(300,650);
        sign.setFont(new Font("Arial", Font.BOLD,40));
        sign.addActionListener(this);
        c.add(sign);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (robot.isSelected()) {
            // Check if the slider is in the correct position
            if (puzzleSlider.getValue() == 50) { // Adjust the correct position as needed
                // Proceed with form submission
                JOptionPane.showMessageDialog(RegisterForm.this, "Form submitted!");
            } else {
                // Display an error message if the slider position is incorrect
                JOptionPane.showMessageDialog(RegisterForm.this, "Please solve the puzzle.");
            }
        } else {
            // Display an error message if the checkbox is not selected
            JOptionPane.showMessageDialog(RegisterForm.this, "Please check 'I am not a robot'.");
        }
    }
}
