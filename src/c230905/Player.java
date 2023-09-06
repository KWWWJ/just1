package c230905;

import java.util.ArrayList;
import java.util.List;

class Player {
	private List<Item> inventory;
	private int defence;
	private int attack;
	public Player(int defence, int attack) {
		inventory = new ArrayList<>();
		this.attack = attack;
		this.defence = defence;
	}
	public void AddItem(Item item) {
		inventory.add(item);
	}
	public void listInventory() {
		System.out.println("인벤토리 아이템 목록 : ");
	for(Item item : inventory) {
		System.out.println(item.getName()+"(장착 여부 : "+(item.isEquippend() ?"장착":"탈착")+")");
	}
	}
	public void equipItem(int index) {
		if(index>=0 && index<inventory.size()) {
			Item item = inventory.get(index);
			//장착되어있지 않다면
			if(!item.isEquippend()) {
				item.equip();
				
				defence+=item.getDefence();
				attack+=item.getAttack();
				
				System.out.println("방어력 : "+defence);
				System.out.println("공격력 : "+attack);
			}
			else {
				System.out.println(item.getName()+"은 장착중");
			}
		}
		else {
			System.out.println("벗어남");
		}
	}
	public void unequipItem(int index) {
		if(index<=0 && index<inventory.size()) {
			Item item = inventory.get(index);
			if(item.isEquippend()) {
				item.unEuip();
				
				defence-=item.getDefence();
				attack-=item.getAttack();
				
				System.out.println("방어력 : "+defence);
				System.out.println("공격력 : "+attack);
			}
			else {
				System.out.println(item.getName()+"은 탈착중");
			}
		}
		else {
			System.out.println("벗어남");
			
		}
	}
}
