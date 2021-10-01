import org.junit.jupiter.api.Assertions ;



public class Fraction {

    private int numerateur;
    private int denumerateur;

    public Fraction(int numerateur,int denumerateur) {

        this.numerateur=numerateur;
        this.denumerateur=denumerateur;

    }

    public int getNumerateur() {
        return numerateur;
    }

    public void setNumerateur(int numerateur) {
        this.numerateur = numerateur;
    }

    public int getDenumerateur() {
        return denumerateur;
    }

    public void setDenumerateur(int denumerateur) {
        this.denumerateur = denumerateur;
    }
    @Override
    public  String ToString(){ return  numerateur+ "/" + denumerateur;}
    public  void TestDenumerateur(){
        assert

    }
}
