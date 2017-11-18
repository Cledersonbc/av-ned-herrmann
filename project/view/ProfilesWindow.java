package view;

/**
 * @author Clederson Cruz
 * Each profile behavior is displayed here.
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ProfilesWindow extends JFrame {
	public ProfilesWindow() {
		/* ** Components **/
		JPanel mainPanel = new JPanel(new GridLayout(5, 6, 5, 5));
		JScrollPane sPanel = new JScrollPane(mainPanel);
		
		JPanel blueBlock1 = returnBlock("blue", 8);
		JPanel blueBlock2 = returnBlock("blue", 4);
		JPanel blueBlock3 = returnBlock("blue", 4);
		JPanel blueBlock4 = returnBlock("blue", 6);
		JPanel blueBlock5 = returnBlock("blue", 1);
		
		JPanel greenBlock1 = returnBlock("green", 8);
		JPanel greenBlock2 = returnBlock("green", 5);
		JPanel greenBlock3 = returnBlock("green", 4);
		JPanel greenBlock4 = returnBlock("green", 4);
		JPanel greenBlock5 = returnBlock("green", 1);
		
		JPanel purpleBlock1 = returnBlock("purple", 8);
		JPanel purpleBlock2 = returnBlock("purple", 4);
		JPanel purpleBlock3 = returnBlock("purple", 5);
		JPanel purpleBlock4 = returnBlock("purple", 5);
		JPanel purpleBlock5 = returnBlock("purple", 2);

		JPanel redBlock1 = returnBlock("red", 8);
		JPanel redBlock2 = returnBlock("red", 4);
		JPanel redBlock3 = returnBlock("red", 4);
		JPanel redBlock4 = returnBlock("red", 7);
		JPanel redBlock5 = returnBlock("red", 2);
		
		JPanel sharkBlock = returnBlock("dblue", 2);
		JPanel wolfBlock = returnBlock("dgreen", 2);
		JPanel eagleBlock = returnBlock("dpurple", 2);
		JPanel catBlock = returnBlock("dred", 2);
		
		/* ** Animals ** */
		ImageIcon shark = new ImageIcon(getClass().getClassLoader().getResource("shark.png"));
		JLabel imgShark = new JLabel(shark);
		sharkBlock.add(imgShark);
		sharkBlock.add(returnBoldWhiteJLabel("Tubarão"));
		
		ImageIcon wolf = new ImageIcon(getClass().getClassLoader().getResource("wolf.png"));
		JLabel imgWolf = new JLabel(wolf);
		wolfBlock.add(imgWolf);
		wolfBlock.add(returnBoldWhiteJLabel("Lobo"));
		
		ImageIcon eagle = new ImageIcon(getClass().getClassLoader().getResource("eagle.png"));
		JLabel imgEagle = new JLabel(eagle);
		eagleBlock.add(imgEagle);
		eagleBlock.add(returnBoldWhiteJLabel("Águia"));
		
		ImageIcon cat = new ImageIcon(getClass().getClassLoader().getResource("cat.png"));
		JLabel imgCat = new JLabel(cat);
		catBlock.add(imgCat);
		catBlock.add(returnBoldWhiteJLabel("Gato"));
		
		/* ** Blue profile (Shark) ** */
		blueBlock1.add(returnWhiteJLabel("\"Fazer Rápido\""));
		blueBlock1.add(returnWhiteJLabel("Senso de urgência"));
		blueBlock1.add(returnWhiteJLabel("Ação, iniciativa"));
		blueBlock1.add(returnWhiteJLabel("Impulso, prático"));
		blueBlock1.add(returnWhiteJLabel("Vencer desafios"));
		blueBlock1.add(returnWhiteJLabel("Aqui e agora"));
		blueBlock1.add(returnWhiteJLabel("Autossuficiente"));
		blueBlock1.add(returnWhiteJLabel("Não gosta de delegar poder"));
		
		blueBlock2.add(returnWhiteJLabel("Ação"));
		blueBlock2.add(returnWhiteJLabel("Fazer que corra"));
		blueBlock2.add(returnWhiteJLabel("Parar com a burocracia"));
		blueBlock2.add(returnWhiteJLabel("Motivação"));
		
		blueBlock3.add(returnWhiteJLabel("Ação"));
		blueBlock3.add(returnWhiteJLabel("Socialmente"));
		blueBlock3.add(returnWhiteJLabel("Fazer do modo mais fácil"));
		blueBlock3.add(returnWhiteJLabel("Relacionamento complicado"));
		
		blueBlock4.add(returnWhiteJLabel("Liberdade para agir individualmente"));
		blueBlock4.add(returnWhiteJLabel("Controle das próprias atividades"));
		blueBlock4.add(returnWhiteJLabel("Resolver problemas do seu jeito"));
		blueBlock4.add(returnWhiteJLabel("Competição individual"));
		blueBlock4.add(returnWhiteJLabel("Variedade de atividades"));
		blueBlock4.add(returnWhiteJLabel("Não ter que repetir tarefas"));
		
		blueBlock5.add(returnWhiteJLabel("Resultados"));
		
		/* ** Green profile (Wolf) ** */
		greenBlock1.add(returnWhiteJLabel("\"Fazer Certo\""));
		greenBlock1.add(returnWhiteJLabel("Detalhista"));
		greenBlock1.add(returnWhiteJLabel("Organizado"));
		greenBlock1.add(returnWhiteJLabel("Estrategista"));
		greenBlock1.add(returnWhiteJLabel("Busca do conhecimento"));
		greenBlock1.add(returnWhiteJLabel("Pontual"));
		greenBlock1.add(returnWhiteJLabel("Conservador"));
		greenBlock1.add(returnWhiteJLabel("Previsível"));
		
		greenBlock2.add(returnWhiteJLabel("Organização"));
		greenBlock2.add(returnWhiteJLabel("Presente, passado e futuro"));
		greenBlock2.add(returnWhiteJLabel("Consistência, conformidade e qualidade"));
		greenBlock2.add(returnWhiteJLabel("Lealdade e segurança"));
		greenBlock2.add(returnWhiteJLabel("Regras e responsabilidade"));
		
		greenBlock3.add(returnWhiteJLabel("Organização"));
		greenBlock3.add(returnWhiteJLabel("Dificuldades de se adaptar às mudanças"));
		greenBlock3.add(returnWhiteJLabel("Pode impedir o progresso"));
		greenBlock3.add(returnWhiteJLabel("Detalhista, estruturado e demasiado sistematizado"));
		
		greenBlock4.add(returnWhiteJLabel("Certeza, compreensão exata de quais são as regras"));
		greenBlock4.add(returnWhiteJLabel("Conhecimento específico do trabalho"));
		greenBlock4.add(returnWhiteJLabel("Ausência de riscos e erros"));
		greenBlock4.add(returnWhiteJLabel("Ver o produto acabado - começo, meio e fim"));
		
		greenBlock5.add(returnWhiteJLabel("Ordem e Controle"));
		
		/* ** Purple profile (Eagle) ** */
		purpleBlock1.add(returnWhiteJLabel("\"Fazer Diferente\""));
		purpleBlock1.add(returnWhiteJLabel("Criativo"));
		purpleBlock1.add(returnWhiteJLabel("Intuitivo"));
		purpleBlock1.add(returnWhiteJLabel("Foco no futuro"));
		purpleBlock1.add(returnWhiteJLabel("Distraído"));
		purpleBlock1.add(returnWhiteJLabel("Curioso"));
		purpleBlock1.add(returnWhiteJLabel("Informal/Casual"));
		purpleBlock1.add(returnWhiteJLabel("Flexível"));
		
		purpleBlock2.add(returnWhiteJLabel("Idealização"));
		purpleBlock2.add(returnWhiteJLabel("Provoca mudanças radicais"));
		purpleBlock2.add(returnWhiteJLabel("Antecipar o futuro"));
		purpleBlock2.add(returnWhiteJLabel("Criatividade"));
		
		purpleBlock3.add(returnWhiteJLabel("Idealização"));
		purpleBlock3.add(returnWhiteJLabel("Falta de atenção para o aqui e agora"));
		purpleBlock3.add(returnWhiteJLabel("Impaciência e rebeldia"));
		purpleBlock3.add(returnWhiteJLabel("Defender o novo pelo novo"));
		
		purpleBlock4.add(returnWhiteJLabel("Liberdade de expressão"));
		purpleBlock4.add(returnWhiteJLabel("Ausência de controles rígidos"));
		purpleBlock4.add(returnWhiteJLabel("Ambiente de trabalho descentralizado"));
		purpleBlock4.add(returnWhiteJLabel("Liberdade para fazer exceções"));
		purpleBlock4.add(returnWhiteJLabel("Oportunidades para delegar tarefas e detalhes"));
		
		purpleBlock5.add(returnWhiteJLabel("Criatividade e Liberdade"));
		purpleBlock5.add(returnWhiteJLabel("(Inspira ideias)"));
		
		/* ** Red profile (Cat) ** */
		redBlock1.add(returnWhiteJLabel("\"Fazer Junto\""));
		redBlock1.add(returnWhiteJLabel("Sensível"));
		redBlock1.add(returnWhiteJLabel("Relacionamentos"));
		redBlock1.add(returnWhiteJLabel("Time"));
		redBlock1.add(returnWhiteJLabel("Tradicionalistas"));
		redBlock1.add(returnWhiteJLabel("Contribuição"));
		redBlock1.add(returnWhiteJLabel("Busca harmonia"));
		redBlock1.add(returnWhiteJLabel("Delega autoridade"));
		
		redBlock2.add(returnWhiteJLabel("Comunicação"));
		redBlock2.add(returnWhiteJLabel("Manter a comunicação harmoniosa"));
		redBlock2.add(returnWhiteJLabel("Desenvolver e manter a cultura empresarial"));
		redBlock2.add(returnWhiteJLabel("Comunicação aberta"));
		
		redBlock3.add(returnWhiteJLabel("Comunicação"));
		redBlock3.add(returnWhiteJLabel("Esconder conflitos"));
		redBlock3.add(returnWhiteJLabel("Felicidade acima dos resultados"));
		redBlock3.add(returnWhiteJLabel("Manipulação através dos sentimentos"));
		
		redBlock4.add(returnWhiteJLabel("Segurança"));
		redBlock4.add(returnWhiteJLabel("Aceitação social"));
		redBlock4.add(returnWhiteJLabel("Construir o consenso"));
		redBlock4.add(returnWhiteJLabel("Reconhecimento da equipe"));
		redBlock4.add(returnWhiteJLabel("Supervisão compreensiva"));
		redBlock4.add(returnWhiteJLabel("Ambiente harmônico"));
		redBlock4.add(returnWhiteJLabel("Busca Trabalho em grupo"));
		
		redBlock5.add(returnWhiteJLabel("Felicidade e Igualdade"));
		redBlock5.add(returnWhiteJLabel("(Cultura da empresa, pensa nos outros)"));
		
		/* ** Setup ** */
		mainPanel.add(new JLabel(""));
		mainPanel.add(returnJLabel("COMPORTAMENTOS"));
		mainPanel.add(returnJLabel("PONTOS FORTES"));
		mainPanel.add(returnJLabel("PONTOS DE MELHORIA"));
		mainPanel.add(returnJLabel("MOTIVAÇÕES"));
		mainPanel.add(returnJLabel("VALORES"));
		mainPanel.add(sharkBlock);
		mainPanel.add(blueBlock1);
		mainPanel.add(blueBlock2);
		mainPanel.add(blueBlock3);
		mainPanel.add(blueBlock4);
		mainPanel.add(blueBlock5);
		mainPanel.add(wolfBlock);
		mainPanel.add(greenBlock1);
		mainPanel.add(greenBlock2);
		mainPanel.add(greenBlock3);
		mainPanel.add(greenBlock4);
		mainPanel.add(greenBlock5);
		mainPanel.add(eagleBlock);
		mainPanel.add(purpleBlock1);
		mainPanel.add(purpleBlock2);
		mainPanel.add(purpleBlock3);
		mainPanel.add(purpleBlock4);
		mainPanel.add(purpleBlock5);
		mainPanel.add(catBlock);
		mainPanel.add(redBlock1);
		mainPanel.add(redBlock2);
		mainPanel.add(redBlock3);
		mainPanel.add(redBlock4);
		mainPanel.add(redBlock5);
		
		sPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBackground(new Color(255, 255, 255));
		this.setTitle("Perfis");
		this.setContentPane(sPanel);
		this.pack();
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
	
	/* ** Return a block with color ** */
	private JPanel returnBlock(String string, int tam) {
		JPanel block = new JPanel();
		block.setLayout(new GridLayout(tam, 1));

		if (string.equals("blue")) {
			block.setBackground(new Color(0, 164, 241));
		}
		else if (string.equals("green")) {
			block.setBackground(new Color(0, 157, 74));
		}
		else if (string.equals("purple")) {
			block.setBackground(new Color(177, 91, 212));
		}
		else if (string.equals("red")) {
			block.setBackground(new Color(195, 55, 55));
		}
		else if (string.equals("dblue")) {
			block.setBackground(new Color(0, 78, 255));
		}
		else if (string.equals("dgreen")) {
			block.setBackground(new Color(0, 108, 51));
		}
		else if (string.equals("dpurple")) {
			block.setBackground(new Color(101, 23, 133));
		}
		else if (string.equals("dred")) {
			block.setBackground(new Color(133, 0, 0));
		}
		return block;
	}

	/* ** Return a label without color, title ** */
	private JLabel returnJLabel(String str) {
		JLabel label = new JLabel(str);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
		return label;
	}
	
	/* ** Return a label with white color, not title ** */
	private JLabel returnWhiteJLabel(String str) {
		JLabel label = new JLabel(str);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setForeground(new Color(255, 255, 255)); // white
		return label;
	}
	
	/* ** Return a label with white color, title ** */
	private JLabel returnBoldWhiteJLabel(String str) {
		JLabel label = new JLabel(str);
		label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setForeground(new Color(255, 255, 255)); // white
		return label;
	}
}
