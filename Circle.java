package jp.dcworks;
/*  1. Shape（図形）という名前のインターフェースを作成し、area()とperimeter()という2つのメソッドを定義してください。
*   ・area()メソッド・・・面積を返す。
*   ・perimeter()メソッド・・・周囲長を返す。
*    Rectangle（長方形）、Circle（円）、Triangle（正三角形）という名前の3つのクラスを作成し、それぞれShapeインター
*    フェースを実装してください。また、各クラスには必要な変数とコンストラクタを定義してください。
*    main関数を持つクラスを作成し、Rectangle、Circle、Triangleのオブジェクトを作成して、各オブジェクトの面積と周囲長
*    を出力するプログラムを作成してください。
*/   

/*円のインタフェース*/
public class Circle implements Shape {
	/*円の半径*/
	private double r;
	
	public Circle (double r) {
		this.r = r;
	}
	public double area() {
		return this.r * this.r * 3.14;
	}
	public double perimeter() {
		return this.r * 2 * 3.14;
	}

}
