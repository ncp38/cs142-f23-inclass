package fraction;

public class Fraction
{
    int numerator;
    int denominator;

    public Fraction()
    {
        numerator = 1;
        denominator= 1;
    }

    public Fraction(int num, int denom)
    {
        if(denom != 0)
        {
            numerator = num;
            denominator = denom;
        }
        else
        {
            //Really we should throw an error-but we haven't really learned how to do that!
            System.out.println("INCORRECT INPUT");
        }
    }

    public Fraction multiply(Fraction b)
    {
        return new Fraction(this.numerator*b.numerator, this.denominator*b.denominator);
    }

    public String toString()
    {
        return this.numerator +"/" + this.denominator;
    }
}