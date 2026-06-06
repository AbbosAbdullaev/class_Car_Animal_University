public class Pragrammer extends Xodim{

    String dasturchTili;

    public Pragrammer(String name, double monthly, String dasturchTili) {
        super(name, monthly);
        this.dasturchTili = dasturchTili;
    }

    public void coder(){
        System.out.println(name + " " + dasturchTili + " tilida kod yozadi.");
    }
}
