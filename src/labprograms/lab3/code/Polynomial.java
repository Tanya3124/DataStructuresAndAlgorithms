package labprograms.lab3.code;

import java.util.Locale;
import java.util.Objects;

public class Polynomial {
    private int coefficient;
    private int exponent;

    public Polynomial(int coefficient, int exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polynomial that = (Polynomial) o;
        return coefficient == that.coefficient && exponent == that.exponent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coefficient, exponent);
    }

    @Override
    public String toString() {
        return String.format(
                Locale.ENGLISH,
                "(%dx^%d)",
                this.getCoefficient(), this.getExponent()
        );
    }
}
