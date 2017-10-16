package UI;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class LoginWindow extends JFrame implements ActionListener
{
	JLabel account;
	JLabel password;
	JTextField jtf;
	JPasswordField jpf;
	JButton jb_login, jb_register;
	JPanel jp;
	
	public static void main(String[] args) 
	{

		LoginWindow lw = new LoginWindow();
	}
	
	public LoginWindow()
	{
		add2Panel();
		setWindowAttribute();
		
	}
	


	public void setWindowAttribute()
	{

		this.setLocation(400, 270);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void createControls()
	{
		account = new JLabel("account");
		password  = new JLabel("password");
		jtf = new JTextField(10);
		jpf = new JPasswordField(10);
		jb_login = new JButton("Login");
		jb_register = new JButton("Register");
		jp = new JPanel();
	}
	
	public void add2Panel()
	{
		createControls();
		this.add(jp);
		this.jp.add(account);
		this.jp.add(jtf);
		this.jp.add(password);
		this.jp.add(jpf);
		this.jp.add(jb_login);
		this.jp.add(jb_register);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		
	}
}
