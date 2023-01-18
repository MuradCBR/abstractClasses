public class Main {
    public static void main(String[] args) {

        GameCalculator manGameCalculator=new ManGameCalculator();
        GameCalculator womanGameCalculator=new WomanGameCalculator();
        GameCalculator kidGameCalculator=new KidGameCalculator();
        manGameCalculator.hesabla();
        womanGameCalculator.hesabla();
        kidGameCalculator.hesabla();




    }
}