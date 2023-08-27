package PixyHands.Card;

public abstract class BasicCard {
	
	private String nameCard;
	private String description;
	private int damage;
	private int cost;
	
	BasicCard()
	{
		
	}
	BasicCard(String nameCard, String description, String giveItem[], int damage, int cost)
	{
		this.nameCard = nameCard;
		this.description = description;
		this.damage = damage;
		this.cost = cost;
	}

	
	void SheetCard()
	{
		System.out.println("["+"타입"+"] : "+getNameCard());
		System.out.println("["+"효과"+"] : "+getdescription());
		System.out.println("["+"대미지"+"] : "+getDamage());
		System.out.println("["+"코스트"+"] : "+getCost());
	}
	
	
	public void setNameCard(String nameCard)
	{
		this.nameCard = nameCard;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public void setDamage(int damage)
	{
		this.damage = damage;
	}
	public void setCost(int cost)
	{
		this.cost = cost;
	}
	
	
	public void getNameCard()
	{
		return nameCard;
	}
	public void getDescription()
	{
		return description;
	}
	public void getDamage()
	{
		return damage;
	}
	public void getCost()
	{
		return cost;
	}
}
