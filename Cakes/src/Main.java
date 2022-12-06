
/**
 *
 * @author HM
 */
public class Main {

    public static void main(String[] args) {

        smallcake q1;
        smallcake q2;
        smallcake q3;

        q1 = new Extrasmallcake("Vanilla", "Strawberry");
        System.out.println(q1.getDescription());
        q2 = new Cakeplus("Eggnog", "Raisins", "Cinnamon");
        System.out.println(q2.getDescription());
        q3 = new Cakeplus("Chocolate", "mint", "Chocolate");
        System.out.println(q3.getDescription());

    }
}
