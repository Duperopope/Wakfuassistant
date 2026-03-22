/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.log4j.Logger;

/*
 * Renamed from cSw
 */
public class csw_2
implements adi_1 {
    private static final Logger nFD = Logger.getLogger(csw_2.class);
    private static final csw_2 nFE = new csw_2();
    public static final int nFF = 2000;
    private alx_2 ikv;
    bdi_0 nFG;
    private final ArrayList<csa_2> nFH = new ArrayList();
    private static final int nFI = 25;
    private ahk_1 nFJ;
    bfq_0 nFK;
    ffV iWZ;
    private boolean nFL = false;
    Runnable bIf;
    final abz_1 nFM = new csz_2(this);

    public static csw_2 eOf() {
        return nFE;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        return true;
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
            if (this.nFG == null || this.nFK == null) {
                return;
            }
            this.ikv = new csx_2(this);
            fyw_0.gqw().a(this.ikv);
            fyw_0.gqw().d("wakfu.blindBox", cdu_2.class);
            ccj_2.g("blindBoxDialog", 8448L);
            fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("blindBoxDialog");
            fbz_2 fbz_22 = (fbz_2)fhs_22.uH("rollingItemList1");
            this.nFH.add(new csa_2(this, fbz_22));
            this.nFH.add(new csa_2(this, (fbz_2)fhs_22.uH("rollingItemList2")));
            this.nFH.add(new csa_2(this, (fbz_2)fhs_22.uH("rollingItemList3")));
            this.nFL = false;
            fse_1.gFu().f("blindBox", this.nFG);
            aie_0.cfn().bmE().a(this.nFM, true);
        }
    }

    private void eOg() {
        this.nFG.fI(false);
        for (csa_2 csa_22 : this.nFH) {
            csa_22.a(false, 0.9f);
        }
        this.bIf = new csy_1(this);
        abg_2.bUP().a(this.bIf, 2000L, 1);
        this.nFJ = cAY.eHc().r(600152L, true);
        if (this.nFJ != null) {
            this.nFJ.cI(0.0f);
            this.nFJ.br(1.0f, 100.0f);
        }
    }

    private void cP(short s) {
        for (csa_2 csa_22 : this.nFH) {
            csa_22.a(s, false, 0.9f);
        }
    }

    private void cQ(short s) {
        for (csa_2 csa_22 : this.nFH) {
            csa_22.cR(s);
        }
        this.nFL = false;
    }

    public void eOh() {
        if (this.bIf != null) {
            abg_2.bUP().h(this.bIf);
            this.bIf = null;
            this.nFL = true;
            this.nFK.ll(this.iWZ.LV());
        }
    }

    int a(fbz_2 fbz_22, float f2) {
        if (fbz_22 == null) {
            return -1;
        }
        fbz_22.setListOffset(f2);
        this.nFG.eC(f2);
        return -1;
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            if (this.nFJ != null) {
                this.nFJ.dZ(true);
                this.nFJ.br(0.0f, 100.0f);
                this.nFJ = null;
            }
            for (csa_2 csa_22 : this.nFH) {
                abg_2.bUP().h(csa_22);
            }
            this.nFH.clear();
            this.nFL = false;
            fyw_0.gqw().b(this.ikv);
            fse_1.gFu().vX("blindBox");
            fyw_0.gqw().tl("blindBoxDialog");
            fyw_0.gqw().tc("wakfu.blindBox");
            aie_0.cfn().bmE().a(this.nFM);
        }
    }

    public void a(bdi_0 bdi_02) {
        this.nFG = bdi_02;
    }

    public static ArrayList<ffT> Ms(int n) {
        Optional<aNg> optional = csw_2.Mt(n);
        if (optional.isEmpty()) {
            return Lists.newArrayList();
        }
        aNg aNg2 = optional.get();
        aNh[] aNhArray = aNg2.cqh();
        if (aNhArray == null) {
            return Lists.newArrayList();
        }
        HashMap<Integer, ffT> hashMap = new HashMap<Integer, ffT>();
        List list = Stream.of(aNhArray).flatMap(aNh2 -> csw_2.a(aNh2).stream()).toList();
        for (ffT ffT2 : list) {
            hashMap.put(ffT2.avr(), ffT2);
        }
        return Lists.newArrayList(hashMap.values());
    }

    private static ArrayList<ffT> a(aNh aNh2) {
        if (aNh2.cqk()) {
            return csw_2.Ms(aNh2.azv());
        }
        Optional<ffT> optional = csw_2.b(aNh2);
        if (optional.isEmpty()) {
            return Lists.newArrayList();
        }
        return Lists.newArrayList((Object[])new ffT[]{optional.get()});
    }

    private static Optional<ffT> b(aNh aNh2) {
        int n = aNh2.azv();
        short s = aNh2.cqi();
        Object r = fgD.fXh().Vd(n);
        if (r == null) {
            return Optional.empty();
        }
        ffT ffT2 = new ffT((fhc_0)r);
        ffT2.ak(s);
        return Optional.of(ffT2);
    }

    private static Optional<aNg> Mt(int n) {
        try {
            aNg aNg2 = new aNg();
            if (!aqb_1.bGD().a(n, aNg2)) {
                return Optional.empty();
            }
            return Optional.of(aNg2);
        }
        catch (Exception exception) {
            nFD.error((Object)("unable to load Loot List " + n), (Throwable)exception);
            return Optional.empty();
        }
    }

    public void Mu(int n) {
        int n2 = this.nFG.Gl(n);
        if (this.nFL) {
            this.cQ((short)n2);
        } else {
            this.cP((short)n2);
        }
    }

    public void a(bfq_0 bfq_02, ffV ffV2) {
        this.iWZ = ffV2;
        this.nFK = bfq_02;
        this.nFG = new bdi_0(ffV2, csw_2.Ms(bfq_02.dTp()));
    }

    public byte eOi() {
        byte by = 0;
        for (csa_2 csa_22 : this.nFH) {
            if (!csa_22.bVp()) continue;
            by = (byte)(by + 1);
        }
        return by;
    }

    void eOj() {
        int n = -1;
        byte by = this.eOi();
        switch (by) {
            case 1: {
                n = 600153;
                break;
            }
            case 2: {
                n = 600154;
                break;
            }
            case 3: {
                n = 600155;
                break;
            }
            default: {
                return;
            }
        }
        cAY.eHc().nP(n);
        if (by < 3) {
            return;
        }
        this.nFG.fI(true);
        this.nFG.dRk();
        cAY.eHc().nP(600156L);
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("blindBoxDialog");
        faw_2 faw_22 = (faw_2)fhs_22.uH("containerParticle");
        fka_1 fka_12 = new fka_1();
        fka_12.aVI();
        fka_12.setUseParentScissor(true);
        fka_12.setFile("6001051.xps");
        fka_12.setAlignment(faa_2.tLO);
        faw_22.getAppearance().d(fka_12);
        if (this.nFJ != null) {
            this.nFJ.dZ(true);
            this.nFJ.br(0.0f, 100.0f);
            this.nFJ = null;
        }
    }

    public void eOk() {
        if (this.nFG.bVp()) {
            if (this.nFG.oP() > 0) {
                this.eOg();
            } else {
                fyw_0.gqw().tl("blindBoxDialog");
            }
        } else {
            this.eOh();
        }
    }
}

