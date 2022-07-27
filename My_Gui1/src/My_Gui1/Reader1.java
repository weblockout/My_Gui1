package My_Gui1;


import javax.swing.JOptionPane;

public class Reader1 {
	int i, k;
	String n1, n2;
	public void Scan() {
		
		//showInputDialog - все введенное расценивает как строку, даже если введем число и 
		// надо будет строки n1 и n2 переводить в числа через Interger
		n1 = JOptionPane.showInputDialog("Введите первое число"); // Выводит табличку , в которой встроенно поле ввода для считывания, 
		//что туда напишем и будет также написана подсказка - "Введите первое число"
		
		n2 = JOptionPane.showInputDialog("Введите второе число");
		i = Integer.parseInt(n1); // Переводим строку в число
		k = Integer.parseInt(n2);
		
	}
	
	
	public void Scan(int a, int b) {
		
		JOptionPane.showMessageDialog(null, "Теперь ваше первое число = " + a);  // Ввыодит какие-то мессаджи, подсказки и тд   
		//null - значит в самом центре экрана
		JOptionPane.showMessageDialog(null, "Теперь ваше второе число = " + b);
	}

}
