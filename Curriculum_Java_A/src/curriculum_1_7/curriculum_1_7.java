package curriculum_1_7;

public class curriculum_1_7 {
	public static void main(String[] args) {

		// 問１）
		// 以下のプログラムを作成してください。
		// ①int型変数 i に 3 を代入する。
		// ②double型変数 d に i を代入する。
		// ③変数 i と変数 d の値をそれぞれコンソールに表示する。

		// int型に３を代入
		int i = 3;
		// double型にiを代入(浮動小数点型)
		double d = i;
		// 箱の中身を表示
		System.out.println(i);
		System.out.println(d);

		//改行
		System.out.println (" ");
		
		// 問２）
		// 以下のプログラムを作成してください。
		// ①double型変数 pi に数値「3.14」を代入して下さい。。
		// ②変数 pi に「3」を掛けた値をコンソールに出力して下さい。
		// ③int型の変数 integer を宣言し、変数 pi を int型に型変換しコンソールに出力して下さい。

		// ①double型に3.14を代入
		double pi = 3.14d;
		// ②自己代入を使って３を掛け算
		pi = pi * 3;
		// ③強制的な型変換。9.42をint型へ型変換して代入
		int integer = (int)pi;			
		// 箱の中身を表示
		System.out.println(pi);
		System.out.println(integer);
		
		//改行
		System.out.println (" ");

		// 問３）
		// ①double型の変数を定義し、「2 + 6.0」を代入して下さい。
		//	 double型の変数をコンソールに出力して下さい。
		// ②int型の変数を定義し、double型の変数をint型に型変換して代入下さい。
		//	 int型の変数をコンソールに出力して下さい。
		// ③String型の変数を定義し、int型の変数をString型に型変換して代入して下さい。
		//	 String型の変数をコンソールに出力して下さい。
		// ④「②」で定義したint型変数に、String型の変数をint型に型変換して代入して下さい。
		//	 int型の変数をコンソールに出力して下さい。

		// ①double型に「2 + 6.0」を代入
		double p = 2 + 6.0;
		// ②int型を定義、double型の変数をint型に型変換して代入。
		int p1 = (int) p;
		// ③String型の変数を定義し、int型の変数をString型に型変換して代入。
		//	 StringクラスのvalueOfメソッドを使って文字列に変換
		String p2 = String.valueOf(p1);
		// ④「②」で定義したing型変数に、String型の変数をing型に型変換して代入。
		// IntegerクラスのparseIntでing型の数値に変換。
		int p3 = Integer.parseInt(p2);
		// 箱の中身を表示
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}