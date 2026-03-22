/*
 * Decompiled with CFR 0.152.
 */
public class fiK
implements fhv {
    private final int ssO;
    private final byte ssP;
    private final byte ssQ;
    private final short ssR;
    private final short ssS;
    private final short ssT;
    private final double ssU;
    private final boolean ssV;
    private final ang_2 ssW;

    public fiK(fiL fiL2) {
        this.ssO = fiL2.AK();
        this.ssP = fiL2.gab();
        this.ssQ = fiL2.gad();
        this.ssR = fiL2.fXS();
        this.ssS = fiL2.fXT();
        this.ssT = fiL2.gac();
        this.ssU = fiL2.cmK();
        this.ssW = fiL2.bdo();
        this.ssV = fiL2.cqk();
    }

    @Override
    public int avr() {
        return this.ssO;
    }

    @Override
    public short fXR() {
        return this.ssP;
    }

    @Override
    public short csp() {
        return this.ssQ;
    }

    @Override
    public short fXS() {
        return this.ssR;
    }

    @Override
    public short fXT() {
        return this.ssS;
    }

    @Override
    public int fXU() {
        return this.ssT;
    }

    @Override
    public boolean cqk() {
        return this.ssV;
    }

    @Override
    public double cmK() {
        return this.ssU;
    }

    @Override
    public ang_2 bdo() {
        return this.ssW;
    }

    public String toString() {
        return "LootDefinition{m_itemRefId=" + this.ssO + ", m_dropQty=" + this.ssP + ", m_rollMax=" + this.ssQ + ", m_dropQuantityMin=" + this.ssR + ", m_dropQuantityMax=" + this.ssS + ", m_minProspection=" + this.ssT + ", m_dropRate=" + this.ssU + ", m_isLootList=" + this.ssV + ", m_criterion=" + String.valueOf(this.ssW) + "}";
    }
}

