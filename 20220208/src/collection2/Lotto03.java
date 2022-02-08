package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto03 {

	public static void main(String[] args) {
		// 로또 복권 당첨 시뮬레이터를 만들어주세요.
		// 몇 장을 사야 당첨되는지 시뮬레이션 해보겠습니다.
		List<Integer> lotto = new ArrayList<>();
		Random random = new Random();
		
		List<Integer> lucky = new ArrayList<>();
		lucky.add(4);
		lucky.add(8);
		lucky.add(13);
		lucky.add(24);
		lucky.add(27);
		lucky.add(44);
		
		int count = 0;
		int getNum = 0;
		boolean bool = true;
		
		
        while (!lucky.equals(lotto)) {
        	lotto.clear();
        	
			while (lotto.size() != 6) {
				getNum = (int)(Math.random() * 45) + 1;
				if (!lotto.contains(getNum)) {
					lotto.add(getNum);
				}
			}
			Collections.sort(lotto);
			System.out.println("" + lucky + lotto);
			count++;
			
			
        }
        System.out.println("구매한 로또복권의 개수 : " + count);
	}
}
