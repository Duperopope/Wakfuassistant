/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQd
 */
public class cqd_2
extends cpm_1 {
    private final int nkF;
    private final long nkG;
    private final byte nkH;

    @Deprecated
    cqd_2() {
        this(0, 0L, 0);
    }

    public cqd_2(int n, long l, byte by) {
        this.nkF = n;
        this.nkG = l;
        this.nkH = by;
    }

    @Override
    public void run() {
        ciW ciW2 = new ciW(this.nkG, this.nkH);
        aue_0.cVJ().etu().d(ciW2);
    }

    @Override
    public boolean bxO() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        boolean bl = evm_2.b(bgt_02.dpL().cWq(), evn_2.otV);
        if (bl) {
            return true;
        }
        if (bgt_02.dkH()) {
            return true;
        }
        return bgt_02.dnx() == bgt_02.dnw();
    }

    @Override
    public String ely() {
        return "changeResourceStepAction";
    }

    @Override
    public String getLabel() {
        if (this.nkH < 0) {
            return aum_0.cWf().c("desc.mru." + this.ely() + ".destroy", new Object[0]);
        }
        String string = aum_0.cWf().a(152, (long)this.nkF, new Object[0]);
        return aum_0.cWf().c("desc.mru." + this.ely() + ".change", string);
    }

    @Override
    protected int eLB() {
        return this.nkH < 0 ? crc_2.nnN.nnW : crc_2.nmI.nnW;
    }

    @Override
    public cps_1 eLz() {
        return cps_1.njL;
    }

    @Override
    public cpm_1 eLD() {
        return new cqd_2(this.nkF, this.nkG, this.nkH);
    }

    public byte eLU() {
        return this.nkH;
    }
}

