package jp.dcworks;

import java.util.HashMap;
import java.util.Map;

public class Helloworld {
	public static void main(String[] args) {
		sayHello();
		NumberReverse();
		halloKuku();
		hellonumber2();
		helloFruit();
		
	}
/*文字列型の変数を2つ（変数名：str1, str2）用意してください。
	それぞれの変数に「aaa」「bbb」を代入してください。
	代入した値を入れ替えてください。*/
	public static void sayHello() {
		String str1 ="aaa";
		String str2 ="bbb";
		System.out.println(str1);
		System.out.println(str2);
	
		String a =str1;
		str1 =str2;
		str2 =a;
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("");
	}
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	数値型の配列を2つ（変数名：arr1, arr2）用意してください。
	arr1の変数の各要素に「0～ 9」を代入し、初期化してください。
	arr1に代入した要素を取り出し、arr2に反転した結果「9 ～ 0」を代入してください。*/		
	public static void NumberReverse() {
		int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};  
		int[] arr2 = arr1.clone();
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println("");
		for (int i = arr2.length - 1; i >=0; i--) {
			System.out.print(arr2[i] +" ");
			
		}
		
		
		
		
		System.out.println("");
		
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*出力結果のように九九の表を作成してください。
数時間の区切り文字は半角スペース文字とします。*/		
	public static void halloKuku() {	
		System.out.println("");
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		System.out.println("");
	}	
		
		
		
		
		
		
		
		
		
		
		
		
/*1から100までの要素を持つ配列を作成し偶数だけ表示してください。*/			
	public static void hellonumber2() {	
		for(int i=1; i<=100; i++ ) {
			if(i % 2==0) {
				System.out.print(i + " ");
			}
			
		}
		System.out.println("");
		System.out.println("");
	}
	
/*	キーに「1から5」、値に「りんご、いちご、みかん、バナナ、メロン」を順にセットした
HashMapを作成し、キーと値を一つずつ表示してください。*/
	public static void helloFruit() {
		Map<String,String>fruits =new HashMap<>(); {
			fruits.put("1","りんご");
			fruits.put("2","いちご");
			fruits.put("3","みかん");
			fruits.put("4","バナナ");
			fruits.put("5","メロン");
			
			for(String fruit : fruits.values()) {
				System.out.println(fruit);
			}
		}
	}
}
