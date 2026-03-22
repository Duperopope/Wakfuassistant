/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxN
 */
public class bxn_0
extends bxR {
    private byr_0 jBP;
    private final fi_1 jBQ = new bxO(this, 22);

    bxn_0() {
    }

    @Override
    public rw_0 dNn() {
        return this.jBP.bdZ();
    }

    @Override
    public cpm_1[] dNh() {
        return this.jBP.chR();
    }

    @Override
    public short chU() {
        return this.jBP.chU();
    }

    @Override
    public String getName() {
        return this.jBP.getName();
    }

    @Override
    public rw_0[] dNf() {
        return this.jBP.dNf();
    }

    @Override
    public void dNq() {
        this.jBP.dj(this.baB);
        this.jBP.dNq();
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        return this.jBP.b(rw_02, rG);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jBP.aZp();
        this.jBP = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        assert (this.jBP == null);
        this.jBP = (byr_0)bcy_0.jHJ.bef().baw();
    }

    @Override
    public void c(ng_1 ng_12) {
        this.jBP.c(ng_12);
    }

    @Override
    public void aPg() {
        super.aPg();
        this.dNq();
    }

    @Override
    protected fi_1 bey() {
        return this.jBQ;
    }

    static /* synthetic */ acd_1 a(bxn_0 bxn_02) {
        return bxn_02.bmd;
    }

    static /* synthetic */ String a(bxn_0 bxn_02, String string) {
        bxn_02.baB = string;
        return bxn_02.baB;
    }

    static /* synthetic */ void a(bxn_0 bxn_02, ayv_2 ayv_22) {
        bxn_02.a(ayv_22);
    }
}

