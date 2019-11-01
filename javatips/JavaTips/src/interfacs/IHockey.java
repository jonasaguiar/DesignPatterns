package interfacs;

public interface IHockey extends ISports {
	   public void homeGoalScored();
	   public void visitingGoalScored();
	   public void endOfPeriod(int period);
	   public void overtimePeriod(int ot);
	}