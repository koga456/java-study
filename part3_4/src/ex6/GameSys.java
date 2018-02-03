package ex6;
import mylib.Input;
public abstract class GameSys {
	/* ゲーム実行 */
	public void playGame() {
		init(); // タイトル表示などの開始処理
		do {
			play(); // ゲームを１回実行する
			eval(); // ゲームの結果を表示する
		} while (next());
	}
	
	/* 繰り返し判定 */
	public boolean next() {
		String s = Input.getString("続けますか？");
		if (s == null) return true; // 続ける
		else           return false; // 止める
	}
	
	/* オーバライドするメソッド（内容は空） */
	protected abstract void init();
	protected abstract void play();
	protected abstract void eval();
}
