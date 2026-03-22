/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bSG
 */
public class bsg_1
extends aez_0<bsy_1, bsz_2>
implements aec_1 {
    public static final String lhU = "languageIcon";
    protected static final Logger lhV = Logger.getLogger(bsg_1.class);
    private static final short lhW = 22;
    public static final String lhX = "chatWindowModulationColor";
    public static final String lhY = "availableRelicAuraMode";
    public static final String lhZ = "availableTitleColorMode";
    public static final String lia = "autoRunModes";
    private static final String[] lib = new String[]{"chatWindowModulationColor", "availableRelicAuraMode", "availableTitleColorMode"};
    protected final fcM<bgt_0> lic = new bsh_1(this);
    final FileFilter lid = new bsi_1(this);

    public bsg_1() {
        fcL.rUh.a(this.lic);
    }

    @Override
    public afe et(String string) {
        afe afe2 = bsn_1.ew(string);
        return afe2 != null ? afe2 : super.et(string);
    }

    @Override
    public String[] bxk() {
        String[] stringArray = super.bxk();
        bsn_1[] bsn_1Array = bsn_1.values();
        String[] stringArray2 = new String[stringArray.length + bsn_1Array.length + lib.length];
        System.arraycopy(stringArray, 0, stringArray2, 0, stringArray.length);
        int n = stringArray.length;
        for (bsn_1 bsn_12 : bsn_1Array) {
            stringArray2[n] = bsn_12.getKey();
            ++n;
        }
        System.arraycopy(lib, 0, stringArray2, stringArray.length + bsn_1Array.length, lib.length);
        return stringArray2;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lhU)) {
            Mv mv = aum_0.cWf().aUXX();
            try {
                return String.format(auc_0.cVq().bS("langIconsPath"), mv.aUK().toUpperCase());
            }
            catch (fu_0 fu_02) {
                lhV.warn((Object)fu_02.getMessage());
                return null;
            }
        }
        if (string.equals(aff.cpI.getKey())) {
            Mv mv = aum_0.cWf().aUXX();
            return mv != null ? mv.aUK() : null;
        }
        if (string.equals(bsn_1.liw.getKey())) {
            return this.a(bsn_1.liw);
        }
        if (string.equals(bsn_1.lix.getKey())) {
            return this.f(bsn_1.lix);
        }
        if (string.equals(bsn_1.liJ.getKey())) {
            return this.a(bsn_1.liJ);
        }
        if (string.equals(bsn_1.liK.getKey())) {
            return this.a(bsn_1.liK);
        }
        if (string.equals(bsn_1.liI.getKey())) {
            return bsm_1.cS((byte)this.d(bsn_1.liI));
        }
        if (string.equals(bsn_1.liL.getKey())) {
            return this.a(bsn_1.liL);
        }
        if (string.equals(bsn_1.liM.getKey())) {
            return this.a(bsn_1.liM);
        }
        if (string.equals(bsn_1.liN.getKey())) {
            return this.a(bsn_1.liN);
        }
        if (string.equals(bsn_1.liX.getKey())) {
            return this.a(bsn_1.liX);
        }
        if (string.equals(bsn_1.liO.getKey())) {
            return this.a(bsn_1.liO);
        }
        if (string.equals(bsn_1.liP.getKey())) {
            return this.a(bsn_1.liP);
        }
        if (string.equals(bsn_1.liQ.getKey())) {
            return this.a(bsn_1.liQ);
        }
        if (string.equals(bsn_1.liY.getKey())) {
            return this.a(bsn_1.liY);
        }
        if (string.equals(bsn_1.liZ.getKey())) {
            return this.a(bsn_1.liZ);
        }
        if (string.equals(bsn_1.lja.getKey())) {
            return this.a(bsn_1.lja);
        }
        if (string.equals(bsn_1.ljb.getKey())) {
            return this.a(bsn_1.ljb);
        }
        if (string.equals(bsn_1.ljc.getKey())) {
            return aKj.aP((byte)this.d(bsn_1.ljc));
        }
        if (string.equals(bsn_1.ljd.getKey())) {
            return aKj.values();
        }
        if (string.equals(bsn_1.lje.getKey())) {
            return this.a(bsn_1.lje);
        }
        if (string.equals(bsn_1.ljf.getKey())) {
            return this.a(bsn_1.ljf);
        }
        if (string.equals(bsn_1.ljg.getKey())) {
            return this.a(bsn_1.ljg);
        }
        if (string.equals(bsn_1.ljh.getKey())) {
            return this.a(bsn_1.ljh);
        }
        if (string.equals(bsn_1.lji.getKey())) {
            return this.a(bsn_1.lji);
        }
        if (string.equals(bsn_1.ljj.getKey())) {
            return this.a(bsn_1.ljj);
        }
        if (string.equals(bsn_1.ljl.getKey())) {
            return fzh_0.aaw(this.d(bsn_1.ljl));
        }
        if (string.equals(bsn_1.ljm.getKey())) {
            return this.a(bsn_1.ljm);
        }
        if (string.equals(bsn_1.ljn.getKey())) {
            return this.a(bsn_1.ljn);
        }
        if (string.equals(bsn_1.ljo.getKey())) {
            return this.a(bsn_1.ljo);
        }
        if (string.equals(bsn_1.ljp.getKey())) {
            return this.a(bsn_1.ljp);
        }
        if (string.equals(bsn_1.ljq.getKey())) {
            return this.a(bsn_1.ljq);
        }
        if (string.equals(bsn_1.ljr.getKey())) {
            return this.a(bsn_1.ljr);
        }
        if (string.equals(bsn_1.ljs)) {
            return this.g(bsn_1.ljs);
        }
        if (string.equals(bsn_1.ljt.getKey())) {
            return this.a(bsn_1.ljt);
        }
        if (string.equals(bsn_1.lju.getKey())) {
            return Float.valueOf(this.c(bsn_1.lju) * 2.0f);
        }
        if (string.equals(bsn_1.ljw.getKey())) {
            return this.a(bsn_1.ljw);
        }
        if (string.equals(bsn_1.ljy.getKey())) {
            return this.a(bsn_1.ljy);
        }
        if (string.equals(bsn_1.ljA.getKey())) {
            return this.d(bsn_1.ljA);
        }
        if (string.equals(bsn_1.ljB.getKey())) {
            return this.a(bsn_1.ljB);
        }
        if (string.equals(bsn_1.ljC.getKey())) {
            return this.a(bsn_1.ljC);
        }
        if (string.equals(bsn_1.ljD.getKey())) {
            return this.a(bsn_1.ljD);
        }
        if (string.equals(bsn_1.ljE.getKey())) {
            return this.a(bsn_1.ljE);
        }
        if (string.equals(bsn_1.ljz.getKey())) {
            return this.a(bsn_1.ljz);
        }
        if (string.equals(bsn_1.ljK.getKey())) {
            return this.a(bsn_1.ljK);
        }
        if (string.equals(bsn_1.ljL.getKey())) {
            return this.a(bsn_1.ljL);
        }
        if (string.equals(bsn_1.ljN.getKey())) {
            return this.a(bsn_1.ljN);
        }
        if (string.equals(bsn_1.ljI.getKey())) {
            return this.a(bsn_1.ljI);
        }
        if (string.equals(bsn_1.ljJ.getKey())) {
            return this.a(bsn_1.ljJ);
        }
        if (string.equals(bsn_1.liS.getKey())) {
            bsa_1 bsa_12 = bsa_1.cP((byte)this.d(bsn_1.liS));
            if (bsa_12 == null) {
                return aum_0.cWf().c(bsa_1.lhh.clY(), new Object[0]);
            }
            return aum_0.cWf().c(bsa_12.clY(), new Object[0]);
        }
        if (string.equals(bsn_1.liU.getKey())) {
            bsd_1 bsd_12 = bsd_1.emW();
            if (bsd_12 == null) {
                return aum_0.cWf().c(bsd_1.lhC.clY(), new Object[0]);
            }
            return aum_0.cWf().c(bsd_12.clY(), new Object[0]);
        }
        if (string.equals(bsn_1.liR.getKey())) {
            ArrayList<String> arrayList = new ArrayList<String>();
            for (bsa_1 bsa_13 : bsa_1.values()) {
                arrayList.add(aum_0.cWf().c(bsa_13.clY(), new Object[0]));
            }
            return arrayList;
        }
        if (string.equals(lhY)) {
            return bsc_1.values();
        }
        if (string.equals(lhZ)) {
            return bse_1.values();
        }
        if (string.equals(bsn_1.lkp.getKey())) {
            return this.d(bsn_1.lkp);
        }
        if (string.equals(bsn_1.lkq.getKey())) {
            return this.d(bsn_1.lkq);
        }
        if (string.equals(bsn_1.liT.getKey())) {
            ArrayList<String> arrayList = new ArrayList<String>();
            for (bsd_1 bsd_13 : bsd_1.values()) {
                arrayList.add(aum_0.cWf().c(bsd_13.clY(), new Object[0]));
            }
            return arrayList;
        }
        if (string.equals(bsn_1.ljx.getKey())) {
            return this.a(bsn_1.ljx);
        }
        if (string.equals(bsn_1.ljR.getKey())) {
            return this.a(bsn_1.ljR);
        }
        if (string.equals(lia)) {
            return bgv_0.values();
        }
        if (string.equals(bsn_1.ljS.getKey())) {
            return bgv_0.CE(this.d(bsn_1.ljS));
        }
        if (string.equals(bsn_1.ljT.getKey())) {
            return bgv_0.CE(this.d(bsn_1.ljT));
        }
        if (string.equals(bsn_1.ljY.getKey())) {
            return this.a(bsn_1.ljY);
        }
        if (string.equals(bsn_1.liV.getKey())) {
            return this.a(bsn_1.liV);
        }
        if (string.equals(bsn_1.liW.getKey())) {
            return this.a(bsn_1.liW);
        }
        if (string.equals(bsn_1.lkr.getKey())) {
            return this.a(bsn_1.lkr);
        }
        if (string.equals(bsn_1.lks.getKey())) {
            return this.a(bsn_1.lks);
        }
        if (string.equals(bsn_1.lkt.getKey())) {
            return this.a(bsn_1.lkt);
        }
        if (string.equals(bsn_1.lku.getKey())) {
            return this.a(bsn_1.lku);
        }
        if (string.equals(bsn_1.lkv.getKey())) {
            return this.a(bsn_1.lkv);
        }
        if (string.equals(bsn_1.lkw.getKey())) {
            return bsb_1.values();
        }
        if (string.equals(bsn_1.lkx.getKey())) {
            return bsb_1.Ju(this.d(bsn_1.lkx));
        }
        if (string.equals(bsn_1.lkz.getKey())) {
            return this.a(bsn_1.lkz);
        }
        if (string.equals(bsn_1.lkA.getKey())) {
            return this.a(bsn_1.lkA);
        }
        if (string.equals(bsn_1.lkW.getKey())) {
            return this.a(bsn_1.lkW);
        }
        if (string.equals(bsn_1.lla.getKey())) {
            return this.f(bsn_1.lla);
        }
        if (string.equals(bsn_1.llb.getKey())) {
            return this.a(bsn_1.llb);
        }
        if (string.equals(bsn_1.llc.getKey())) {
            int n = this.d(bsn_1.llc);
            return crf_2.Mk(n);
        }
        return super.eu(string);
    }

    @Override
    protected void bxi() {
        super.bxi();
        this.b((afe)bsn_1.liu, true);
        this.b((afe)bsn_1.liB, 0);
        this.b((afe)bsn_1.liD, fqt_0.sTc.name());
        this.b((afe)bsn_1.liE, 0);
        this.b((afe)bsn_1.liF, 0);
        this.b((afe)bsn_1.ljv, true);
        this.b((afe)bsn_1.liG, 1);
        this.b((afe)bsn_1.liH, "1;3;4;5;6;7;8;10;11;12;13");
        this.b((afe)bsn_1.ljx, false);
        this.b((afe)bsn_1.ljy, true);
        this.b((afe)bsn_1.lji, false);
        this.b((afe)bsn_1.ljz, false);
        this.b((afe)bsn_1.ljA, apv_0.eyV.ordinal());
        this.b((afe)bsn_1.ljB, true);
        this.b((afe)bsn_1.ljC, true);
        this.b((afe)bsn_1.ljF, -1);
        this.b((afe)bsn_1.liM, true);
        this.b((afe)bsn_1.liN, false);
        this.b((afe)bsn_1.liO, true);
        this.b((afe)bsn_1.ljY, false);
        this.b((afe)bsn_1.ljZ, false);
        this.b((afe)bsn_1.liX, true);
        this.b((afe)bsn_1.lka, false);
        this.b((afe)bsn_1.lkb, false);
        this.b((afe)bsn_1.lkD, true);
    }

    @Override
    protected void bxh() {
        super.bxh();
        this.b((afe)bsn_1.liy, 0.5f);
        this.b((afe)bsn_1.lja, true);
        this.b((afe)bsn_1.ljb, false);
        this.b((afe)bsn_1.ljj, false);
        this.b((afe)bsn_1.ljl, fzh_0.tGV.ordinal());
        this.b((afe)bsn_1.ljm, true);
        this.b((afe)bsn_1.ljn, true);
        this.b((afe)bsn_1.ljo, true);
        this.b((afe)bsn_1.ljp, true);
        this.b((afe)bsn_1.ljq, true);
        this.b((afe)bsn_1.ljr, true);
        this.b((afe)bsn_1.ljs, Collections.emptySet());
        this.b((afe)bsn_1.ljt, true);
        this.b((afe)bsn_1.lju, 0);
        this.b((afe)bsn_1.ljw, true);
        this.b((afe)bsn_1.liP, true);
        this.b((afe)bsn_1.liQ, true);
        this.b((afe)bsn_1.liS, 0);
        this.b((afe)bsn_1.liU, 0);
        this.b((afe)bsn_1.ljG, "");
        this.b((afe)bsn_1.ljH, bic_0.ilu.d());
        this.b((afe)bsn_1.ljI, false);
        this.b((afe)bsn_1.ljJ, false);
        this.b((afe)bsn_1.ljK, true);
        this.b((afe)bsn_1.ljL, false);
        this.b((afe)bsn_1.ljM, true);
        this.b((afe)bsn_1.ljN, true);
        this.b((afe)bsn_1.ljD, true);
        this.b((afe)bsn_1.ljE, true);
        this.b((afe)bsn_1.ljR, true);
        this.b((afe)bsn_1.ljS, bgv_0.iav.aPm());
        this.b((afe)bsn_1.ljT, bgv_0.iav.aPm());
        this.b((afe)bsn_1.ljX, true);
        this.b((afe)bsn_1.lkp, bsc_1.lhu.d());
        this.b((afe)bsn_1.lkq, bse_1.lhH.d());
        this.b((afe)bsn_1.liW, false);
        this.b((afe)bsn_1.lkr, true);
        this.b((afe)bsn_1.lje, true);
        this.b((afe)bsn_1.ljf, true);
        this.b((afe)bsn_1.ljg, true);
        this.b((afe)bsn_1.ljh, true);
        this.b((afe)bsn_1.ljc, aKj.edv.aJr());
        Mv mv = aup_0.cWl();
        this.b((afe)bsn_1.lks, mv == Mv.aVk);
        this.b((afe)bsn_1.lkt, mv == Mv.aVl);
        this.b((afe)bsn_1.lku, mv == Mv.aVm);
        this.b((afe)bsn_1.lkv, mv == Mv.aVn);
        this.b((afe)bsn_1.lkx, bsb_1.lhn.d());
        this.b((afe)bsn_1.lkz, true);
        this.b((afe)bsn_1.lkB, false);
        this.b((afe)bsn_1.lkE, false);
        this.b((afe)bsn_1.lkF, true);
        this.b((afe)bsn_1.lkG, 0);
        this.b((afe)bsn_1.lkH, false);
        this.b((afe)bsn_1.lkJ, true);
        this.b((afe)bsn_1.lkK, false);
        this.b((afe)bsn_1.lkL, true);
        this.b((afe)bsn_1.lkM, bic_1.kdX.d());
        this.b((afe)bsn_1.lkN, bic_1.kdZ.d());
        this.b((afe)bsn_1.lkO, true);
        this.b((afe)bsn_1.lkP, bic_1.kdX.d());
        this.b((afe)bsn_1.lkQ, bic_1.kdZ.d());
        this.b((afe)bsn_1.lkR, true);
        this.b((afe)bsn_1.lkS, true);
        this.b((afe)bsn_1.lkT, true);
        this.b((afe)bsn_1.lkV, fhw_0.sqI.aJr());
        this.b((afe)bsn_1.lkY, 400);
    }

    public void ena() {
        List<Long> list = ewo_0.oBF.o(ewr_0.oCz);
        if (list.isEmpty()) {
            return;
        }
        EnumSet<Mv> enumSet = EnumSet.noneOf(Mv.class);
        list.forEach(l -> enumSet.add(vb_0.pS(l.intValue()).aUXX()));
        for (Mv mv : Mv.aVz) {
            if (enumSet.contains((Object)mv)) continue;
            this.a(mv, false);
        }
    }

    private void a(Mv mv, boolean bl) {
        switch (mv) {
            case aVk: {
                this.a((afe)bsn_1.lks, bl);
                break;
            }
            case aVl: {
                this.a((afe)bsn_1.lkt, bl);
                break;
            }
            case aVm: {
                this.a((afe)bsn_1.lku, bl);
                break;
            }
            case aVn: {
                this.a((afe)bsn_1.lkv, bl);
            }
        }
    }

    public void s(Mv mv) {
        this.a((afe)bsn_1.lks, mv == Mv.aVk);
        this.a((afe)bsn_1.lkt, mv == Mv.aVl);
        this.a((afe)bsn_1.lku, mv == Mv.aVm);
        this.a((afe)bsn_1.lkv, mv == Mv.aVn);
    }

    public boolean t(@Nullable Mv mv) {
        if (mv == null) {
            return true;
        }
        switch (mv) {
            case aVk: {
                return this.a(bsn_1.lks);
            }
            case aVl: {
                return this.a(bsn_1.lkt);
            }
            case aVm: {
                return this.a(bsn_1.lku);
            }
            case aVn: {
                return this.a(bsn_1.lkv);
            }
        }
        return false;
    }

    public ArrayList<Mv> bla() {
        ArrayList<Mv> arrayList = new ArrayList<Mv>();
        if (this.a(bsn_1.lks)) {
            arrayList.add(Mv.aVk);
        }
        if (this.a(bsn_1.lkt)) {
            arrayList.add(Mv.aVl);
        }
        if (this.a(bsn_1.lku)) {
            arrayList.add(Mv.aVm);
        }
        if (this.a(bsn_1.lkv)) {
            arrayList.add(Mv.aVn);
        }
        return arrayList;
    }

    public List<Mv> enb() {
        ArrayList<Mv> arrayList = new ArrayList<Mv>();
        if (!this.a(bsn_1.lks)) {
            arrayList.add(Mv.aVk);
        }
        if (!this.a(bsn_1.lkt)) {
            arrayList.add(Mv.aVl);
        }
        if (!this.a(bsn_1.lku)) {
            arrayList.add(Mv.aVm);
        }
        if (!this.a(bsn_1.lkv)) {
            arrayList.add(Mv.aVn);
        }
        return arrayList;
    }

    public bsb_1 enc() {
        return bsb_1.Ju(this.d(bsn_1.lkx));
    }

    @Override
    public void a(aeb_1 aeb_12) {
        super.a(aeb_12);
        if (aeb_12 != null) {
            aeb_12.a(this);
        }
    }

    public void a(bsy_1 bsy_12) {
        boolean bl;
        super.b(bsy_12);
        boolean bl2 = bl = bsy_12 != null;
        if (bl) {
            bsy_12.a(this);
        }
        this.a((afe)aff.cpN, bl);
    }

    public void a(bsz_2 bsz_22) {
        super.c(bsz_22);
        if (bsz_22 != null) {
            bsz_22.a(this);
        }
    }

    @Override
    public void b(bsz_2 bsz_22) {
        this.a(bsz_22.KU(), bsz_22);
    }

    @NotNull
    public bsz_2 M(bgt_0 bgt_02) {
        bsz_2 bsz_22 = (bsz_2)this.bxm();
        if (bsz_22 != null && bgt_02.Sn() == bsz_22.KU()) {
            return bsz_22;
        }
        bsz_2 bsz_23 = (bsz_2)this.fO(bgt_02.Sn());
        if (bsz_23 == null) {
            bsz_23 = new bsz_2(bgt_02);
            this.a(bgt_02.Sn(), bsz_23);
            try {
                bsz_23.buq();
            }
            catch (IOException iOException) {
                lhV.error((Object)("[Preferences] Unable to load preferences for character " + bgt_02.Sn()), (Throwable)iOException);
            }
        }
        return bsz_23;
    }

    @Nullable
    public bsz_2 mr(long l) {
        bsz_2 bsz_22 = (bsz_2)this.bxm();
        if (bsz_22 != null && bsz_22.KU() == l) {
            return bsz_22;
        }
        return (bsz_2)this.fO(l);
    }

    @Override
    public void a(long l, bsz_2 bsz_22) {
        super.a(l, bsz_22);
        if (bsz_22 != null) {
            bsz_22.a(this);
        }
    }

    @Override
    protected void bxj() {
        super.bxj();
        this.b((afe)bsn_1.lix, "");
        this.b((afe)bsn_1.liw, true);
        this.b((afe)bsn_1.liY, true);
        this.b((afe)bsn_1.liZ, true);
        this.b((afe)bsn_1.liI, bsm_1.lim.aJr());
        this.b((afe)bsn_1.liL, true);
        this.b((afe)bsn_1.liK, true);
        this.b((afe)bsn_1.liV, true);
        this.b((afe)aff.cpL, 0);
        this.b((afe)aff.cpM, false);
        this.b((afe)bsn_1.lkW, true);
        this.b((afe)bsn_1.lkZ, true);
        this.b((afe)bsn_1.lla, cAM.mpj.eGQ());
        this.b((afe)bsn_1.llb, true);
    }

    public void end() {
        this.a((afe)bsn_1.lji, this.h(bsn_1.lji));
        this.a((afe)bsn_1.ljA, this.d(bsn_1.ljA));
    }

    @Override
    public void onPreferenceStoreLoaded(aeb_1 aeb_12) {
        this.g(aeb_12);
        if (aeb_12 == bsn_1.lks.e(this)) {
            aup_0.m(() -> {
                Mv mv = aup_0.cWl();
                this.a(mv, true);
                aPb.i(mv);
                aPb.j(mv);
            });
        }
    }

    private void g(aeb_1 aeb_12) {
        int n = aeb_12.hF(bsn_1.lit.getKey());
        if (n < 22) {
            URL uRL = this.getClass().getResource("/com/ankamagames/wakfu/client/preferences/wakfuPreferencesActions.xml");
            bsy_2.a(uRL, this, aeb_12, n);
            aeb_12.k(bsn_1.lit.getKey(), 22);
            try {
                aeb_12.buR();
            }
            catch (IOException iOException) {
                lhV.warn((Object)"Probl\u00e8me \u00e0 la sauvegarde", (Throwable)iOException);
            }
        }
    }

    private void nB(String string) {
        File[] fileArray;
        File file = new File(string);
        for (File file2 : fileArray = file.listFiles(this.lid)) {
            if (file2.isDirectory()) {
                this.nB(file2.getPath());
                continue;
            }
            file2.delete();
        }
    }

    @Override
    public /* synthetic */ void c(aeb_1 aeb_12) {
        this.a((bsz_2)aeb_12);
    }

    @Override
    public /* synthetic */ void b(aeb_1 aeb_12) {
        this.a((bsy_1)aeb_12);
    }
}

