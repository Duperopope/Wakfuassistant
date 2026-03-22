/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.wakfu.client.console.command.commonIn.TurnCharacterCommand;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cUB
 */
public class cub_1
extends crt_2
implements adi_1 {
    private static final cub_1 nMN = new cub_1();
    private static final Logger nMO = Logger.getLogger(cub_1.class);
    private static final String nMP = "targetCell";
    private static final float[] nMQ = new float[]{0.9f, 0.9f, 0.9f, 0.5f};
    private bsj_0 edi;
    private final acd_1 nMR = new acd_1();
    private int bYe;
    private int bYf;
    private btq_0 nMS = new btq_0();
    private DisplayedScreenElement jUn;
    private final akc_0 nMT = new akc_0();
    private boolean nMU;
    private boolean nMV;

    public void a(bay_0 bay_02) {
        if (this.nDX != null && this.nDX.eNt() != null && this.nDX.eNt().equals(bay_02)) {
            cxq_1.eWO().a(this.nDX);
        }
    }

    public static cub_1 eSi() {
        return nMN;
    }

    public acd_1 eSj() {
        return this.nMR;
    }

    protected acd_1 eF(int n, int n2) {
        return this.a(n, n2, !cub_1.eNq(), false, this.edi);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        aam_0 aam_02 = aie_0.cfn().bmC();
        switch (aam_22.d()) {
            case 16346: {
                dcm_0 dcm_02 = (dcm_0)aam_22;
                if (this.nMS.isEnabled()) {
                    return this.f(dcm_02);
                }
                if (this.eSw()) {
                    this.h(dcm_02);
                    return false;
                }
                this.bYe = dcm_02.bqM();
                this.bYf = dcm_02.bqN();
                acd_1 acd_12 = this.a(this.bYe, this.bYf, !cub_1.eNq(), false, this.edi);
                if (!this.nMV) {
                    this.an(acd_12);
                }
                assert (this.edi != null) : "UIFightFrame uniquement pour les gens en combat. m_fight ne peut \u00eatre null";
                assert (this.edi.bag() != null) : "UIFightFrame : fight sans fightMap";
                if (acd_12 != null && this.edi != null && this.edi.ax(acd_12) == null) {
                    this.a(aam_02, acd_12, this.edi);
                }
                return false;
            }
            case 17000: {
                cub_1.c(null);
                if (this.edi != null && this.edi.bai() != null) {
                    Iterator<QQ> iterator = this.edi.bai().bdh().iterator();
                    boolean bl = false;
                    boolean bl2 = false;
                    block25: while (iterator.hasNext()) {
                        etm_0 etm_02;
                        QQ qQ = iterator.next();
                        if (!qQ.d(this.nMR.getX(), this.nMR.getY(), this.nMR.bdi()) || (etm_02 = etm_0.Sr(qQ.aeV())) == null) continue;
                        switch (etm_02) {
                            case rns: {
                                cub_1.a((baz_0)qQ);
                                bl = true;
                                continue block25;
                            }
                            case rnt: {
                                boolean bl3 = this.edi.a((bbq)qQ);
                                if (bl3) continue block25;
                                cub_1.c((bbq)qQ);
                                bl2 = true;
                                continue block25;
                            }
                            case rnz: {
                                cub_1.c((eSS)qQ);
                                bl2 = true;
                                continue block25;
                            }
                            case rnD: {
                                bbi bbi2 = (bbi)qQ;
                                switch (bbi2.fIN()) {
                                    case 4: {
                                        if (!qQ.aZw().ac(this.nMR)) continue block25;
                                        cub_1.c((eSS)qQ);
                                        bl2 = true;
                                        continue block25;
                                    }
                                }
                                continue block25;
                            }
                        }
                    }
                    if (!bl) {
                        cub_1.a(null);
                    }
                    if (!bl2) {
                        cub_1.c(null);
                    }
                }
                return false;
            }
            case 16680: {
                dcd_0 dcd_02 = (dcd_0)aam_22;
                cuk_2 cuk_22 = cuk_2.eSS();
                boolean bl = aue_0.cVJ().c(cuk_22);
                if (bl) {
                    return false;
                }
                bmx_0 bmx_02 = cuk_22.eSR();
                bmx_0 bmx_03 = dcd_02.eeW();
                if (bmx_03 == null || !dcd_02.fcb() && bmx_02.axA() != bmx_03.axA()) {
                    cuk_22.k(null);
                    cuk_22.eNl();
                    return false;
                }
                cuk_22.k(bmx_03);
                cuk_22.bW(cul_2.eST().eSH());
                cuk_22.eNa();
                cuk_22.eNk();
                return false;
            }
            case 16902: {
                Object object;
                Object object2;
                Object object3;
                ArrayList<ZH> arrayList;
                dcm_0 dcm_03 = (dcm_0)aam_22;
                if (this.nMS.isEnabled()) {
                    if (dcm_03.fch()) {
                        DisplayedScreenElement displayedScreenElement;
                        arrayList = aue_0.cVJ().cVK();
                        if (((exP)((Object)arrayList)).a(ezj_0.pty)) {
                            return false;
                        }
                        ArrayList<DisplayedScreenElement> arrayList2 = aam_02.a(dcm_03.bqM(), dcm_03.bqN(), 0.0f, aar.bZj);
                        DisplayedScreenElement displayedScreenElement2 = displayedScreenElement = arrayList2 != null && !arrayList2.isEmpty() ? arrayList2.get(0) : null;
                        if (displayedScreenElement == null) {
                            return false;
                        }
                        object3 = displayedScreenElement.brk();
                        object2 = new acd_1(((ScreenElement)object3).bsu(), ((ScreenElement)object3).bsv(), ((ScreenElement)object3).bst());
                        if (this.nMS.dIi() == btr_0.jmr) {
                            object = new ckm();
                            ((ckm)object).Z((acd_1)object2);
                            aue_0.cVJ().etu().d(object);
                        } else if (this.nMS.dIi() == btr_0.jms) {
                            object = cub_1.am((acd_1)object2);
                            cwd_2.eVe().a((cpm_1[])object);
                        } else if (this.nMS.dIi() == btr_0.jmt && ((Optional)(object = this.edi.S((acd_1)object2))).isPresent()) {
                            ckv ckv2 = new ckv();
                            ckv2.Z((acd_1)object2);
                            ckv2.c((eVi)((Object)((Optional)object).get()));
                            aue_0.cVJ().etu().d(ckv2);
                        }
                    }
                    if (agx_0.bze().eH(nMP) != null) {
                        try {
                            this.ko(true);
                        }
                        catch (Exception exception) {
                            nMO.error((Object)"Exception during onMessage for WORLD_SCENE_MOUSE_RELEASED", (Throwable)exception);
                        }
                    }
                    this.nMS.cancel();
                }
                if (this.eSw()) {
                    this.i(dcm_03);
                    return false;
                }
                arrayList = ((aIs)aam_02).cY(this.bYe, this.bYf);
                if (!arrayList.isEmpty() && dcm_03.fch()) {
                    int n = arrayList.size();
                    for (int i = 0; i < n; ++i) {
                        object3 = (ZH)arrayList.get(i);
                        if (!(object3 instanceof bdj_2) || (object = ((bdj_2)(object2 = (bdj_2)object3)).dcP()) == null || ((bgy)object).bqo() != this.edi.d()) continue;
                        cya_1.eYj().dGQ().bA((bgy)object);
                        if (bsd_1.emW() != bsd_1.lhD) break;
                        akj_0.ciY().ig(((exP)object).Sn());
                        break;
                    }
                    return false;
                }
                if (!arrayList.isEmpty() && dcm_03.fcj()) {
                    cub_1.e((List<ZH>)arrayList, this.edi.d());
                }
                return false;
            }
            case 17041: {
                this.eSl();
                return false;
            }
            case 17988: {
                this.b(btr_0.jmr);
                return false;
            }
            case 19661: {
                this.b(btr_0.jms);
                return false;
            }
            case 18906: {
                cub_1.eNs();
                return false;
            }
            case 18536: {
                return this.eSk();
            }
            case 19763: {
                cub_1.r(this.edi);
                return false;
            }
            case 16428: {
                cub_1.s(this.edi);
                return false;
            }
            case 18208: {
                boolean bl = ((ama_1)aam_22).bCu();
                cxq_1.eWO().kN(bl);
                return false;
            }
        }
        return true;
    }

    public void a(eVi eVi2, acd_1 acd_12) {
        if (acd_12 == null) {
            nMO.warn((Object)"Trying to add a fight marker but the coordinates are missing");
            return;
        }
        cku cku2 = new cku();
        cku2.Z(acd_12);
        cku2.c(eVi2);
        aue_0.cVJ().etu().d(cku2);
    }

    @NotNull
    private static cpm_1[] am(acd_1 acd_12) {
        return (cpm_1[])Arrays.stream(bts_0.values()).map(bts_02 -> {
            cqs_1 cqs_12 = new cqs_1();
            cqs_12.a((bts_0)((Object)bts_02));
            cqs_12.Z(acd_12);
            return cqs_12;
        }).toArray(cpm_1[]::new);
    }

    private boolean eSk() {
        if (this.edi != null && !this.edi.dGo().fKV()) {
            return true;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.a(ezj_0.ptA)) {
            return true;
        }
        fiq_2.gCw().d(new fik_2().l("question.giveUpFight", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1).a(fil_2.gCn().c(string -> {
            ckD ckD2 = new ckD();
            aue_0.cVJ().etu().d(ckD2);
        })).a(fil_2.gCo()));
        return false;
    }

    private boolean f(dcm_0 dcm_02) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dkZ() == null) {
            nMO.warn((Object)"Ciblage de case hors combat. On d\u00e9senclenche le mode ciblage de case");
            this.eSn();
            return false;
        }
        this.g(dcm_02);
        return false;
    }

    private DisplayedScreenElement g(dcm_0 dcm_02) {
        aam_0 aam_02 = aie_0.cfn().bmC();
        ArrayList<DisplayedScreenElement> arrayList = aam_02.a(dcm_02.bqM(), dcm_02.bqN(), 0.0f, aar.bZj);
        DisplayedScreenElement displayedScreenElement = arrayList.isEmpty() ? null : (arrayList.size() == 1 ? arrayList.get(0) : this.V(arrayList));
        if (displayedScreenElement != this.jUn) {
            if (displayedScreenElement != null) {
                this.ko(true);
                agx_0.bze().a(displayedScreenElement.brp(), nMP);
                agx_0.bze().eH(nMP).q(nMQ);
            }
            this.jUn = displayedScreenElement;
        }
        return displayedScreenElement;
    }

    @Nullable
    private DisplayedScreenElement V(ArrayList<DisplayedScreenElement> arrayList) {
        for (DisplayedScreenElement displayedScreenElement : arrayList) {
            if (!this.edi.bag().T(displayedScreenElement.bcC(), displayedScreenElement.bcD())) continue;
            return displayedScreenElement;
        }
        return null;
    }

    private void eSl() {
        this.nMS.dIh();
        this.eSm();
    }

    private void b(btr_0 btr_02) {
        boolean bl;
        boolean bl2 = bl = this.nMS.dIi() != btr_02;
        if (!bl) {
            return;
        }
        this.nMS.a(btr_02);
        this.eSm();
    }

    private void eSm() {
        if (this.nMS.isEnabled()) {
            cue_2.eSA().eSI();
            cub_1.eSq();
            if (this.eSw()) {
                this.eSy();
            }
        } else {
            this.ko(false);
        }
    }

    private void eSn() {
        this.ko(false);
        cue_2.eSA().eSI();
        this.nMS.cancel();
    }

    public boolean eSo() {
        return !this.eSp() && !this.eSw();
    }

    public boolean eSp() {
        return this.nMS.isEnabled();
    }

    private static void eSq() {
        cuk_2 cuk_22 = cuk_2.eSS();
        boolean bl = aue_0.cVJ().c(cuk_22);
        if (!bl) {
            return;
        }
        cuk_22.k(null);
        cuk_22.eNl();
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            boolean bl2;
            adn_0.bvh().a((ZH)null);
            bLe.ecw().a((ZH)null);
            afh_0.bxU().a((ZH)null);
            cxq_1.eWO().eWY();
            if (agx_0.bze().eH(nMP) == null) {
                try {
                    agx_0.bze().eF(nMP);
                }
                catch (Exception exception) {
                    nMO.error((Object)"Exception during onFrameAdd", (Throwable)exception);
                }
            }
            this.nMS.cancel();
            aUm.cUI().p("fight", true);
            aUm.cUI().p("world", false);
            bir_1.dZt().setVisible(false);
            fse_1.gFu().f("isInFight", true);
            fse_1.gFu().f("isInFightPlayerTurn", false);
            byf_2.F("is_in_fight", true);
            fse_1.gFu().f("controlCenterDisplayMode", 0);
            fyw_0.gqw().d("wakfu.fightAction", cef_1.class);
            fyw_0.gqw().d("wakfu.controlCenterFight", ceb_2.class);
            fyw_0.gqw().d("wakfu.fightCreationOrPlacement", ceg_2.class);
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (bgt_02 == null) {
                return;
            }
            blh_2 blh_22 = aue_0.cVJ().cVN();
            blh_22.edG();
            bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
            if (bsg_12.a(bsn_1.ljw) && blh_22.ede() == fqt_0.sTc) {
                blh_22.b(fqt_0.sTd);
            }
            blh_22.p((byte)fqt_0.sTd.eFS(), true);
            this.edi = bgt_02.dkZ();
            boolean bl3 = bl2 = this.edi.dGp() == etw_0.rqT && this.edi.dGo().fKT();
            if (!bl2) {
                cub_1.qx("worldAndFightBarDialog");
            }
            fse_1.gFu().f("isInFightPlacement", bl2);
            fse_1.gFu().f("isInFightCreationOrPlacement", this.edi.dGp() == etw_0.rqV || bl2);
            cty_1.ePV().kh(false);
            boolean bl4 = this.edi.dGo().fKV();
            fse_1.gFu().a("canGiveUpFight", (Object)bl4, true);
            boolean bl5 = this.edi.dGo().fLh();
            fse_1.gFu().a("fight.velocity.enable", (Object)bl5, true);
            fse_1.gFu().f("cellReportDisabled", bgt_02.a(ezj_0.pty));
            fse_1.gFu().f("lockFightDisabled", bgt_02.a(ezj_0.ptx));
            fse_1.gFu().f("callHelpDisabled", bgt_02.a(ezj_0.ptw));
            fse_1.gFu().f("hideFightersDisabled", bgt_02.a(ezj_0.ptz));
            fse_1.gFu().f("giveUpDisabled", bgt_02.a(ezj_0.ptA));
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            aIs aIs2 = (aIs)aie_0.cfn().bmC();
            aIs2.em(false);
            aIs2.en(false);
            this.nDY = null;
            this.eSs();
            this.nMV = false;
            cul_2.eST().a(null);
            this.eNr();
            agx_0.bze().eG(nMP);
            cub_1.a(null);
            cub_1.c(null);
            fse_1.gFu().f("isInFight", false);
            fse_1.gFu().f("isInFightPlacement", false);
            byf_2.F("is_in_fight", false);
            aUm.cUI().p("fight", false);
            aUm.cUI().p("world", true);
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            bir_1.dZt().setVisible(true);
            fyw_0.gqw().tc("wakfu.fightAction");
            fyw_0.gqw().tc("wakfu.controlCenterFight");
            cty_1.ePV().kh(true);
            aue_0.cVJ().r(aue_0.cVJ().cVK());
            this.edi = null;
        }
    }

    public static void c(eSS eSS2) {
        cub_1.a(eSS2, null);
    }

    public static void a(eSS eSS2, acd_1 acd_12) {
        if (eSS2 != null && !aue_0.cVJ().c(cuk_2.eSS())) {
            qu_0 qu_02 = eSS2.bci();
            if (qu_02 instanceof bgy) {
                if (acd_12 == null) {
                    aKu.ciN().a(eSS2, (bgy)qu_02);
                } else {
                    aKu.ciN().a(eSS2, (bgy)qu_02, acd_12);
                }
                return;
            }
            nMO.error(qu_02 == null ? "Owner du pi\u00e8ge est null" : "ClassCastException attendu=CharacterInfo : " + String.valueOf(qu_02.getClass()));
        }
        aKu.ciN().ciS();
    }

    public static void a(baz_0 baz_02) {
        if (baz_02 != null) {
            aKq.ciL().a(baz_02, (bgy)baz_02.bci());
        } else {
            aKq.ciL().ciT();
            aKq.ciL().ciS();
        }
    }

    public boolean eSr() {
        if (this.edi == null) {
            return false;
        }
        this.nMT.ciS();
        bgy bgy2 = (bgy)this.edi.ax(this.nMR);
        return bgy2 != null && this.nMT.j(bgy2);
    }

    public void eSs() {
        this.nMT.ciS();
    }

    public void an(acd_1 acd_12) {
        if (aue_0.cVJ().cVK().dkZ() == null) {
            nMO.warn((Object)"message recu par UIFightFrame hors combat");
            return;
        }
        if (this.edi == null) {
            return;
        }
        if (this.edi.dGp() != etw_0.rqU) {
            return;
        }
        if (acd_12 != null && !acd_12.equals(this.nMR)) {
            this.nMR.C(acd_12);
            dae_0 dae_02 = new dae_0();
            dae_02.lK(17000);
            aaw_1.bUq().h(dae_02);
        }
    }

    public bsj_0 cXk() {
        return this.edi;
    }

    public boolean eSt() {
        return this.nMV;
    }

    public void kn(boolean bl) {
        this.nMV = false;
    }

    public void i(bgy bgy2, boolean bl) {
        this.edi.dGQ().i(bgy2, bl);
    }

    private static void qx(String string) {
        fes_2 fes_22;
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        if (fhs_22 != null && (fes_22 = (fes_2)fhs_22.uH("apsContainer")) != null) {
            fes_22.setVisible(false);
        }
    }

    public int bqM() {
        return this.bYe;
    }

    public int bqN() {
        return this.bYf;
    }

    private Optional<bgy> eSu() {
        if (this.edi == null) {
            return Optional.empty();
        }
        if (this.edi.dGQ() == null) {
            return Optional.empty();
        }
        bgy bgy2 = this.edi.dGp() == etw_0.rqT ? cuh_2.eSM().eSN() : this.edi.dGQ().dIA();
        if (bgy2 == null) {
            return Optional.empty();
        }
        if (!bgy2.dkQ()) {
            return Optional.empty();
        }
        return Optional.of(bgy2);
    }

    public void eSv() {
        if (this.eSw()) {
            this.eSy();
        } else {
            this.eSx();
        }
    }

    public boolean eSw() {
        return this.nMU;
    }

    private void h(dcm_0 dcm_02) {
        Optional<bgy> optional = this.eSu();
        if (optional.isEmpty()) {
            this.eSy();
            return;
        }
        bgy bgy2 = optional.get();
        DisplayedScreenElement displayedScreenElement = this.g(dcm_02);
        if (displayedScreenElement == null) {
            return;
        }
        acd_1 acd_12 = new acd_1(displayedScreenElement.bcC(), displayedScreenElement.bcD(), displayedScreenElement.bcE());
        abi_1 abi_12 = abi_1.d(bgy2.aZw(), acd_12);
        switch (abi_12) {
            case dzo: {
                fhn_1.gzT().a(fzo_0.tHZ, true);
                break;
            }
            case dzq: {
                fhn_1.gzT().a(fzo_0.tIa, true);
                break;
            }
            case dzm: {
                fhn_1.gzT().a(fzo_0.tIb, true);
                break;
            }
            case dzk: {
                fhn_1.gzT().a(fzo_0.tIc, true);
            }
        }
    }

    private void i(dcm_0 dcm_02) {
        Optional<bgy> optional = this.eSu();
        if (optional.isEmpty()) {
            this.eSy();
            return;
        }
        if (!dcm_02.fch()) {
            this.eSy();
            return;
        }
        bgy bgy2 = optional.get();
        DisplayedScreenElement displayedScreenElement = this.g(dcm_02);
        if (displayedScreenElement == null) {
            return;
        }
        acd_1 acd_12 = new acd_1(displayedScreenElement.bcC(), displayedScreenElement.bcD(), displayedScreenElement.bcE());
        abi_1 abi_12 = abi_1.d(bgy2.aZw(), acd_12);
        if (TurnCharacterCommand.cTR()) {
            ceb_2.fightSetDirection(this.edi, abi_12);
            TurnCharacterCommand.is(100L);
            this.eSy();
        }
    }

    private void eSx() {
        cue_2.eSA().eSI();
        cub_1.eSq();
        if (this.nMS.isEnabled()) {
            this.eSn();
        }
        this.nMU = true;
    }

    private void eSy() {
        this.ko(true);
        fhn_1.gzT().bYz();
        this.nMU = false;
    }

    private void ko(boolean bl) {
        if (!bl && (this.eSp() || this.eSw())) {
            return;
        }
        agx_0.bze().eI(nMP);
    }

    public void X(@NotNull exP exP2) {
        if (exP2.dlK() == null) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null || bgt_02.bqo() != exP2.dlK().d()) {
            return;
        }
        if (!aue_0.cVJ().c(this)) {
            return;
        }
        cuk_2.eSS().eNn();
        cud_1.eSz().eNn();
        cuj_1.eSQ().eNn();
    }
}

