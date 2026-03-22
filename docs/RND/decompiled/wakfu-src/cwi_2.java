/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cWI
 */
public class cwi_2
implements aeh_2 {
    public static final String nTB = "name";
    public static final String nTC = "sourcesDescription";
    public static final String nTD = "logFiltered";
    public static final String nTE = "visible";
    public final String[] nTF = new String[]{"name", "sourcesDescription"};
    private final cAN nTG;
    private boolean bmg;
    boolean nTH;

    public cwi_2(cAN cAN2) {
        this.nTG = cAN2;
        this.bmg = this.cca() > 0;
        this.nTH = false;
    }

    @Override
    public String[] bxk() {
        return this.nTF;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(nTB)) {
            return this.nTG.name() + "(" + this.cca() + ")";
        }
        if (string.equals(nTD)) {
            return this.nTH;
        }
        if (string.equals(nTE)) {
            return this.bmg;
        }
        if (string.equals(nTC)) {
            agc_1 agc_12;
            Object object;
            ahv_2 ahv_22 = new ahv_2();
            ago_1 ago_12 = this.nTG.eGT();
            if (ago_12 != null) {
                ahv_22.ceu().c("-Default- size=").yx(ago_12.cbQ().size()).cev().c("\n");
                object = ago_12.cbQ().iterator();
                while (object.hasNext()) {
                    agc_12 = (ahk_1)object.next();
                    ahv_22.c(((ahk_1)agc_12).getDescription()).c("\n");
                }
            }
            if ((object = this.nTG.eGU()) != null) {
                ahv_22.ceu().c("-Field- size=").yx(((agu_1)object).cca()).cev().c("\n");
                ahv_22.c(((agu_1)object).ccb()).c("\n");
            }
            if ((agc_12 = this.nTG.eGS()) != null) {
                ahk_1 ahk_12 = ((ahd_2)agc_12).ccl();
                ahv_22.ceu().c("-Music-").cev().c("\n");
                if (ahk_12 != null) {
                    ahv_22.c(ahk_12.getDescription()).c("\n");
                }
            }
            return ahv_22.ceL();
        }
        return null;
    }

    public void kH(boolean bl) {
        this.nTH = bl;
        fse_1.gFu().a((aef_2)this, nTD);
    }

    public byte eGR() {
        return this.nTG.eGR();
    }

    public void setVisible(boolean bl) {
        this.bmg = bl;
        fse_1.gFu().a((aef_2)this, nTE);
    }

    public int cca() {
        int n = 0;
        if (this.nTG.eGT() != null) {
            n += this.nTG.eGT().cbQ().size();
        }
        if (this.nTG.eGU() != null) {
            n += this.nTG.eGU().cca();
        }
        return n;
    }
}

