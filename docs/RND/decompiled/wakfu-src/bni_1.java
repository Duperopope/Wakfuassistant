/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bni
 */
public class bni_1
implements bek_2 {
    private static final bni_1 iGS = new bni_1();
    private final acv_0 iGT = new bnj_1(this);
    private byte iGU = 0;
    private int iGV = 0;
    private bnv_2 iGW;

    private bni_1() {
    }

    public static bni_1 dyk() {
        return iGS;
    }

    public void b(bdf_1 bdf_12) {
        switch (this.iGU) {
            case 1: {
                assert (this.iGW != null);
                this.c(bdf_12);
                break;
            }
            case -1: {
                assert (this.iGW == null);
                this.deL();
            }
        }
        this.iGU = 0;
    }

    @Override
    public void boS() {
    }

    @Override
    public void deL() {
        acq_0.cge.b(this.iGT);
        aIz.yD(this.iGV);
    }

    public void b(bnv_2 bnv_22) {
        assert (bnv_22 != null);
        this.iGU = 1;
        this.iGW = bnv_22;
    }

    public void dyl() {
        this.iGU = (byte)-1;
        this.iGW = null;
    }

    private void c(bdf_1 bdf_12) {
        if (this.iGW != null) {
            this.boS();
        }
    }
}

