

public class MonetaryCoin
{
	private int HEADS = 0;
	private int TAILS = 1;
	private int face;
	private int value;
	private double averageValue;


public MonetaryCoin ()
	{
		flip();
	}

public void flip ()
	{
		face = (int) (Math.random() * 2);
	}

public double getAverageValue()
	{
		return averageValue;
	}

public void setCoin(int heads,int tails)
	{

	HEADS = heads;
	TAILS = tails;
	}
public int getHeads()
	{
		return HEADS;
	}
public int getTails()
	{
		return TAILS;
	}
public int getValue()
	{
		return value;
	}
public boolean isHeads ()
	{
		return (face == HEADS);
	}



public String toString()
	{
	String faceName;
		if (face == HEADS)
			faceName = "Heads";
		else
			faceName = "Tails";
		return faceName;
	}
}