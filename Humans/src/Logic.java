
/**
 *
 * @author HM
 */
public class Logic {

    private HomoSapiens professor;
    private Modernhuman class_[];

    public Logic(String val1, String val2, String val3) {

        this.professor = new HomoSapiens(val1);
        this.class_ = new Modernhuman[3];

        class_[0] = professor;
        class_[1] = new HomoSapiens(val2);
        class_[2] = new HomoSapiens(val3);

    }

    public void introduce() {
        System.out.println(professor.Discover());

        for (int i = 1; i < 2; i++) {
            System.out.println(class_[1].Tospeak());
            System.out.println(class_[2].Tospeak());
        }
    }

}
