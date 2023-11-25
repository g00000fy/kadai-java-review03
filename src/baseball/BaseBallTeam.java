package baseball;

public class BaseBallTeam {
	//フィールド
	public String name;		//チーム名
	public int win;			//勝ち数
	public int lose;		//負け数
	public int draw;		//引き分け


	//引数なしコンストラクタ（デフォルトコンストラクタ）
	public BaseBallTeam() {
	}

	//引数ありコンストラクタ
	public BaseBallTeam (String name, int win, int lose, int draw) {
		this.name = name;
		this.win = win;
		this.lose = lose;
		this.draw = draw;
	}

	//getRateメソッド
	public double getRate() {
		double getRate = (double)win/(win + lose);
		return getRate;
	}

	//reportメソッド
	public void report () {
		double getRate = getRate();
		System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw +"分、勝率は" + getRate + "です。");
	}

}
