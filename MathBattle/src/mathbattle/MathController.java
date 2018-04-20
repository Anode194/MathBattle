package mathbattle;

public class MathController
{
private int studyNumber;
private int[] currentEquation;
Equation Equation = new Equation(studyNumber);

    public MathController(int number)
    {
        studyNumber = number;

    }
    public void setcurrentEquation()
    {
        currentEquation =  Equation.getEquations();
    }
    public boolean compareEquation(int x)
    {
        if(x == currentEquation[1])
        {
            return true;
        }
        return false;
    }
}
