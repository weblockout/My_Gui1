package My_Gui1;

import javax.swing.JFrame;

public class Main3 {

	public static void main(String[] args) {

		Calculate3 r = new Calculate3("Калькулятор");
		r.setVisible(true);  // Теперь наше окно видимо
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Теперь на крестик можно закрыть окно
		r.setSize(300, 300); // Размер окна длина и ширина
		r.setResizable(false); // Теперь нельзя изменить размер окна
		r.setLocationRelativeTo(null); // Чтобы окно открывалось в центре экрана


	}

}
