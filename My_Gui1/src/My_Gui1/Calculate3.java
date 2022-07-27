package My_Gui1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculate3 extends JFrame {
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9; 
	JButton b_sum, b_sub, b_div, b_mult, b_equal, b_alt, b_sqr, b_ce, b_del, b_raz;
	JLabel l1,l2,l3;
	
	boolean zpt = false, minus = false;//признак нажатой кнопки зпт, признак -1.
	
	int mod_op = 0; // 1-сложить, 2-вычесть, 3-умножить, 4-поделить, 5-корень, 6-степень, 0-ничего не делать. 
	
	double arg1, arg2, arg0, rezult;   //аргументы для вычисления 
	
	String scr1 = "";	 //строка экрана
	
	public Calculate3 (String s){
		super(s);
		setLayout(new FlowLayout());
		b0 = new JButton(" 0 ");
		b1 = new JButton(" 1 ");
		b2 = new JButton(" 2 ");
		b3 = new JButton(" 3 ");
		b4 = new JButton(" 4 ");
		b5 = new JButton(" 5 ");
		b6 = new JButton(" 6 ");
		b7 = new JButton(" 7 ");
		b8 = new JButton(" 8 ");
		b9 = new JButton(" 9 ");
		b_sum = new JButton(" + ");
		b_sub = new JButton(" - ");
		b_div = new JButton(" / ");
		b_mult = new JButton(" * ");
		b_equal = new JButton("  = ");
		b_alt = new JButton("+/-");
		b_sqr = new JButton("sqr");
		b_ce = new JButton(" CE ");
		b_del = new JButton("del");
		b_raz = new JButton("  , ");
		l1 = new JLabel("");
		l2 = new JLabel("");
		l3 = new JLabel("");

		add(b1);
		add(b2);
		add(b3);
		add(b_div);	
		add(b_del);	
		add(b4);
		add(b5);
		add(b6);
		add(b_mult);
		add(b_ce);
		add(b7);
		add(b8);
		add(b9);
		add(b_sub);
		add(b_sqr);
		add(b0);
		add(b_raz);
		add(b_alt);
		add(b_sum);
		add(b_equal);
		add(l2);
		add(l3);
		add(l1);
		
		eHandler Handler = new eHandler();
		b1.addActionListener(Handler);
		b2.addActionListener(Handler);
		b3.addActionListener(Handler);
		b4.addActionListener(Handler);
		b5.addActionListener(Handler);
		b6.addActionListener(Handler);
		b7.addActionListener(Handler);
		b8.addActionListener(Handler);
		b9.addActionListener(Handler);
		b0.addActionListener(Handler);
		b_raz.addActionListener(Handler);
		b_alt.addActionListener(Handler);
		b_ce.addActionListener(Handler);
		b_del.addActionListener(Handler);		
		b_sum.addActionListener(Handler);
		b_sub.addActionListener(Handler);
		b_div.addActionListener(Handler);
		b_sqr.addActionListener(Handler);
		b_equal.addActionListener(Handler);
		b_mult.addActionListener(Handler);
		l1.setText("0");
	}
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource()==b1){
				if (scr1 == ""){
					scr1 = "1";
				}
				else {
				scr1 = scr1 +"1";
				}
				l1.setText(scr1);
			}
			if(e.getSource()==b2){
				if (scr1 == ""){
					scr1 = "2";
				}
				else {
				scr1 = scr1 +"2";
				}
				l1.setText(scr1);
			}
			if(e.getSource()==b3){
				if (scr1 == ""){
					scr1 = "3";
				}
				else {
				scr1 = scr1 +"3";
				}
				l1.setText(scr1);
			}			
			if(e.getSource()==b4){
				if (scr1 == ""){
					scr1 = "4";
				}
				else {
				scr1 = scr1 +"4";
				}
				l1.setText(scr1);
			}			
			if(e.getSource()==b5){
				if (scr1 == ""){
					scr1 = "5";
				}
				else {
				scr1 = scr1 +"5";
				}
				l1.setText(scr1);
			}
			if(e.getSource()==b6){
				if (scr1 == ""){
					scr1 = "6";
				}
				else {
				scr1 = scr1 +"6";
				}
				l1.setText(scr1);
			}			
			if(e.getSource()==b7){
				if (scr1 == ""){
					scr1 = "7";
				}
				else {
				scr1 = scr1 +"7";
				}
				l1.setText(scr1);
			}			
			if(e.getSource()==b8){
				if (scr1 == ""){
					scr1 = "8";
				}
				else {
				scr1 = scr1 +"8";
				}
				l1.setText(scr1);
			}			
			if(e.getSource()==b9){
				if (scr1 == ""){
					scr1 = "9";
				}
				else {
				scr1 = scr1 +"9";
				}
				l1.setText(scr1);
			}
			if (e.getSource()==b0){				
				if (scr1 != ""){
					scr1 = scr1 + "0";
					l1.setText(scr1);
				}					
			}
// всякие кнопки
			if (e.getSource()==b_raz){
				if (zpt == false){
					if (scr1 == "") {
						scr1 = "0";
					}
					zpt = true;// признак ввода после запятой
					scr1 = scr1 +"."; //прихерачить запятую
					l1.setText(scr1);
				}
				else {
					l1.setText(scr1);
				}				
			}
			if (e.getSource()==b_ce){
				scr1 = ""; // стереть все к х*ям
				mod_op = 0; // убиваем предыдущее вычисление
				l1.setText("0");
			}
			if (e.getSource()==b_del){
				if (scr1 != ""){
					scr1 = scr1.substring(0,scr1.length() - 1); //Backspace реализация  substring - 0 - берем промежуток с начала строки и 
					//scr1.length() до конца стрроки - и отнимаем с конца один символ
					
					if (scr1.indexOf('.')==-1){ // проверяем, не стерли ли мы запятую
						zpt = false;
					}
					if (scr1.length() == 0 ) {
						scr1 = "";
						l1.setText("0");
					}
					else if (scr1 == "-") {
						scr1 = "";
						l1.setText("0");
					}
					else if (scr1 == "-0") {
						scr1 = "";
						l1.setText("0");
					}
					else l1.setText(scr1);
				}	
			}
			
				
			if (e.getSource()==b_alt){
				arg0 = Double.parseDouble(scr1);
				if (arg0 != 0){  // проверяем, что в строке не ноль
					if (minus == false){   // проверяем был ли уже нажат +- ранее
						minus = true;      	//теперь нажали	
						scr1 = "-" + scr1; // приколачиваем - с переди в строку экрана
						l1.setText(scr1);
					}
					else {
						minus = false;
						scr1 = scr1.replace("-", ""); // убираем минус из строки
						l1.setText(scr1);
					}
				}
			}
// операции вычисления
			if (e.getSource()==b_sum){  //сложение
				if (scr1 !=""){
					arg1 = Double.parseDouble(scr1);
				}
				scr1 = "";
				mod_op = 1;
				l1.setText("0");
			}
			if (e.getSource()==b_sub){  // Вычитание
				if (scr1 !=""){
					arg1 = Double.parseDouble(scr1);
				}
				scr1 = "";
				mod_op = 2;
				l1.setText("0");
			}
			if (e.getSource()==b_mult){  // Умножение
				if (scr1 !=""){
					arg1 = Double.parseDouble(scr1);
				}
				scr1 = "";
				mod_op = 3;
				l1.setText("0");
			}
			if (e.getSource()==b_div){  // деление
				if (scr1 !=""){
					arg1 = Double.parseDouble(scr1);
				}
				scr1 = "";
				mod_op = 4;
				l1.setText("0");
			}
			if (e.getSource()==b_sqr){   // Квадратный корень числа
				if (scr1 !=""){
					arg1 = Double.parseDouble(scr1);
				}
				arg1 = Math.sqrt(arg1);   //Его считаем сразу здесь
				scr1 = "" + arg1;
				mod_op = 5;
				l1.setText(scr1);
			}
			
			if (e.getSource()==b_equal){  // Равно
				if (scr1 !=""){
					arg2 = Double.parseDouble(scr1);
				}
				else {
					arg2 = arg1;
				}
				
				if (mod_op == 1){
					rezult = arg1 + arg2;
				}
				if (mod_op == 2){
					rezult = arg1 - arg2;
				}
				if (mod_op == 3){
					rezult = arg1 * arg2;
				}
				if (mod_op == 4){
					rezult = arg1 / arg2;
				}	
				scr1 = "" + rezult;
				l1.setText(scr1);
			
			}
		}
	}
}