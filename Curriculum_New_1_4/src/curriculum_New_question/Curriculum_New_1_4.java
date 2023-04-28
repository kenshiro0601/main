package curriculum_New_question;

public class Curriculum_New_1_4 {
		public static void main(String[] args) {
	//   Q1 下記9個をローカル変数として宣言のみしてください
	//		(その場でしか使えない関数)  SQL入門 P.49

	//	・バイト型(とても小さな整数)
		byte a;
	//	・短整数型(小さな整数)
		short b;
	//	・整数型(普通の整数)
		int c;
	//	・長整数型(大きな整数 *末尾にL)
		long d;
	// 	・単精度浮動小数点数型(少しあいまいでもよい少数 *末尾にf) 
		float e;
	//	・倍精度浮動小数点数型(普通の少数 *末尾にd)
		double f;
	//  ・文字型(1つの文字)
		char g;
	//	・文字列型(文字の並び)
		String h;
	//	・ブーリアン型 (true か false)
		boolean i;

	//  Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
	//		(初期値は変数が宣言された時に最初に設定される値のこと)

		a = 0;
		b = 0;
		c = 0;
		d = 0L;
		e = 0.0f;
		f = 0.0d;
		g = '\u0000';
		h = null;
		i = false;
	    	 
	//  Q3 初期化をしたそれぞれの変数に下記の値を代入してください
		
	//	・バイト型                10
	//	（a箱に10を入れる）
		a = 10;
			
	// 	・短整数型                 100
	//　（b箱に100を入れる）
		b = 100;

	// 	・整数型                	1000
	//	（c箱に1000を入れる）
		c = 1000;

	// 	・長整数型                 10000
	//	（d箱に10000を入れる）
		d = 10000L;
			
	//	・単精度浮動小数点数型   	 9.5
	//	(e箱に9.5を入れる）
	 	e = 9.5f;
			 
	//	・倍精度浮動小数点数型		 10.5
	//	(f箱に10.5を入れる)
		f = 10.5d;

	//	・文字型                   a
	//	(g箱にaを入れる)
		g = 'a';

	//	・文字列型              	 ハロー
	//	(h箱にハローを入れる)
		h = "ハロー";

	//	・ブーリアン型          	 true
	//	(i箱にtrueを入れる)
		i = true;
		    	 
	//	Q4 下記の通りにコンソール出力されるようにしてください
	// 	必ず変数を使用すること
		
	//	11110
	//	「c」という箱(普通の整数)
		int c;
	//	（cの箱に11110を入れる）
		c = 11110;
	//	箱の中身を表示
		System.out.println(c);

	// 	20.0
	//	「e」という箱(普通の整数)
		float e;
	//	（eの箱に20.0を入れる）
		e = 20.0f;
	//	箱の中身を表示
		System.out.println(e);

	//	a ハロー true
	//	「g,h,i」という箱
		char g;
		String h;
		boolean i;
	//  g,h,iの箱に各文字を入れる
		g = 'a';
		h = "ハロー";
		i = true;
	//  箱の中身を表示
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);

	// 	11130.0 
	//	「f」という箱(普通の整数)
		double f;
	//  cの箱に10,c1の箱に100を入れる
		f = 11130.0d;
	//  箱の中身を表示
		System.out.println(f);
			 
	// 	10000000000                小数点以外の数字を全てかける
	//	「d」という箱
		long d;
	//	「d1」という箱
		long d1;
	//  dの箱に100000,d1の箱に100000を入れる
		d = 100000;
		d1 = d * 100000;
	//  箱の中身を表示
		System.out.println(d1);

	// 	0.105                      10.5割る100をする
	//	「f」という箱
		double f;
	//	「f1」という箱
		double f1;
	//  fの箱に10.5,f1の箱に100を入れる
		f = 10.5d;
		f1 = f / 100;
	//  箱の中身を表示
		System.out.println(f1);

	// 	-90                        10引く100をする
	//	「c」という箱
		int c;
	//	「c1」という箱
		int c1;
	//  cの箱に10,c1の箱に100を入れる
		c = 10;
		c1 = c - 100;
	//  箱の中身を表示
		System.out.println(c1);
	    	 
	// 	Q5 
	//	次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
	//	「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
	//	String num = "20";
	//	int num1 = 23;
	//	System.out.println("ハローJAVA" + (num + num1));
	//	解答
	//	「num」と「num1」という箱
		int num = 20;
		int num1 = 23;
	//	「num」と「num1」の合計
		int sum = num + num1;
	//  箱の中身を表示
		System.out.println("ハローJAVA" + (num + num1));
		}
}
