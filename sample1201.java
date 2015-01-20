
class houteisiki1d {
	double a;
	double b;

	houteisiki1d(double a, double b){
		this.a = a;
		this.b = b;
	}

	String print(){
		String formula = "1d: " + a + "x" + (b >= 0 ? "+" : "") + b + "=" + 0;
		return formula;
	}

	double solve(){
		double x = -b / a;
		return x;
	}
}
// x=-b / a

class houteisiki2d extends houteisiki1d {
	int c;

	houteisiki2d(int a, int b, int c){
		super(a, b);
		this.c = c;
	}

	String print(){
		String formula = "2d: " + a + "x^2" + (b >= 0 ? "+" : "") + b + "x" + (c >= 0 ? "+" : "") + c + "=" + 0;
		return formula;
	}

	double solve(){
		double x = (-b + Math.sqrt(Math.pow(b, 2) - 4.0 * a * c)) / (2.0 * a);
		return x;
	}
	
	double solve2(){
		double x = (-b - Math.sqrt(Math.pow(b, 2) - 4.0 * a * c)) / (2.0 * a);
		return x;
	}
}
// x^2/ab+x/a=-c/ab

public class sample1201 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		houteisiki1d test1d = new houteisiki1d(2, 3);
		houteisiki2d test2d = new houteisiki2d(1, 8, 0);

		System.out.println(test1d.print());
		System.out.println(test1d.solve());
		System.out.println(test2d.print());
		System.out.println(test2d.solve());
		System.out.println(test2d.solve2());
	}

}
