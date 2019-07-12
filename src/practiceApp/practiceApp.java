package practiceApp;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class practiceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new MaineFrame("Practice App");
				frame.setSize(500,400);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});

	}

}
