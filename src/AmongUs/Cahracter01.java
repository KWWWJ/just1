package AmongUs;

public class Cahracter01
{
	public String gender;
	public String kind;
	public String[][] voices;
	public String[] job;
	public String weapon;
	public String[] subWeapon;
	public String mainStatus;
	public String[] subStatus;
	public String[] jobList;
	public String[][] globalWriting;
	public double weaponRate;
	public int attackSpeed;
	public double workmanwhip;
	public String property;
	public double subAttack;
	public int defense;
	public int tolerance;
	public int evasion;
	public int stance;
	public boolean isStance;
	public boolean isMagicGuard;
	public int damageReduction;
	public int damageAbsorpyion;
	public double damageRateReduction;
	public boolean isGuard;
	public double movingSpeed;
	public double maxMovingSpeed;
	public double jumpingPower;
	public int criticalRate;
	public Cahracter01(
			String gender,
			String kind,
			String[][] voices,
			String[] job,
			String weapon,
			String[] subWeapon,
			String mainStatus,
			String[] subStatus,
			String[] jobList,
			String[][] globalWriting,
			double weaponRate,
			int attackSpeed,
			double workmanwhip,
			String property,
			double subAttack,
			int defense,
			int tolerance,
			int evasion,
			int stance,
			boolean isStance,
			boolean isMagicGuard,
			int damageReduction,
			int damageAbsorpyion,
			double damageRateReduction,
			boolean isGuard,
			double movingSpeed,
			double maxMovingSpeed,
			double jumpingPower,
			int criticalRate) {
		this.gender = gender;
		this.kind = kind;
		this.voices = voices;
		this.job = job;
		this.weapon = weapon;
		this.subWeapon = subWeapon;
		this.mainStatus = mainStatus;
		this.subStatus = subStatus;
		this.jobList = jobList;
		this.globalWriting = globalWriting;
		this.weaponRate = weaponRate;
		this.attackSpeed = attackSpeed;
		this.defense = defense;
		this.tolerance = tolerance;
		this.evasion = evasion;
		this.stance = stance;
		this.isStance = isStance;
		this.isMagicGuard = isMagicGuard;
		this.damageReduction = damageReduction;
		this.damageAbsorpyion = damageAbsorpyion;
		this.damageRateReduction = damageRateReduction;
		this.isGuard = isGuard;
		this.movingSpeed = movingSpeed;
		this.maxMovingSpeed = maxMovingSpeed;
		this.jumpingPower = jumpingPower;
		this.criticalRate = criticalRate;
	}
}

