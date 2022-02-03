package gui;

import javax.swing.*;

public class aboutBox {
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Test");

	aboutBox() {
		JFrame window = new JFrame("Sobre a calculadora"); 
		window.add(new JLabel("<html><h1 style=\"color: #4485b8; text-align: center;\">Calculadora Simples em Java</h1>\r\n"
				+ "<p style=\"text-align: center;\"><strong style=\"color: #000;\">Vers&atilde;o:</strong> 1.0.1</p>\r\n"
				+ "<p style=\"text-align: center;\"><strong>Commit:</strong> <a class=\"text-small text-mono Link--secondary\" href=\"https://github.com/fpedrolucas95/Calculadora/commit/979f8c7395b428fd3b72bc2300887374e8793cf4\" data-pjax=\"\">979f8c7</a></p>\r\n"
				+ "<p style=\"text-align: center;\"><strong style=\"color: #000;\"></strong> <a href=\"https://github.com/fpedrolucas95/Calculadora\" target=\"_blank\" rel=\"noopener\" title=\"Calculadora\">https://github.com/fpedrolucas95/Calculadora</a></p>"));
		label.setLocation(8, 16);
		window.pack();
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setSize(305, 186);
	}

	public static void main(String[] args) {
		new aboutBox();
	}
}
