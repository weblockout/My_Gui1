package My_Gui1;

import java.awt.*;
import java.awt.event.*;  //нужно для отслеживание нажатия на кнопки
import javax.swing.*;    // для формачек - надпись, поле ..и тд

public class SimpleGui extends JFrame {
	
	//Создаем поля
	
	private JButton button = new JButton("Press");  //приватное поле кнопка с надписью Press
	private JTextField input = new JTextField("", 5);  //текстовое поле c размером 5 ( 5 колонок)
	private JLabel label = new JLabel("Input:");  //Надпись для texfield
	private JRadioButton radio1 = new JRadioButton("Select this");  // Кругляшка, в которой мы можем, например выбирать - миужской или женский пол
	private JRadioButton radio2 = new JRadioButton("Select that");  //
	private JCheckBox check = new JCheckBox("Check", false);  // квадратик, где можно кликнуть галочку (типа когда соглашаешься с правилами в конце)
	// false - значит по умолчанию будет без галочки
	
	public SimpleGui () {
		super("Simple example");  //Передаем название в основной конструктор выше JFrame
		this.setBounds(100, 100, 250, 100); // Размер нашей формачки: первые две это где он будет находится, потом 250 по ширине и 100 высота
		// Сразу создадим, чтоб наша формачка могла закрываться
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container container = this.getContentPane();  // container - эта наша формачка, куда мы сможем помещать все наши кнопки,поля и тд
		container.setLayout(new GridLayout(3, 2, 2, 2)); // Создали ширину и высоту 3 и 2,      2 и 2 - Создали отступы
		container.add(label); // Помещаем в контейнер надпись
		container.add(input); // Помещаем поле
		
		// Посколько radio1 и radio2 должны быть вместе
		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		container.add(radio1);
		radio1.setSelected(true);  // Эта кнопка будет выбрана по умолчанию
		container.add(radio2);
		container.add(check);
		//С кнопкой button не все так просто
		// класс ButtonEventListener  создается ниже
		button.addActionListener(new ButtonEventListener ());  // Позволит вызвать новый класс для реализации нашего действия
		container.add(button);
		
	}
	
	// Обработчик всех наших событий
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {    // какое-то событие передается сюда в качестве параметра e
			//Что будем делать при нажатии на кнопку
			String message = "";
			message += "Button was pressed\n";
			// берем текст из input
			message += "Text is " + input.getText() + "\n";
			//Если выбрано radio1 - то напишем Radio #1, если нет, то - Radio #2
			message += (radio1.isSelected() ? "Radio #1" : "Radio #2") + " is selected!\n";
			message += "Checkbox is " + ((check.isSelected()) ? "checked" : "unchecked");
			JOptionPane.showMessageDialog(null, message, "Output",JOptionPane.PLAIN_MESSAGE );
		}
	}
	
	
}
