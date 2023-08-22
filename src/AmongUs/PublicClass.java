package AmongUs;
//import java.util.Scanner;

class Character
{
	public static int emergencyMeeting = 0; //긴급회의 소집을 활성화 하지 않음
	public static int vote = 0; //투표를 하지 않음.
	public static int range = 0; //캐릭터 사이의 거리
	public static double moveSpeed = 1.0; // 이동속도 1
	public static boolean missionUpdate = true; //미션 업데이트 항상 활성화
	public static boolean misssion = true; // 클리어한 민큼 임무 게이지 활성화
	public static String nicName = " "; //유저정보로 부터 가져옴
	public static int colorSelet = 0; //캐릭터 색상 선택
	public static int[] die = new int[4]; //사망하면 인덱스 0부터 삽입.
	public static String moveUp = "w"; //w를 누르면 위로 이동
	public static String moveDown = "s"; //s를 누르면 아래로 이동
	public static String moveRight = "d"; //d를 누르면 오른쪽로 이동
	public static String moveLeft = "a"; //a를 누르면 왼쪽으로 이동
	public static String[] allSkills = new String[]{"report", "emergencyMeeting","lever"};
	//if (color == main.colorSelet) //선택한 색상이 존재한다면
	//{
	//colorClose=false; // 그 색상을 더이상 선택 불가능한 상태로 변경
	//}
}

class Crew
{
	Character character = new Character();
	CrewGost cGost = new CrewGost();
	//GuardianAngelGost guard = GuardianAngelGost();
	public static double crewView = 1.0; //크루원 기본 시야=1
	public static int doMission =0; //크루원은 미션을 할 수 있다.
	int missionCount = 0;
//	if (missionCount == 4) // 정해진 만큼의 미션을 전부 클리어 했다면
//	{
//		Character.misssion = false; //캐릭터는 미션을 수행할 수 없다.
//	}
//	if(Character.die[] == Charater.colorSelet) //죽으면
//	{
//		CrewGost.gostColor = ; //유령상태가 활성화된다.(반투명한 색으로 변환)
//	else if(Charater.die[0] == Charater.colorSelet)
//	{
//		Charater.colorSelet == GuardianAngelGost.class;
//	}	
//	}
	
	
}

class GuardianAngelGost
{
	Character character = new Character();
	Crew crew = new Crew();
	public static int[] gostColor = new int[15]; //유령이 되면 적용
	public static double moveSpeed = 3.0; // 이동속도 3
	public String[] skills = new String[]{"guard"}; //유령이 되면 스킬 활성화
}

class Scientist
{
	Character character = new Character();
	Crew crew = new Crew();
	CrewGost cGost = new CrewGost();
	public String[] skills = new String[]{"vitals"};
//	if(Character.die[] == Charater.colorSelet) //죽으면
//		{
//			CrewGost.gostColor = ;
//      }	
}

class Technician
{
	Character character = new Character();
	Crew crew = new Crew();
	CrewGost cGost = new CrewGost();
	public String[] skills = new String[]{"lesser vent"};
//	if(Character.die[] == Charater.colorSelet) //죽으면
//		{
//			CrewGost.gostColor = ;
//      }	
}

class CrewGost
{
	Character character = new Character();
	Crew crew = new Crew();
	//유령이 되면 적용
	public static double moveSpeed = 3.0; // 이동속도 3
}

class Imporster
{
	Character character = new Character();
	InmporsterGost imGost = new  InmporsterGost();
	public static double imporster = Crew.crewView*1.5; //임포스터는 크루윈의 1.5배의 시야를 가진다.
	public static boolean misssion = false; // 클리어한 민큼 임무 게이지 활성화
	public String[] skills = new String[]{"kill", "savotage", "vent"};//기본적인 임포스터의 스킬은 킬, 방해공작, 환퉁구를 통한 순간이동이다.
//	if(Character.die == 1) //만약 die가 1이 되면
//	{
//		ImporsterGost.gostColor = ; //유령상태가 활성화된다.(반투명한 색으로 변환)
//	}
}

class ShapeShifter
{
	Character character = new Character();
	Imporster imporster = new Imporster();
	InmporsterGost imGost = new  InmporsterGost();
	public String[] skills = new String[]{"kill", "savotage", "vent", "shapeshift"};//일반적인 임포스터보다 스킬이 하나 더 있다.
}

class InmporsterGost
{
	Character character = new Character();
	Imporster imporster = new Imporster();
	public static int[] gostColor = new int[15]; //유령이 되면 적용
	public static double moveSpeed = 3.0; // 이동속도 3
	//Imporster.skills[0] = "null"; // 스킬이 방해공작으로 한정
	//Inporster.skills[2] = "null";
}

class Skill
{
	Character character = new Character();
	Crew crew = new Crew();
//	GuardianAngelGost guard = GuardianAngelGost();
	Scientist scientist = new Scientist();
	Technician technicion = new Technician();
	Imporster imporster = new Imporster();
	ShapeShifter shapeshifter = new ShapeShifter();
	InmporsterGost imGost = new  InmporsterGost();
	public int coolTime = 0;
	public int duration = 0;
	public int savotage1 = 0;
	public int vent1 = 0;
	public int vent2 = 0;
	public int vent3 = 0;
	public int vent4 = 0;
	public int vent5 = 0;
	public int vent6 = 0;
	public int shapeshift1 = 0;
	//kill, savotage, vent, shapeshift, guard, vitals,lesser vent
	public String kill = "kill";
	void kill()
	{
//		if(Character.range<=3&&Character.colorSelect==Crew.class) //캐릭터간 거리가 3 안쪽이고 대상이 크루원이면
//		{
//			Character.die=Crew.class; //사망한다.
//			coolTime=35;
//		}
	}
	
	public String savotage = "savotage";
	void savotage()
	{
//		if(savotage1 == 1)
//		{
//			System.out.println("문닫기");
//		}
//      if(savotage1 == 2)
//		{
//			System.out.println("원자로 융해 45초");
//			if (savotage1 = 0)
//			{
//				imporster = win;	
//			}		
//		}		
//		if(savotage1 == 3)
//			{
//				System.out.println("산소고갈 45초");
//				if (savotage1 = 0)
//				{
//					imporster = win;	
//				}		
//			}		
//		if(savotage1 == 4)
//			{
//				System.out.println("지반 안정화 장치 초기화 60초");
//				if (savotage1 = 0)
//				{
//					imporster = win;	
//				}		
//			}		
//		if(savotage == 5)
//			{
//				System.out.println("충돌 항로 방지 초기화 90초");
//				if (savotage1 = 0)
//				{
//					imporster = win;	
//				}		
//			}		
		
	}
	
	public String vent = "vent";
	
	void vent()
	{
//		if(vent1==1) //vent를 활성화하면 다른 벤트로 이동
//		{
//			Charater.colorselect=vent2;
//		}
//		if(vent2==1)
//		{
//			Charater.colorselect=vent3;
//		}
//		if(vent3==1)
//		{
//			Charater.colorselect=vent1;
//		}
//		if(vent4==1)
//		{
//			Charater.colorselect=vent5;
//		}
//		if(vent5==1)
//		{
//			Charater.colorselect=vent6;
//		}
//		if(vent6==1)
//		{
//			Charater.colorselect=vent4;
//		}
	}
	
	public String shapeshift = "shapeshift";
	void shapeshft()
	{
//		if(shapeshift1==1) //활성화되면
//		{
//			ShapeShifter.class=Character.color; 복제한다.
//		}
	}
	
	public String guard = "guard";
	void guard()
	{
//		if(kill==1) //킬이 활성화되면
//		{
//			Character.colorSelet!=Character.die; 죽지않는다.
//			coolTime = 60;
//			killCoolTime = 35/2;
//		}
	}
	
	public String lesserVent = "lesserVent";
	void lesserVent()
	{
//		if(vent1==1) //vent를 활성화하면 다른 벤트로 이동
//		{
//			Charater.colorselect=vent2;
//			coolTime=30;
//		}
//		if(vent2==1)
//		{
//			Charater.colorselect=vent3;
//		    coolTime=30;
//		}
//		if(vent3==1)
//		{
//			Charater.colorselect=vent1;
//	    	coolTime=30;
//		}
//		if(vent4==1)
//		{
//			Charater.colorselect=vent5;
//	  	 	coolTime=30;
//		}
//		if(vent5==1)
//		{
//			Charater.colorselect=vent6;
//	  		coolTime=30;
//		}
//		if(vent6==1)
//		{
//			Charater.colorselect=vent4;
//	  	 	coolTime=30;
//		}
	}
	
	public String emergencyMeeting = "emergencyMeeting";
	void emergencyMeeting()
	{
//		if(emergencyMeeting==1) //긴급 회의가 활성화되면
//		{
//			meetingTime==15; //회의시간 15초
//			voteTime = 120; //투표시간 120초 생성
//		}
	}
	
	public String report = "report";
	void report()
	{
//		if(emergencyMeeting==1) //긴급 회의가 활성화되면
//		{
//			meetingTime==15; //회의시간 15초
//			voteTime = 120; //투표시간 120초 생성
//		}
	}
	
	public String lever = "lever";
	void lever()
	{
//		if(lever==1)
//		{
//			boolean doorOpen=true;
//			boolean lightOn=true;
//		}
	}
}




//public class PublicClass 
//{
//	public static void main(String[] agrs)
//	{
//		Scanner scanner = new Scanner(System.in);
//		
//		while(true)
//		{
//			Character.emergencyMeeting = scanner.nextInt();
//			if (Character.emergencyMeeting==1)//버튼 클릭
//			{
//				System.out.println("긴급회의");
//			}
//			Character.vote = scanner.nextInt();
//			if (Character.emergencyMeeting==1)//버튼 클릭
//			{
//				System.out.println("투표");
//			}
//			Character.meetingTime = scanner.nextInt();
//			if (Character.meetingTime >=121) //회의 시간은 120초까지 설정가능.
//			{
//				Character.meetingTime=120;
//			}
//			Character.voteTime = scanner.nextInt();
//			if (Character.voteTime >=301) //투표시간은 300초까지 설정가능
//			{
//				Character.voteTime=300;
//			}
//			Character.moveSpeed = scanner.nextInt();
//			if (Character.moveSpeed >= 3.25) //이동속도는 3.0까지.
//			{
//				Character.moveSpeed=3;
//			}
//			Character.up = scanner.nextInt();
//			if (Character.up == 1) //
//			{
//				Character.moveSpeed+=0.25; //한 번 업 버튼을 누를 떄마다 0.25씩 감소
//			}
//			Character.down = scanner.nextInt();
//			if (Character.down == 1) //
//			{
//				Character.moveSpeed-=0.25; //한 번 다운 버튼을 누를 떄마다 0.25씩 감소
//			}
//		}
//	}
//}
//
//
