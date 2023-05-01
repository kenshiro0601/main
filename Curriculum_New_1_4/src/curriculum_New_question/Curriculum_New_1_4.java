package curriculum_New_question;

public class Curriculum_New_1_4 {
	public static void main(String[] args) {
		// Q1 下記9個をローカル変数として宣言のみしてください	

		// ・バイト型
		byte a;
		// ・短整数型
		short b;
		// ・整数型
		int c;
		// ・長整数型
		long d;
		// ・単精度浮動小数点数型
		float e;
		// ・倍精度浮動小数点数型
		double f;
		// ・文字型
		char g;
		// ・文字列型
		String h;
		// ・ブーリアン型
		boolean i;

		// Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください

		a = 0;
		b = 0;
		c = 0;
		d = 0L;
		e = 0.0f;
		f = 0.0d;
		g = '\u0000';
		h = null;
		i = false;

		// Q3 初期化をしたそれぞれの変数に下記の値を代入してください

		// ・バイト型                10
		// a箱に10を入れる
		a = 10;

		// ・短整数型                 100
		// b箱に100を入れる
		b = 100;

		// ・整数型                	1000
		// c箱に1000を入れる
		c = 1000;

		// ・長整数型                 10000
		// d箱に10000を入れる
		d = 10000L;

		// ・単精度浮動小数点数型   	 9.5
		// e箱に9.5を入れる
		e = 9.5f;

		// ・倍精度浮動小数点数型		 10.5
		// f箱に10.5を入れる
		f = 10.5d;

		// ・文字型                   a
		// g箱にaを入れる
		g = 'a';

		// ・文字列型              	 ハロー
		// h箱にハローを入れる
		h = "ハロー";

		// ・ブーリアン型          	 true
		// i箱にtrueを入れる
		i = true;

		// Q4 下記の通りにコンソール出力されるようにしてください
		// 	必ず変数を使用すること

		// 11110
		// 「c1」という箱(普通の整数)
		int c1;
		// c1の箱に11110を入れる
		c1 = 11110;
		// 箱の中身を表示
		System.out.println(c1);

		// 20.0
		// 「p1」という箱(普通の整数)
		float p1;
		// p1の箱に20.0を入れる
		p1 = 20.0f;
		// 箱の中身を表示
		System.out.println(p1);

		// a ハロー true
		// 「g1,h1,i1」という箱
		char g1;
		String h1;
		boolean i1;
		// g1,h1,i1の箱に各文字を入れる
		g1 = 'a';
		h1 = "ハロー";
		i1 = true;
		// 箱の中身を表示
		System.out.println(g1);
		System.out.println(h1);
		System.out.println(i1);

		// 11130.0 
		// 「f1」という箱(普通の整数)
		double f1;
		// f1の箱に11130.0を入れる
		f1 = 11130.0d;
		// 箱の中身を表示
		System.out.println(f1);

		// 10000000000                小数点以外の数字を全てかける
		// 「d2」という箱
		long d2;
		// 「d3」という箱
		long d3;
		// d2の箱に100000,d3の箱に「d2*100000」を入れる
		d2 = 100000;
		d3 = d2 * 100000;
		// 箱の中身を表示
		System.out.println(d3);

		// 0.105                      10.5割る100をする
		// 「f2」という箱
		double f2;
		// 「f3」という箱
		double f3;
		// f2の箱に10.5,f3の箱に「f2/100」を入れる
		f2 = 10.5d;
		f3 = f2 / 100;
		// 箱の中身を表示
		System.out.println(f3);

		// -90                        10引く100をする
		// 「c2」という箱
		int c2;
		// 「c3」という箱
		int c3;
		// c2の箱に10,c3の箱に「c2-100」を入れる
		c2 = 10;
		c3 = c2 - 100;
		// 箱の中身を表示
		System.out.println(c3);

		// Q5 
		// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		// 「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		// String num = "20";
		// int num1 = 23;
		// System.out.println("ハローJAVA" + (num + num1));

		// 解答
		// 「num」と「num1」という箱
		int num = 20;
		int num1 = 23;
		// 「num」と「num1」の合計
		int sum = num + num1;
		// 箱の中身を表示
		System.out.println("ハローJAVA" + (num + num1));
	}
}
