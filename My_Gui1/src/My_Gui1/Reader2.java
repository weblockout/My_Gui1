package My_Gui1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Reader2 extends JFrame { // extends JFrame - теперь наш класс Reader2 - окно
	JButton b1, b2; // Кнопки
	JLabel l1, l2, l3, l4;
	JTextField t1, t2;
	int i, k;
	String a ,b;
	//Чтобы повесить слушатель на кнопку b2 и b1
	eHandler handler = new eHandler();
	
	public Reader2(String s) {  //Создаем метод с именем как у класса и он становится конструктором
		// Он будет принимать перемнную String
		
		super(s); //ПЕРЕДАЕМ В title строку s
		setLayout(new FlowLayout()); // Теперь все добавленные нами элементы будет он сам расспологать друг рядом с другом
		//(сам выбирает, как их размещать в окне)
		
		
		b2 = new JButton("Посчитать");
		l1 = new JLabel("Введите первое число:"); // Тексит, подсказка для пользователя
		l2 = new JLabel("Введите второе число:");
		l3 = new JLabel("");
		l4 = new JLabel("");
		t1 = new JTextField(10); //Передаем размер поля ввода 10 символов
		t2 = new JTextField(10);

		
		//Теперь нужно все это добавить на экран
		add(b1);
		add(b2);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(l4);
		//Чтобы повесить слушатель на кнопку b2 и b1
		b2.addActionListener(handler);
		b1.addActionListener(handler);
	}
	//Создаем класс внутри класса, тогда он все пременные и все будет заимствовать из вышестоящего класса
	
	public class eHandler implements ActionListener{ // когда мы делаем  implements, есть методы, которые нужно перезаписывать

		public void actionPerformed(ActionEvent e) { //actionPerformed - метод вызывается каждый раз, когда что-то происходит (движение мыши, нажатие)
		//Если пользователь будет вводить не числа а буквы, надо обезопасить от ошибок с помощью try catch
		try { // try пробуем выполнять код, если работает ,идет дальше,
			if(e.getSource() == b2) { //e.getSource() - мы берем наше действие e, getSource() - возвращает значения места, где это сделали(например b2)
			//грубо говоря - если нажали на кнопку "Посчитать"
				i = Integer.parseInt(t1.getText());  // Переводим число набранное в строке в целочисленное
				k = Integer.parseInt(t2.getText());
				i++;
				k++;
				a = "Ваше первое число = " + i;
				b = "Ваше второе число = " + k;
				l3.setText(a); //Передаем значение, строку в l3
				l4.setText(b);
			}
			if(e.getSource() == b1) { //Если нажали Очистить, то очищаем заполненные поля
				t1.setText(null);
				t2.setText(null);
				l3.setText("");
				l4.setText("");
				
			}
		} catch(Exception ex) { // если нет, то 

			JOptionPane.showMessageDialog(null, "Введите в поле число!");		
			}
			
		}
		
	}

}
