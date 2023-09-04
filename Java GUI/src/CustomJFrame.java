import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.text.NumberFormatter;
/** 
 * Designs the GUI using JFrame. Also implements functions for buttons. 
 */
public class CustomJFrame extends JFrame{

	private JLabel headingLabel; 
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel phoneNumberLabel;
	private JLabel emailLabel; 
	private JLabel dietaryLabel; 
	private JLabel genderLabel;
	private JLabel waterLabel;
	private JLabel mealLabel;
	private JLabel checkBoxLabel;
	private JLabel walkLabel;
	private JLabel weightLabel; 
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;
	private JTextField phoneNumberTextField; 
	private JTextField emailTextField; 
	private JRadioButton maleRadioButton;
	private JRadioButton femaleRadioButton;
	private JRadioButton preferRadioButton;
	private ButtonGroup radioButtonGroup;
	private JSpinner waterIntakeSpinner; 
	private JSlider mealSlider; 
	private JCheckBox wheatCheckBox; 
	private JCheckBox sugarCheckBox;
	private JCheckBox dairyCheckBox; 
	private JComboBox <Object>walkComboBox; 
	private String[] walkOptions;
	private JFormattedTextField weightFormattedTextField; 
	private JButton clearButton; 
	private JButton submitButton; 
	private FileHandler fileHandler; 
	//constructor
	CustomJFrame(){
		//using grid bag to design GUI
		setLayout(new GridBagLayout());
		GridBagConstraints layoutManager = new GridBagConstraints();
		setTitle("Dietary Survey");

		layoutManager.gridx = 0;
		layoutManager.gridy = 0; 

		layoutManager.insets = new Insets(15,1,1,15);

		headingLabel = new JLabel("Personal Information");
		add(headingLabel, layoutManager);

		layoutManager.gridx = 0;
		layoutManager.gridy = 1; 

		firstNameLabel = new JLabel("First Name:");
		add(firstNameLabel , layoutManager);

		layoutManager.gridx = 1;
		layoutManager.gridy = 1;

		firstNameTextField = new JTextField(15); 
		add(firstNameTextField, layoutManager); 

		layoutManager.gridx = 0;
		layoutManager.gridy = 2;

		lastNameLabel = new JLabel("Last Name:");
		add(lastNameLabel, layoutManager);

		layoutManager.gridx = 1;
		layoutManager.gridy = 2;

		lastNameTextField = new JTextField(15); 
		add(lastNameTextField , layoutManager); 

		layoutManager.gridx = 0;
		layoutManager.gridy = 3;

		phoneNumberLabel = new JLabel("Phone Number:"); 
		add(phoneNumberLabel , layoutManager); 

		layoutManager.gridx = 1;
		layoutManager.gridy = 3;

		phoneNumberTextField = new JTextField(15); 
		add(phoneNumberTextField , layoutManager);

		layoutManager.gridx = 0;
		layoutManager.gridy = 4;

		emailLabel = new JLabel("Email:"); 
		add(emailLabel , layoutManager);

		layoutManager.gridx = 1;
		layoutManager.gridy = 4;

		emailTextField = new JTextField(15); 
		add(emailTextField , layoutManager);

		layoutManager.gridx = 0;
		layoutManager.gridy = 5;

		genderLabel = new JLabel("Sex:"); 
		add(genderLabel , layoutManager);

		layoutManager.gridx = 1;
		layoutManager.gridy = GridBagConstraints.RELATIVE;
		layoutManager.anchor = GridBagConstraints.WEST;

		maleRadioButton = new JRadioButton("Male");
		add(maleRadioButton, layoutManager);

		layoutManager.gridx = 1;
		layoutManager.gridy = GridBagConstraints.RELATIVE;
		layoutManager.anchor = GridBagConstraints.WEST;

		femaleRadioButton = new JRadioButton("Female"); 
		add(femaleRadioButton, layoutManager);

		layoutManager.gridx = 1;
		layoutManager.gridy = GridBagConstraints.RELATIVE;
		layoutManager.anchor = GridBagConstraints.WEST;

		preferRadioButton = new JRadioButton("Prefer not to say"); 
		add(preferRadioButton, layoutManager);

		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(maleRadioButton); 
		radioButtonGroup.add(femaleRadioButton);
		radioButtonGroup.add(preferRadioButton);

		layoutManager.gridx = 0; 
		layoutManager.gridy = 8; 

		dietaryLabel = new JLabel("Dietary Questions");
		add(dietaryLabel, layoutManager); 

		layoutManager.gridx = 1; 
		layoutManager.gridy = 9; 

		waterLabel = new JLabel("How many cups of water on average do you drink per day?");
		add(waterLabel , layoutManager); 

		layoutManager.gridx = 1; 
		layoutManager.gridy = 10;

		SpinnerModel value = new SpinnerNumberModel(15,0,50,1);
		waterIntakeSpinner = new JSpinner(value);
		add(waterIntakeSpinner, layoutManager);

		layoutManager.gridx = 1; 
		layoutManager.gridy = 11;

		mealLabel = new JLabel("How many meals on average do you eat per day?");
		add(mealLabel, layoutManager); 

		layoutManager.gridx = 1; 
		layoutManager.gridy = 12;

		mealSlider = new JSlider(0,10,3);
		mealSlider.setMinorTickSpacing(1);
		mealSlider.setMajorTickSpacing(1);
		mealSlider.setPaintTicks(true);
		mealSlider.setPaintLabels(true);
		add(mealSlider, layoutManager);

		layoutManager.gridx = 1; 
		layoutManager.gridy = 13; 

		checkBoxLabel = new JLabel("Do any of these meals regularly contain:");
		add(checkBoxLabel , layoutManager); 

		layoutManager.gridx = 0; 
		layoutManager.gridy = 14; 

		dairyCheckBox = new JCheckBox("Dairy"); 
		add(dairyCheckBox , layoutManager); 

		layoutManager.gridx = 1;
		layoutManager.gridy = 14; 

		wheatCheckBox = new JCheckBox("Wheat");
		add(wheatCheckBox , layoutManager);

		layoutManager.gridx = 2;
		layoutManager.gridy = 14;

		sugarCheckBox = new JCheckBox("Sugar"); 
		add(sugarCheckBox , layoutManager);

		layoutManager.gridx = 1;
		layoutManager.gridy = 15;

		walkLabel = new JLabel("On average how many miles do you walk per day?");
		add(walkLabel , layoutManager); 

		layoutManager.gridx = 1;
		layoutManager.gridy = 16;

		String[] values = {"Less than 1 Mile", "More than 1 mile but less than 2 miles" , "More than 2 miles but less than 3 miles" , "More than 3 miles"};
		walkOptions = values; 

		walkComboBox = new JComboBox<Object>(walkOptions);
		add(walkComboBox , layoutManager); 

		layoutManager.gridx = 1;
		layoutManager.gridy = 17;

		weightLabel = new JLabel("How much do you weigh?");
		add(weightLabel , layoutManager); 

		layoutManager.gridx = 1;
		layoutManager.gridy = 18;

		NumberFormat  nf = DecimalFormat.getInstance(); 
		weightFormattedTextField = new JFormattedTextField(nf); 
		weightFormattedTextField.setColumns(15);
		add(weightFormattedTextField , layoutManager);

		layoutManager.gridx = 0;
		layoutManager.gridy = 19;

		clearButton = new JButton("Clear");
		clearButton.setBackground(Color.YELLOW);
		add(clearButton , layoutManager); 

		layoutManager.gridx = 2;
		layoutManager.gridy = 19;

		submitButton = new JButton("Submit");
		submitButton.setBackground(Color.GREEN);
		add(submitButton , layoutManager); 
		/** 
		 * Inner class for action listner (handles button functions). 
		 */
		class InnerActionListener implements ActionListener{
			/** 
			 * Backend functionality for submit and clear buttons. 
			 * @param Event that occurs. 
			 * @return Void. 
			 */ 
			public void actionPerformed(ActionEvent e){



				if(e.getSource() == submitButton)
				{
					String firstName = firstNameTextField.getText(); 
					String lastName = lastNameTextField.getText(); 
					String phoneNumber = phoneNumberTextField.getText(); 
					String email = emailTextField.getText();  
					String gender = "null";
					String waterSpinner = value.getValue().toString();
					int meals = mealSlider.getValue(); 
					boolean dairyBox = dairyCheckBox.isSelected();
					boolean wheatBox = wheatCheckBox.isSelected();
					boolean sugarBox = sugarCheckBox.isSelected(); 
					String walkBox = walkComboBox.getSelectedItem().toString(); 
					String weight = ""; 

					System.out.println(firstName);
					System.out.println(lastName);
					System.out.println(phoneNumber);
					System.out.println(email);

					if(maleRadioButton.isSelected())
					{ 
						gender = maleRadioButton.getText(); 
					}
					if(femaleRadioButton.isSelected())
					{
						gender = femaleRadioButton.getText(); 
					}
					if(preferRadioButton.isSelected())
					{
						gender = preferRadioButton.getText(); 
					}

					if(weightFormattedTextField.getText().equals("")) //sets value to null if no integer is entered
					{
						weight = "null"; 
					}
					else
					{
						weight = weightFormattedTextField.getText();
					}

					SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/YYYY HH:mm:ss");

					Date date = new Date();

					String createdAt = formatter.format(date); 

					String combined = createdAt + "," + firstName + "," + lastName + "," + phoneNumber + "," + email + "," + gender + "," 
							+ waterSpinner + "," + meals + "," + dairyBox + "," + wheatBox + "," + sugarBox + "," + walkBox + "," + weight; 

					fileHandler = new FileHandler();
					fileHandler.writeResults(combined); 
				}

				clearForm(); 

			}
			/** 
			 *Clears form.  
			 * @return Void. 
			 */ 
			private void clearForm() {

				firstNameTextField.setText("");
				lastNameTextField.setText("");
				phoneNumberTextField.setText("");
				emailTextField.setText("");
				radioButtonGroup.clearSelection();
				waterIntakeSpinner.setValue(15);
				mealSlider.setValue(3); 
				dairyCheckBox.setSelected(false);
				wheatCheckBox.setSelected(false);
				sugarCheckBox.setSelected(false);
				walkComboBox.setSelectedIndex(0);
				weightFormattedTextField.setText(""); 
			}

		}
		InnerActionListener buttonListener = new InnerActionListener();
		submitButton.addActionListener(buttonListener);	//implementing action listener
		clearButton.addActionListener(buttonListener);     
	}
}
