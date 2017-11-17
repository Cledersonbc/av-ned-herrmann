package view;
/**
 * @author Clederson Cruz
 * This view displays the test pane. The test consists in 25 questions with 4 choices.
 */
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PlayPanel extends JPanel {
	JButton finish;
	private ButtonGroup btnGroup[];
	private ArrayList<JRadioButton> radios = new ArrayList<>();
	
	public PlayPanel(MouseListener window) {
		
		/* ** Components ** */
		finish = new JButton("Resultado");
		this.setLayout(new GridLayout(151, 1));
		JLabel label;
		JRadioButton radio;
		btnGroup = new ButtonGroup[25];
		
		/* ** Asks and choices ** */
		String textContent[] = {
				"1) Eu sou...",
				"Idealista, criativo e visionário",
				"Divertido, espiritual e benéfico",
				"Confiável, meticuloso e previsível",
				"Focado, determinado e persistente", "",

				"2) Eu gosto de...",
				"Ser piloto",
				"Conversar com os passageiros",
				"Planejar a viagem",
				"Explorar novas rotas", "",

				"3) Se você quiser se dar bem comigo...",
				"Me dê liberdade",
				"Me deixa saber sua expectativa",
				"Lidere, siga ou saia do caminho",
				"Seja amigável, carinhoso e compreensível", "",

				"4) Para conseguir obter bons resultados é preciso...",
				"Ter incertezas",
				"Controlar o essencial",
				"Diversão e celebração",
				"Planejar e obter recursos", "",

				"5) Eu me divirto quando...",
				"Estou me exercitando",
				"Tenho novidades",
				"Estou com os outros",
				"Determino Regras", "",

				"6) Eu penso que...",
				"Unidos venceremos, divididos perderemos",
				"O ataque é a melhor defesa",
				"É bom ser manso, mas andar com um porrete",
				"O homem prevenino vale por dois", "",

				"7) Minha preocupação é...",
				"Gerar a ideia global",
				"Fazer com que as pessoas gostem",
				"Fazer com que funcione",
				"Fazer com que aconteça", "",

				"8) Eu prefiro...",
				"Perguntas a respostas",
				"Ter todos os detalhes",
				"Vantagens a meu favor",
				"Que todos tenham a chance de serem ouvidos", "",

				"9) Eu gosto de...", "Fazer progresso",
				"Construir memórias",
				"Fazer sentido",
				"Tornar as pessoas confortáveis", "",

				"10) Eu gosto de chegar...",
				"Na frente",
				"Junto",
				"Na hora",
				"Em outro lugar", "",

				"11) Um ótimo dia para mim é quando...",
				"Consigo fazer muitas coisas",
				"Me divirto com meus amigos", 
				"Tudo segue conforme o planejado",
				"Desfruto de coisas novas e estimulantes", "",

				"12) Eu vejo a morte como...",
				"Uma grande aventura misteriosa",
				"Oportunidade para rever falecidos",
				"Um modo de receber recompensas",
				"Algo que sempre chega muito cedo", "",

				"13) Minha filosofia de vida é...",
				"Há ganhadores e perdedores, e eu acredito ser um ganhador",
				"Para ganhar, ninguém precisa perder",
				"Para ganhar é precisa seguir as regras",
				"Para ganhar, é necessário inventar novas regras", "",

				"14) Eu sempre gostei de...",
				"Explorar", "Evitar surpresas",
				"Focalizar a meta",
				"Realizar a abordagem natura", "",

				"15) Eu gosto de mudanças se...",
				"Me der uma vantagem competitiva",
				"For divertido e puder ser compartilhado",
				"Me der mais liberdade e variedade",
				"Melhorar ou me der mais controle", "",

				"16) Não existe nada errado em...",
				"Se colocar na frente",
				"Colocar os outros na frente",
				"Mudar de ideia", "Ser consistente", "",

				"17) Eu gosto de buscar conselhos de...",
				"Pessoas bem sucedidas",
				"Anciões e conselheiros",
				"Autoridades no assunto",
				"Lugares, os mais estranhos", "",

				"18) Meu lema é...",
				"Fazer o que precisar ser feito",
				"Fazer bem feito",
				"Fazer junto com grupo",
				"Simplesmente fazer", "",

				"19) Eu gosto de...",
				"Complexidade, mesmo se confuso",
				"Ordem e sistematização",
				"Calor humano e animação",
				"Coisas claras e simples", "",

				"20) O tempo para mim é...",
				"Algo que detesto desperdiçar",
				"Um grande ciclo",
				"Uma flecha que leva ao inevitável",
				"Irrelevante", "",

				"21) Se eu fosse bilionário...",
				"Faria doações para entidades",
				"Criaria uma poupança avantajada",
				"Faria o que desse na cabeça",
				"Exibiria bastante com algumas pessoas", "",

				"22) Eu acredito que...",
				"O destino é mais importante que a jornada",
				"A jornada é mais importante que o destino",
				"Um centavo economizado é um centavo ganho",
				"Bastam um navio e uma estrela para navegar", "",

				"23) Eu acredito também que...",
				"Aquele que hesita está perdido",
				"De grão em grão a galinha enche o papo",
				"O que vai, volta",
				"Um sorriso ou uma careta é o mesmo para quem é cego", "",

				"24) Eu acredito ainda que...",
				"É melhor prudência do que arrependimento",
				"A autoridade deve ser desafiada",
				"Ganhar é fundamental",
				"O coletivo é mais importante do que o individual", "",

				"25) Eu penso que...",
				"Não é fácil ficar encurralado",
				"É preferível olhar, antes de pular",
				"Duas cabeças pensam melhor do que uma",
				"Se você não tem condições de competir, não compita", "",
			};
		
		/* ** Values for each choice ** */
		String choices[] = {
				"I", "C", "O", "A",
				"A", "C", "O", "I",
				"I", "O", "A", "C",
				"I", "O", "C", "A",
				"A", "I", "C", "O",
				"C", "A", "I", "O",
				"I", "C", "O", "A",
				"I", "O", "A", "C",
				"A", "C", "O", "I",
				"A", "C", "O", "I",
				"A", "C", "O", "I",
				"I", "C", "O", "A",
				"A", "C", "O", "I",
				"I", "O", "A", "C",
				"A", "C", "I", "O",
				"A", "C", "I", "O",
				"A", "C", "O", "I",
				"I", "O", "C", "A",
				"I", "O", "C", "A",
				"A", "C", "O", "I",
				"C", "O", "I", "A",
				"A", "C", "O", "I",
				"A", "O", "C", "I",
				"O", "I", "A", "C",
				"I", "O", "C", "A",
		};
		
		/* ** Initializing ** */
		for (int i = 0; i < btnGroup.length ; i++)
			btnGroup[i] = new ButtonGroup();
		
		/* ** Adding radio buttons in panel ** */
		// 150 strings
		// 25 gropus with 6 strings
		// 25 bntGrupos with 4 radios
		// j is a counter for each group
		// choice is a value of a radio (I, O, A or C)
		for (int i = 0, j = -1, choice = 0; i < textContent.length; i++) {
			label = new JLabel(textContent[i]);
			if (i % 6 != 0 && !textContent[i].equals("")) {
				//Each button has a name. His name is its own value.
				radio = new JRadioButton(textContent[i]);
				radio.setName(choices[choice]);
				radio.setBackground(new Color(255, 255, 255));
				radio.setCursor(new Cursor(Cursor.HAND_CURSOR));
				radio.setFocusPainted(false);
				radios.add(radio);
				btnGroup[j].add(radio);
				this.add(radio);
				choice++;
			} else {
				label.setBackground(new Color(255, 255, 255));
				this.add(label);
				if (i % 6 == 0)
					j++;
			}
			
		}
		/* ** Setup ** */
		finish.setBorderPainted(false);
		finish.setFocusPainted(false);
		finish.setContentAreaFilled(false);
		finish.setBackground(new Color(0, 120, 255)); // blue
		finish.setForeground(new Color(255, 255, 255)); // white
		finish.setOpaque(true);
		finish.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
		finish.setCursor(new Cursor(Cursor.HAND_CURSOR));
		finish.addMouseListener(window);
		this.add(finish);
		this.setBackground(new Color(255, 255, 255));
	}
	
	/* ** Counting answers ** */
	public String count() {
		StringBuffer choices = new StringBuffer();
		
		for (JRadioButton radio : radios) {
			if (radio.isSelected()) {
				choices.append(radio.getName());
			}
		}
		
		if (choices.length() != 25) {
			JOptionPane.showMessageDialog(null, "Você se esqueceu de responder alguma pergunta!"
				+ "\nVolte e responda-a para completar o teste.");
		}
		
		return choices.toString();
	}

}
