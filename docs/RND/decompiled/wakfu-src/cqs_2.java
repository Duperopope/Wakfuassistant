/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 */
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * Renamed from cQS
 */
public class cqs_2
extends bkc_1 {
    private final bmv_2 nlF;
    private final fqy_0 nlG;

    @Override
    public List<flv_0> euZ() {
        if (cqs_2.eLw() != fkc_0.sAp) {
            return null;
        }
        ArrayList<flv_0> arrayList = new ArrayList<flv_0>();
        bJr bJr2 = bTj.eno().doD();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        fmL fmL2 = new fmL(bgt_02, (bhx_0)this.cqO, this.nlF, bJr2 == null ? null : bJr2.eaH());
        arrayList.addAll(fmL2.gdj());
        return arrayList;
    }

    @Override
    public List<flv_0> eva() {
        return null;
    }

    public cqs_2(bmv_2 bmv_22) {
        this.nlF = bmv_22;
        this.nlG = fqz_0.giz().YY(this.nlF.clf());
        this.iqe = (ads_02, n, n2, s) -> {
            ads_02.c(this.iqe);
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (!bgt_02.i(false, true)) {
                return;
            }
            this.m((bgy)this.cqO, true);
        };
    }

    @Override
    public cpm_1 eLD() {
        return new cqe_1();
    }

    @Override
    public cps_1 eLz() {
        return cps_1.niI;
    }

    @Override
    public void run() {
        this.run(false);
    }

    @Override
    public boolean isEnabled() {
        List<Long> list = ewo_0.oBF.o(ewr_0.oDL);
        short s = ((bhx_0)this.cqO).aWP();
        return this.eLW() == bKM.kqu && !list.contains(s);
    }

    @Override
    public void run(boolean bl) {
        boolean bl2;
        int n;
        int n2;
        Iterable<enk_0> iterable;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!this.bxO()) {
            bkc_2.dsD().dsE();
            return;
        }
        if (this.cqO == null) {
            bkc_2.dsD().dsE();
            return;
        }
        bhx_0 bhx_02 = (bhx_0)this.cqO;
        if (!cqs_2.ac(bgt_02)) {
            return;
        }
        if (this.nlG.giy()) {
            iterable = this.nlG.bW(bgt_02);
            if (iterable == null) {
                bkc_2.dsD().dsE();
                return;
            }
            n2 = ((ffV)iterable).dOg().cpn();
            n = ((ffV)iterable).dOg().cpo();
        } else {
            n2 = 1;
            n = 1;
        }
        wa_0.a(bgt_02.bcN(), bgt_02.bcO(), bgt_02.bvy());
        iterable = wa_0.a(bhx_02.aZw(), n2, n, false);
        acd_1 acd_12 = bgt_02.aZw();
        boolean bl3 = iterable.stream().noneMatch(acd_12::equals);
        if (iterable.isEmpty()) {
            bNG.egl();
            bNG.a(2, new Object[0]);
            bkc_2.dsD().dsE();
            return;
        }
        if (bgt_02.ddI().bvE()) {
            bl3 = true;
        }
        if (!bl3) {
            this.m(bhx_02, false);
            return;
        }
        bgt_02.ddI().m(adh_0.class);
        bgt_02.ddI().b(this.iqe);
        boolean bl4 = bl2 = acd_12.A(bhx_02.aZw()) > 2;
        if (!bgt_02.b(false, bl2, (List<acd_1>)iterable) && !iterable.contains(acd_12)) {
            bgt_02.ddI().c(this.iqe);
            bNG.egl();
            bNG.a(2, new Object[0]);
        }
    }

    @Override
    public bmv_2 dsB() {
        return this.nlF;
    }

    @Override
    public ZG dsC() {
        if (!(this.cqO instanceof bhx_0)) {
            return null;
        }
        return ((bhx_0)this.cqO).bvp();
    }

    public acd_1 eLV() {
        return null;
    }

    private bKM eLW() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bhx_0 bhx_02 = (bhx_0)this.cqO;
        Optional<eki_0> optional = bgt_02.dpJ();
        if (optional.isEmpty()) {
            return bKM.kqJ;
        }
        if (!evg_1.osQ.a(new eve_2[]{bgt_02})) {
            return bKM.kqG;
        }
        if (!bhx_02.CU(this.nlF.d())) {
            return bKM.kqz;
        }
        if (!this.nlG.bV(bgt_02)) {
            return bKM.kqD;
        }
        if (optional.get().PG(this.nlF.cms()) < this.nlF.dwb()) {
            return bKM.kqx;
        }
        if (this.nlF.bdo() != null && !this.nlF.bdo().b(bgt_02, this.cqO, null, null)) {
            return bKM.kqv;
        }
        if (!optional.get().tX(this.nlF.cms())) {
            return bKM.kqB;
        }
        if (aue_0.cVJ().cVO().bfb()) {
            return bKM.kqw;
        }
        return bKM.kqu;
    }

    @Override
    public boolean bxO() {
        if (!this.nlG.isEnabled()) {
            return false;
        }
        bKM bKM2 = this.eLW();
        if (bKM2 == bKM.kqB) {
            return false;
        }
        bhx_0 bhx_02 = (bhx_0)this.cqO;
        if (bhx_02.djT()) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dkG()) {
            return false;
        }
        if (bgt_02.a(ezj_0.ptp)) {
            return false;
        }
        boolean bl = this.nlF.bdo() == null || this.nlF.bdo().b(bgt_02, this.cqO, null, null);
        boolean bl2 = !bgt_02.djT();
        boolean bl3 = !bsl_0.jfZ.dFs();
        return bl && bl2 && bl3;
    }

    @Override
    public String ely() {
        if (this.nlG == null) {
            return "undefined";
        }
        return this.nlG.giw();
    }

    public axb_2 eLS() {
        return this.eLW() == bKM.kqu ? awx_2.dnL : awx_2.dnJ;
    }

    @Override
    protected int eLB() {
        return this.nlG.giv();
    }

    @Override
    public String getLabel() {
        ahv_2 ahv_22 = new ahv_2().ceu();
        ahv_22.c(this.eLA());
        ahv_22.cev().c("\n");
        Object r = fgD.fXh().Vd(this.nlF.csA());
        ahv_22.c(r != null ? ((fhc_0)r).getName() : "#ERROR#").c("\n");
        String string = aum_0.cWf().a(43, (long)this.nlF.cms(), new Object[0]);
        ahv_22.c(string).c(" ");
        bKM bKM2 = this.eLW();
        axb_2 axb_22 = bKM2 == bKM.kqx ? awx_2.dnJ : awx_2.dnL;
        ahv_22.ceC().ih(axb_22.bQk());
        ahv_22.c(aum_0.cWf().c("desc.mru.levelRequired", this.nlF.dwb()));
        ahv_22.ceD();
        if (bKM2 != bKM.kqu) {
            ahv_22.ceC().ih(awx_2.dnJ.bQk());
            switch (bKM2) {
                case kqy: {
                    ahv_22.c("\n").c(aum_0.cWf().c("collect.error.npc.inFight", new Object[0]));
                    break;
                }
                case kqG: {
                    ahv_22.c("\n").c(aum_0.cWf().c("error.playerNotSubscribed", new Object[0]));
                    break;
                }
                case kqx: {
                    ahv_22.c("\n").c(aum_0.cWf().c("collect.error.wrongLevel", new Object[0]));
                    break;
                }
                case kqz: {
                    ahv_22.c("\n").c(aum_0.cWf().c("collect.error.npc.collected", new Object[0]));
                    break;
                }
                case kqv: {
                    ang_2 ang_22 = this.nlF.bdo();
                    if (ang_22 != null) {
                        ahv_22.ceH().c(eLP.b(ang_22));
                        break;
                    }
                    ahv_22.c("\n").c(aum_0.cWf().c("error.unknown", new Object[0]));
                    break;
                }
                case kqD: {
                    ahv_22.c("\n").c(aum_0.cWf().c("action.error.wrongItemEquiped", new Object[0]));
                    break;
                }
                case kqw: {
                    ahv_22.ceH().c(aum_0.cWf().c("security.impossible.action.account.locked", new Object[0]));
                }
            }
            ahv_22.ceD();
        }
        return ahv_22.ceL();
    }

    private void m(bgy bgy2, boolean bl) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bdj_2 bdj_22 = bgt_02.ddI();
        int n = amf_1.c((amg_1)bdj_22, bgy2);
        if (n <= 1) {
            ffV ffV2;
            abi_1 abi_12 = bdj_22.bqg().x(((bgy)this.cqO).aZw());
            if (abi_12 != null) {
                bdj_22.a(abi_12);
            }
            if (this.nlG.giy() && (ffV2 = this.nlG.bW(bgt_02)) == null) {
                bkc_2.dsD().dsE();
                return;
            }
            float f2 = Math.abs((float)bgy2.bcE() - bdj_22.getAltitude());
            if (f2 > (float)bdj_22.bvy()) {
                nii.error((Object)("Plantation impossible sur la cellule " + String.valueOf(bgy2.aZw()) + " : hauteur maximale de saut de " + bdj_22.bvy()));
                bNG.a(2, new Object[0]);
                bkc_2.dsD().dsE();
                return;
            }
            bdj_22.c(this.iqe);
            bkc_2.dsD().dsH();
            cib_0 cib_02 = new cib_0(3, 13120, (MessageLite)yq_2.awd().jW(this.nlF.d()).bS(bgy2.Sn()).awj());
            aue_0.cVJ().etu().d(cib_02);
        } else if (bl && n <= 2) {
            bgt_02.ddI().m(adh_0.class);
            bdj_22.b(this.iqe);
            if (!bgt_02.a((anu_1)this.cqO, false, false)) {
                bdj_22.c(this.iqe);
                bNG.a(2, new Object[0]);
                bkc_2.dsD().dsE();
                return;
            }
        }
    }
}

