/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cPZ
 */
public class cpz_1
extends cpl_1 {
    private eUw njY;
    private static final int njZ = 0;
    private static final int nka = 1;
    private static final int nkb = 2;
    private static final int nkc = 3;
    private static final int nkd = 4;
    private static final int nke = 5;
    private static final int nkf = 6;
    private static final int nkg = 7;
    private final BitSet nkh = new BitSet(cqb_1.values().length);
    private boolean nki;
    private int nkj;

    cpz_1(eUw eUw2) {
        this.njY = eUw2;
    }

    @Override
    public void aH(Object object) {
        boolean bl;
        super.aH(object);
        bgy bgy2 = (bgy)this.cqO;
        if (bgy2.doP()) {
            this.a(cqb_1.nks);
            return;
        }
        if (bgy2.djT()) {
            this.a(cqb_1.nko);
            return;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        if (bgy2.i(ezj_0.put) && bdj_22.bvE()) {
            this.a(cqb_1.nkp);
            return;
        }
        if (aue_0.cVJ().cVO().bfb()) {
            this.a(cqb_1.nkB);
            return;
        }
        fse_0 fse_02 = ((fsf)fsf.gkM()).mC(bgy2.aqZ());
        boolean bl2 = bl = fse_02 != null && fse_02.eqw();
        if (!bl && this.njY == eUw.ruF) {
            this.njY = eUw.rva;
        }
        bgt_0 bgt_02 = aie_0.cfo().cVK();
        acd_1 acd_12 = bgt_02.aZw();
        boolean bl3 = wa_0.C(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        bzq_2 bzq_22 = bzp_2.eqt().mA(bgt_02.aqZ());
        if (!bzq_22.eqy() || bgy2.a(ezj_0.psz) || bl3 || this.bV(bgy2)) {
            this.a(cqb_1.nks);
            return;
        }
        if (bgy2 instanceof bhx_0) {
            this.a(bgt_02, (bhx_0)bgy2);
        } else if (bgy2 instanceof bhJ) {
            this.a(bgy2, bgt_02);
        }
    }

    private boolean bV(bgy bgy2) {
        acd_1 acd_12 = bgy2.aZw();
        boolean bl = wa_0.C(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        bl &= cpz_1.a(acd_12, acd_12.getX() + 1, acd_12.getY());
        bl &= cpz_1.a(acd_12, acd_12.getX() - 1, acd_12.getY());
        bl &= cpz_1.a(acd_12, acd_12.getX(), acd_12.getY() + 1);
        return bl &= cpz_1.a(acd_12, acd_12.getX(), acd_12.getY() - 1);
    }

    private void a(bgt_0 bgt_02, bhx_0 bhx_02) {
        Object object;
        Optional<fpv> optional;
        bzq_2 bzq_22 = bzp_2.eqt().mA(bhx_02.aqZ());
        if (bzq_22 != null && (!bzq_22.lEy || bzq_22.dYb())) {
            this.a(cqb_1.nks);
            return;
        }
        if (bhx_02.i(ezj_0.puv)) {
            if (bgt_02.i(ezj_0.puw)) {
                this.a(cqb_1.nkz);
                return;
            }
            optional = cux_0.mjE.eDE();
            if (optional.isPresent()) {
                object = (fpv)optional.get();
                int n = bgt_02.Xt();
                TIntArrayList tIntArrayList = ((fpv)object).ggK();
                if (bhx_02.i(ezj_0.puz) && tIntArrayList.contains(n)) {
                    this.a(cqb_1.nkA);
                    return;
                }
                TIntArrayList tIntArrayList2 = ((fpv)object).ggL();
                if (bhx_02.i(ezj_0.puA) && tIntArrayList2.contains(n)) {
                    this.a(cqb_1.nkA);
                    return;
                }
            }
            this.nki = true;
        }
        if ((optional = bjl_1.dri().jO(bhx_02.aXa())) != null && ((bji_1)((Object)optional)).drd()) {
            this.a(cqb_1.nkt);
            return;
        }
        if (bhx_02.a(ezj_0.psO)) {
            return;
        }
        object = bgt_02.ddI();
        anp_2 anp_22 = ((bdf_1)object).a(bhx_02.aZw(), true, true);
        if (anp_22 == sr_0.bqh) {
            this.a(cqb_1.nkm);
            return;
        }
        if (anp_22.bDU() > 25) {
            this.a(cqb_1.nkl);
        }
    }

    private void a(bgy bgy2, bgt_0 bgt_02) {
        if (this.njY == eUw.ruS) {
            this.b(bgt_02, bgy2);
        } else {
            this.c(bgt_02, bgy2);
        }
    }

    private void b(bgt_0 bgt_02, bgy bgy2) {
        bzq_2 bzq_22 = bzp_2.eqt().mA(bgy2.aqZ());
        if (bzq_22 != null && !bzq_22.lEz) {
            this.a(cqb_1.nkr);
            return;
        }
        boolean bl = bgt_02.a(ezj_0.pth);
        boolean bl2 = bgy2.a(ezj_0.pth);
        if (bl || bl2) {
            this.a(cqb_1.nkx);
            return;
        }
        boolean bl3 = bgy2.ffF().gaX();
        if (bl3) {
            this.a(cqb_1.nkx);
        }
    }

    private void c(bgt_0 bgt_02, bgy bgy2) {
        boolean bl;
        boolean bl2;
        this.nki = true;
        boolean bl3 = bgt_02.a(ezj_0.pti);
        if (bl3) {
            this.a(cqb_1.nkz);
            return;
        }
        if (bgy2.a(ezj_0.ptd)) {
            this.a(cqb_1.nky);
            return;
        }
        Optional<fpv> optional = cux_0.mjE.eDE();
        if (optional.isPresent()) {
            fpv fpv2 = optional.get();
            int n = bgt_02.Xt();
            TIntArrayList tIntArrayList = fpv2.ggK();
            if (bgy2.i(ezj_0.puz) && tIntArrayList.contains(n)) {
                this.a(cqb_1.nkA);
                return;
            }
            TIntArrayList tIntArrayList2 = fpv2.ggL();
            if (bgy2.i(ezj_0.puA) && tIntArrayList2.contains(n)) {
                this.a(cqb_1.nkA);
                return;
            }
            return;
        }
        if (bgt_02.dnG() < bgy2.dnG() - 50) {
            this.a(cqb_1.nkw);
            return;
        }
        bzq_2 bzq_22 = bzp_2.eqt().mA(bgy2.aqZ());
        bzr_2 bzr_22 = boa_2.ehn().ehq();
        boolean bl4 = bzq_22 != null && bzq_22.eqz();
        boolean bl5 = bl2 = bzr_22 != null && bzr_22.eqz();
        if (!bl4 || !bl2) {
            this.a(cqb_1.nkq);
            return;
        }
        fjn_0 fjn_02 = bgy2.ffF();
        if (bgt_02.dkC() != fpu_0.sRd && fjn_02.dkC() != fpu_0.sRd) {
            return;
        }
        boolean bl6 = bl = bgy2.ffM() != bgt_02.Xt() || !fjn_02.WC(bgt_02.Xt());
        if (bl) {
            this.a(cqb_1.nkq);
            return;
        }
    }

    @Override
    public boolean isEnabled() {
        if (!super.isEnabled()) {
            return false;
        }
        if (this.b(cqb_1.values())) {
            return false;
        }
        return this.nkj == 0;
    }

    @Override
    public boolean bxO() {
        bJr bJr2;
        int n;
        Object object;
        bzq_2 bzq_22;
        this.nkj = 0;
        Object object2 = this.cqO;
        if (!(object2 instanceof bgy)) {
            return false;
        }
        bgy bgy2 = (bgy)object2;
        if (!this.eLR()) {
            return false;
        }
        if (this.b(cqb_1.nko, cqb_1.nkx, cqb_1.nkA)) {
            return false;
        }
        object2 = aue_0.cVJ().cVK();
        if (((bgy)object2).dkG() && this.njY != eUw.ruS) {
            return false;
        }
        if (this.b(cqb_1.nkz) && ((bzq_22 = bzp_2.eqt().mA(((exP)object2).aqZ())) == null || !bzq_22.eqw())) {
            return false;
        }
        if (bgy2.doP()) {
            return false;
        }
        if (((bgt_0)object2).dnw() != null) {
            return false;
        }
        if (((bgy)object2).djT()) {
            return false;
        }
        if (((bgt_0)object2).dnj()) {
            return false;
        }
        if (bsl_0.jfZ.dFs()) {
            return false;
        }
        if (((exP)object2).b(ezj_0.psx) > 0) {
            return false;
        }
        boolean bl = bgy2 instanceof bhx_0;
        if (bl && ((exP)object2).a(ezj_0.pto)) {
            return false;
        }
        if (bgy2.a(ezj_0.psz)) {
            return false;
        }
        List<Long> list = ewo_0.oBF.o(ewr_0.oDM);
        if (bl && list.contains(bgy2.aWP())) {
            this.nkj = 6;
        }
        if (bgy2.a(ezj_0.psM)) {
            this.nkj = 1;
        }
        if (this.nki && !((bhJ)object2).a(evv_1.owZ)) {
            this.nkj = 4;
        }
        if (this.b(cqb_1.nkz)) {
            this.nkj = 7;
        }
        boolean bl2 = evg_1.osP.a(new eve_2[]{object2});
        boolean bl3 = evg_1.osQ.a(new eve_2[]{object2});
        if (!(this.njY == eUw.ruS && ((bhJ)object2).a(evv_1.oxh) || (bl2 || this.njY.fLg() != eui_0.rxU) && bl3)) {
            this.nkj = 2;
        }
        if (bgy2 instanceof bhJ) {
            object = (bhJ)bgy2;
            if (this.njY != eUw.ruS || !((bhJ)object).a(evv_1.oxh)) {
                if (this.nki && !((bhJ)object).a(evv_1.owZ)) {
                    this.nkj = 5;
                }
                n = evg_1.osP.a(new eve_2[]{object}) ? 1 : 0;
                boolean bl4 = evg_1.osQ.a(new eve_2[]{object});
                if (!bl4 || n == 0 && this.njY != eUw.ruS) {
                    this.nkj = 3;
                }
            }
        }
        if (bgy2.a(ezj_0.psF)) {
            return false;
        }
        object = ((exP)object2).ffF();
        n = object.Xt();
        bJr bJr3 = bJr2 = bl ? (bJr)bgy2.doW() : null;
        if (bJr2 != null && bJr2.gfT() == n) {
            return false;
        }
        return this.njY == null || this.njY != eUw.ruS || bgy2 instanceof bhJ;
    }

    @Override
    public void run() {
        bgy bgy2;
        bdj_2 bdj_22;
        if (!this.bxO()) {
            return;
        }
        bdj_2 bdj_23 = aue_0.cVJ().cVK().ddI();
        if (amf_1.c((amg_1)bdj_23, bdj_22 = (bgy2 = (bgy)this.cqO).ddI()) > 25) {
            return;
        }
        switch (this.njY) {
            case ruS: {
                if (aPd.a(bgy2.getName(), ejn_0.qzh)) {
                    return;
                }
                ckr ckr2 = new ckr();
                ckr2.mY(bgy2.Sn());
                ckr2.Z(bdj_22.bvI(), bdj_22.bvJ(), (short)bdj_22.getAltitude());
                ckr2.jl(((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljb));
                aue_0.cVJ().etu().d(ckr2);
                aPd.g("fight.invitation", bgy2.getName());
                break;
            }
            case ruH: {
                foP foP2 = bgy2.doW();
                if (foP2 == null) {
                    return;
                }
                aue_0.cVJ().cVK().CM(foP2.d());
                break;
            }
            default: {
                aue_0.cVJ().cVK().aE(bgy2);
            }
        }
    }

    @Override
    public cpm_1 eLD() {
        return new cpz_1(this.njY);
    }

    @Override
    public cps_1 eLz() {
        switch (this.njY) {
            case ruS: {
                return cps_1.niF;
            }
        }
        return cps_1.niy;
    }

    @Override
    protected int eLB() {
        switch (this.njY) {
            case ruS: {
                return crc_2.nnA.nnW;
            }
        }
        return crc_2.nmr.nnW;
    }

    @Override
    public String ely() {
        switch (this.njY) {
            case ruS: {
                return "duelStart";
            }
        }
        return "fightStart";
    }

    @Override
    public String getLabel() {
        if (!(this.cqO instanceof bgy)) {
            return this.ely();
        }
        String string = ((bgy)this.cqO).getName();
        ahv_2 ahv_22 = new ahv_2().ceu().ih(this.eLS().bQk());
        if (this.b(cqb_1.nkm)) {
            ahv_22.c(aum_0.cWf().c("fight.error.nopathtomonster", string));
        } else if (this.b(cqb_1.nkl)) {
            ahv_22.c(aum_0.cWf().c("fight.error.monstertoofar", string));
        } else if (this.b(cqb_1.nkn)) {
            ahv_22.c(aum_0.cWf().c("fight.error.insideGroup", new Object[0]));
        } else if (this.b(cqb_1.nko)) {
            ahv_22.c(aum_0.cWf().c("fight.error.character.inFight", string));
        } else if (this.b(cqb_1.nkq)) {
            ahv_22.c(aum_0.cWf().c("fight.error.pvpForbidden", string));
        } else if (this.b(cqb_1.nkr)) {
            ahv_22.c(aum_0.cWf().c("fight.error.duelForbidden", string));
        } else if (this.b(cqb_1.nks)) {
            ahv_22.c(aum_0.cWf().c("systemNotification.instanceConfig.cannotFight", new Object[0]));
        } else if (this.b(cqb_1.nku)) {
            ahv_22.c(aum_0.cWf().c("fight.error.not.enemy.protector", new Object[0]));
        } else if (this.b(cqb_1.nkv)) {
            ahv_22.c(aum_0.cWf().c("fight.error.target.level.too.low", new Object[0]));
        } else if (this.b(cqb_1.nkw)) {
            ahv_22.c(aum_0.cWf().c("fight.error.target.level.too.high", new Object[0]));
        } else if (this.b(cqb_1.nky)) {
            ahv_22.c(aum_0.cWf().c("fight.error.cant.be.aggro", new Object[0]));
        } else if (this.b(cqb_1.nkz)) {
            ahv_22.c(aum_0.cWf().c("fight.error.cant.aggro", new Object[0]));
        } else if (this.b(cqb_1.nkA)) {
            ahv_22.c(aum_0.cWf().c("fight.error.cant.aggro", new Object[0]));
        } else if (this.b(cqb_1.nkt)) {
            ahv_22.c(aum_0.cWf().c("fight.error.memberBusy", new Object[0]));
        } else if (this.b(cqb_1.nkp)) {
            ahv_22.c(aum_0.cWf().c("fight.error.character.unstoppable", new Object[0]));
        } else if (this.b(cqb_1.nkB)) {
            ahv_22.c(aum_0.cWf().c("security.impossible.action.account.locked", new Object[0]));
        } else {
            switch (this.njY) {
                case ruS: {
                    ahv_22.c(aum_0.cWf().c("fight.duel.with", string));
                    break;
                }
                case ruF: {
                    ahv_22.c(aum_0.cWf().c("fight.pvp.with", string));
                    break;
                }
                default: {
                    ahv_22.c(aum_0.cWf().c("fight.with", string));
                }
            }
        }
        ahv_22.cev();
        if (this.nkj != 0) {
            switch (this.nkj) {
                case 1: {
                    return ahv_22.ceH().ih(nim).c(aum_0.cWf().c("fight.error.protector.attacked.too.recenlty", string)).ceL();
                }
                case 2: {
                    return ahv_22.ceH().ih(nim).c(aum_0.cWf().c("error.playerNotSubscribed", new Object[0])).ceL();
                }
                case 4: {
                    return ahv_22.ceH().ih(nim).c(aum_0.cWf().c("error.playerNotSubscriptionRight", new Object[0])).ceL();
                }
                case 5: {
                    return ahv_22.ceH().ih(nim).c(aum_0.cWf().c("error.targetNotSubscriptionRight", new Object[0])).ceL();
                }
                case 3: {
                    return ahv_22.ceH().ih(nim).c(aum_0.cWf().c("error.targetNotSubscribed", new Object[0])).ceL();
                }
                case 6: {
                    return ahv_22.ceH().ih(nim).c(aum_0.cWf().c("fight.error.monster.protected", new Object[0])).ceL();
                }
            }
        }
        return ahv_22.ceL();
    }

    @Override
    @Nullable
    public String eLv() {
        String string;
        String string2;
        ahv_2 ahv_22 = new ahv_2();
        if (this.isEnabled()) {
            switch (this.njY) {
                case ruF: {
                    ahv_22.ceC().e(awx_2.dnJ).c(aum_0.cWf().c("pvp.canGainPointsWithFight", new Object[0])).ceD();
                }
            }
        }
        if ((string2 = super.eLv()) != null) {
            if (!ahv_22.toString().isEmpty()) {
                ahv_22.ceH();
            }
            ahv_22.c(string2);
        }
        return (string = ahv_22.ceL()).isEmpty() ? null : string;
    }

    @Override
    public List<flv_0> euZ() {
        Object object;
        qe_0 qe_02;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        ArrayList<exP> arrayList = new ArrayList<exP>();
        exP exP2 = (exP)this.cqO;
        if (this.cqO instanceof bhx_0) {
            qe_02 = (bhx_0)this.cqO;
            object = bjl_1.dri().jO(((bhx_0)qe_02).aXa());
            if (object == null) {
                return Collections.emptyList();
            }
            for (bjk_1 object2 : ((bji_1)object).dre()) {
                bgy bgy2 = bgg_0.dlO().ju(object2.Sn());
                if (bgy2 == null) continue;
                arrayList.add(bgy2);
            }
        } else {
            arrayList.add(exP2);
        }
        qe_02 = bTj.eno().doD();
        object = new fmO(bgt_02, this.njY, bgt_02, exP2, qe_02 == null ? null : ((bJr)qe_02).eaH(), arrayList);
        List<flv_0> list = ((flx_0)object).gdj();
        if (this.njY == eUw.ruS) {
            fmS fmS2 = new fmS(bgt_02);
            list.addAll(fmS2.gdj());
        }
        return list;
    }

    @Override
    public List<flv_0> eva() {
        Object object2;
        Object object3;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        ArrayList<exP> arrayList = new ArrayList<exP>();
        exP exP2 = (exP)this.cqO;
        fmt_0 fmt_02 = new fmt_0(bgt_02);
        if (this.cqO instanceof bhx_0) {
            object3 = (bhx_0)this.cqO;
            if (cpz_1.eLw() == fkc_0.sAp) {
                object2 = bjl_1.dri().jO(((bhx_0)object3).aXa());
                if (object2 == null) {
                    return Collections.emptyList();
                }
                for (bjk_1 object4 : ((bji_1)object2).dre()) {
                    int n;
                    boz_2 boz_22;
                    bgy bgy2 = bgg_0.dlO().ju(object4.Sn());
                    if (bgy2 == null) continue;
                    arrayList.add(bgy2);
                    if (fmt_02.gdJ() == fmU.sHz || (boz_22 = boc_2.eht().IE(((bhx_0)object3).doQ().cqy())) == null || !boz_22.ehc() || boz_22.ehd() || (n = boz_22.ehe()) == 0) continue;
                    fmt_02.a(n > 0 ? fmU.sHz : fmU.sHy);
                }
            }
        } else {
            arrayList.add(exP2);
        }
        object3 = new fmR(bgt_02, this.njY, bgt_02);
        object2 = new fmz_0(bgt_02, this.njY);
        fmQ fmQ2 = new fmQ(bgt_02, exP2, 0, 1, this.njY);
        ArrayList<flv_0> arrayList2 = new ArrayList<flv_0>();
        arrayList2.addAll(((flx_0)object3).gdj());
        arrayList2.addAll(((flx_0)object2).gdj());
        arrayList2.addAll(fmQ2.gdj());
        arrayList2.addAll(fmt_02.gdj());
        return arrayList2;
    }

    private void a(cqb_1 ... cqb_1Array) {
        for (cqb_1 cqb_12 : cqb_1Array) {
            this.nkh.set(cqb_12.ordinal(), true);
        }
    }

    private boolean b(cqb_1 ... cqb_1Array) {
        for (cqb_1 cqb_12 : cqb_1Array) {
            if (!this.nkh.get(cqb_12.ordinal())) continue;
            return true;
        }
        return false;
    }

    private boolean eLR() {
        eUw eUw2 = bsV.a(aue_0.cVJ().cVK(), (exP)this.cqO);
        return eUw2 == this.njY;
    }

    private axb_2 eLS() {
        if (this.b(cqb_1.nkm, cqb_1.nkl, cqb_1.nkn, cqb_1.nko, cqb_1.nkq, cqb_1.nkr, cqb_1.nkt, cqb_1.nks, cqb_1.nku, cqb_1.nky, cqb_1.nkz, cqb_1.nkA, cqb_1.nkp, cqb_1.nkv, cqb_1.nkw)) {
            return awx_2.dnJ;
        }
        return awx_2.dnF;
    }

    private static boolean a(acd_1 acd_12, int n, int n2) {
        short s = wa_0.w(n, n2, acd_12.bdi());
        if (s == Short.MIN_VALUE) {
            return true;
        }
        return wa_0.C(n, n2, s);
    }
}

