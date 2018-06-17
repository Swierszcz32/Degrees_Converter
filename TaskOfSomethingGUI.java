package pl.java.workExperience;

import javax.swing.*;
import java.awt.*;

public class TaskOfSomethingGUI extends JFrame{
	public TaskOfSomethingGUI() {
		
		super("Fibonacci number");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		settingTheSizeOfTheFrame();
		AddComponents();
	}
	public void settingTheSizeOfTheFrame() {
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		this.setBounds((width-(width/2))/2, (height-(height/2))/2, width/2, height/2);
	}
	
	JLabel label = new JLabel("pustka");
	JPanel panel = new JPanel();
	GroupLayout layout = new GroupLayout(getContentPane());
	
	public void AddComponents() {
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
				.addGroup(
						layout.createParallelGroup()
						.addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						)
				);
		layout.setVerticalGroup(
				layout.createSequentialGroup()
				.addGroup(
						layout.createParallelGroup()
						.addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						)
				);
	}
	

}
