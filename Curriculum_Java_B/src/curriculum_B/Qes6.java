package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {

		//		入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
		//		・拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可
		//		・Switch文内でテレビとディスプレイは続けて書くようにしてください、条件演算子で出力される値を変更してください
		//		・テレビとディスプレイは同じ商品扱いとし、ディスプレイが出た場合は最大個数の11個からランダムで出た数字を引いて出力してください 
		//		・例：テレビと受け取った場合、→「テレビの残り台数は〇〇台です」※〇〇はランダムで出た数字
		//		・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません
		//		・入力された値は「、」区切りで指定してください
		//		・そのほかの値が入力された場合下記を出力されるようにしてください
		//		・残り台数は0〜11までのランダムな値が出力されるようにしてください
		//
		//		入力例↓↓
		//		パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品
		//
		//		出力例↓↓
		//		パソコンの残り台数は8台です
		//		冷蔵庫の残り台数は7台です
		//		扇風機の残り台数は7台です
		//		洗濯機の残り台数は10台です
		//		加湿器の残り台数は3台です
		//		テレビの残り台数は9台です
		//		ディスプレイの残り台数は2台です
		//		『 その他商品 』は指定の商品ではありません


		// キーボードから1行の文字列の入力を受け付ける記述。読み込みのみのコード。
		Scanner input = new Scanner(System.in);

		// ランダムな数値を生成[Random.nextInt()]
		Random ran = new Random();

		// 在庫の値
		int stock = 0;
		int stocktv = 0;
		int stockdisplay = 0;

		// falseの宣言。(ループを繰り返す)
		boolean fact1 = false;

		// 繰り返し(do-while構文)
		do {

			/*
			 * [nextLine]でコンソールに入力したものが出力。入力した文字が[goods]の中へ。
			 * 区切り[ 、]の指定
			 * String [] goods = input1.split(","); + String input1 = input.nextLine();の省略コード
			 */
			String[] goods = input.nextLine().split("、");

			// 配列[appliance]の要素を順番に取り出し、変数[product]に代入
			for (String products : goods) {

				// 代入された後にswitch文の実行。在庫(stock)が表示され、次のループへ。
				switch (products) {

				// 同様の処理
				case "パソコン":

				case "冷蔵庫":

				case "扇風機":

				case "洗濯機":

				case "加湿器":

					/*
					 * 数値を取得するメソッド(nextInt)でコンソールに入力したものが出力)。
					 * 在庫を表す変数「stock」に、0以上12未満のランダムな数値を代入
					 */
					stock = ran.nextInt(12);

					// 入力された家電の残り台数を出力。
					System.out.println(products + "の残り台数は" + stock + "台です" + "\n");
					break;

				// 同様の処理。最大個数11個からランダムで出た数字を引いて出力。
				case "テレビ":

					// テレビの在庫数を表す。
					stocktv = ran.nextInt(11);

					// テレビの在庫数の表示。
					System.out.println(products + "の残り台数は" + stocktv + "台です" + "\n");
					break;

				case "ディスプレイ":

					// テレビの在庫数(stock)を11から引いた値がディスプレイ
					stockdisplay = 11 - stocktv;

					// ディスプレイの在庫数を表示。
					System.out.println(products + "の残り台数は" + stockdisplay + "台です" + "\n");
					break;

				// switch文のどの[case]にも当てはまらない場合、[defalt]が実行される。
				default:
					// 「false」に設定し、ループを繰り返す。
					fact1 = false;
					System.out.println("『 " + products + " 』は指定の商品ではありません" + "\n");
					break;
				}
			}
		// フラグをtrueに設定してループを終了
		} while(!fact1);
	}
}

