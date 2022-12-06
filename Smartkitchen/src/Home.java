
/**
 *
 * @author HM
 */
public class Home implements Smartdevice {

    protected String type;
    protected String model;

    @Override
    public String StatusReport() {
        return "Status report";
    }

}
