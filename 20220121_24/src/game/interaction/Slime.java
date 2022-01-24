package game.interaction;

public class Slime {
	
	// 슬라임은 hp, atk, 을 가집니다
	private int hp;
	private int atk;
	
	// 생성자는 슬라임에게 hp는 10, atk는 5을 부여합니다.
	public Slime() {
		this.hp = 10;
		this.atk = 5;
	}

	// doBattle() 메서드를 만들겠습니다.
	// 유저의 공격력을 받아 오크의 체력을 차감합니다.
	public void doBattle(int uAtk) {
		
	    this.hp -= uAtk;
		System.out.println("슬라임의 남은 체력 : " + this.hp);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	
	
}
