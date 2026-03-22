/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from cQR
 */
public class cqr_2
extends cpm_1
implements adm_0 {
    private bjo_2 lWr;
    private boolean nlC;
    public static final int nlD = 0;
    public static final int nlE = 1;
    private int nll;

    cqr_2() {
    }

    public cqr_2(bjo_2 bjo_22) {
        this.lWr = bjo_22;
    }

    @Override
    public void aH(Object object) {
        super.aH(object);
        this.nlC = ((exP)this.cqO).a(ezj_0.psE);
    }

    @Override
    public boolean isEnabled() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (this.lWr.aZv() == eio_0.qxK.aJr() && !evg_1.osP.a(new eve_2[]{bgt_02})) {
            this.nll = 1;
            return false;
        }
        if (this.lWr.aZv() == eio_0.qxJ.aJr() && !evg_1.osQ.a(new eve_2[]{bgt_02})) {
            this.nll = 1;
            return false;
        }
        this.nll = 0;
        return true;
    }

    @Override
    public boolean bxO() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.a(ezj_0.ptn)) {
            return false;
        }
        return this.cqO instanceof bhx_0 && !((bhx_0)this.cqO).doP() && !((bhx_0)this.cqO).i(ezj_0.psZ) && this.lWr.j((bhx_0)this.cqO);
    }

    @Override
    public void run() {
        boolean bl;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgt_02.ddI().b(this);
        int n = bgt_02.aZw().A(((bhx_0)this.cqO).aZw());
        boolean bl2 = bl = n > 2;
        if (!this.lWr.fwN() || n <= 1 && bgt_02.ddI().bvF() == null) {
            this.bVi();
        } else {
            ArrayList<acd_1> arrayList = new ArrayList<acd_1>();
            acd_1 acd_12 = ((bhx_0)this.cqO).aZw();
            arrayList.add(new acd_1(acd_12.getX() + 1, acd_12.getY(), acd_12.bdi()));
            arrayList.add(new acd_1(acd_12.getX() - 1, acd_12.getY(), acd_12.bdi()));
            arrayList.add(new acd_1(acd_12.getX(), acd_12.getY() + 1, acd_12.bdi()));
            arrayList.add(new acd_1(acd_12.getX(), acd_12.getY() - 1, acd_12.bdi()));
            if (!bgt_02.b(false, bl, (List<acd_1>)arrayList)) {
                bgt_02.ddI().c(this);
                bNG.egl();
                bNG.a(2, new Object[0]);
            }
        }
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        this.bVi();
    }

    private void bVi() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bdj_2 bdj_22 = bgt_02.ddI();
        bhx_0 bhx_02 = (bhx_0)this.cqO;
        bdj_22.c(this);
        int n = bgt_02.aZw().A(bhx_02.aZw());
        if (this.lWr.fwN() && n > 1) {
            return;
        }
        this.lWr.i(bhx_02);
    }

    public bjo_2 eMu() {
        return this.lWr;
    }

    @Override
    protected int eLB() {
        return this.lWr.drR().giv();
    }

    @Override
    public String getLabel() {
        ahv_2 ahv_22 = new ahv_2().ceu().ih(!eio_0.PW(this.lWr.aZv()).fwO() && this.nlC ? nim : nik);
        ahv_22.c(aum_0.cWf().c("desc.mru." + this.lWr.drR().giw(), new Object[0]));
        ahv_22.cev();
        if (!this.isEnabled()) {
            switch (this.nll) {
                case 1: {
                    ahv_22.ceH().ih(nim).c(aum_0.cWf().c("error.playerNotSubscribed", new Object[0]));
                }
            }
        }
        return ahv_22.ceL();
    }

    @Override
    public String ely() {
        return null;
    }

    @Override
    public cps_1 eLz() {
        return cps_1.njf;
    }

    @Override
    public cpm_1 eLD() {
        return new cqr_2(this.lWr);
    }

    public String toString() {
        return "MRUMonsterAction{m_action=" + String.valueOf(this.lWr) + ", m_busy=" + this.nlC + "}";
    }
}

