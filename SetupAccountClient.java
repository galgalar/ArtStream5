package com.mycompany.artstreamfinal;

import javax.swing.*;
import java.awt.*;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.event.*;

public class SetupAccountClient extends JFrame implements ActionListener, StoreRequests{
    
    protected Container con = getContentPane();
    protected JPanel main = new JPanel();
    protected JPanel secondMain = new JPanel();
    protected JPanel rightPanel = new JPanel();
    protected ImageIcon icon = new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\ArtSTREAM-removebg-preview.png");
    protected JLabel image = new JLabel(icon);
    protected ImageIcon imageIcon = new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\ARTS-removebg-preview.png");
    protected JLabel imageLabel = new JLabel(icon);
    
    protected JLabel setupLabel = new JLabel("Setup your account as a Client");
    protected JButton signin = new JButton("Sign in");
    protected JButton register = new JButton("Create an account");
    protected JPanel back = new JPanel();
    protected JButton goBack = new JButton("Return");
    protected CardLayout card = new CardLayout();
    protected JLabel usernameLabelSignin = new JLabel("Username");
    protected JTextField usernameFieldSignin = new JTextField();
    protected JLabel passwordLabelSignin = new JLabel("Password");
    protected JPasswordField passwordFieldSignin = new JPasswordField();
    protected JButton signinButton = new JButton("Sign In");
    
    protected JLabel usernameLabelRegister = new JLabel("Username");
    protected JTextField usernameFieldRegister = new JTextField();
    protected JLabel passwordLabelRegister = new JLabel("Password");
    protected JPasswordField passwordFieldRegister= new JPasswordField();
     protected JLabel confirmPasswordLabelRegiste = new JLabel("Password");
    protected JPasswordField confirmPasswordFieldRegister= new JPasswordField();
    protected JButton registerButton = new JButton("Register");
    
    protected JCheckBox rememberMeCheckbox = new JCheckBox("Remember me");
    


    public SetupAccountClient() {
        super("ArtStream");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set container layout and background
        
        JPanel setup = new JPanel();
        setup.setLayout(new BorderLayout());
        setup.add(main,BorderLayout.CENTER);
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
        main.setBackground(Color.WHITE);
        
        con.setLayout(new GridLayout(0,2,5,5));
        con.add(setup);       
        con.add(secondMain);   
       
        con.setBackground(Color.WHITE);
        
        Image iconSize = icon.getImage();
        Image iconNewSize = iconSize.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        icon = new ImageIcon(iconNewSize);
        image.setIcon(icon);


        // Styling the components
        setupLabel.setFont(new Font("Monospaced", Font.BOLD, 20));
        setupLabel.setForeground(Color.BLACK);

        signin.setFont(new Font("Monospaced", Font.PLAIN, 15));
        register.setFont(new Font("Monospaced", Font.PLAIN, 15));
        goBack.setFont(new Font("Monospaced", Font.PLAIN, 15));

        signin.setBackground(Color.decode("#89CFF0"));
        register.setBackground(Color.decode("#89CFF0"));
        goBack.setBackground(Color.decode("#89CFF0"));

        signin.setForeground(Color.BLACK);
        register.setForeground(Color.BLACK);
        goBack.setForeground(Color.BLACK);

        // Adding components to the main panel
      
        main.add(image);
        image.setAlignmentX(CENTER_ALIGNMENT);

        main.add(Box.createRigidArea(new Dimension(0, 0)));
        main.add(setupLabel);
        setupLabel.setAlignmentX(CENTER_ALIGNMENT);

        main.add(Box.createRigidArea(new Dimension(0, 30)));
        main.add(signin);
        signin.setAlignmentX(CENTER_ALIGNMENT);
        signin.setMaximumSize(new Dimension(400,100));

        
        
        main.add(Box.createRigidArea(new Dimension(0, 20)));
        main.add(register);
        register.setAlignmentX(CENTER_ALIGNMENT);
        register.setMaximumSize(new Dimension(400,100));
        main.add(Box.createRigidArea(new Dimension(0, 20)));
        
        
        main.add(Box.createRigidArea(new Dimension(0, 30)));
        main.add(goBack);
        goBack.setAlignmentX(CENTER_ALIGNMENT);
        goBack.setMaximumSize(new Dimension(400,100));
        main.add(Box.createRigidArea(new Dimension(0, 20)));
        
        Image img = imageIcon.getImage();
        Image resizedImg = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(resizedImg);
        imageLabel.setIcon(imageIcon);

        rightPanel.setBackground(Color.decode("#000e37"));
        rightPanel.setLayout(new BorderLayout());
        rightPanel.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));
        rightPanel.add(imageLabel,BorderLayout.CENTER);
        
        
        secondMain.setLayout(card);
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        
        panel1.setBackground(Color.decode("#303765"));
        panel1.setLayout(new BorderLayout());
        
        JPanel pane = new JPanel();
        panel1.setBorder(BorderFactory.createEmptyBorder(200,200,200,200));
        panel1.add(pane,BorderLayout.CENTER);
        
        pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
        
 
        
        usernameLabelSignin.setFont(new Font("Monospaced", Font.PLAIN, 16));
        usernameLabelSignin.setForeground(Color.BLACK);

        
        usernameFieldSignin.setMaximumSize(new Dimension(600, 40));
        usernameFieldSignin.setFont(new Font("Monospaced", Font.PLAIN, 14));

        
        passwordLabelSignin.setFont(new Font("Monospaced", Font.PLAIN, 16));
        passwordLabelSignin.setForeground(Color.BLACK);

       
        passwordFieldSignin.setMaximumSize(new Dimension(600, 40));
        passwordFieldSignin.setFont(new Font("Monospaced", Font.PLAIN, 14));

        
        rememberMeCheckbox.setFont(new Font("Monospaced", Font.PLAIN, 14));
        rememberMeCheckbox.setBackground(Color.decode("#000e37"));
        rememberMeCheckbox.setForeground(Color.BLACK);

        
        signinButton.setFont(new Font("Monospaced", Font.BOLD, 16));
        signinButton.setBackground(Color.decode("#89CFF0"));
        signinButton.setForeground(Color.BLACK);
        signinButton.setAlignmentX(LEFT_ALIGNMENT);
        signinButton.setMaximumSize(new Dimension(300, 30));
        

       
        pane.add(Box.createRigidArea(new Dimension(0, 20)));
        pane.add(usernameLabelSignin);
        pane.add(Box.createRigidArea(new Dimension(0, 10)));
        pane.add(usernameFieldSignin);
        pane.add(Box.createRigidArea(new Dimension(0, 20)));
        pane.add(passwordLabelSignin);
        pane.add(Box.createRigidArea(new Dimension(0, 10)));
        pane.add(passwordFieldSignin);
        pane.add(Box.createRigidArea(new Dimension(0, 20)));
        pane.add(rememberMeCheckbox);
        pane.add(Box.createRigidArea(new Dimension(0, 20)));
        pane.add(signinButton);
       
        
        panel2.setLayout(new BorderLayout());
        panel2.setBackground(Color.decode("#303765"));
        JPanel pane2 = new JPanel();
        pane2.setLayout(new BoxLayout(pane2,BoxLayout.Y_AXIS));
        panel2.setBorder(BorderFactory.createEmptyBorder(200,200,200,200));
        panel2.add(pane2,BorderLayout.CENTER);
        
        
        usernameLabelRegister.setFont(new Font("Monospaced", Font.PLAIN, 16));
        usernameLabelRegister.setForeground(Color.BLACK);

        
        usernameFieldRegister.setMaximumSize(new Dimension(600, 40));
        usernameFieldRegister.setFont(new Font("Monospaced", Font.PLAIN, 14));

        
        passwordLabelRegister.setFont(new Font("Monospaced", Font.PLAIN, 16));
        passwordLabelRegister.setForeground(Color.BLACK);

       
        passwordFieldRegister.setMaximumSize(new Dimension(600, 40));
        passwordFieldRegister.setFont(new Font("Monospaced", Font.PLAIN, 14));

        confirmPasswordLabelRegiste.setFont(new Font("Monospaced", Font.PLAIN, 16));
        confirmPasswordLabelRegiste.setForeground(Color.BLACK);
        
        confirmPasswordFieldRegister.setMaximumSize(new Dimension(600, 40));
        confirmPasswordFieldRegister.setFont(new Font("Monospaced", Font.PLAIN, 14));
        
        registerButton.setFont(new Font("Monospaced", Font.BOLD, 16));
        registerButton.setBackground(Color.decode("#89CFF0"));
        registerButton.setForeground(Color.BLACK);
        registerButton.setAlignmentX(LEFT_ALIGNMENT);
        registerButton.setMaximumSize(new Dimension(300, 30));
    

        pane2.add(Box.createRigidArea(new Dimension(0, 20)));
        pane2.add(usernameLabelRegister);
        pane2.add(Box.createRigidArea(new Dimension(0, 10)));
        pane2.add(usernameFieldRegister);
        pane2.add(Box.createRigidArea(new Dimension(0, 10)));
        pane2.add(passwordLabelRegister);
        pane2.add(Box.createRigidArea(new Dimension(0, 10)));
        pane2.add(passwordFieldRegister);
        pane2.add(Box.createRigidArea(new Dimension(0, 10)));
        pane2.add(confirmPasswordLabelRegiste);
        pane2.add(Box.createRigidArea(new Dimension(0, 10)));
        pane2.add(confirmPasswordFieldRegister);
        pane2.add(Box.createRigidArea(new Dimension(0, 10)));
        pane2.add(registerButton);

        
        signin.setActionCommand("signin");
        register.setActionCommand("register");
        
        
        
        // Adjust icon size
        

        secondMain.add("firstFrame",rightPanel);
        secondMain.add("signin",panel1);
        secondMain.add("register",panel2);
        
        registerButton.addActionListener(this);
        signinButton.addActionListener(this);

        signin.addActionListener(this);
        register.addActionListener(this);
        goBack.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        String command = e.getActionCommand();
        
        
        if(command.equals("signin"))
        {
            card.show(secondMain,command);
        }else if(command.equals("register"))
        {
            card.show(secondMain,command);    
        }
    
       if(source == registerButton)
       {
           String username = usernameFieldRegister.getText();
           char[] pass = passwordFieldRegister.getPassword();
           char[] confirmPass = confirmPasswordFieldRegister.getPassword();
           String password = "",confirmPassword = "";
           
           
           for(int i = 0;i < pass.length; ++i)
           {
               password += pass[i];
           }
           for(int i = 0;i < confirmPass.length; ++i)
           {
               confirmPassword += confirmPass[i];
           }
           
           if(password.equals(confirmPassword))
           {
               new Client(username,password);
               JOptionPane.showMessageDialog(null,"Account created successfully!");
               
               card.show(secondMain,"signin");   
               
              
           }
           else
           {
               passwordFieldRegister.setText(""); 
               confirmPasswordFieldRegister.setText(""); 
               JOptionPane.showMessageDialog(null,"The password should match");
           }
  
           
       }else if(source == goBack)
       {
           new FirstFrame();
           setVisible(false);
       }else if(source == signinButton)
       {
           JOptionPane.showMessageDialog(null,"Login Successfully!");
           new DashboardClient((String)usernameFieldRegister.getText());
           setVisible(false);
           
       }
        
    }  
    
    
    
    
    
    
   
    
}
