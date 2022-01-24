package game.interaction;

public class Magician {
	private int hp;
	private int mp;
	private int atk;
	private int exp;
	private int lv;
	
	
	public Magician() {
		this.hp = 15;
		this.mp = 30;
		this.atk = 6;
		this.lv = 1;
		this.exp = 0;
	}
	
	public void huntSlime(Slime sli)  {
		if (sli.getHp() <= 0 ) {
			System.out.println("슬라임은 죽은 상태입니다");
			return;
		}
		sli.doBattle(this.atk);
		
		if (sli.getHp() <= 0) {
			this.exp += 15;
			System.out.println("슬라임이 죽었습니다");
			System.out.println("경험치가 증가합니다. 경험치 : " + this.exp);
		} else {
			this.hp -= sli.getAtk();
		}
		System.out.println("마법사의 남은 체력 : " + this.hp);
	}
	
	public void huntRabbit(Rabbit rabbit)  {
		if (rabbit.getHp() <= 0 ) {
			System.out.println("슬라임은 죽은 상태입니다");
			return;
		}
		rabbit.doBattle(this.atk);
		
		if (rabbit.getHp() <= 0) {
			this.exp += 15;
			System.out.println("슬라임이 죽었습니다");
			System.out.println("경험치가 증가합니다. 경험치 : " + this.exp);
		} else {
			this.hp -= rabbit.getAtk();
		}
		System.out.println("전사의 남은 체력 : " + this.hp);
	}
	// 오크와 교전할 수 있도록 huntOrc()를 만들어보겠습니다.
	public void huntOrc(Orc orc) {
		// orc의 체력을 검사해서 0 이하라면 공격 없이 
		// 오크가 이미 죽은 상태입니다. 라는 멘트만 뜨고
		// 메서드가 종료되게 해주세요.
		if (orc.getHp() <= 0) {
			System.out.println("오크가 이미 죽은 상태입니다.");
			return;
		}
				
		// orc의 doBattle을 호출해 먼저 오크 체력을 깎고
		orc.doBattle(this.atk);
		
		// 오크가 전사의 공격으로 죽은 경우 경험치를 10더해주시고
		// 오크가 죽었습니다. 라는 멘트가 뜨고 메서드가 종료되게 해주세요.
		if (orc.getHp() <= 0) {
			this.exp += 10;
			System.out.println("오크가 죽었습니다.");
			System.out.println("경험치가 증가합니다." + "경험치 : " + this.exp);
		} else {
			// 오크 공격력만큼 자신의 체력을 차감해줍니다.
			this.hp -= orc.getAtk();
		}
		
		System.out.println("전사의 남은 체력 : " + this.hp);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}
	
	
}
