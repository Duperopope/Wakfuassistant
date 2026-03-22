/*
 * Decompiled with CFR 0.152.
 */
public class aPR
implements aeh_2 {
    public static final String eAU = "name";
    public static final String eAV = "pipeInternalName";
    public static final String eAW = "descSentence";
    public static final String eAX = "displayable";
    public static final String eAY = "colorString";
    public static final String eAZ = "command";
    public static final String[] eBa = new String[]{"name", "pipeInternalName", "descSentence", "displayable", "colorString", "command"};
    private final apj_0 eBb;
    private final aPP eBc;
    private String eBd;
    private aOZ eBe;
    private boolean eBf = true;
    private String aYl;

    public aPR(apj_0 apj_02, String string, aOZ aOZ2, aPO aPO2) {
        this.eBb = apj_02;
        this.eBd = string;
        if (aPO2 != null) {
            this.eBc = aPO2.cBk();
            if (this.eBc.cyQ() != null) {
                this.eBd = this.eBd + " " + this.eBc.cyQ();
            }
            this.aYl = aPO2.cBl();
        } else {
            this.eBc = null;
        }
        this.eBe = aOZ2;
    }

    public aPP cBm() {
        return this.eBc;
    }

    public apj_0 cBn() {
        return this.eBb;
    }

    public String cBo() {
        return this.eBd;
    }

    public aOZ cBp() {
        return this.eBe;
    }

    public void a(aOZ aOZ2) {
        this.eBe = aOZ2;
    }

    public String cBl() {
        return this.aYl;
    }

    public int cBq() {
        return this.eBb.czu().aYs();
    }

    @Override
    public String[] bxk() {
        return eBa;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(eAU)) {
            return this.eBd;
        }
        if (string.equals(eAV)) {
            return this.cBn().czv();
        }
        if (string.equals(eAW)) {
            return this.eBd;
        }
        if (string.equals(eAX)) {
            return true;
        }
        if (string.equals(eAY)) {
            axb_2 axb_22 = this.eBb.getColor();
            return axb_22.aIU() + "," + axb_22.aIV() + "," + axb_22.aIW();
        }
        if (string.equals(eAZ)) {
            return this.aYl;
        }
        return null;
    }

    public boolean czw() {
        return this.eBf;
    }

    public aPR eM(boolean bl) {
        this.eBf = bl;
        aeg_2.caa().a((aef_2)this, eBa);
        return this;
    }

    public boolean equals(Object object) {
        if (!(object instanceof aPR)) {
            return false;
        }
        aPR aPR2 = (aPR)object;
        return this.eBe == aPR2.cBp() && (this.aYl == null || this.aYl.equals(aPR2.cBl()));
    }

    public boolean cBr() {
        return this.eBe != aOZ.evn && ((bsg_1)aie_0.cfn().bmH()).t(this.eBb.aUXX());
    }

    public aPP cBs() {
        if (this.eBb.aUXX() == null) {
            return this.eBc;
        }
        if (this.eBb.czu().czH()) {
            return aPa.g(aup_0.cWl());
        }
        if (this.eBb.czu().czI()) {
            return aPa.h(aup_0.cWl());
        }
        return null;
    }
}

