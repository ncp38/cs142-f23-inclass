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
            //Reduce
            int greatestDenominator = ExtraMath.gcd(num, denom);
            if(denom < 0)
            {
                num *= -1;
            }
            numerator = num / greatestDenominator;
            denominator = denom / greatestDenominator;
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

    public Fraction divide(Fraction b)
    {
        return new Fraction(this.numerator*b.denominator, this.denominator*b.numerator);
    }

    public Fraction add(Fraction b)
    {
        return new Fraction(this.numerator*b.denominator+b.numerator*this.denominator, this.denominator*b.denominator);
    }

    public Fraction subtract(Fraction b)
    {
        return new Fraction(this.numerator*b.denominator-b.numerator*this.denominator, this.denominator*b.denominator);
    }

    public Fraction negate()
    {
        return new Fraction(-1*this.numerator, this.denominator);
    }

    public double getDecimalValue()
    {
        return (double) this.numerator/this.denominator;
    }

    public String toString()
    {
        return this.numerator +"/" + this.denominator;
    }

    public boolean equals(Fraction b)
    {
        if(this.numerator == b.numerator && this.denominator == b.denominator)
        {
            return true;
        }
        return false;
    }

    public boolean greaterThan(Fraction b)
    {
        if(this.numerator * b.denominator > b.numerator * this.denominator)
        {
            return true;
        }
        return false;
    }

    public boolean greaterThanOrEqualTo(Fraction b)
    {
        if(this.numerator * b.denominator >= b.numerator * this.denominator)
        {
            return true;
        }
        return false;
    }

    public boolean LessThan(Fraction b)
    {
        if(this.numerator * b.denominator < b.numerator * this.denominator)
        {
            return true;
        }
        return false;
    }

    public boolean lessThanOrEqualTo(Fraction b)
    {
        if(this.numerator * b.denominator <= b.numerator * this.denominator)
        {
            return true;
        }
        return false;
    }
}