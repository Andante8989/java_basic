package game.polymorphism;

public class Slime extends Monster {
	
	// 이미 몬스터 계열에 필요한 정보는 모두 Monster클래스에
	// 작성되어있으므로 그냥 체력수치와 공격력 수치만 몬스터별로 관리하면 됩니다.
	
	public Slime() {
		super(10,2,"슬라임" , 3);
	}

}
