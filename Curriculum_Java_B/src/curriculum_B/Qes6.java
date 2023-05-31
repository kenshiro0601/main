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
		//
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
		System.out.println("製品を入力してください" + "\n");

		// ランダムな数値を生成[Random.nextInt()]
		Random ran = new Random();

		/*
		 * 数値を取得するメソッド(nextIntでコンソールに入力したものが出力)。
		 * 在庫を表す変数「stock1〜7」に、0以上12未満のランダムな数値を代入
		 */
		int stock1 = ran.nextInt(12);
		int stock2 = ran.nextInt(12);
		int stock3 = ran.nextInt(12);
		int stock4 = ran.nextInt(12);
		int stock5 = ran.nextInt(12);
		int stock6 = ran.nextInt(12);
		int stock7 = ran.nextInt(12);

		// falseの宣言。(ループを繰り返す)
		boolean fact1 = false;

		// 繰り返し(do-while構文)
		do {

			// 1行分の文字列を取得するメソッド(nextLineでコンソールに入力したものが出力)
			String input1 = input.nextLine();

			// コンソールに入力した文字が「goods」の中へ。
			String [] goods = input1.split(",");

			// 配列[appliance]の要素を順番に取り出し、変数[product]に代入
			for (String products : goods) {

				// 代入された後にswitch文の実行。在庫(stock1)が表示され、次のループへ。
				switch (products) {

				// 同様の処理
				case "パソコン":
					System.out.println(products + "の残り台数は" + stock1 + "台です" + "\n");
					System.out.println("製品を入力してください" + "\n");
					break;

				// 同様の処理
				case "冷蔵庫":
					System.out.println(products + "の残り台数は" + stock2 + "台です" + "\n");
					System.out.println("製品を入力してください" + "\n");
					break;

				// 同様の処理
				case "扇風機":
					System.out.println(products + "の残り台数は" + stock3 + "台です" + "\n");
					System.out.println("製品を入力してください" + "\n");
					break;

				// 同様の処理
				case "洗濯機":
					System.out.println(products + "の残り台数は" + stock4 + "台です" + "\n");
					System.out.println("製品を入力してください" + "\n");
					break;

				// 同様の処理
				case "加湿器":
					System.out.println(products + "の残り台数は" + stock5 + "台です" + "\n");
					System.out.println("製品を入力してください" + "\n");
					break;

				// 同様の処理
				case "テレビ":
					System.out.println("テレビの残り台数は" + stock6 + "台です" + "\n");
					System.out.println("製品を入力してください" + "\n");
					break;

				// 同様の処理。最大個数11個からランダムで出た数字を引いて出力。
				case "ディスプレイ":
					System.out.println("ディスプレイの残り台数は" + (11 - stock7) + "台です" + "\n");
					System.out.println("製品を入力してください" + "\n");
					break;

				// switch文のどの[case]にも当てはまらない場合、[defalt]が実行される。
				default:
					// 「false」に設定し、ループを繰り返す。
					fact1 = false;
					System.out.println("『 " + products + " 』は指定の商品ではありません" + "\n");
					System.out.println("製品を入力してください" + "\n");
					break;
				}
			}

		// フラグをtrueに設定してループを終了
		} while(!fact1);
	}
}

