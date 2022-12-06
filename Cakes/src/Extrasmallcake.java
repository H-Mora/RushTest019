
/**
 *
 * @author HM
 */
public class Extrasmallcake implements smallcake {

    protected String favlorBase;
    protected Topping topping1;

    public Extrasmallcake(String favlorBase, String favlortopping1) {
        this.favlorBase = favlorBase;
        this.topping1 = new Topping(favlortopping1);
    }

    @Override
    public String getDescription() {
        return "Muffin " + favlorBase + " with " + topping1.getName();
    }

}
