import javax.swing.*;
import java.awt.*;

public class Main2 {
	public static void main(String[] args){
		JFrame frame = new JFrame("Galaxy Wars");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,800);
		frame.setVisible(true);
	

		JPanel bg = new JPanel();
			bg.setBackground(Color.LIGHT_GRAY);
				frame.add(bg);
		}
}