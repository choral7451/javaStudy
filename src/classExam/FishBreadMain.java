package classExam;

// 클래스 생성
class FishBread {
	
	public String fishCode; // 붕어빵 번호
	public String inside; // 붕어빵의 속(재료)
	public String flourCode;; // 밀가루 원산지
	
	public void showFish () {
		System.out.println("번호 : " + fishCode);
		System.out.println("재료 : " + inside);
		System.out.println("원산지 : " + flourCode);
		System.out.println();
	}
	
	
}


public class FishBreadMain {

	public static void main(String[] args) {
		
		FishBread fi = new FishBread();
		
		fi.fishCode = "001번";
		fi.inside = "팥";
		fi.flourCode = "한국";
		
		fi.showFish();
		
		FishBread fi2 = new FishBread();
		
		fi2.fishCode = "002번";
		fi2.inside = "슈크림";
		fi2.flourCode = "미국산";
		
		fi2.showFish();

	}

}
