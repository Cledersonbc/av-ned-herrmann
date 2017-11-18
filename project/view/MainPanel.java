package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Clederson Cruz
 * This Panel has a Main View to show the first pane.
 */

public class MainPanel extends JPanel{
	JButton start;

	public MainPanel(MouseListener window) {

		/* ** Panel Components ** */
		JPanel imgPanel = new JPanel();
		start = new JButton("Iniciar");
		
		String pathImg = "brain.jpg";
		ImageIcon brain = new ImageIcon(getClass().getClassLoader().getResource(pathImg));
		brain = new ImageIcon(brain.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH));
		JLabel img = new JLabel(brain);

		/* ** Setup ** */
		start.setBorderPainted(false);
		start.setFocusPainted(false);
		start.setContentAreaFilled(false);
		start.setBackground(new Color(0, 121, 13)); // green
		start.setForeground(new Color(255, 255, 255)); // white
		start.setOpaque(true);
		start.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
		start.setCursor(new Cursor(Cursor.HAND_CURSOR));
		start.addMouseListener(window);

		imgPanel.add(img);
		imgPanel.setBackground(new Color(255, 255, 255));

		this.setLayout(new BorderLayout());
		this.add(start, BorderLayout.SOUTH);
		this.add(imgPanel, BorderLayout.CENTER);
		this.setBackground(new Color(255, 255, 255));
	}
}
