
public abstract class Employee {
	BonusCalculator bonusCalculator;
	void setB(int x){

		System.out.println("��⺹�������ҡ���  "+x+" �� "+(bonusCalculator.computeBonus(x)));
	}
}
