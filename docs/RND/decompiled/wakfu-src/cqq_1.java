/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from cQq
 */
public class cqq_1
extends cpl_1 {
    public static final int nkV = 0;
    public static final int nkW = 1;
    public static final int nkX = 2;
    private static final int nkY = 3;
    private static final int nkZ = 4;
    private static final int nla = 5;
    adm_0 nlb;
    private int nkj;

    @Override
    public cps_1 eLz() {
        return cps_1.niA;
    }

    @Override
    public cpm_1 eLD() {
        return new cqq_1();
    }

    @Override
    public void run() {
        bhJ bhJ2;
        if (!this.bxO()) {
            nii.error((Object)("Tentative de lancement de l'action '" + this.eLz().aXB() + "' alors que isRunnable retourne que l'action est impossible"));
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bdj_2 bdj_22 = bgt_02.ddI();
        if (this.nlb != null) {
            bdj_22.c(this.nlb);
        }
        if (aPd.a((bhJ2 = (bhJ)this.cqO).getName(), ejn_0.qzj)) {
            return;
        }
        int n = bhJ2.bcC() - bdj_22.bcC();
        int n2 = bhJ2.bcD() - bdj_22.bcD();
        if (Math.abs(n) <= 1 && Math.abs(n2) <= 1) {
            bdj_22.a(acq_1.bo(n, n2));
            ckd_0 ckd_02 = new ckd_0();
            ckd_02.nd(bhJ2.Sn());
            aue_0.cVJ().etu().d(ckd_02);
            return;
        }
        this.nlb = new cqr_1(this);
        bdj_22.b(this.nlb);
        bgt_02.c(((bhJ)this.cqO).aZw(), true, true);
    }

    @Override
    public boolean isEnabled() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bhJ bhJ2 = (bhJ)this.cqO;
        if (!bgt_02.a(evv_1.oxd)) {
            this.nkj = 3;
            return false;
        }
        if (!bhJ2.a(evv_1.oxd)) {
            this.nkj = 4;
            return false;
        }
        if (bgt_02.dpM() || bhJ2.dpM()) {
            this.nkj = 1;
            return false;
        }
        if (aue_0.cVJ().cVO().bfb()) {
            this.nkj = 5;
            return false;
        }
        return true;
    }

    @Override
    public boolean bxO() {
        if (!(this.cqO instanceof bhJ)) {
            return false;
        }
        bgy bgy2 = (bgy)this.cqO;
        if (bgy2.Sn() <= 0L) {
            return false;
        }
        if (bgy2.djT()) {
            return false;
        }
        if (bgy2.a(ezj_0.ptj)) {
            return false;
        }
        if (bgy2.dpX() != null && bgy2.dpX().dsm() == 4) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dnj()) {
            return false;
        }
        if (bgt_02.a(ezj_0.ptj)) {
            return false;
        }
        if (bgt_02.djT()) {
            return false;
        }
        if (bsl_0.jfZ.dFs()) {
            return false;
        }
        return !cpq_1.bU(bgy2);
    }

    @Override
    public String ely() {
        return "trade";
    }

    @Override
    public String getLabel() {
        if (!this.isEnabled()) {
            ahv_2 ahv_22 = new ahv_2();
            ahv_22.ceu().c(this.eLA()).cev().c("\n");
            ahv_22.ceC().ih(nim);
            switch (this.nkj) {
                case 2: {
                    ahv_22.c(aum_0.cWf().c("error.someoneNotSubscribed", new Object[0])).ceD();
                    break;
                }
                case 4: {
                    ahv_22.c(aum_0.cWf().c("error.targetNotSubscriptionRight", new Object[0])).ceD();
                    break;
                }
                case 3: {
                    ahv_22.c(aum_0.cWf().c("error.playerNotSubscriptionRight", new Object[0])).ceD();
                    break;
                }
                case 1: {
                    ahv_22.c(aum_0.cWf().c("exchange.forbidden.in.prison", new Object[0])).ceD();
                    break;
                }
                case 5: {
                    ahv_22.c(aum_0.cWf().c("security.impossible.action.account.locked", new Object[0])).ceD();
                }
            }
            return ahv_22.ceL();
        }
        if (!(this.cqO instanceof bgy)) {
            return this.ely();
        }
        ahv_2 ahv_23 = new ahv_2().ceu().ih(nik);
        ahv_23.c(aum_0.cWf().c("exchange.with", ((bgy)this.cqO).getName())).cev();
        return ahv_23.ceL();
    }

    @Override
    protected int eLB() {
        return crc_2.nmq.nnW;
    }

    @Override
    public List<flv_0> euZ() {
        if (cqq_1.eLw() != fkc_0.sAp) {
            return null;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        fmN fmN2 = new fmN(bgt_02, (fjm)this.cqO);
        ArrayList<flv_0> arrayList = new ArrayList<flv_0>();
        arrayList.addAll(fmN2.gdj());
        return arrayList;
    }

    @Override
    public List<flv_0> eva() {
        return null;
    }
}

