/*
 * Decompiled with CFR 0.152.
 */
public class fhy
implements fhv {
    private final int soN;
    private final short soO;
    private final short soP;
    private final short soQ;
    private final double soR;
    private final int soS;
    private final ang_2 soT;
    private boolean jlH;
    private boolean shk;
    private short rPf;
    private long bgK;

    public fhy(fhv fhv2) {
        this.soN = fhv2.avr();
        this.soO = fhv2.fXR();
        this.soP = fhv2.fXS();
        this.soQ = fhv2.fXT();
        this.soR = fhv2.avr();
        this.soS = fhv2.avr();
        this.soT = fhv2.bdo();
    }

    public fhy(int n, short s, boolean bl) {
        this.soN = n;
        this.rPf = s;
        this.jlH = bl;
        this.soO = 0;
        this.soP = 0;
        this.soQ = 0;
        this.soR = 0.0;
        this.soS = 0;
        this.soT = null;
    }

    @Override
    public int avr() {
        return this.soN;
    }

    @Override
    public short fXR() {
        return this.soO;
    }

    @Override
    public short fXS() {
        return this.soP;
    }

    @Override
    public short fXT() {
        return this.soQ;
    }

    @Override
    public double cmK() {
        return this.soR;
    }

    @Override
    public int fXU() {
        return this.soS;
    }

    @Override
    public short csp() {
        return 0;
    }

    @Override
    public boolean cqk() {
        return false;
    }

    @Override
    public ang_2 bdo() {
        return this.soT;
    }

    public void ne(boolean bl) {
        this.jlH = bl;
    }

    public boolean fVP() {
        return this.jlH;
    }

    public void nf(boolean bl) {
        this.shk = bl;
    }

    public boolean fVQ() {
        return this.shk;
    }

    public void eX(short s) {
        this.rPf = s;
    }

    public short fQY() {
        return this.rPf;
    }

    public long Lx() {
        return this.bgK;
    }

    public void di(long l) {
        this.bgK = l;
    }
}

