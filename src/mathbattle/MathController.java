package mathbattle;

public class MathController
{
private int studyNumber;
private int currentEquation[];
Equation Equation;

    public MathController(int number, Equation Equation)
    {
        studyNumber = number;
        this.Equation = Equation;

    }
    public void setCurrentEquation()
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

    public String getMissingFaEq()
    {
        String missingFactorEquation = String.format("%d %c   %c %d%n",
                studyNumber,'\u00D7','\u003D', currentEquation[2]);

        return missingFactorEquation;
    }

    public String getfullEq()
    {
        String fullEquation = String.format("%d %c %d %c %d",
                studyNumber,'\u00D7', currentEquation[1], '\u003D', currentEquation[2]);
        return fullEquation;
    }
    public int getCurrentEquation()
    {

        return currentEquation[1];
    }


}
