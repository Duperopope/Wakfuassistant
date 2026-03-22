/*
 * Decompiled with CFR 0.152.
 */
public class fiL {
    private int epc;
    private byte ssP;
    private byte ssQ;
    private short soP;
    private short soQ;
    private short ssT;
    private double ejs;
    private boolean emM;
    private ang_2 bfe;

    public fiL Wc(int n) {
        this.epc = n;
        return this;
    }

    public fiL gI(byte by) {
        this.ssP = by;
        return this;
    }

    public fiL ff(short s) {
        this.ssT = s;
        return this;
    }

    public fiL ac(double d2) {
        this.ejs = d2;
        return this;
    }

    public fiL k(ang_2 ang_22) {
        this.bfe = ang_22;
        return this;
    }

    public fiL gJ(byte by) {
        this.ssQ = by;
        return this;
    }

    public fiL fg(short s) {
        this.soP = s;
        return this;
    }

    public fiL fh(short s) {
        this.soQ = s;
        return this;
    }

    public fiL nv(boolean bl) {
        this.emM = bl;
        return this;
    }

    int AK() {
        return this.epc;
    }

    byte gab() {
        return this.ssP;
    }

    short gac() {
        return this.ssT;
    }

    double cmK() {
        return this.ejs;
    }

    ang_2 bdo() {
        return this.bfe;
    }

    byte gad() {
        return this.ssQ;
    }

    short fXS() {
        return this.soP;
    }

    short fXT() {
        return this.soQ;
    }

    boolean cqk() {
        return this.emM;
    }

    public fhv drr() {
        return new fiK(this);
    }

    public String toString() {
        return "LootDefinitionBuilder{m_itemRefId=" + this.epc + ", m_dropQty=" + this.ssP + ", m_dropQuantityMin=" + this.soP + ", m_dropQuantityMax=" + this.soQ + ", m_minProspection=" + this.ssT + ", m_rollMax=" + this.ssQ + ", m_isLootList=" + this.emM + ", m_dropRate=" + this.ejs + ", m_criterion=" + String.valueOf(this.bfe) + "}";
    }
}

