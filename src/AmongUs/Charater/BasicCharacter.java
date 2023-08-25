package AmongUs.Charater;

public class BasicCharacter {
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
