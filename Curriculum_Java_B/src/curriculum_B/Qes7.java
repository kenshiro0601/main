package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	private static Scanner input;

	public static void main(String[] args) {
		
		// キーボードから1行の文字列の入力を受け付ける読み込みコード。
		input = new Scanner(System.in);
		System.out.printf("生徒の人数を入力してください(2以上): ");

		// 生徒の人数を入力して代入
		int number = input.nextInt();

		// 生徒の平均点を格納するための配列を作成
		double[] average = new double[number + 1];

		// 各科目の点数の値
		int englishTotal = 0;
		int mathTotal = 0;
		int scienceTotal = 0;
		int socialTotal = 0;

		/*
		 * 左の値が右の値より小さければ[true]で+1される。
		 * 生徒の点数を入力して合計を計算。
		 */
		for (int i = 1; i <= number; i++) {

			// メッセージの表示
			System.out.printf(i + "人目の「英語」の点数を入力してください" + " :");

			// 点数を入力してスコアに代入
			int englishScore = input.nextInt();

			// 変数トータルに変数スコアを加算し、結果を代入。
			englishTotal = englishTotal + englishScore;

			// メッセージの表示
			System.out.printf(i + "人目の「数学」の点数を入力してください" + " :");

			// 点数を入力してスコアに代入
			int mathScore = input.nextInt();

			// 変数トータルに変数スコアを加算し、結果を代入。
			mathTotal = mathTotal + mathScore;

			// メッセージの表示
			System.out.printf(i + "人目の「理科」の点数を入力してください" + " :");

			// 点数を入力してスコアに代入
			int scienceScore = input.nextInt();

			// 変数トータルに変数スコアを加算し、結果を代入。
			scienceTotal = scienceTotal + scienceScore;

			// メッセージの表示
			System.out.printf(i + "人目の「社会」の点数を入力してください" + " :");

			// 点数を入力してスコアに代入
			int socialScore = input.nextInt();

			// 変数トータルに変数スコアを加算し、結果を代入。
			socialTotal = socialTotal + socialScore;
			
			// 各科目の合計の平均を求める。
			average[i] = ((double)englishScore + (double)mathScore + (double)scienceScore + (double)socialScore) / 4;

			// 改行
			System.out.println();

		}
		// 英語の平均点を計算して代入
		double englishAverage = (double)englishTotal / number;

		// 数学の平均点を計算して代入
		double mathAverage = (double)mathTotal / number;

		// 理科の平均点を計算して代入
		double scienceAverage = (double)scienceTotal / number;

		// 社会の平均点を計算して代入
		double socialAverage = (double)socialTotal / number;

		// 全体の平均点を計算して代入。
		double totalAverage = ((double)englishTotal + (double)mathTotal + (double)scienceTotal + (double)socialTotal) / (4 * number);

		/*
		 *  jの値が右より小さければ[true]で+1される。
		 *  生徒の平均点を順番に表示するためのループ。
		 */
		for (int j = 1; j < average.length; j++) {
			System.out.printf("%d人目の平均点は%.2f点です。%n" , j , average[j]);

		}
		// 各メッセージの表示
		System.out.printf("%n英語の平均点は%.2f点です。%n" , englishAverage);
		System.out.printf("数学の平均点は%.2f点です。%n" , mathAverage);
		System.out.printf("理科の平均点は%.2f点です。%n" , scienceAverage);
		System.out.printf("社会の平均点は%.2f点です。%n" , socialAverage);
		System.out.printf("全体の平均点は%.2f点です。%n" , totalAverage);
	}
}
