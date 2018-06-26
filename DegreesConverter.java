package pl.java.workExperience;
import javax.swing.*;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DegreesConverter extends JFrame implements ActionListener{
	
	public DegreesConverter() {
		super("Converter of Defrees");
		
		setBounds(0, 0, 400, 200);
		initComponents();
		this.setDefaultCloseOperation(3);
		setLayout(null);
		
		
	}
	double tmpCelcius, tmpFarenheit;
	
	JLabel labelCelcius;
	JLabel labelFarenheit;
	JTextField textCelcius;
	JTextField textFarenheit;
	JButton convertButton;
	JButton reset;
	
	
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
		convertButton.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(!textCelcius.getText().equals("")) {
		tmpCelcius = Double.parseDouble(textCelcius.getText());
		tmpFarenheit = 32.0 + (9.0/5.0) * tmpCelcius;
		textFarenheit.setText(String.valueOf(tmpFarenheit));
		}else if(!textFarenheit.getText().equals("")) {
			tmpFarenheit = Double.parseDouble(textFarenheit.getText());
			tmpCelcius = (tmpFarenheit - 32.0)/1.8000;
			textCelcius.setText(String.valueOf(tmpCelcius));
		}
		else {
			textFarenheit.setText("NO DATA");
			textCelcius.setText("NO DATA");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DegreesConverter().setVisible(true);

	}

}
