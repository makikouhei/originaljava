package jp.dcworks;
/*  Animalという名前の親クラスを作成し、sound()というメソッドを定義してください。sound()メソッドは、動物の鳴き声
*   を出力するように実装してください。
*	Dog、Cat、Lionという名前の子クラスを作成し、それぞれAnimalクラスを継承してください。また、各クラスには必要な
*	変数とコンストラクタを定義してください。
*	main関数を持つクラスを作成し、Dog、Cat、Lionのオブジェクトを作成して、各オブジェクトのsound()メソッドを呼び出
*	すプログラムを作成してください。
*/
public class Mainvoice {

	public static void main(String[] args) {
		Animal dog = new Dog();
		System.out.println("犬:  " + dog.sound());
		
		Animal cat = new Cat();
		System.out.println("猫:  " + cat.sound());
		
		Animal lion = new Lion();
		System.out.println("ライオン:　　" + lion.sound());

	}

}
