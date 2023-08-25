package PixyHands.stage;

public class BasicStage {
	public String stageName = " ";
	public String stageDescription = " ";
	public int stageCount = 0;
	public boolean stageType = true;
	void stageTypeSelect()
	{
		if(stageCount%6 == 0)
		{
			stageType = false;
		}
		else
		{
			stageType = true;
		}
	}
}
