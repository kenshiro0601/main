package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	private static Scanner input;

	public static void main(String[] args) {

		// キーボードから1行の文字列の入力を受け付ける読み込みコード。
		input = new Scanner(System.in);
		System.out.printf("生徒の人数を入力してください(2以上): ");

		// 生徒の人数を入力して代入
		int studentNumber = input.nextInt();

		// 科目名の配列を生成
		String[] subject = { "英語", "数学", "理科", "社会" };

		// 生徒の人数に応じた行数と科目の数に応じた列数の多次元配列を作成
		int[][] scores = new int[studentNumber][subject.length];

		// 生徒人数の繰り返し処理
		for (int i = 0; i < studentNumber; i++) {

			// 科目の繰り返し処理(各科目の平均点を計算するループ)
			for (int j = 0; j < subject.length; j++) {

				// 生徒の各科目の点数を出力
				System.out.printf("%d人目の「%s」の点数を入力してください: ", (i + 1) , subject[j]);

				// 入力から整数を読み取り、整数を配列のi番目の行とj番目の列の要素に代入
				scores[i][j] = input.nextInt();

			}
			// 改行
			System.out.println();

		}
		// 各生徒の平均点を格納するための配列を宣言
		double[] average = new double[studentNumber];

		// 各科目の合計点を格納するための配列を宣言
		int[] subjectTotal = new int[subject.length];

		// 生徒人数の繰り返し処理
		for (int i = 0; i < studentNumber; i++) {

			// 科目の繰り返し処理(各科目の平均点を計算するループ)
			for (int j = 0; j < subject.length; j++) {

				// 科目ごとの合計点を計算
				subjectTotal[j] = subjectTotal[j] + scores[i][j];

				// 各生徒の合計点を計算
				average[i] = average[i] + scores[i][j];
				
			}
			// 各生徒の平均点を計算
			average[i] = average[i] / subject.length;
			
		}
		// 各科目の平均点を格納
		double[] subjectAverage = new double[subject.length]; 

		// 科目の繰り返し処理(各科目の平均点を計算するループ)
		for (int j = 0; j < subject.length; j++) {

			// 各科目の平均点を計算
			subjectAverage[j] = (double) subjectTotal[j] / studentNumber;
			
		}
		// 全体の平均点を表すための変数
		double totalAverage = 0;

		// 科目の繰り返し処理(各科目の平均点を計算するループ)
		for (int j = 0; j < subject.length; j++) {

			// 各科目の平均点を合計
			totalAverage = totalAverage + subjectAverage[j];
			
		}
		// 全体の平均点を計算
		totalAverage = totalAverage / subject.length;

		// 生徒人数の繰り返し処理
		for (int i = 0; i < studentNumber; i++) {
			System.out.printf("%d人目の平均点は%.2f点です。%n", (i + 1), average[i]);
			
		}
		// 改行
		System.out.println();

		// 科目の繰り返し処理(各科目の平均点を計算するループ)
		for (int j = 0; j < subject.length; j++) {
			System.out.printf("%sの平均点は%.2f点です。%n", subject[j], subjectAverage[j]);
			
		}
		// 全体の平均点を表すメッセージ
		System.out.printf("全体の平均点は%.2f点です。%n", totalAverage);
	}
}
