package c230905;

class Item {
	private String name;
	private boolean equipped;
	
	private int defence;
	private int attack;
	
	public Item(String name, int defence, int attack) {
		this.name = name;
		this.equipped = false;
		this.defence = defence;
		this.attack = attack;
	}
	public String getName() {
		return name;
	}
	public boolean isEquippend() {
		return equipped;
	}
	public void equip() {
		equipped=true;
		System.out.println(name+"을 장착함");
	}
	public void unEuip() {
		equipped=false;
		System.out.println(name+"을 탈착함");
	}
	public int getDefence() {
		return defence;
	}
	public int getAttack() {
		return attack;
	}
}
