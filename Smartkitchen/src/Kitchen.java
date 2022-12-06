
/**
 *
 * @author HM
 */
public class Kitchen extends Home {

    public Kitchen(String k) {
        this.model = k;
        this.type = "Kitchen";
    }

    @Override
    public String StatusReport() {
        return super.StatusReport() + type + "-" + model;
    }

}
