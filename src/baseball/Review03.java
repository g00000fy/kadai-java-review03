package baseball;

public class Review03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//チームを生成
		BaseBallTeam bbt01 = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
		BaseBallTeam bbt02 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
		BaseBallTeam bbt03 = new BaseBallTeam("阪神タイガース", 68, 71, 4);
		BaseBallTeam bbt04 = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
		BaseBallTeam bbt05 = new BaseBallTeam("広島東洋カープ", 66, 74, 4);
		BaseBallTeam bbt06 = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

		bbt01.getRate();
		bbt01.report();
		bbt02.getRate();
		bbt02.report();
		bbt03.getRate();
		bbt03.report();
		bbt04.getRate();
		bbt04.report();
		bbt05.getRate();
		bbt05.report();
		bbt06.getRate();
		bbt06.report();
	}

}
