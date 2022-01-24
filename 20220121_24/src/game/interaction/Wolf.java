package game.interaction;

public class Wolf {
	
	private int hp;
	private int atk;
	
	public Wolf() {
		this.hp = 15;
		this.atk = 8;
	}
	
    public void doBattle(int uAtk) {
	    this.hp -= uAtk;
		System.out.println("늑대의 남은 체력 : " + this.hp);
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
