public class Triangolo extends Forma {
    @Override
    public void calcolaArea(double b, double h) {
        System.out.println("calcolo area triangolo " + b * h / 2);
    }
    @Override
    public void calcolaArea() {
        System.out.println("indefinito");
    }
}
