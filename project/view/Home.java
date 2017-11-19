package view;

/**
 * @author: Clederson Cruz
 * This class is a view that displays a single window to the user with diff. panes.
 */

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

import controller.CtrlHome;
import model.Profile;

public class Home implements MouseListener {
	private JFrame window;
	private MainPanel mainPanel;
	private PlayPanel playPanel;
	private EndPanel endPanel;
	private JScrollPane SPlayPanel;
	private JButton mainButton;
	private JButton profiles;
	private CtrlHome controller;

	public Home() {
		/* ** Components ** */
		window = new JFrame("Avaliação Comportamental");
		mainPanel = new MainPanel(this);
		mainButton = mainPanel.start;
		controller = new CtrlHome();
		
		/* ** Setup Window ** */
		window.setContentPane(mainPanel);
		window.pack();
		window.setSize(500, 500);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	public static void main(String[] args) {
		try {
			 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e) {
			System.out.println("Erro ao carregar L&F.");
		}
		new Home();
	}

	/* ** Mouse Events ** */
	@Override
	public void mouseClicked(MouseEvent me) {
		String button = me.getComponent().toString();

		//It shows the test pane
		if (button.contains("Iniciar")) {
			playPanel = new PlayPanel(this);
			mainButton = playPanel.finish;
			SPlayPanel = new JScrollPane(playPanel);
			SPlayPanel.getVerticalScrollBar().setUnitIncrement(10);
			window.setContentPane(SPlayPanel);
			window.validate();
			window.repaint();
		}

		//It shows the results pane
		else if (button.contains("Resultado")) {
			String choices = playPanel.count();
			
			if (choices.length() == 25) {
				controller.setProfile(new Profile(choices));
				endPanel = new EndPanel(this, controller.getProfile());
				mainButton = endPanel.goHome;
				profiles = endPanel.profiles;
				window.setContentPane(endPanel);
				window.validate();
				window.repaint();
			}
		}

		//It go back home view
		else if (button.contains("Início")) {
			window.setContentPane(mainPanel);
			mainButton = mainPanel.start;
			window.validate();
			window.repaint();
		}

		//It displays behavioral profiles.
		else if (button.contains("Ver Perfis")) {
			endPanel.showProfiles();
		}
	}

	@Override
	public void mouseEntered(MouseEvent me) {
		String button = me.getComponent().toString();
		
		if (button.contains("Iniciar") || button.contains("Início")) {
			mainButton.setBackground(new Color(0, 86, 9)); // dark green
		}
		else if (button.contains("Resultado")) {
			mainButton.setBackground(new Color(0, 67, 144)); //darker blue
		}
		else if (button.contains("Ver Perfis")) {
			profiles.setBackground(new Color(0, 159, 255)); //dark blue
		}

	}

	@Override
	public void mouseExited(MouseEvent me) {
		String button = me.getComponent().toString();
		
		if (button.contains("Iniciar") || button.contains("Início")) {
			mainButton.setBackground(new Color(0, 121, 13)); // green
		}
		else if (button.contains("Resultado")) {
			mainButton.setBackground(new Color(0, 120, 255)); // blue
		}
		else if (button.contains("Ver Perfis")) {
			profiles.setBackground(new Color(0, 186, 255)); // light blue
			
		}

	}

	@Override
	public void mousePressed(MouseEvent me) {

	}

	@Override
	public void mouseReleased(MouseEvent me) {

	}

}
