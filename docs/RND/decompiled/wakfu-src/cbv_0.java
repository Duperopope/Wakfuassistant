/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cBV
 */
public class cbv_0
extends cbw_0 {
    public static final byte myT = 0;
    private ub_0 bwV;

    public ub_0 bjn() {
        return this.bwV;
    }

    public void e(ub_0 ub_02) {
        this.bwV = ub_02;
    }

    @Override
    public boolean eIS() {
        return cbr_0.eIZ().bjn() == this.bwV;
    }

    @Override
    public byte eIT() {
        return 0;
    }

    @Override
    public void D(apl_1 apl_12) {
        this.bwV = ub_0.values()[apl_12.aIy()];
    }

    @Override
    public void q(fs_0 fs_02) {
        fs_02.g((byte)this.bwV.ordinal());
    }

    @Override
    public String eIU() {
        return "Saison : " + this.bwV.toString();
    }

    @Override
    public cbp_0 eIV() {
        cbv_0 cbv_02 = new cbv_0();
        cbv_02.jH(this.bDL());
        cbv_02.e(this.bwV);
        return cbv_02;
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.eIV();
    }
}

