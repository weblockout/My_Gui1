package My_Gui1;

import javax.swing.JFrame;

public class Dick2 {

	public static void main(String[] args) {

		Reader2 r = new Reader2("Черный-Рубен"); // Передаем в title уже сам текст
		r.setVisible(true);  // Теперь наше окно видимо
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Теперь на крестик можно закрыть окно
		r.setSize(300, 200); // Размер окна длина и ширина
		r.setResizable(false); // Теперь нельзя изменить размер окна
		r.setLocationRelativeTo(null); // Чтобы окно открывалось в центре экрана
	}

}
