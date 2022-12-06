
/**
 *
 * @author HM
 */
public class Main {

    public static void main(String[] args) {

        Refrigerator refrigerator = new Refrigerator("KIT-2000");
        Kitchen kitchen = new Kitchen("Emerson");
        Smarthouse s = new Smarthouse(refrigerator, kitchen);

        s.reporteCasa();
    }
}
