public class Rettangolo extends Forma{
    @Override
    public void calcolaArea(double b, double h) {
        System.out.println("calcolo area rettangolo " + b * h);
    }
    @Override
    public void calcolaArea() {
        System.out.println("indefinito");
    }
}

