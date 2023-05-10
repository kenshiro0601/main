package curriculum_1_8;

public class curriculum_1_8 {
	public static void main(String[] args) {
		// 問１）
		// 以下の変数を使ってboolean型変数 result_1 に「変数 a の値は変数 b の値以上」という条件式を代入して下さい。
		// boolean型変数 result_1 をコンソールに出力して下さい。

		// 「a」、「b」という箱
		int a = 20;
		int b = 5;
		// result_1に「変数 a の値は変数 b の値以上」という条件式を代入。
		boolean result_1 = a > b ;
		// 箱の中身を表示
		System.out.println(result_1);

		//改行
		System.out.println(" ");

		// 問２）
		// 以下の変数を使ってboolean型変数 result_2 に「変数 c の値と変数 d の値は等しくない」という条件式を代入して下さい。
		// boolean型変数 result_2 をコンソールに出力して下さい。

		// 「c」、「d」という箱
		int c = 5;
		int d = 10;
		// result_2 に「変数 c の値と変数 d の値は等しくない」という条件式を代入
		boolean result_2 = c != d;
		// 箱の中身を表示
		System.out.println(result_2);
		
		//改行
		System.out.println(" ");

		// 問３）
		// 以下の変数を使ってboolean型変数 result_3 に「変数 e の値は10より大きい かつ 変数 f の値は10未満」という条件式を代入して下さい。
		// boolean型変数 result_3 をコンソールに出力して下さい。

		// 「e」、「f」という箱
		int e = 12;
		int f = 8;
		// result_3 に「変数 e の値は10より大きい かつ 変数 f の値は10未満」という条件式を代入
		boolean result_3 = e > 10 && f < 10;
		// 箱の中身を表示
		System.out.println(result_3);
		
		//改行
		System.out.println(" ");

		// 問４）
		// 以下の変数を使ってboolean型変数 result_4 に「変数 g の値は5以下 または 変数 g の値は10以上」という条件式を代入して下さい。
		// boolean型変数 result_4 をコンソールに出力して下さい。

		// 「g」という箱
		int g = 7;
		// result_4 に「変数 g の値は5以下 または 変数 g の値は10以上」という条件式を代入
		boolean result_4 = 5 <= g || g <= 10;
		// 箱の中身を表示
		System.out.println(result_4);
	}
}