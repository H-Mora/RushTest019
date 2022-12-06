
/**
 *
 * @author HM
 */
public class Startsystem implements Celestialbody {

    private int starlife;
    Celestialbody planets[];

    public Startsystem() {
        starlife = 10000;
        planets = new Celestialbody[5];

        planets[0] = new Planet("Ogle-2005-Blg-390lb1 ", 2);
        planets[1] = new Planet("Ogle-2005-Blg-390lb2 ", 3);
        planets[2] = new Planet("Ogle-2005-Blg-390lb3 ", 5);
        planets[3] = new Planet("Ogle-2005-Blg-390lb4 ", 7);
        planets[4] = new Planet("Ogle-2005-Blg-390lb5 ", 8);
    }

    @Override
    public void revolutionize() {
        while (starlife > 0) {
            for (int i = 0; i < planets.length; i++) {
                planets[i].revolutionize();
                starlife -= 1;
            }
        }
    }

    public void report() {
        System.out.println("The star exploded!");
        System.out.println(planets[0].toString());
        System.out.println(planets[1].toString());
        System.out.println(planets[2].toString());
        System.out.println(planets[3].toString());
        System.out.println(planets[4].toString());
    }

}
