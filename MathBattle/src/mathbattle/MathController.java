package mathbattle;

public class MathController
{
private int studyNumber;
private int[] currentEquation;
    public MathController(int number)
    {
        studyNumber = number;

    }
    public void setcurrentEquation()
    {
        Equation Equation = new Equation(studyNumber);
        currentEquation =  Equation.getEquations();
    }

}
