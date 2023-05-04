package curriculum_New_1_5;

public class Curriculum_New_1_5 {
	public static void main(String[] args) {

		// Q1 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		// ローカル変数に代入し○○に入れてください
		// 『山田太郎 18歳 170.5cm 62.2kg 寿司』

		// ↓↓format↓↓
		// 「初めまして○○です」
		// 「年齢は○○歳です」
		// 「身長は○○cmです」
		// 「体重は○○kgです」
		// 「好きな食べ物は○○です」

		// Q1を下記に記載

		// (=〜)という箱を用意
		String name = "山田太郎";
		short age = 18;
		double height = 170.5d;
		double weight = 62.2d;
		String food = "寿司";

		// 箱(括弧内)の中身を表示
		System.out.println( "初めまして" + name + "です" );
		System.out.println( "年齢は" + age + "歳" + "です" );
		System.out.println( "身長" + height + "㎝" + "です");
		System.out.println( "体重は" + weight + "kg" + "です");
		System.out.println( "好きな食べ物は" + food + "です");

		// Q2 Q1で作成した自己紹介に続いて、BMIがコンソールに出力されるようにしてください
		// 「BMIは○○です」
		// ただし計算は数値を直書きせず、全て変数を使ってすること

		// Q2を下記に記載

		// (=〜)という箱を用意
		double BMI = weight / ((height / 100) * (height / 100));

		// 箱(括弧内)の中身を表示　※BMI = (String.format("%.1f", 〜))
		System.out.println( "BMIは" + (String.format("%.1f", BMI) + "です" ));   	


		// Q3 Q1で宣言した変数に再代入し、下記の通りコンソールに出力してください
		// 初めまして鈴木一郎です
		// 年齢は24歳です
		// 身長168.5cmです
		// 体重は64.2kgです
		//	好きな食べ物はオムライスです
		// BMIは22.6です

		// Q3を下記に記載

		String name1 = "山田太郎";
		// 再代入
		name1 = "鈴木一郎";
		short age1 = 18;
		// 再代入
		age1 = 24;
		double height1 = 170.5d;
		// 再代入
		height1 = 168.5d;
		double weight1 = 62.2d;
		// 再代入
		weight1 = 64.2d;
		String food1 = "寿司";
		// 再代入
		food1 = "オムライス";
		double BMI1 = weight1 / ((height1 / 100) * (height1 / 100));
		// 再代入
		BMI1 = weight1 / ((height1 / 100) * (height1 / 100));
		// 箱(括弧内)の中身を表示
		System.out.println( "初めまして" + name1 + "です" );
		System.out.println( "年齢は" + age1 + "歳" + "です" );
		System.out.println( "身長" + height1 + "㎝" + "です");
		System.out.println( "体重は" + weight1 + "kg" + "です");
		System.out.println( "好きな食べ物は" + food1 + "です");
		System.out.println( "BMIは" + (String.format("%.1f", BMI1) + "です" ));

		// ↓↓コンソール最終結果↓↓

		// 初めまして山田太郎です
		// 年齢は18歳です
		// 身長170.5cmです
		// 体重は62.2kgです
		// 好きな食べ物は寿司です
		// BMIは21.4です
		//	
		// 初めまして鈴木一郎です
		// 年齢は24歳です
		// 身長168.5cmです
		// 体重は64.2kgです
		// 好きな食べ物はオムライスです
		// BMIは22.6です
	}
}