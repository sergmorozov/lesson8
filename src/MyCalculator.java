import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyCalculator {
	
	public static void main(String[] args) {
		
		// Create a panel
		JPanel windowContent= new JPanel();
		
		// Set the GridBagLayout for the window’s content pane
		GridBagLayout gb = new GridBagLayout();
		windowContent.setLayout(gb);
		
		// Create an instance of the GridBagConstraints
		// You’ll have to repeat these lines for each component
		// that you’d like to add to the grid cell
		GridBagConstraints constr = new GridBagConstraints();
		
		// Create buttons using constructor of the  
	     // class JButton that takes the label of the 
	     // button as a parameter 
		JTextField displayField  = new JTextField();
		
		displayField.setHorizontalAlignment(JTextField.RIGHT);
	
		//setting constraints for the Calculator’s displayField:
		// x coordinate in the grid
		constr.gridx=0;
		// y coordinate in the grid
		constr.gridy=0;
		// this cell has the same height as other cells
		constr.gridheight =1;
		// this cell is as wide as 6 other ones
		constr.gridwidth= 10;
		// fill all space in the cell
		constr.fill= constr.BOTH;
		// proportion of horizontal space taken by this
		// component
		constr.weightx = 1.0;
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
		// position of the component within the cell
		constr.anchor=constr.CENTER;
		
		// set constrains for this field
		gb.setConstraints(displayField,constr);
				
		// add the text field to the window
		windowContent.add(displayField);
		
		addButton(windowContent, gb, "0", 0, 1);
		addButton(windowContent, gb, "1", 1, 1);
		addButton(windowContent, gb, "2", 2, 1);
		addButton(windowContent, gb, "3", 3, 1);
		addButton(windowContent, gb, "4", 4, 1);
		addButton(windowContent, gb, "5", 0, 2);
		addButton(windowContent, gb, "6", 1, 2);
		addButton(windowContent, gb, "7", 2, 2);
		addButton(windowContent, gb, "8", 3, 2);
		addButton(windowContent, gb, "9", 4, 2);
		addButton(windowContent, gb, "+", 0, 3);
		addButton(windowContent, gb, "-", 1, 3);
		addButton(windowContent, gb, "=", 2, 3, 3);
		
		JFrame frame = new JFrame("My First Calculator");
		
		// Add the panel to the top-level container
		frame.setContentPane(windowContent);
		
		// set the size and make the window visible
		frame.setSize(600,400);
		frame.setVisible(true);
	}
	
	private static void addButton(JPanel windowContent, GridBagLayout gb, String name, int gridx, int gridy) {
		addButton(windowContent, gb, name, gridx, gridy, 1);
	}
	
	private static void addButton(JPanel windowContent, GridBagLayout gb, String name, int buttonCoordinateX, int buttonCoordinateY, int width) {
		GridBagConstraints constr = new GridBagConstraints();
		constr.gridx = buttonCoordinateX;
		constr.gridy = buttonCoordinateY;
		constr.gridheight = 1;
		constr.gridwidth = width;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.fill = constr.BOTH;	
		
		JButton  button=new JButton(name);
		gb.setConstraints(button,constr);
		windowContent.add(button);
	}
}
