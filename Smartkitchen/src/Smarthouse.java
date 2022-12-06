/**
 *
 * @author HM
 */
public class Smarthouse implements Smartdevice {

    Refrigerator refrigerador;
    Kitchen cocina;
    Home dispositivos[] = new Home[2];

    public Smarthouse(Refrigerator refrigerador, Kitchen cocina) {
        this.dispositivos[0] = refrigerador;
        this.dispositivos[1] = cocina;
    }

    public void reporteCasa() {
        System.out.println(StatusReport());
    }

    @Override
    public String StatusReport() {
        String x = "";
        for (int i = 0; i < 2; i++) {
            x = dispositivos[i].StatusReport();
        }

        return x;
    }

}
