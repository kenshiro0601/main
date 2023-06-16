package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args) {

		// キーボードから1行の文字列の入力を受け付ける読み込みコード。
		Scanner input = new Scanner(System.in);
		System.out.printf("生徒の人数を入力してください(2以上): ");

		// 生徒の人数を入力して[number]に代入
		int number = input.nextInt();

		// 生徒の平均点を格納するための配列[average]を作成
		double[] average = new double[number + 1];

		// 各科目の値
		int englishTotal = 0;
		int mathTotal = 0;
		int scienceTotal = 0;
		int socialTotal = 0;

		/*
		 * iの値が[number]より小さければ[true]で+1される。
		 * 1から始まり、生徒の人数[変数number]までの範囲でループ。
		 */
		for (int i = 1; i <= number; i++) {

			// メッセージの表示
			System.out.printf(i + "人目の「英語」の点数を入力してください" + " :");

			// 点数の入力して[englishScore]に代入
			int englishScore = input.nextInt();

			// 変数[englishTotal]に変数[englishScore]を加算し、結果を[englishTotal]に代入。
			englishTotal = englishTotal + englishScore;

			// メッセージの表示
			System.out.printf(i + "人目の「数学」の点数を入力してください" + " :");

			// 点数の入力して[englishScore]に代入
			int mathScore = input.nextInt();

			// 変数[mathTotal]に変数[mathScore]を加算し、結果を[mathTotal]に代入。
			mathTotal = mathTotal + mathScore;

			// メッセージの表示
			System.out.printf(i + "人目の「理科」の点数を入力してください" + " :");

			// 点数の入力して[englishScore]に代入
			int scienceScore = input.nextInt();

			// 変数[scienceTotal]に変数[scienceScore]を加算し、結果を[scienceTotal]に代入。
			scienceTotal = scienceTotal + scienceScore;

			// メッセージの表示
			System.out.printf(i + "人目の「社会」の点数を入力してください" + " :");

			// 点数の入力して[englishScore]に代入
			int socialScore = input.nextInt();

			// 変数[socialTotal]に変数[socialScore]を加算し、結果を[socialTotal]に代入。
			socialTotal = socialTotal + socialScore;

			// 各科目の点数の合計を[totalScore]に代入。
			int totalScore = englishScore + mathScore + scienceScore + socialScore;

			// [totalScore]を科目数の4で割ることで平均点を計算。
			double averageScore = (double) totalScore / 4;

			// 変数[averageScore]の値を[average[i](平均点)]に代入。
			average[i] = averageScore;

			// 改行
			System.out.println();

		}
		// 英語の平均点を計算して変数[englishAverage]に代入
		double englishAverage = (double)englishTotal / number;

		// 数学の平均点を計算して変数 mathAverage に代入
		double mathAverage = (double)mathTotal / number;

		// 理科の平均点を計算して変数 scienceAverage に代入
		double scienceAverage = (double)scienceTotal / number;

		// 社会の平均点を計算して変数 socialAverage に代入
		double socialAverage = (double)socialTotal / number;

		// 全体の平均点を計算して[totalAverage]に代入。
		double totalAverage = ((double)englishTotal + (double)mathTotal + (double)scienceTotal + (double)socialTotal) / (4 * number);

		/*
		 *  生徒の平均点を順番に表示するためのループ。
		 *  jの値が[average.length]より小さければ[true]で+1される。
		 */
		for (int j = 1; j < average.length; j++) {
			System.out.printf("%d" + "人目の平均点は" + "%.2f" + "点です。" + "\n" , j , average[j]);

		}
		// 各メッセージの表示
		System.out.printf("\n" + "英語の平均点は" + "%.2f" + "点です。" + "\n" , englishAverage);
		System.out.printf("数学の平均点は" + "%.2f" + "点です。" + "\n" , mathAverage);
		System.out.printf("理科の平均点は" + "%.2f" + "点です。" + "\n" , scienceAverage);
		System.out.printf("社会の平均点は" + "%.2f" + "点です。" + "\n" , socialAverage);
		System.out.printf("全体の平均点は" + "%.2f" + "点です。" + "\n" , totalAverage);
	}
}
