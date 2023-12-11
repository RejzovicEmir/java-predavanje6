public class Main {
    public static void main(String[] args) {
        //for each petlja
        int[] prviNiz = {1, 2, 3};
        for (int element : prviNiz) {
            System.out.println("Ispis brojeva:" + element);
        }
        //while petlje
        int brojac = 5;
        while (brojac <= 10) {
            System.out.println("Brojac je " + brojac);
            brojac++;
        }
        //do while petlje
        int broj = 5;
        do {
            System.out.println("Broj je " + broj);
        }
        while (broj > 5);
        //break
        int broj1 = 0;
        while (broj1 < 5) {
            if (broj1 == 3) {
                break;
            }
            System.out.println("Ispis broja:" + broj1);
            broj1 ++;
        }
    }
}
