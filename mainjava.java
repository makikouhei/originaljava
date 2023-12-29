package jp.dcworks;
/* main関数を持つクラスを1つ、足し算、引き算、掛け算、割り算の計算をする関数を持つクラ
*  スをそれぞれ作成してください。関数は静的メソッドとして作成してください。
*  main関数を持つクラスに、作成した足し算、引き算、掛け算、割り算の静的メソッドを使用し、
*  計算を行ってください。
*     ※各関数に渡す引数の値は、数値（int）であれば何でも良い。
*/
public class mainjava {

	public static void main(String[] args) {
		int x = 8;
		int y = 4;
		
		int result = maintest.sum(x , y);
		System.out.println(result);
		
		result = subjava.sub(x , y);
		System.out.println(result);
		
		result = muljava.mul(x, y);
		System.out.println(result);
		
		result = divjava.div(x, y);
		System.out.println(result);
		
	}

}
