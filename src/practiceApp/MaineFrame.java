package practiceApp;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MaineFrame extends JFrame {
	//DetailsPanel 
	private DetailsPanel detailsPanel;
	
	public MaineFrame(String title) {
		super(title);
		
		//Set layout manager 
		setLayout(new BorderLayout());
		
		//Create Swing component
		final JTextArea textArea = new JTextArea();
		
		detailsPanel = new DetailsPanel();
		detailsPanel.addDetailListener(new DetailListener() {
			public void detailEventOccurred(DetailEvent event) {
				String text = event.getText();
				
				textArea.append(text);
			}
		});
		
		//Add swing components to content panel 
		Container c = getContentPane();
	
		c.add(textArea, BorderLayout.CENTER);
		c.add(detailsPanel, BorderLayout.WEST);
		
		//add behavior 
		
		
	}
}
