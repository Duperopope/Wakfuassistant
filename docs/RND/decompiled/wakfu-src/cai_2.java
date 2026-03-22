/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cai
 */
public class cai_2 {
    private float eau;
    private short[] lFE;
    private final adh lFF = new adh();

    public void r(apl_1 apl_12) {
        this.lFF.a(apl_12);
        this.eau = apl_12.aIB();
        this.lFE = apl_12.mw(4);
    }

    public float chw() {
        return this.eau;
    }

    short a(caj_1 caj_12) {
        return this.lFE[caj_12.ordinal()];
    }

    public adC[] bus() {
        adC[] adCArray = this.lFF.bus();
        return adCArray == null ? cai_1.lHl : adCArray;
    }

    public adG[] but() {
        adG[] adGArray = this.lFF.but();
        return adGArray == null ? cai_1.lHm : adGArray;
    }

    public adi[] buw() {
        adi[] adiArray = this.lFF.buw();
        return adiArray == null ? cai_1.lHk : adiArray;
    }
}

