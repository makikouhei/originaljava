package jp.dcworks;
/* 5. X軸（int） 、Y軸（int）の座標を保持するPointクラスを作成してください。
*   2点の座標の距離を求める関数を作成し、main関数を持つクラスで計算結果を表示してください。
*   2点の座標を計算する計算式： Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))
*/
public class Point {

	private double x;
	
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double distanceTo(Point other) {
		return Math.sqrt((this.x - other.x) * (this.x - other.x) + (this.y - other.y) * (this.y - other.y));
	}
}
