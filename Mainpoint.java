package jp.dcworks;
/* 5. X軸（int） 、Y軸（int）の座標を保持するPointクラスを作成してください。
*   2点の座標の距離を求める関数を作成し、main関数を持つクラスで計算結果を表示してください。
*   2点の座標を計算する計算式： Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))
*/
public class Mainpoint {

	public static void main(String[] args) {
		Point p1 =new Point(3,4);
		Point p2 =new Point(7,1);
		
		double distance =p1.distanceTo(p2);
		System.out.println(distance);
	}
}
