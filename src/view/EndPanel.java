package view;

/**
 * @author Clederson Cruz
 * This pane displays the result of the test.
 */

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Profile;

public class EndPanel extends JPanel {
	JButton goHome;
	JButton profiles;
	private ProfilesWindow profileswindow;
	
	public EndPanel(MouseListener window, Profile profile) {
		/* ** Panel Components ** */
		this.setLayout(new GridLayout(9, 1));
		JPanel imgPanel = new JPanel();
		JPanel animalPanel = new JPanel(new GridLayout(1, 4));
		JPanel brainPanel = new JPanel(new GridLayout(7, 1));
		profiles = new JButton("Ver Perfis");
		goHome = new JButton("Início");
		profileswindow = null;

		JLabel title = new JLabel("Resultado");
		String msg1 = String.format("Esquerdo (Razão) %d%% e Direito (Emoção) %d%%", profile.LEFT, profile.RIGHT);
		String msg2 = String.format("Posterior (Atuante) %d%% e Anterior (Pensante) %d%%",  profile.FRONT, profile.BACK);
		String msg3 = "Cada animal representa um perfil comportamental.";
		
		JLabel brainTitle = new JLabel("Regiões Cerebrais");
		JLabel brainMgs1 = new JLabel(msg1);
		JLabel brainMgs2 = new JLabel(msg2);
		JLabel brainExplain = new JLabel(msg3);
		
		JLabel shark = new JLabel("       Tubarão: " + profile.SHARK + "%");
		JLabel wolf = new JLabel("       Lobo: " + profile.WOLF + "%");
		JLabel eagle = new JLabel(" Águia: " + profile.EAGLE + "%");
		JLabel cat = new JLabel("Gato: " + profile.CAT + "%");
		
		String blue = "blue_bar.png";
		String green = "green_bar.png";
		String purple = "purple_bar.png";
		String red = "red_bar.png";
		
		/* Blue bar*/
		ImageIcon imgBlue = new ImageIcon(getClass().getClassLoader().getResource(blue));
		imgBlue = new ImageIcon(imgBlue.getImage().getScaledInstance(60, profile.SHARK, Image.SCALE_SMOOTH));
		JLabel barBlue = new JLabel(imgBlue);
		
		/* Green bar*/
		ImageIcon imgGreen = new ImageIcon(getClass().getClassLoader().getResource(green));
		imgGreen = new ImageIcon(imgGreen.getImage().getScaledInstance(60, profile.WOLF, Image.SCALE_SMOOTH));
		JLabel barGreen = new JLabel(imgGreen);
		
		/* Purple bar*/
		ImageIcon imgPurple = new ImageIcon(getClass().getClassLoader().getResource(purple));
		imgPurple = new ImageIcon(imgPurple.getImage().getScaledInstance(60, profile.EAGLE, Image.SCALE_SMOOTH));
		JLabel barPurple = new JLabel(imgPurple);
		
		/* Red bar*/
		ImageIcon imgRed = new ImageIcon(getClass().getClassLoader().getResource(red));
		imgRed = new ImageIcon(imgRed.getImage().getScaledInstance(60, profile.CAT, Image.SCALE_SMOOTH));
		JLabel barRed = new JLabel(imgRed);
		
		/* ** Setup ** */
		goHome.setBorderPainted(false);
		goHome.setFocusPainted(false);
		goHome.setContentAreaFilled(false);
		goHome.setBackground(new Color(0, 121, 13)); // green
		goHome.setForeground(new Color(255, 255, 255)); // white
		goHome.setOpaque(true);
		goHome.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
		goHome.setCursor(new Cursor(Cursor.HAND_CURSOR));
		goHome.addMouseListener(window);
		
		profiles.setBorderPainted(false);
		profiles.setFocusPainted(false);
		profiles.setContentAreaFilled(false);
		profiles.setBackground(new Color(0, 186, 255)); // light blue
		profiles.setForeground(new Color(255, 255, 255)); // white
		profiles.setOpaque(true);
		profiles.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
		profiles.setCursor(new Cursor(Cursor.HAND_CURSOR));
		profiles.addMouseListener(window);

		imgPanel.setLayout(new BoxLayout(imgPanel, BoxLayout.X_AXIS));
		barBlue.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		barGreen.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		barPurple.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		barRed.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		title.setHorizontalAlignment(JLabel.CENTER);
		brainTitle.setHorizontalAlignment(JLabel.CENTER);
		brainExplain.setHorizontalAlignment(JLabel.CENTER);
		brainMgs1.setHorizontalAlignment(JLabel.CENTER);
		brainMgs2.setHorizontalAlignment(JLabel.CENTER);

		title.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
		brainTitle.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
		shark.setForeground(new Color(0, 164, 241)); // light blue
		wolf.setForeground(new Color(0, 157, 74)); // light green
		eagle.setForeground(new Color(177, 91, 212)); // light purple
		cat.setForeground(new Color(195, 55, 55)); // light red

		imgPanel.add(Box.createRigidArea(new Dimension(80,0)));
		imgPanel.add(barBlue);
		imgPanel.add(Box.createRigidArea(new Dimension(30,0)));
		imgPanel.add(barGreen);
		imgPanel.add(Box.createRigidArea(new Dimension(30,0)));
		imgPanel.add(barPurple);
		imgPanel.add(Box.createRigidArea(new Dimension(30,0)));
		imgPanel.add(barRed);

		animalPanel.add(shark);
		animalPanel.add(wolf);
		animalPanel.add(eagle);
		animalPanel.add(cat);
		
		this.add(title);
		this.add(imgPanel);
		this.add(animalPanel);
		this.add(brainExplain);
		this.add(brainTitle);
		this.add(brainMgs1);
		this.add(brainMgs2);
		this.add(profiles);
		this.add(goHome);

		this.setBackground(new Color(255, 255, 255));
		imgPanel.setBackground(new Color(255, 255, 255));
		animalPanel.setBackground(new Color(255, 255, 255));
		brainPanel.setBackground(new Color(255, 255, 255));
	}
	
	/*
	 * It displays behavior profiles 
	 */
	public void showProfiles() {
		if (profileswindow == null) {
			profileswindow = new ProfilesWindow();
		} else {
			profileswindow.setVisible(true);
		}
		System.out.println(profileswindow);
	}
}
