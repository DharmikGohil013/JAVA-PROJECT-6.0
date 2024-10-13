package main;
import javax.swing.JFrame;

public  class Main {
	
	public static void main(String[] args){
	
	JFrame window =new JFrame("SIMPLE CHESS");
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setResizable(false);
	// gamepanel
	GamePanel gp =new GamePanel();
	window.add(gp);
	window.pack();

	window.setLocationRelativeTo(null);
	window.setVisible(true);

	gp.launchGame();
	
	}
		
}

