
/**
 *
 * @author HM
 */
public class Refrigerator extends Home {

    public Refrigerator(String x) {
        this.model = x;
        this.type = "Refrigerator";
    }

    @Override
    public String StatusReport() {
        return super.StatusReport() + type + "-" + model;
    }

}
