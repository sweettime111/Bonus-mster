
public abstract class Employee {
	BonusCalculator bonusCalculator;
	void setB(int x){

		System.out.println("ได้โบนัสเพิ่มจากเดิม  "+x+" เป็น "+(bonusCalculator.computeBonus(x)));
	}
}
