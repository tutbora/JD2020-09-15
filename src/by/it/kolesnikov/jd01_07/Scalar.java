package by.it.kolesnikov.jd01_07;

class Scalar extends Var {

    private double value;

    public Scalar(double value) {

        this.value = value;
    }

    public Scalar(String strValue) {

        this.value=Double.parseDouble(strValue);
    }

    public Scalar(Scalar otherScalar) {

        this.value=otherScalar.value;
    }

    @Override
    public String toString() {

        return Double.toString(value);
    }
}
