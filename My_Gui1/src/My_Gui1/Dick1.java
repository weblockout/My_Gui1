package My_Gui1;

// Пример как выводить окна типа подсказок

public class Dick1 {

	public static void main(String[] args) {
	
		Reader1 r = new Reader1();
		r.Scan();
		r.i = count(r.i);
		r.k = count(r.k);
		r.Scan(r.i, r.k); // Это уже вывзывает второй метод Scan в Reader1
				

	}
	
	private static int count(int x) {
		x = x + 1;
		return x;
	}

}
