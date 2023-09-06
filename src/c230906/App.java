package c230906;

public class App {
	public static void main(String[] args) {
		
		Player player = new Player("나", 100, 20);
		Monster monster = new Monster("몬스터", 85, 10);
		
		boolean isGame = true;
		
		System.out.println("전투시작");
		System.out.println(player.getName()+"(체력 : "+player.getHealth()+")"
				+monster.getName()+"(체력 : "+monster.getHealth()+")");
		
		while(isGame) {
			STATE playerSelect = player.selectAction();
			
			switch(playerSelect) {
			case ATTACK:
				System.out.println(player.getName()+"이 "+monster.getName()+"에게 "
						+player.attack()+"만큼의 데미지를 입혔다.");
				monster.takeDamage(player.attack());
				
				if(!monster.isAlive()) {
					System.out.println(monster.getName()+"을 처치했다.");
				}
				else {
					System.out.println(monster.getName()+"( 체력 : "+monster.getHealth()+")");
				}
				break;
			case USE_ITEM:
				player.useItem();break;
			case RUN:
				System.out.println(player.getName()+"은/는 도망쳤다.");
			}
		}
	}
}
