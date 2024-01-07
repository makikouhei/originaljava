package jp.dcworks;
/* 4. main関数を持つクラスを1つ、足し算、引き算、掛け算、割り算の計算をする関数を持つクラスをそれぞれ作
*  成してください。関数は動的メソッドとして作成してください。
*  また、関数は引数を持たず、クラスのインスタンス変数を使用し計算を行ってください。
*  main関数を持つクラスに、作成した足し算、引き算、掛け算、割り算の動的メソッドを使用し、計算を行って
*  ください。
*      ※各クラスのインスタンス生成時に渡す引数の値は、数値（int）であれば何でも良い。
*/      
public class Subcalculation {
	
	private int x = 0;
	private int y = 0;
	
	public Subcalculation(int x,int y) {
		this.x = x;
		this.y = y;

	}
	public int sub() {
		return this.x - this.y;
	}

}
