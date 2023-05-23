package curriculum_B;
import java.util.Random;
import java.util.Scanner;
public class Qes1_3 {
	public static void main(String[] args) {
		// Q1 ログイン時の入力チェックシステムを下記条件で作成してください
		// ・コンソールにユーザー名を入力できるようにしてください
		// ・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください 
		// ・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		// ・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
		// Q2 ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください

		// Q1＋Q2の解答

		// キーボードから1行の文字列の入力を受け付ける記述。読み込みのみのコード。x
		Scanner input = new Scanner(System.in);
		
		// 変数nameの値が定義されているか(nullでないかどうか)を判定
		String name = null;

		do {
			System.out.println("名前を入力してください");
			// 1行分の文字列を取得するメソッド(nextLineでコンソールに入力したものが出力)
			name = input.nextLine();
		
			// 文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力
			if (name == null || name.length() == 0) {
			System.out.println("名前を入力してください" + "\n");
			
			}
			// 半角英数字「!：以外」の出力で
			else if (!name.matches("^[a-zA-Z0-9]+$")) {
			System.out.println("半角英数字のみで名前を入力してください" + "\n");
		
			}
			// 文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力
			else if (name.length() > 10) {
			System.out.println("名前を10文字以内にしてください" + "\n");
			
			}
			// 正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力
			else {
			System.out.println("ユーザー名「" + name + "」を登録しました" + "\n");
			break;
		
		}
		} while(true);
		// メッセージの表示
		System.out.println("じゃんけんの手を選んでください");
		
		// Q3 じゃんけんのシステムを下記の条件で作成してください
		// ・「0はグー、1：チョキ、2：パー」とすること
		// ・じゃんけんに勝つまでループすること
		// ・一回ごとに自分の手と相手の手を下記の通り出力してください
		// ユーザー名「name」を登録しました
		// nameの手は「パー」
		// 相手の手は「グー」
		
		// ・条件分岐の設定
		// ・自分がじゃんけんに勝った場合、下記が出力されるようにしてください
		// やるやん。
		// 次は俺にリベンジさせて
		
		// ・自分がじゃんけんでグーに負けた場合、下記が出力されるようにしてください
		//	 俺の勝ち！
		//	 負けは次につながるチャンスです！
		//   ネバーギブアップ！
		
		// ・自分がじゃんけんでチョキに負けた場合、下記が出力されるようにしてください
		//	 俺の勝ち！
		//	 たかがじゃんけん、そう思ってないですか？
		//	 それやったら次も、俺が勝ちますよ
		
		// ・自分がじゃんけんでパーに負けた場合、下記が出力されるようにしてください
		//	 俺の勝ち！
		//	 なんで負けたか、明日まで考えといてください。
		//	 そしたら何かが見えてくるはずです
		
		// ・あいこの場合、下記が出力されるようにしてください
		//   DRAW あいこ もう一回しましょう！
		
		// じゃんけんを行った回数を表示してください
		// 勝つまでにかかった合計回数は1回です
		// ユーザー名が正常の場合じゃんけんのシステムが起動するようにしてください

		// キーボードから1行の文字列の入力を受け付ける記述。読み込みのみのコード。
		Scanner input1 = new Scanner(System.in);
		
		// 整数で指定範囲の乱数を生成[Random.nextInt()](enemy)
		Random rum = new Random();
		
		// 同じ型の複数の値をまとめて一つの変数として扱う。
		String [] janken = {"グー", "チョキ", "パー"};
		int enemyHand = 0;
		int count = 0;
		
		// trueかfalseのみ入るデータ型の宣言。
		boolean fact = true;
		
		// 繰り返し(do-while構文)
		do {
			
			// 相手：「0:グー,1:チョキ,2:パー」の数字を定義。(0,1,2の一つを決めている。)
			enemyHand = rum.nextInt(3);
			
			// 数値を取得するメソッド(nextIntでコンソールに入力したものが出力)
			int myHand = input1.nextInt();
			
			// 自分がどの手を出すかの表示
			System.out.println(myHand);
			
			// 相手がどの手を出すかの表示
			System.out.println(enemyHand);
			
			// ここで何番目かというのを引っ張って来ている：myhand
			System.out.println(name + "の手は" + janken[myHand]);
			
			// ここで何番目かというのを引っ張って来ている：enemyhand
			System.out.println("相手の手は" + janken[enemyHand] + "\n");
			
			//あいこの場合
			if (myHand == enemyHand) {
				// メッセージを表示
				System.out.println("DRAW あいこ もう一回しましょう！" + "\n");
				
			}
			// 自分が相手に負けた記述
			else if ((myHand == 1 && enemyHand == 0) || (myHand == 2 && enemyHand == 1) || (myHand == 0 && enemyHand == 2)) {
				
				// 処理の切り分け。相手の出した手によって負けた場合
				switch(enemyHand) {
				
					// enemyの値が0のとき。自分がじゃんけんでグーに負けた場合
					case 0: 
						System.out.println("俺の勝ち！" + "\n" + "負けは次につながるチャンスです！" + "\n" + "ネバーギブアップ！" + "\n");
						// 処理を中断してswitch文の{}を抜ける
						break;
						
					// enemyの値が1のとき。自分がじゃんけんでチョキに負けた場合
					case 1: 
						System.out.println("俺の勝ち！" + "\n" + "たかがじゃんけん、そう思ってないですか？" + "\n" + "それやったら次も、俺が勝ちますよ" + "\n");
						break;
						
					// enemyの値が2のとき。自分がじゃんけんでパーに負けた場合
					case 2: 
						System.out.println("俺の勝ち！" + "\n" + "なんで負けたか、明日まで考えといてください。" + "\n" + "そしたら何かが見えてくるはずです" + "\n");
						break;

				}
			} 
			else {
					// falseの宣言でじゃんけんを終わらせる。
					fact = false;
					
					// 勝ちのパターン
					System.out.println("やるやん。" + "\n" + "次は俺にリベンジさせて" + "\n");

			}
			// カウント変数で回数の表示
			count++;

		// 上記ブロックを実行後に条件判定
		} while(fact);
		// 回数の表示
		System.out.println("勝つまでにかかった合計回数は" + count + "回です");
	}
}