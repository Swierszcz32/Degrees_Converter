package pl.java.workExperience;
import javax.swing.*;
import java.awt.*;

public class DegreesConverter extends JFrame{
	
	public DegreesConverter() {
		super("Converter of Defrees");
		
		setBounds(0, 0, 400, 200);
		initComponents();
		this.setDefaultCloseOperation(3);
		setLayout(null);
		
		
	}
	JLabel labelCelcius;
	JLabel labelFarenheit;
	JTextField textCelcius;
	JTextField textFarenheit;
	JButton convertButton;
	
	
	
	public void initComponents() {
		labelCelcius = new JLabel("Celcius Degree");
		labelCelcius.setBounds(20, 20, 150, 20);
		add(labelCelcius);
		
		labelFarenheit = new JLabel("Farenheit Degree");
		labelFarenheit.setBounds(20, 60, 150, 20);
		add(labelFarenheit);
		textCelcius = new JTextField("");
		textCelcius.setBounds(170, 20, 150, 20);
		add(textCelcius);
		textFarenheit = new JTextField("");
		textFarenheit.setBounds(170, 60, 150, 20);
		add(textFarenheit);
		convertButton = new JButton("Convert");
		convertButton.setBounds(20, 100, 300, 20);
		add(convertButton);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DegreesConverter().setVisible(true);

	}

}
