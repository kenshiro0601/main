package curriculum_1_6;

public class curriculum_1_6 {
	public static void main(String[] args) {
		// 問１）
		// 変数 x を宣言し、「3」を代入して下さい。
		// 変数 x に自己代入を使って「20」を掛け算して下さい。
		// その後 x の値をコンソールに表示して下さい。

		// 「x」という箱(普通の整数)
		int x ;
		// （xの箱に3を入れる）
		x = 3;
		// 自己代入を使って「20」を掛け算する。
		x = x * 20;
		// 箱の中身を表示
		System.out.println(x);
		
		//改行
		System.out.println (" ");

		// 問２）
		// 以下のプログラムを作成してください。
		// ①int 型の変数 i に 100 を代入する。
		// ②インクリメント演算子を適用して数値を 1 増やす。
		// ③コンソールに変数 i の値を表示する。
		// ④デクリメント演算子を適用して数値を 1 減らす。
		// ⑤コンソールに変数 i の値を表示する。

		// 「i」という箱
		int i ;
		// 「i」の箱に100を入れる
		i = 100;
		// 値を1増やす
		i++;
		// 値を１減らす
		i--;
		// 箱の中身を表示
		System.out.println(i);
		
		//改行
		System.out.println (" ");

		// 問３）
		// 下記の例のような文章をコンソールに出力して下さい。
		// 但し、年齢の部分は乱数を使用し実行毎に結果が変わるようにして下さい。
		// ※数字は0～100までの間で表示されるようにしてください。
		// 例）
		// あなたの年齢を予想します。
		// あなたの年齢はおそらく〇〇歳ですね？

		// (=〜)という箱を用意
		String age = "年齢";
		// 乱数を発生させる記述。(101)を指定すると(r)には(0~100)のいずれかが代入される。
		int r = new java.util.Random().nextInt(101); 
		// 箱(括弧内)の中身を表示
		System.out.println( "あなたの" + age + "を" + "予想します。" );
		// (+ r +)＝(〜歳)乱数を指している。
		System.out.println( "あなたの年齢はおそらく" + r + "歳ですね？" );
	}
}