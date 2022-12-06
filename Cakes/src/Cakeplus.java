
/**
 *
 * @author HM
 */
public class Cakeplus extends Extrasmallcake {

    private Topping topping2;

    public Cakeplus(String favlorBase, String favlorTopping1, String favlorTopping2) {
        super(favlorBase, favlorTopping1);
        this.topping2 = new Topping(favlorTopping2);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " and " + topping2.getName();
    }

}
