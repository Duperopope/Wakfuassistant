/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQj
 */
public class cqj_2
extends cpm_1 {
    private final bhx_0 nkN;

    @Deprecated
    cqj_2() {
        this(null);
    }

    public cqj_2(bhx_0 bhx_02) {
        this.nkN = bhx_02;
    }

    @Override
    public void run() {
        if (this.nkN == null) {
            return;
        }
        long l = this.nkN.aXa();
        ciX ciX2 = new ciX(l);
        aUQ aUQ2 = aue_0.cVJ().cVO();
        boolean bl = evm_2.b(aUQ2.cWq(), evn_2.otV);
        if (bl && this.nkN.i(ezj_0.psz)) {
            fiq_2.gCw().d(fik_2.a(string -> aue_0.cVJ().etu().d(ciX2)).l("question.confirm", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
        } else {
            aue_0.cVJ().etu().d(ciX2);
        }
    }

    @Override
    public boolean bxO() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        boolean bl = evm_2.b(bgt_02.dpL().cWq(), evn_2.otV);
        if (bl) {
            return true;
        }
        long l = bgt_02.aqZ();
        return bgt_02.Ya() == Math.abs(l);
    }

    @Override
    public String ely() {
        return "destroyMonsterGroup";
    }

    @Override
    protected int eLB() {
        return crc_2.nnN.nnW;
    }

    @Override
    public cps_1 eLz() {
        return cps_1.njK;
    }

    @Override
    public cpm_1 eLD() {
        return new cqj_2(this.nkN);
    }
}

