package jp.dcworks;
/*  1. Shape（図形）という名前のインターフェースを作成し、area()とperimeter()という2つのメソッドを定義してください。
*   ・area()メソッド・・・面積を返す。
*   ・perimeter()メソッド・・・周囲長を返す。
*    Rectangle（長方形）、Circle（円）、Triangle（正三角形）という名前の3つのクラスを作成し、それぞれShapeインター
*    フェースを実装してください。また、各クラスには必要な変数とコンストラクタを定義してください。
*    main関数を持つクラスを作成し、Rectangle、Circle、Triangleのオブジェクトを作成して、各オブジェクトの面積と周囲長
*    を出力するプログラムを作成してください。
*/   

/*正三角形のインターフェース*/
public class Triangle implements Shape {
	/*変の長さ*/
	private double w;
	/*高さ*/
	private double h;
	
	public Triangle(double w, double h) {
		this.w = w;
		this.h = h;

	}
	public double area() {
		return this.w * this.h/2;
	}
	public double perimeter() {
		return this.w * 3;
	}

}
