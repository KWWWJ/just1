package AmongUs;
//import java.util.Scanner;

class Character
{
	Gost gost = new  Gost(); // 유령상태를 모든 캐릭터가 공유
	public int emergencyMeeting = 0; //긴급회의 소집을 활성화 하지 않음
	public int vote = 0; //투표를 하지 않음.
	public int myLocation = 0; //나의 캐릭터의 위치
	public int otherLocation = 0;//다른 사람의 캐릭터의 위치
	public double moveSpeed = 1.0d; // 이동속도 1
	public boolean missionUpdate = true; //미션 업데이트 항상 활성화
	public boolean mission = true; // 클리어한 만큼 임무 게이지 활성화
	public String nicName = " "; //유저정보로 부터 가져옴
	public int colorSelect = 0; //캐릭터 색상 선택
	public int die = 0; //사망하면 1로 활성화
	public int gost1 = 0; //유령상태에서 1로 활성화
	public String moveUp = "w"; //w를 누르면 위로 이동
	public String moveDown = "s"; //s를 누르면 아래로 이동
	public String moveRight = "d"; //d를 누르면 오른쪽로 이동
	public String moveLeft = "a"; //a를 누르면 왼쪽으로 이동
	public String[] allSkills = new String[] {
			"emergencyMeeting",
			"report",
			"lever"
			};
	void Gost()
	{
		if(die == 1)
		{
			gost1 = 1;
		}
	}
}

class Crew extends Character //상속
{
	public String characterjob = "Crew";
	GuardianAngelGost angel = new GuardianAngelGost();
	int dieCount = 0;
	Skill skill = new Skill(); //공통 스킬
	public double crewView = 1.0d; //크루원 기본 시야
	public int doMission =0; //크루원은 미션을 할 수 있다.
	int missionCount = 0; //미션 클리어시 카운트 증가
	void Guardian()
	{
		int fristDie = 0; //첫 죽음의 변수
		if (die == 1 && fristDie == 0) //사망상태에서 아무도 죽지 않았다면
		{
			 characterjob = "GuardianAngelGost"; //수호천사로 변경
			 fristDie++; //첫 죽음이 비활성화된다.
		}
	}
}

class GuardianAngelGost extends Gost //수호천사
{	
	public String characterjob = "GuardianAngelGost";
	SkillGuardianAngelGost skill = new SkillGuardianAngelGost(); //수호천사 스킬
}

class Scientist extends Crew
{
	public String characterjob = "Scientist";
	SkillScientist skill = new SkillScientist(); //과학자 스킬
}

class Technician extends Crew
{
	public String characterjob = "Technician";
	SkillTechnician skill = new SkillTechnician(); //기술자 스킬
}

class Imporster extends Crew
{
	public String characterjob = "Imporster";
	SkillImporster skill = new SkillImporster(); //임포스터 공통 스킬
	public double imporster = crewView*1.5; //임포스터는 크루윈의 1.5배의 시야를 가진다.
	public boolean misssion = false; // 클리어한 민큼 임무 게이지 활성화
}

class ShapeShifter extends Imporster
{
	public String characterjob = "ShapeShifter";
	SkillShapeShifter skill = new SkillShapeShifter(); //형상변환자 스킬
}

class Gost extends Character
{
	public static double moveSpeed = 3.0d; // 이동속도 3
	public int die = 1; //사망상태
	public static int[] gostColor = new int[15]; //유령이 되면 반투명 색상 적용
	void kill() //킬 버튼이
	{
		if(die == 1)
		{
			return;
		}
	}
}

class Skill
{
	Character character = new Character(); //캐릭터의 위치정보가 필요함
	public int coolTime = 0; //스킬의 쿨타임
	public int duration = 0; //스킬의 지속시간
	public int vent1 = 0; //밴트 1번
	public int vent2 = 0; //밴트 2번
	public int vent3 = 0; //밴트 3번
	public int vent4 = 0; //밴트 4번
	public int vent5 = 0; //밴트 5번
	public int vent6 = 0; //밴트 6번
	public int meetingTime = 0; //시스템 룰인 회의 시간
	public int voteTime = 0; //시스템 룰인 투표 시간
	public boolean doorOpen = false; //활성화 안됨
	public boolean lightOn = false; //활성화 안됨

	void emergencyMeeting()
	{
		if(character.allSkills[0] == "emergencyMeeting") //긴급 회의가 활성화되면
		{
			meetingTime = 15; // 시스템 룰인 회의 시간을 호출한다.
			voteTime = 120; //시스템 룰인 투표 시간을 호출한다.
		}
	}
	
	void report()
	{
		if(character.allSkills[1] == "report") //
		{
			meetingTime = 15; // 시스템 룰인 회의 시간을 호출한다.
			voteTime = 120; //시스템 룰인 투표 시간을 호출한다.
		}
	}
	
	void lever()
	{
		if(character.allSkills[2] == "lever") // 레버 활성화 시
		{
			doorOpen=true; //문 열림
			lightOn=true; //시야 회복됨
		}
	}
}

class SkillImporster extends Skill
{
	public int savotage1 = 0; //빙해공작 활성화 여부
	public int shapeshift1 = 0; //형상변환자 활성화 여부
	public String kill = "kill";
	void kill()
	{
		if(character.otherLocation-character.myLocation <= 3) //캐릭터간 거리가 3 이하라면
		{
			character.die = 1; //사망한다.
			coolTime=35;
		}
	}
	
	public String savotage = "savotage";
	void savotage()
	{
		if(savotage1 == 1) //사보타지가 1번으로 활성화되면 문을 닫는다.
		{
			System.out.println("문닫기");
		}
		if(savotage1 == 2) //사보타지가 2번으로 활성화되면 원자로 융해가 시작된다.
		{
			System.out.println("원자로 융해 45초");
		}		
		if(savotage1 == 3) //사보타지가 3번으로 활성화되면 산소고갈이 시작된다.
		{
			System.out.println("산소고갈 45초");
		}		
		if(savotage1 == 4) //사보타지가 4번으로 활성화되면 지반 안정화 장치가 초기화되기 시작한다.
		{
			System.out.println("지반 안정화 장치 초기화 60초");
		}		
		if(savotage1 == 5) //사보타지가 5번으로 활성화되면 충돌 항로 방지가 초기화되기 시작한다.
		{
			System.out.println("충돌 항로 방지 초기화 90초");
		}		
		
	}
	
	public String vent = "vent";
	
	void vent()
	{
		if(vent1==1) //vent를 활성화하면 다른 벤트로 이동, 1~3번, 4~6번은 각각 순환한다
		{
			character.myLocation=vent2; //캐릭터가 vent2로 이동한다.
		}
		if(vent2==1)
		{
			character.myLocation=vent3; //캐릭터가 vent3으로 이동한다.
		}
		if(vent3==1)
		{
			character.myLocation=vent1; //캐릭터가 vent1로 이동한다.
		}
		if(vent4==1)
		{
			character.myLocation=vent5; //캐릭터가 vent5로 이동한다.
		}
		if(vent5==1)
		{
			character.myLocation=vent6; //캐릭터가 vent6으로 이동한다.
		}
		if(vent6==1)
		{
			character.myLocation=vent4; //캐릭터가 vent4로 이동한다.
		}
	}
	
}

class SkillShapeShifter extends SkillImporster
{
	public String shapeshift = "shapeshift";
	void shapeshft()
	{
		if(shapeshift1==1) //활성화되면
		{
			character.myLocation = character.colorSelect; //캐릭터의 색을 복제한다.
		}
	}
	
}

class SkillGuardianAngelGost extends Skill
{
	public int guard = 1; //킬을 무효화한다.
	public int killCoolTime = 0; //가드로 인해 변화되는 킬의 쿨타임
	void guard()
	{
		if(character.myLocation == character.die) //킬이 활성화되면
		{
			guard = 0; //가드 휫수가 차감되며 죽지 않는다.
			coolTime = 60; //쿨타임 60초
			killCoolTime = 35/2; //방어되었다면 다음 킬 쿨타임이 절반으로 감소
		}
	}
	
}

class SkillScientist extends Skill
{
	public int vital = 0; // 바이탈 확인이 비활성화 상태
	public String dead = " "; // 사망시 문자열 변환
	void vital()
	{
		if(vital == 1) //바이탈 활성화시
		{
		if(character.die == 1) //사망한 인원이 있다면
		{
			dead = "Dead"; //사망상태로 변환
		}
		coolTime = 15;
		}
	}
}

class SkillTechnician extends Skill
{
	public String lesserVent = "lesserVent"; //열화된 벤트
	void lesserVent()
	{
		if(vent1==1) //vent를 활성화하면 다른 벤트로 이동, 1~3번, 4~6번은 각각 순환한다
		{
			character.myLocation=vent2; //캐릭터가 vent2로 이동한다.
			coolTime=30; //쿨타임 30초
		}
		if(vent2==1)
		{
			character.myLocation=vent3;//캐릭터가 vent3으로 이동한다.
		    coolTime=30;
		}
		if(vent3==1)
		{
			character.myLocation=vent1;//캐릭터가 vent1로 이동한다.
	    	coolTime=30;
		}
		if(vent4==1)
		{
			character.myLocation=vent5;//캐릭터가 vent5로 이동한다.
	  	 	coolTime=30;
		}
		if(vent5==1)
		{
			character.myLocation=vent6;//캐릭터가 vent6으로 이동한다.
	  		coolTime=30;
		}
		if(vent6==1)
		{
			character.myLocation=vent4;//캐릭터가 vent4로 이동한다.
	  	 	coolTime=30;
		}
	}
	
}