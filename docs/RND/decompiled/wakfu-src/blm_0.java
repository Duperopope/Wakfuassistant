/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from blm
 */
public class blm_0
extends blj_0 {
    private final int itB;
    final /* synthetic */ bll_0 itC;

    blm_0(bll_0 bll_02, int n) {
        this.itC = bll_02;
        this.itB = n;
    }

    @Override
    public Object eu(String string) {
        Object object = super.eu(string);
        if (object != null) {
            return object;
        }
        return ((bgv_2)fgD.fXh().Vd(this.itB)).eu(string);
    }

    @Override
    public long dtr() {
        return Math.min(this.dtt(), this.dts());
    }

    @Override
    public long dts() {
        return aue_0.cVJ().cVK().dno().Gn(this.itB);
    }

    @Override
    public long getMaxQuantity() {
        fdl fdl2 = this.itC.dtn().djh();
        return fdl2 == null ? 0L : (long)fdl2.Ui(this.itB);
    }

    @Override
    public long dtu() {
        blh_0 blh_02 = (blh_0)this.itC.dtn().djj();
        return blh_02 == null ? 0L : (long)blh_02.Qe(this.itB);
    }

    public int acs() {
        return this.itB;
    }
}

