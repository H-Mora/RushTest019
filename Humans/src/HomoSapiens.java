
/**
 *
 * @author HM
 */
public class HomoSapiens extends HomoHeidelbergensis implements Modernhuman {

    private String name;

    public HomoSapiens(String name) {
        this.name = name;
    }

    @Override
    public String Tospeak() {
        return "Hello my name is: " + name;
    }

    @Override
    protected String Discover() {
        return super.Discover() + Tospeak();
    }

}
