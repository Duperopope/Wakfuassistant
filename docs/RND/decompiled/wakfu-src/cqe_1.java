/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 *  gnu.trove.list.array.TIntArrayList
 */
import com.google.protobuf.MessageLite;
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * Renamed from cQe
 */
public class cqe_1
extends bkc_1 {
    private bKV iqr;
    private bmv_2 iqb;
    private fqy_0 nkI;

    public cqe_1() {
    }

    public cqe_1(bKV bKV2, bmv_2 bmv_22) {
        this.iqr = bKV2;
        this.iqb = bmv_22;
        this.nkI = fqz_0.giz().YY(this.iqb.clf());
        this.iqe = (ads_02, n, n2, s) -> {
            ads_02.c(this.iqe);
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (!bgt_02.i(false, true)) {
                return;
            }
            this.r(this.iqr);
        };
    }

    @Override
    public bmv_2 dsB() {
        return this.iqb;
    }

    @Override
    public ZG dsC() {
        return this.iqr;
    }

    public acd_1 eLV() {
        return this.iqr.bqg();
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
    public List<flv_0> euZ() {
        Object object;
        if (cqe_1.eLw() == fkc_0.sAo) {
            return null;
        }
        ArrayList<flv_0> arrayList = new ArrayList<flv_0>();
        bKT bKT2 = this.iqr.eco();
        bJr bJr2 = bTj.eno().doD();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (this.iqb.fyR()) {
            object = new ArrayList<boz_2>();
            if (bKT2 instanceof bKQ) {
                for (int object2 : ((bKQ)bKT2).cuE()) {
                    ((ArrayList)object).add(boc_2.eht().IE(object2));
                }
            } else {
                ((ArrayList)object).add(bod_1.ehw().IF(bKT2.ghz()));
            }
            Object object3 = ((ArrayList)object).iterator();
            while (object3.hasNext()) {
                boz_2 boz_22 = (boz_2)object3.next();
                if (boz_22 == null || !boz_22.ehc() || boz_22.ehd()) continue;
                fmt_0 fmt_02 = new fmt_0(bgt_02);
                int n = boz_22.ehe();
                if (n == 0) continue;
                fmU fmU2 = n > 0 ? fmU.sHz : fmU.sHy;
                fmt_02.a(fmU2);
                arrayList.addAll(fmt_02.gdj());
            }
        }
        if (!this.iqr.eco().c(fqi_0.sSj)) {
            object = new fmL(bgt_02, this.iqr, this.iqb, bJr2 == null ? null : bJr2.eaH());
            arrayList.addAll(((flx_0)object).gdj());
        }
        return arrayList;
    }

    @Override
    public List<flv_0> eva() {
        return null;
    }

    @Override
    public boolean bxO() {
        boolean bl;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.a(ezj_0.ptE)) {
            return false;
        }
        bKM bKM2 = this.eLW();
        if (bKM2 == bKM.kqv && this.iqb.cuR()) {
            return false;
        }
        boolean bl2 = bl = this.nkI.isEnabled() && bKM2 != bKM.kqB && !bgt_02.djT() && !bgt_02.dkG() && !bsl_0.jfZ.dFs();
        if (bl) {
            this.setEnabled(true);
            bnv_2 bnv_22 = bgt_02.dnw();
            if (bnv_22 != null && !bnv_22.a(bgt_02, this.iqr.bcC(), this.iqr.bcD())) {
                this.setEnabled(false);
            }
        }
        return bl;
    }

    @Override
    public String ely() {
        if (this.nkI == null) {
            return "undefined";
        }
        return this.nkI.giw();
    }

    public axb_2 eLS() {
        int n;
        boolean bl;
        if (this.iqb.cms() == 0) {
            return awx_2.dnL;
        }
        eKW eKW2 = eKQ.qEb.QV(this.iqb.cms());
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        eki_0 eki_02 = bgt_02.dpK();
        short s = eki_02.PG(this.iqb.cms());
        boolean bl2 = bl = eKX.a(s, (short)(n = this.iqb.dwb()), eKW2, bgt_02) == 0L;
        return this.eLW() == bKM.kqx ? awx_2.dnJ : (bl ? awx_2.dnQ : awx_2.dnL);
    }

    @Override
    public boolean isEnabled() {
        return this.eLW() == bKM.kqu;
    }

    @Override
    protected int eLB() {
        return this.nkI.giv();
    }

    private bKM eLW() {
        Object object;
        Object object2;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        Optional<eki_0> optional = bgt_02.dpJ();
        if (optional.isEmpty()) {
            return bKM.kqJ;
        }
        Object Info2 = this.iqb.fyS();
        boolean bl = evg_1.osQ.a(new eve_2[]{bgt_02});
        if (!bl) {
            return bKM.kqG;
        }
        if (this.iqr.awH() && this.iqr.awI() != bgt_02.aZj()) {
            if (!bzp_2.eqt().mA(bgt_02.aqZ()).eqw()) {
                return bKM.kqH;
            }
            object2 = cux_0.mjE.eDD();
            TIntArrayList tIntArrayList = ((fpv)object2).ggK();
            if (tIntArrayList.contains(bgt_02.Xt()) && tIntArrayList.contains(this.iqr.awK())) {
                return bKM.kqH;
            }
            object = ((fpv)object2).ggL();
            if (object.contains(bgt_02.Xt()) && object.contains(this.iqr.awK())) {
                return bKM.kqH;
            }
        }
        if ((object2 = bgt_02.dnw()) != null && !((bnv_2)object2).a(bgt_02, this.iqr.bcC(), this.iqr.bcD())) {
            return bKM.kqI;
        }
        if (this.iqb.cms() != 0 && (!optional.get().tX(this.iqb.cms()) || bkc_2.dsD().j(this.iqr))) {
            return bKM.kqB;
        }
        if (optional.get().PG(this.iqb.cms()) < this.iqb.dwb()) {
            return bKM.kqx;
        }
        if (!this.nkI.bV(bgt_02)) {
            return bKM.kqB;
        }
        if (this.iqb.bdo() != null && !this.iqb.bdo().b(bgt_02, this.cqO, null, null)) {
            return bKM.kqv;
        }
        if (((eKP)Info2).fyT() && bgt_02.dno().UK(((eKP)Info2).cuQ()) == null && ((fec_0)bgt_02.a(fez_0.sep)).UB(((eKP)Info2).cuQ()) == null && fea_0.ah(bgt_02.aZj(), ((eKP)Info2).cuQ()) <= 0) {
            return bKM.kqC;
        }
        boolean bl2 = ewo_0.oBF.k(ewr_0.oDr);
        if (!this.eLX() && bl2 && !bgt_02.fgO()) {
            object = bgt_02.dpL();
            uw_0 uw_02 = ue_0.bjV().bjm();
            long l = ((evd_2)object).fdS();
            if (uw_02.bjB() - l < 60000L) {
                return bKM.kqF;
            }
        }
        if (aue_0.cVJ().cVO().bfb()) {
            return bKM.kqw;
        }
        if (this.iqr == bgt_02.dla()) {
            return bKM.kqA;
        }
        return bKM.kqu;
    }

    private boolean eLX() {
        bKT bKT2 = this.iqr.eco();
        if (bKT2 == null) {
            return false;
        }
        return bKT2.c(fqi_0.sSh);
    }

    @Override
    public String getLabel() {
        int n;
        Object object;
        int n2;
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.ceu().c(this.eLA()).cev();
        if (this.iqb.csA() != 0) {
            ahv_22.ceH();
            Object r = fgD.fXh().Vd(this.iqb.csA());
            if (r != null) {
                ahv_22.c(((fhc_0)r).getName());
            } else {
                ahv_22.c("#ERROR#");
            }
        }
        if ((n2 = this.iqb.cms()) != 0) {
            ahv_22.ceH();
            object = aum_0.cWf().a(43, (long)n2, new Object[0]);
            ahv_22.c((CharSequence)object).c(" : ").ceC().ih(this.eLS().bQk()).c(aum_0.cWf().c("desc.mru.levelRequired", this.iqb.dwb())).ceD();
        }
        object = this.eLW();
        Object Info2 = this.iqb.fyS();
        if (((eKP)Info2).fyT()) {
            ahv_22.ceH();
            n = ((eKP)Info2).cuQ();
            Object r = fgD.fXh().Vd(n);
            String string = ((fhc_0)r).getName();
            ahv_22.c(aum_0.cWf().c("itemNeeded", new Object[0]));
            ahv_22.ceC().ih(object == bKM.kqC ? nim : nil).c(string).ceD();
        }
        if (object != bKM.kqu) {
            switch (cqf_2.nkJ[((Enum)object).ordinal()]) {
                case 1: {
                    ahv_22.ceH().ceC().ih(nim).c(aum_0.cWf().c("error.playerNotSubscribed", new Object[0])).ceD();
                    break;
                }
                case 2: {
                    ahv_22.ceH().ceC().ih(nim).c(aum_0.cWf().c("error.timerNotFinished", new Object[0])).ceD();
                    break;
                }
                case 3: {
                    ahv_22.ceH().ceC().ih(nim).c(aum_0.cWf().c("collect.error.wrongLevel", new Object[0])).ceD();
                    break;
                }
                case 4: {
                    ang_2 ang_22 = this.iqb.bdo();
                    if (ang_22 != null) {
                        ahv_22.ceH().ceC().ih(nim).c(eLP.b(ang_22)).ceD();
                        break;
                    }
                    ahv_22.ceH().ceC().ih(nim).c(aum_0.cWf().c("error.unknown", new Object[0])).ceD();
                    break;
                }
                case 5: {
                    ahv_22.ceH().ceC().ih(nim).c(aum_0.cWf().c("collect.error.tooEarly", new Object[0])).ceD();
                    break;
                }
                case 6: {
                    ahv_22.ceH().ceC().ih(nim).c(aum_0.cWf().c("collect.resourceAlreadyUseByPlayer", new Object[0])).ceD();
                    break;
                }
                case 7: {
                    ahv_22.ceH().ceC().ih(nim).c(aum_0.cWf().c("action.error.wrongItemEquiped", new Object[0])).ceD();
                    break;
                }
                case 8: {
                    ahv_22.ceH().ceC().ih(nim).c(aum_0.cWf().c("action.error.resourceReserved", new Object[0])).ceD();
                    break;
                }
                case 9: {
                    ahv_22.ceH().ceC().ih(nim).c(aum_0.cWf().c("dimensionalBag.error.roomLocked", new Object[0])).ceD();
                    break;
                }
                case 10: {
                    break;
                }
                case 11: {
                    ahv_22.ceH().ceC().ih(nim).c(aum_0.cWf().c("security.impossible.action.account.locked", new Object[0])).ceD();
                    break;
                }
                default: {
                    ahv_22.ceH().ceC().ih(nim).c(aum_0.cWf().c("unknown", new Object[0])).ceD();
                }
            }
        }
        if ((n = this.iqb.fyP()) > 1) {
            ahv_22.ceH().c(aum_0.cWf().c("collect.nbPlayers", n));
        }
        return ahv_22.ceL();
    }

    private void r(bKV bKV2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bdj_2 bdj_22 = bgt_02.ddI();
        bdj_22.a(bgt_02.aZw().x(this.iqr.bqg()));
        boolean bl = true;
        int n = fqj_0.YU(this.iqb.cms());
        int n2 = bgt_02.aZw().A(this.iqr.bqg());
        if (n2 < 1 || n2 > n) {
            bkc_2.dsD().dsE();
            return;
        }
        bkc_2.dsD().dsH();
        cib_0 cib_02 = new cib_0(3, 13259, (MessageLite)yu_2.awq().jX(this.iqb.d()).jY(bKV2.bcC()).jZ(bKV2.bcD()).aww());
        aue_0.cVJ().etu().d(cib_02);
    }

    @Override
    public void run() {
        this.run(false);
    }

    @Override
    public void run(boolean bl) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!this.bxO()) {
            bkc_2.dsD().dsE();
            return;
        }
        if (this.iqr == null || !this.iqr.ecl()) {
            bkc_2.dsD().dsE();
            return;
        }
        ZH zH = bgt_02.dla();
        if (zH != null && zH == this.iqr) {
            bkc_2.dsD().dsE();
            return;
        }
        if (!cqe_1.ac(bgt_02)) {
            return;
        }
        wa_0.a(bgt_02.bcN(), bgt_02.bcO(), bgt_02.bvy());
        List<acd_1> list = wa_0.a(this.iqr.bqg(), 1, fqj_0.YU(this.iqb.cms()), false, acd_12 -> fqj_0.a(bgt_02.bcN(), acd_12.bdi(), this.iqr.aZw().bdi(), this.iqb.cms()));
        acd_1 acd_13 = bgt_02.aZw();
        boolean bl2 = list.stream().noneMatch(acd_13::equals);
        if (list.isEmpty()) {
            bNG.egl();
            bNG.a(2, new Object[0]);
            bkc_2.dsD().dsE();
            return;
        }
        if (bgt_02.ddI().bvE()) {
            bl2 = true;
        }
        if (bl2) {
            boolean bl3;
            bgt_02.ddI().m(adh_0.class);
            bgt_02.ddI().b(this.iqe);
            boolean bl4 = bl3 = acd_13.A(this.iqr.bqg()) > 2;
            if (!bgt_02.b(false, bl3, list) && !list.contains(acd_13)) {
                bgt_02.ddI().c(this.iqe);
                bNG.egl();
                bNG.a(2, new Object[0]);
                bkc_2.dsD().dsE();
            }
        } else {
            this.r(this.iqr);
        }
    }
}

