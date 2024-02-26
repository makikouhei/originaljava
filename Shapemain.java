package jp.dcworks;
/*  1. Shape（図形）という名前のインターフェースを作成し、area()とperimeter()という2つのメソッドを定義してください。
*   ・area()メソッド・・・面積を返す。
*   ・perimeter()メソッド・・・周囲長を返す。
*    Rectangle（長方形）、Circle（円）、Triangle（正三角形）という名前の3つのクラスを作成し、それぞれShapeインター
*    フェースを実装してください。また、各クラスには必要な変数とコンストラクタを定義してください。
*    main関数を持つクラスを作成し、Rectangle、Circle、Triangleのオブジェクトを作成して、各オブジェクトの面積と周囲長
*    を出力するプログラムを作成してください。
*/   
public class Shapemain {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(5,8);
		System.out.println("長方形の面積" + rectangle.area());
		System.out.println("長方形の周長" + rectangle.perimeter());
		
		Shape circle = new Circle(4);
		System.out.println("円の面積" + circle.area());
		System.out.println("円の周長" + circle.perimeter());
		
		Shape triangle = new Triangle(5,4);
		System.out.println("正三角形の面積" + triangle.area());
		System.out.println("正三角形の周長" + triangle.perimeter());
	}

}
