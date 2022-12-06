
/**
 *
 * @author HM
 */
public class Planet extends Planetoid implements Celestialbody {

    private int orbititerator = 0;
    private int orbityears = 0;

    public Planet(String name, int nuevint) {
        super(name, nuevint);
    }

    public int getOrbityears() {
        return orbityears;
    }

    @Override
    public void revolutionize() {
        orbititerator++;
        if (orbititerator == this.getOrbitdistance()) {
            orbititerator = 0;
            orbityears++;
        }
    }

    @Override
    public String toString() {
        return "Planet{" + super.getName() + "orbititerator=" + orbititerator + ", orbityears=" + orbityears + '}';
    }

    

}
