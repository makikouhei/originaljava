package jp.dcworks;


public class Hellopaiza {
	public static void main(String[] args) {
	sum();
	calculation1();
	}
/*	1. 数値（int）の引数を2つ受け取り、足し算を行う関数を作成してください。
*	作成した関数をmain関数で使用し、結果を標準出力で表示してください。
*	※足し算の関数に渡す引数の値は、数値（int）であれば何でも良い。
*/	
	public static void sum() {
	int num = add1(8,4);
	System.out.println(num);
	}
	public static int add1(int x, int y) {
		return x + y;
		
	}
/*	上記で作成したクラスに、足し算の関数と同様2つの引数を受け取り、
*	引き算、掛け算、割り算を行う関数を作成してください。
*	作成した関数をmain関数で使用し、結果を標準出力で表示してください。
*	※各関数に渡す引数の値は、数値（int）であれば何でも良い。
*/	
    public static void calculation1() {
    	int x = 8;
    	int y = 4;
    	int result;
    	
    	result = add2(x, y);
    	System.out.println(result);

    	result = sub(x, y);
    	System.out.println(result);

    	result = mul(x, y);
    	System.out.println(result);

    	result = div(x, y);
    	System.out.println(result);
    	}
         
    public static int add2(int x, int y) {
    	return x + y;
    }   
    
    public static int sub(int x, int y) {
    	return x - y;
    }
  
    public static int mul(int x, int y) {
    	return x * y;
    }
    
    public static int div(int x, int y) {
    	if (y == 0) {
    		throw new IllegalArgumentException("0で割ることはできません");
    	}
    	return x / y;
    }   
}