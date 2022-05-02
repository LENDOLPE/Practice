import java.util.ArrayList;

public class CalculatorDemo1 {
	public static int getSurvivingIndex(int n, int k) {
		// 솔저 생성
		ArrayList<Integer> soldiers = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			soldiers.add(i); // 1번군사부터 차례대로 배열에 넣어준다.
		}
		// 시체 보관소
		ArrayList<Integer> corpse_list = new ArrayList<>();
		// 최후의 한명이 남는 순간까지 게임을 반복한다
		while (n >= 2) { // 20명중 1명이 남을때까지.
			for (int i = 1; i <= k - 1; i++) { // 1번부터 4번까지
				soldiers.add(soldiers.get(0)); // 솔져의 0번째 배열 조회 후 조회 한 값을
				soldiers.remove(0); // 0번째 자리에 있는 값을 없앤다
			}
			corpse_list.add(soldiers.get(0)); // 솔져0번째 값을 시체 리스트에 담는다
			soldiers.remove(0); // 0번째 값을 없앤다.
			n--; // 감소해서 1이 될때까지 반복
		}
		// 시체 나열
		for (Integer corpse : corpse_list) {
			System.out.println(corpse + "번 군사가 죽습니다. ");
		}
		// 최후의 1인
		return soldiers.get(0);
	}

	public static void main(String[] args) {
		System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
	}
}