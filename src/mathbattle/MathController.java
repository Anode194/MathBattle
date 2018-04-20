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

    public String getMissingFaEq()
    {
        String missingFactorEquation = "test";/*String.format("%d %c   %c %d%n",
                studyNumber,'\u00D7','\u003D', currentEquation[2]);
*/
        return missingFactorEquation;
    }

    public String getfullEq()
    {
        String fullEquation = String.format("%d %c %d %c %d",
                studyNumber,'\u00D7', '\u003D', currentEquation[2]);
        return fullEquation;
    }


}
