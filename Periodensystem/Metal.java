import java.lang.Override;import java.lang.String; /**
 * Created by Lolololarry on 19.05.16.
 */
public class Metal extends Element {
    private boolean metalloid;
    private double conductivity; public Metal() {
    }
    public Metal(String name, String symbol, int ordinal, char shell, int phase, boolean group, boolean metalloid, double conductivity) {
        super(name, symbol, ordinal, shell, phase, group);
        this.metalloid = metalloid; this.conductivity = conductivity;
    }
    @Override
    public String toString() {
        return super.toString() + (metalloid ? ", Halbleiter" : "") +
                ", \u03C3: " + conductivity;
    }
    public boolean isMetalloid() {
        return metalloid;
    }
    public void setMetalloid(boolean metalloid) {
        this.metalloid = metalloid;
    }
    public double getConductivity() {
        return conductivity;
    }
    public void setConductivity(double conductivity) { this.conductivity = conductivity;
    }

}
