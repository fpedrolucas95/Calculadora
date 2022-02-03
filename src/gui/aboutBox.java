package gui;

import javax.swing.*;

public class aboutBox {
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Test");

	aboutBox() {
		JFrame window = new JFrame("Sobre a calculadora"); 
		window.add(new JLabel("<html><h1><bold>Calculadora Simples em Java</bold></h1><center>Versão 1.0.0</bold><p><h5>Commit 148a92a<p>https://github.com/fpedrolucas95/Calculadora<p>⠀"));
		window.pack();
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
	}

	public static void main(String[] args) {
		new aboutBox();
	}
}
