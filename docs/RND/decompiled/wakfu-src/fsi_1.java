/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;

/*
 * Renamed from fSi
 */
public class fsi_1<T> {
    private static final String vdt = "content";
    private T vdu;
    private Method vdv;
    private Method vdw;
    private Method vdx;
    private fiw_1<?> vdy;
    private String vcM;
    private int vcN;
    private String dGP = null;
    private fjj_2 vcO = null;
    private boolean bsk = false;
    private fsg_1 vdz = null;

    public fsi_1(T t, fiw_1<?> fiw_12, String string, String string2, fjj_2 fjj_22) {
        this.vdu = t;
        this.vdy = fiw_12;
        this.vcM = string;
        this.vcN = string != null ? string.hashCode() : 0;
        this.vdv = fiw_12.vy(string);
        this.vdw = fiw_12.vA(string);
        this.vdx = fiw_12.vB(string);
        this.dGP = string2;
        this.vcO = fjj_22;
    }

    public fsi_1(T t, fiw_1<?> fiw_12, String string, fjj_2 fjj_22) {
        this.vdu = t;
        this.vdy = fiw_12;
        this.vcM = string;
        this.vcN = string != null ? string.hashCode() : 0;
        this.vcO = fjj_22;
    }

    public int getAttributeHash() {
        return this.vcN;
    }

    public String getAttribute() {
        return this.vcM;
    }

    public void setAttribute(String string) {
        this.vcM = string;
        this.vcN = this.vcM != null ? string.hashCode() : 0;
    }

    public T gFH() {
        return this.vdu;
    }

    public void bk(T t) {
        this.vdu = t;
    }

    public fiw_1<?> gFI() {
        return this.vdy;
    }

    public void a(fiw_1<?> fiw_12) {
        this.vdy = fiw_12;
    }

    public String gFJ() {
        return this.dGP;
    }

    public void wh(String string) {
        this.dGP = string;
    }

    public fjj_2 getResultProvider() {
        return this.vcO;
    }

    public void b(fjj_2 fjj_22) {
        this.vcO = fjj_22;
    }

    public boolean gFK() {
        return this.vdu instanceof fiz_1 && vdt.equalsIgnoreCase(this.vcM);
    }

    public Method gFL() {
        return this.vdv;
    }

    public Method gFM() {
        return this.vdw;
    }

    public Method gFN() {
        return this.vdx;
    }

    public boolean gFO() {
        return this.bsk;
    }

    public void po(boolean bl) {
        this.bsk = bl;
    }

    fsg_1 gFP() {
        return this.vdz;
    }

    void a(fsg_1 fsg_12) {
        this.vdz = fsg_12;
    }

    public String toString() {
        return "(PropertyClientData Element:" + String.valueOf(this.vdu) + " attribute=" + this.vcM + " field=" + this.dGP + ")";
    }
}

