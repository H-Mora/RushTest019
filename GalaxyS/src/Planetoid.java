
/**
 *
 * @author HM
 */
public class Planetoid {

    private String name;
    private int orbitdistance;

    public Planetoid(String name, int x) {
        this.name = name;
        this.orbitdistance = x;
    }

    public String getName() {
        return name;
    }

    public int getOrbitdistance() {
        return orbitdistance;
    }

}
