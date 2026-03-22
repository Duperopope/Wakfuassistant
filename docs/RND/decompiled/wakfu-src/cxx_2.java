/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Random;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cXX
 */
public class cxx_2
implements adi_1,
blj_2 {
    private static final cxx_2 nXv = new cxx_2();
    private static final Logger nXw = Logger.getLogger(cxx_2.class);
    blh_2 ieQ;
    private final TIntObjectHashMap<fey_2> nXx = new TIntObjectHashMap();
    private final aea_1 nXy = aez_12 -> this.ieQ.edE();
    private boolean dgm = false;

    public static cxx_2 eXH() {
        return nXv;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        switch (aam_22.d()) {
            case 18337: {
                int n;
                dae_0 dae_02 = (dae_0)aam_22;
                Object t = dae_02.bCv();
                if (t instanceof bfF) {
                    n = ((bfF)t).wp();
                } else if (t instanceof blb_2 && ((fqr_0)t).gih() == fqu_0.sTv) {
                    n = ((RT)t).avr();
                } else {
                    return false;
                }
                cvu_2.eTO().L(bgt_02.Sn(), n);
                return false;
            }
            case 17585: {
                blb_2 blb_22 = (blb_2)((dae_0)aam_22).bCv();
                if (blb_22.gih() != fqu_0.sTw) {
                    return false;
                }
                ctb_2.a(blb_22.avr(), bgt_02);
                return false;
            }
            case 16366: {
                aue_0.cVJ().b(this);
                return false;
            }
            case 17640: {
                this.n(abi_1.dzq);
                return false;
            }
            case 19284: {
                this.n(abi_1.dzo);
                return false;
            }
            case 18112: {
                this.n(abi_1.dzk);
                return false;
            }
            case 19740: {
                this.n(abi_1.dzm);
                return false;
            }
            case 18027: {
                if (fyw_0.gqw().to("osamodasSymbiotDialog")) {
                    aue_0.cVJ().b(cxo_2.eWM());
                } else if (aue_0.cVJ().cVK().dmN() != null) {
                    aue_0.cVJ().a(cxo_2.eWM());
                }
                return false;
            }
            case 19934: {
                aef_2 aef_22;
                dcz dcz2 = (dcz)aam_22;
                bgt_02 = dcz2.KU() != 0L ? (bgt_0)fcL.rUh.sw(dcz2.KU()) : aue_0.cVJ().cVK();
                if (bgt_02 == null) {
                    return false;
                }
                blh_2 blh_22 = bgt_02.dlG();
                Object object = dcz2.fbU();
                boolean bl = dcz2.bCu();
                boolean bl2 = dcz2.fbY();
                boolean bl3 = bgt_02.i(ezj_0.ptq);
                if (bl3 && !bl2) {
                    return false;
                }
                if (object == null) {
                    return false;
                }
                int n = dcz2.fbV();
                byte by = dcz2.fbW();
                int n2 = dcz2.Lz();
                blb_2 blb_23 = null;
                fqt_0 fqt_02 = blh_22.ede();
                if (n2 != -1 && n != -1 && (blb_23 = blh_22.cm((byte)n).cc((short)n2)) != null) {
                    blb_23 = (blb_2)blb_23.bfg();
                }
                int n3 = dcz2.fbX();
                fqt_0 fqt_03 = null;
                blb_2 blb_24 = null;
                if (object instanceof bmx_0) {
                    fqt_03 = fqt_0.sTd;
                    aef_22 = (bmx_0)object;
                    blb_24 = blb_2.a(fqu_0.sTq, ((fqE)((Object)aef_22)).LV(), ((fqE)((Object)aef_22)).avr(), ((bmx_0)aef_22).aVt());
                } else if (object instanceof blb_2) {
                    blb_24 = (blb_2)object;
                    if (blb_24.gih() == fqu_0.sTt) {
                        aef_22 = fgD.fXh().Vd(2145);
                        if (blb_24.avr() != ((fhc_0)((Object)aef_22)).d()) {
                            ffV ffV2 = bgt_02.dmL().a(bgt_02.dnP(), ffS.gj((byte)(-(blb_24.LV() + 1L))));
                            fqt_0 fqt_04 = fqt_03 = ffV2.fAu() ? fqt_0.sTc : fqt_0.sTd;
                            if (ffV2.apo()) {
                                blb_24 = blb_2.a(fqu_0.sTs, ffV2.LV(), ffV2.avr(), ffV2.aVt());
                                if (ffV2.isUsable()) {
                                    blb_24.bi((byte)2);
                                } else {
                                    blb_24.bi((byte)3);
                                }
                            }
                        }
                    }
                } else if (object instanceof ffV) {
                    aef_22 = (ffV)object;
                    fqt_03 = fqt_0.sTc;
                    if (bgt_02.dno().x((RT)((Object)aef_22)) != null) {
                        if (((ffV)aef_22).dOg().dGh().fZq().length > 0) {
                            blb_24 = blb_2.a(fqu_0.sTs, ((ffV)aef_22).LV(), ((ffV)aef_22).avr(), ((ffV)aef_22).aVt());
                            blb_24.bi((byte)0);
                        } else if (((ffV)aef_22).isUsable()) {
                            blb_24 = blb_2.a(fqu_0.sTr, ((ffV)aef_22).LV(), ((ffV)aef_22).avr(), ((ffV)aef_22).aVt());
                            blb_24.bi((byte)4);
                        } else {
                            blb_24 = blb_2.a(fqu_0.sTs, ((ffV)aef_22).LV(), ((ffV)aef_22).avr(), ((ffV)aef_22).aVt());
                            blb_24.bi((byte)0);
                        }
                    } else if (bgt_02.dmL().tz(((ffV)aef_22).LV()) != null) {
                        blb_24 = blb_2.a(fqu_0.sTs, ((ffV)aef_22).LV(), ((ffV)aef_22).avr(), ((ffV)aef_22).aVt());
                        if (((ffV)aef_22).isUsable()) {
                            blb_24.bi((byte)2);
                        } else {
                            blb_24.bi((byte)3);
                        }
                    } else {
                        blb_24 = null;
                    }
                } else if (object instanceof bgp_1) {
                    aef_22 = ((bgp_1)object).getItem();
                    if (bgt_02.dmL().tz(((ffV)aef_22).LV()) != null) {
                        blb_24 = blb_2.a(fqu_0.sTs, ((ffV)aef_22).LV(), ((ffV)aef_22).avr(), ((ffV)aef_22).aVt());
                        if (((ffV)aef_22).isUsable()) {
                            blb_24.bi((byte)2);
                        } else {
                            blb_24.bi((byte)3);
                        }
                    }
                } else if (object instanceof bbi_0) {
                    fqt_03 = fqt_0.sTc;
                    aef_22 = (bbi_0)object;
                    blb_24 = blb_2.a(fqu_0.sTu, new Random().nextLong(), ((bbi_0)aef_22).d(), ((bbi_0)aef_22).d());
                } else if (object instanceof bfF) {
                    fqt_03 = fqt_0.sTc;
                    aef_22 = (bfF)object;
                    if (((bfF)aef_22).KU() != fcK.rUe.sq(bbs_2.xl())) {
                        return false;
                    }
                    blb_24 = blb_2.a(fqu_0.sTv, ((bfF)aef_22).wp(), ((bfF)aef_22).wp(), ((bfF)aef_22).dhd().ws());
                } else if (object instanceof blZ) {
                    fqt_03 = fqt_0.sTc;
                    aef_22 = (blZ)object;
                    int n4 = bjf_1.a(((blZ)aef_22).bnd(), bgt_02);
                    blb_24 = blb_2.a(fqu_0.sTw, ((blZ)aef_22).BJ(), ((blZ)aef_22).BJ(), n4);
                }
                if (fqt_03 != null && blh_22.ede() != fqt_03) {
                    blh_22.b(fqt_03);
                    n2 = -1;
                    n = -1;
                }
                if (!blh_22.a(blb_24, n, (short)n2)) {
                    if (blb_23 != null && n3 != -1) {
                        blh_22.a(blb_23, n, (short)n2);
                    }
                    if (blb_24 != null) {
                        blb_24.aZp();
                    }
                    if (bl3) {
                        blh_22.b(fqt_02);
                    }
                    return false;
                }
                if (blb_23 != null && n3 != -1) {
                    aef_22 = blb_2.a(blb_23.gih(), blb_23.LV(), blb_23.avr(), blb_23.gii());
                    blh_22.a((blb_2)aef_22, (int)by, (short)n3);
                }
                if (bl) {
                    cAY.eHc().nP(600053L);
                }
                if (bl3) {
                    blh_22.b(fqt_02);
                }
                return false;
            }
            case 17548: {
                dcz dcz3 = (dcz)aam_22;
                int n = dcz3.fbV();
                int n5 = dcz3.Lz();
                boolean bl = dcz3.fbY();
                boolean bl4 = bgt_02.i(ezj_0.ptq);
                if (bl4 && !bl) {
                    return false;
                }
                this.ieQ.b(n, (short)n5, false);
                cAY.eHc().nP(600059L);
                return false;
            }
            case 19419: {
                dcz dcz4 = (dcz)aam_22;
                Object object = dcz4.fbU();
                boolean bl = dcz4.fbY();
                boolean bl5 = bgt_02.i(ezj_0.ptq);
                if (bl5 && !bl) {
                    return false;
                }
                if (object instanceof blb_2) {
                    this.ieQ.b((blb_2)object, dcz4.fbV(), (short)dcz4.Lz());
                }
                cAY.eHc().eHs();
                return false;
            }
            case 19450: {
                this.ieQ.edu();
                this.eXK();
                return false;
            }
            case 17621: {
                this.ieQ.edv();
                this.eXK();
                return false;
            }
            case 17716: {
                fqt_0 fqt_05 = this.ieQ.ede();
                this.ieQ.a(fqt_05 == fqt_0.sTc ? fqt_0.sTd : fqt_0.sTc, true);
                return false;
            }
            case 19433: {
                dae_0 dae_03 = (dae_0)aam_22;
                byte by = (byte)(this.ieQ.ede().eFS() + dae_03.bCn());
                this.ieQ.p(by, true);
                return false;
            }
            case 19029: {
                dae_0 dae_04 = (dae_0)aam_22;
                byte by = dae_04.bCn();
                byte by2 = (byte)(by - this.ieQ.ede().eFS());
                this.ei(by2);
                return false;
            }
            case 19637: {
                dae_0 dae_05 = (dae_0)aam_22;
                bsj_0 bsj_02 = bgt_02.dkZ();
                if (bsj_02 != null && bsj_02.dGp() != etw_0.rqT) {
                    return false;
                }
                int n = dae_05.bCo();
                byte by = dae_05.bCn();
                frb frb2 = new frb();
                long l = bgt_02.Sn();
                if (frb2.a(l, n, bgt_02.djx(), (int)by)) {
                    cnX cnX2 = new cnX(l, n, bgt_02.djx(), by);
                    aue_0.cVJ().etu().d(cnX2);
                    bMV.a(bgt_02.dnM(), bgt_02.dkB(), bgt_02.dlG());
                    if (cvu_2.eQx()) {
                        cvu_2.eTO().eUh();
                    }
                }
                return false;
            }
            case 19940: {
                if (this.ieQ.ede() == fqt_0.sTd) {
                    return false;
                }
                blk_2.edK();
                return false;
            }
        }
        return true;
    }

    private static boolean as(bgt_0 bgt_02) {
        return bgt_02 != null && bgt_02.djT();
    }

    private void n(abi_1 abi_12) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!bgt_02.djT()) {
            return;
        }
        ciJ ciJ2 = new ciJ(abi_12);
        aue_0.cVJ().etu().d(ciJ2);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void ei(byte by) {
        if (cxx_2.as(aue_0.cVJ().cVK())) {
            return;
        }
        blg_2 blg_22 = this.ieQ.cl(by);
        if (blg_22 == null) {
            return;
        }
        if (!blg_22.edc()) {
            this.ek(by);
        } else {
            this.r(by, true);
        }
    }

    public void eXI() {
        byte by = this.ieQ.ede().fnx();
        for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
            this.ek(by2);
        }
    }

    public void eXJ() {
        byte by = this.ieQ.ede().fnx();
        for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
            this.r(by2, false);
        }
    }

    private void ej(byte by) {
        blg_2 blg_22 = this.ieQ.cl(by);
        if (blg_22 == null) {
            return;
        }
        if (!blg_22.edc()) {
            nXw.error((Object)("Tried to restore a Shortcut bar that was not supposed to be open :" + by));
            return;
        }
        this.a(by, blg_22);
    }

    private void a(byte by, blg_2 blg_22) {
        String string;
        String string2;
        String string3;
        block5: {
            string3 = blg_22.isVertical() ? "verticalSecondaryShortcutBarDialog" : "secondaryShortcutBarDialog";
            string2 = string3 + by;
            if (fyw_0.gqw().to(string2)) {
                return;
            }
            string = null;
            try {
                if (this.nXx.isEmpty()) break block5;
                int n = 0;
                do {
                    fey_2 fey_22;
                    if ((fey_22 = (fey_2)this.nXx.get(n)) == null || fey_22.isUnloading() || fey_22.getUserDefinedManager().gGG()) continue;
                    string = fey_22.getElementMap().getId();
                    break;
                } while ((n = (int)((byte)(n + 1))) < this.nXx.size());
            }
            catch (Exception exception) {
                nXw.error((Object)"Erreur au contr\u00f4le du placement d'une barre de raccourci secondaire");
                return;
            }
        }
        fey_2 fey_23 = string != null ? (fey_2)fyw_0.gqw().a(string2, ccj_2.pe(string3), null, string, string3, 40960L) : (fey_2)fyw_0.gqw().a(string2, ccj_2.pe(string3), 40960L);
        fey_23.setHorizontalDialog("secondaryShortcutBarDialog");
        fey_23.setVerticalDialog("verticalSecondaryShortcutBarDialog");
        if (!this.nXx.contains((int)by)) {
            this.nXx.put((int)by, (Object)fey_23);
        }
        fkj_2.gCW().a(fey_23, false);
        fse_1.gFu().a("shortcutBar", (Object)blg_22, fey_23.getElementMap());
    }

    public void ek(byte by) {
        blg_2 blg_22 = this.ieQ.cl(by);
        if (blg_22 == null || blg_22.edc()) {
            return;
        }
        this.a(by, blg_22);
        this.ieQ.edD();
        blg_22.hW(true);
        this.eXL();
    }

    public void r(byte by, boolean bl) {
        if (this.ieQ == null) {
            return;
        }
        blg_2 blg_22 = this.ieQ.cl(by);
        if (blg_22 == null || !blg_22.edc()) {
            return;
        }
        String string = (blg_22.isVertical() ? "verticalSecondaryShortcutBarDialog" : "secondaryShortcutBarDialog") + by;
        if (fyw_0.gqw().to(string)) {
            fyw_0.gqw().J(string, true);
        }
        blg_22.hW(false);
        if (bl) {
            this.eXL();
        }
    }

    public void s(byte by, boolean bl) {
        fqt_0 fqt_02 = this.ieQ.ede();
        blg_2 blg_22 = this.ieQ.c(fqt_02, by);
        if (blg_22 == null) {
            return;
        }
        blg_22.setVertical(bl);
        this.eXL();
    }

    public void eXK() {
        fqt_0 fqt_02;
        if (this.ieQ != null && (fqt_02 = this.ieQ.ede()) != null) {
            byte by = fqt_02.fnx();
            for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
                this.el(by2);
            }
        }
    }

    public void el(byte by) {
        blg_2 blg_22 = this.ieQ.cl(by);
        if (blg_22 == null) {
            return;
        }
        String string = blg_22.isVertical() ? "verticalSecondaryShortcutBarDialog" : "secondaryShortcutBarDialog";
        String string2 = string + by;
        if (!blg_22.edc()) {
            fyw_0.gqw().tl(string2);
            return;
        }
        if (blg_22.edc() && !fyw_0.gqw().to(string2)) {
            fyw_0.gqw().az(string2, ccj_2.pe(string));
        }
        if (fyw_0.gqw().to(string2)) {
            fse_1.gFu().b("shortcutBar", blg_22, string2);
        }
    }

    public void d(fqt_0 fqt_02) {
        if (fqt_02 != null) {
            byte by = fqt_02.fnx();
            for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
                this.d(fqt_02, by2);
            }
        }
    }

    public void d(fqt_0 fqt_02, byte by) {
        if (this.ieQ == null) {
            return;
        }
        blg_2 blg_22 = this.ieQ.cl(by);
        blg_2 blg_23 = this.ieQ.c(fqt_02, by);
        if (blg_22 == null) {
            return;
        }
        String string = blg_23.isVertical() ? "verticalSecondaryShortcutBarDialog" : "secondaryShortcutBarDialog";
        String string2 = string + by;
        if (!blg_22.edc() && blg_23.edc() || blg_23.isVertical() != blg_22.isVertical()) {
            fyw_0.gqw().tl(string2);
        }
        String string3 = blg_22.isVertical() ? "verticalSecondaryShortcutBarDialog" : "secondaryShortcutBarDialog";
        String string4 = string3 + string2;
        if (blg_22.edc() && !fyw_0.gqw().to(string4)) {
            this.a(by, blg_22);
        }
    }

    public void eXL() {
        byte by = fqt_0.giq();
        if (by > 32) {
            nXw.error((Object)("Could not save shortcut bar preferences as it would overflow. Information size : " + by));
            return;
        }
        boolean[] blArray = new boolean[by];
        for (fqt_0 fqt_02 : fqt_0.gip()) {
            byte by2 = 0;
            byte by3 = 0;
            byte by4 = fqt_02.fnx();
            while (by2 < by4) {
                blg_2 blg_22 = this.ieQ.c(fqt_02, by2);
                if (blg_22 != null) {
                    blArray[by3 + fqt_02.gil()] = blg_22.edc();
                    blArray[by3 + fqt_02.gil() + 1] = blg_22.isVertical();
                }
                by2 = (byte)(by2 + 1);
                by3 = (byte)(by3 + 2);
            }
        }
        int n = 0;
        int n2 = blArray.length;
        for (int i = 0; i < n2; ++i) {
            if (blArray[i]) {
                n |= 1 << i;
                continue;
            }
            n &= ~(1 << i);
        }
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.liB, n);
    }

    public void a(blh_2 blh_22) {
        if (!this.dgm) {
            return;
        }
        if (this.ieQ != null && blh_22 != null) {
            ArrayList<blg_2> arrayList = this.ieQ.hY(false);
            blh_22.a(this);
            if (arrayList != null) {
                for (blg_2 blg_22 : arrayList) {
                    blh_22.cm(blg_22.deO()).hW(blg_22.edc());
                }
            }
        }
        this.ieQ = blh_22;
        fse_1.gFu().f("shortcutBarManager", this.ieQ);
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!this.dgm) {
            this.dgm = true;
            bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
            this.a(aue_0.cVJ().cVK().dlG());
            this.ieQ.a(this);
            int n = GC.a(bsg_12.d(bsn_1.liG), 1, (int)fqt_0.sTc.fnx());
            this.ieQ.HZ(n);
            fqt_0 fqt_02 = fqt_0.valueOf(bsg_12.f(bsn_1.liD));
            bsn_1 bsn_12 = fqt_02 == fqt_0.sTd ? bsn_1.liE : bsn_1.liF;
            byte by = (byte)bsg_12.d(bsn_12);
            fqt_0 fqt_03 = this.ieQ.ede();
            if (fqt_03 != fqt_02) {
                this.ieQ.b(fqt_02, by);
            } else {
                this.ieQ.p(by, true);
            }
            bsn_1.lkr.a(bsg_12, this.nXy);
            blk_2.ib(false);
            fyw_0.gqw().a(new cxy_1(this));
            fse_1.gFu().f("loadingShortcutBar", true);
            ccj_2.g("shortcutBarDialog", 270336L);
            bsj_0 bsj_02 = aue_0.cVJ().cVK().dkZ();
            if (bsj_02 != null && bsj_02.dGQ().dIA() == aue_0.cVJ().cVK()) {
                aue_0.cVJ().a(cua_1.eSg());
            }
            fyw_0.gqw().d("wakfu.shortcutBar", cgw_2.class);
            fyw_0.gqw().d("wakfu.osamodasSymbiot", cgb_2.class);
            try {
                int n2 = bsg_12.d(bsn_1.liB);
                int n3 = Math.min(32, fqt_0.giq());
                boolean[] blArray = new boolean[n3];
                for (int i = 0; i < n3; ++i) {
                    blArray[i] = (n2 >> i & 1) == 1;
                }
                for (fqt_0 fqt_04 : fqt_0.gip()) {
                    byte by2 = 0;
                    byte by3 = 0;
                    byte by4 = fqt_04.fnx();
                    while (by2 < by4) {
                        blg_2 blg_22 = this.ieQ.c(fqt_04, by2);
                        int n4 = by3 + fqt_04.gil();
                        blg_22.hW(blArray[n4]);
                        blg_22.setVertical(blArray[n4 + 1]);
                        by2 = (byte)(by2 + 1);
                        by3 = (byte)(by3 + 2);
                    }
                }
                ArrayList<blg_2> arrayList = this.ieQ.hY(false);
                for (int n5 = 0; n5 < arrayList.size(); n5 = (byte)(n5 + 1)) {
                    if (!((blg_2)arrayList.get(n5)).edc()) continue;
                    this.ej((byte)n5);
                }
            }
            catch (RuntimeException runtimeException) {
                nXw.error((Object)"Unable to load shortcut bar preferences", (Throwable)runtimeException);
            }
            cdv_0.euj().d(this);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (this.dgm) {
            this.nXx.clear();
            this.eXJ();
            bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
            bsn_1.lkr.b(bsg_12, this.nXy);
            fyw_0.gqw().tc("wakfu.shortcutBar");
            fyw_0.gqw().tc("wakfu.osamodasSymbiot");
            aue_0.cVJ().b(cua_1.eSg());
            fyw_0.gqw().tl("shortcutBarDialog");
            this.ieQ = null;
            this.dgm = false;
            cdv_0.euj().e(this);
        }
    }

    @Override
    public void c(fqt_0 fqt_02) {
        switch (fqt_02) {
            case sTd: {
                for (byte by = 4; by < 4; by = (byte)(by + 1)) {
                    blg_2 blg_22 = this.ieQ.cm(by);
                    if (!blg_22.edc()) continue;
                    String string = (blg_22.isVertical() ? "verticalSecondaryShortcutBarDialog" : "secondaryShortcutBarDialog") + by;
                    fyw_0.gqw().tl(string);
                }
                break;
            }
            case sTc: {
                blk_2.edM();
                for (byte by = 4; by < 4; by = (byte)(by + 1)) {
                    blg_2 blg_23 = this.ieQ.cm(by);
                    if (!blg_23.edc()) continue;
                    String string = blg_23.isVertical() ? "verticalSecondaryShortcutBarDialog" : "secondaryShortcutBarDialog";
                    String string2 = string + by;
                    fyw_0.gqw().a(string2, ccj_2.pe(string), 40960L);
                }
                break;
            }
        }
    }

    @Nullable
    public blh_2 dlG() {
        return this.ieQ;
    }
}

