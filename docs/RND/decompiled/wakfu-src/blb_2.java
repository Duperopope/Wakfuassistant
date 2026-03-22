/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import java.util.ArrayList;
import org.apache.commons.pool.ObjectPool;

/*
 * Renamed from bLB
 */
public class blb_2
extends fqr_0
implements aeh_2 {
    public static final String ktt = "uid";
    public static final String ktu = "rid";
    public static final String ktv = "smallIconUrl";
    public static final String ktw = "type";
    public static final String ktx = "usable";
    public static final String kty = "backgroundTypeIcon";
    public static final String ktz = "quantity";
    public static final String ktA = "cooldown";
    public static final String ktB = "particleFile";
    public static final String ktC = "themeItemBorderStyle";
    private byte bZe;
    public static final byte ktD = 0;
    public static final byte ktE = 1;
    public static final byte ktF = 2;
    public static final byte ktG = 3;
    public static final byte ktH = 4;
    public static final byte ktI = 5;
    private static final short[] ktJ = new short[]{0, 0, 1, 1, 0, 0};
    public static final String[] ktK = new String[]{"uid", "rid", "smallIconUrl", "type", "usable", "backgroundTypeIcon", "quantity"};
    private boolean bmh = true;
    private static final ObjectPool ktL = new ayv_2(new blc_2());
    private final bln_2 ktM = new bln_2();

    blb_2() {
    }

    public static blb_2 ecN() {
        blb_2 blb_22;
        try {
            blb_22 = (blb_2)ktL.borrowObject();
            blb_22.bip = ktL;
        }
        catch (Exception exception) {
            blb_22 = new blb_2();
            blb_22.bip = null;
            blb_22.aVI();
            sSX.error((Object)("Erreur lors d'un checkOut sur un ShortCutItem : " + exception.getMessage()));
        }
        return blb_22;
    }

    public static blb_2 a(fqu_0 fqu_02, long l, int n, int n2) {
        blb_2 blb_22 = blb_2.ecN();
        blb_22.b(fqu_02, l, n, n2);
        return blb_22;
    }

    @Override
    public void aZp() {
        if (this.bip != null) {
            try {
                this.bip.returnObject((Object)this);
            }
            catch (Exception exception) {
                sSX.error((Object)("Exception dans le release de " + this.getClass().toString() + ". Normalement impossible"));
            }
            this.bip = null;
        } else {
            this.aVH();
        }
    }

    @Override
    public Object eu(String string) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (string.equals(ktt)) {
            return this.LV();
        }
        if (string.equals(ktu)) {
            return this.avr();
        }
        if (string.equals(ktw)) {
            return this.gih();
        }
        if (string.equals(ktC)) {
            switch (this.gih()) {
                case sTs: 
                case sTr: {
                    Object r = fgD.fXh().Vd(this.avr());
                    return ((fhc_0)r).dwg().fWN();
                }
            }
            return null;
        }
        if (string.equals(ktv)) {
            switch (this.gih()) {
                case sTu: {
                    bbi_0 bbi_02 = bbl_0.hBr.AF(this.avr());
                    if (bbi_02 == null) {
                        return null;
                    }
                    return bbi_02.byf();
                }
                case sTq: {
                    return auc_0.cVq().zA(this.gii());
                }
                case sTs: 
                case sTr: 
                case sTt: {
                    return auc_0.cVq().zx(this.gii());
                }
                case sTv: {
                    return auc_0.cVq().kv(String.valueOf(this.gii()));
                }
                case sTw: {
                    if (this.gii() == -1) {
                        return "txDefaultPresetIcon";
                    }
                    return auc_0.cVq().zx(this.gii());
                }
            }
            return null;
        }
        if (string.equals(ktx)) {
            if (!this.bmh) {
                return false;
            }
            bgy bgy2 = cul_2.eST().eSH();
            if (bgy2 == null && bgt_02.doP()) {
                return false;
            }
            if (bgy2 != null && bgy2.doP()) {
                return false;
            }
            switch (this.gih()) {
                case sTv: {
                    if (bgy2 != null) {
                        return bgy2.dnK().wM() != this.avr() && new eIn().P(bgy2.Sn(), this.avr());
                    }
                    return bgt_02.dnK().wM() != this.avr() && new eIn().P(bgt_02.Sn(), this.avr());
                }
                case sTw: {
                    return bjf_1.Di(this.avr()).isPresent();
                }
                case sTu: {
                    bbf_0 bbf_02 = bbl_0.hBr.AH(this.avr());
                    if (bbf_02 == null) {
                        return true;
                    }
                    return bbf_02.bdo() == null || bbf_02.bdo().b(bgt_02, bgt_02.aZw(), bbf_02, bgt_02.bdV());
                }
                case sTq: {
                    bsj_0 bsj_02;
                    if (bgy2 == null || bgy2.fgk() || !bgy2.dkQ()) {
                        bgy2 = bgt_02;
                    }
                    if ((bsj_02 = bgt_02.dkZ()) == null) {
                        bmx_0 bmx_02 = bgy2.jr(this.LV());
                        return bmx_02 == null;
                    }
                    bmx_0 bmx_03 = bgy2.jr(this.LV());
                    if (bmx_03 == null) {
                        return false;
                    }
                    if (!((bmt_0)bmx_03.giP()).cvP()) {
                        this.ktM.l(bsj_02);
                        fqH fqH2 = this.ktM.a(bgy2, bmx_03, null, true);
                        return fqH2 == fqH.sUS;
                    }
                    ffV ffV2 = bgt_02.dmL().a(bgt_02.dnP(), ffS.gj(((bmt_0)bmx_03.giP()).giM()));
                    fqH fqH3 = bsj_02.a((exP)bgy2, ffV2, bmx_03, null);
                    return fqH3 == fqH.sUS;
                }
                case sTt: {
                    ffV ffV3;
                    bsj_0 bsj_03 = bgt_02.dkZ();
                    if (bsj_03 == null) {
                        return true;
                    }
                    if (this.avr() != 2145) {
                        ffV3 = bgt_02.dmL().a(bgt_02.dnP(), ffS.gj((byte)(-(this.LV() + 1L))));
                    } else {
                        Object r = fgD.fXh().Vd(2145);
                        ffV ffV4 = new ffV(-1L);
                        ffV4.l((fhc_0)r);
                        ffV4.ak((short)1);
                        ffV3 = ffV4;
                        bgy bgy3 = cul_2.eST().eSH();
                        if (bgy3 == null) {
                            return false;
                        }
                    }
                    return ffV3 != null && ffV3.apo() && bsj_03.a((exP)bgt_02, ffV3, null, true) == fqH.sUS;
                }
                case sTr: {
                    Object r = fgD.fXh().Vd(this.avr());
                    if (r == null) {
                        return false;
                    }
                    if (((fhc_0)r).fUZ() instanceof bfp_1) {
                        short s = ((bfp_1)((fhc_0)r).fUZ()).cqz();
                        int n = ((bfp_1)((fhc_0)r).fUZ()).cms();
                        eki_0 eki_02 = bgt_02.dpK();
                        return eki_02.tX(n) && eki_02.PG(n) >= s && this.bfd() > 0;
                    }
                    if (((fhc_0)r).cmL() > bgt_02.cmL()) {
                        return false;
                    }
                    bsj_0 bsj_04 = bgt_02.dkZ();
                    if (bsj_04 != null) {
                        if (bsj_04.dGp() == etw_0.rqT) {
                            return bEf.a(r, bgt_02, bsj_04, this.LV());
                        }
                        bgy bgy4 = cul_2.eST().eSH();
                        if (bgy4 == null) {
                            return false;
                        }
                        return bEf.a(r, bgy4, bsj_04, this.LV());
                    }
                    ang_2 ang_22 = ((fhc_0)r).a(ffj_0.sgc);
                    bgt_0 bgt_03 = bgt_02;
                    return (ang_22 == null || ang_22.b(bgt_03, bgt_03.aZw(), null, bgt_03.fgg())) && this.bfd() > 0;
                }
                case sTs: {
                    ffV ffV5 = bgt_02.dno().tb(this.LV());
                    if (ffV5 != null && ffV5.apo()) {
                        ang_2 ang_23;
                        if (ffV5.dOg().dGh().fZq().length == 0 || this.dij() == 4) {
                            bgy bgy5;
                            ang_2 ang_24;
                            if (bgt_02.djT() && bgt_02.dkZ() != null && bgt_02.dkZ().dGp() != etw_0.rqT) {
                                ang_24 = ffV5.dOg().a(ffj_0.sgd);
                                bgy5 = cul_2.eST().eSH();
                                if (bgy5 == null) {
                                    return false;
                                }
                            } else {
                                ang_24 = ffV5.dOg().a(ffj_0.sgc);
                                bgy5 = bgt_02;
                            }
                            return (ang_24 == null || ang_24.b(bgy5, bgy5.aZw(), ffV5, bgy5.fgg())) && this.bfd() > 0;
                        }
                        bgy bgy6 = bgt_02;
                        if (bgt_02.djT()) {
                            if (!ffV5.dOg().v(ffS.sgQ) && !ffV5.dOg().v(ffS.sgR)) {
                                return false;
                            }
                            bgy6 = cul_2.eST().eSH();
                            if (bgy6 == null) {
                                return false;
                            }
                        }
                        return ((ang_23 = ffV5.dOg().a(ffj_0.sge)) == null || ang_23.b(bgy6, bgy6.aZw(), ffV5, bgy6.fgg())) && this.bfd() > 0;
                    }
                    ffV5 = bgt_02.dmL().a(bgt_02.dnP(), this.avr());
                    if (ffV5 != null && ffV5.apo()) {
                        bgy bgy7;
                        ang_2 ang_25;
                        if (bgt_02.a(exe_1.rDP)) {
                            return false;
                        }
                        if (bgt_02.djT() && !ffV5.beB()) {
                            return false;
                        }
                        bsj_0 bsj_05 = bgt_02.dkZ();
                        if (bgt_02.djT() && bsj_05 != null && bsj_05.dGp() != etw_0.rqT) {
                            ang_25 = ffV5.dOg().a(ffj_0.sgd);
                            bgy7 = cul_2.eST().eSH();
                            if (bgy7 == null) {
                                return false;
                            }
                        } else {
                            ang_25 = ffV5.dOg().a(ffj_0.sgc);
                            bgy7 = bgt_02;
                        }
                        return (ang_25 == null || ang_25.b(bgy7, bgy7.aZw(), ffV5, bgy7.fgg())) && ffV5.dOg().fYi() <= bgy7.c((pt_0)exx_2.rGj) && this.bfd() > 0;
                    }
                    return this.bfd() > 0;
                }
            }
        } else {
            if (string.equals(ktA)) {
                if (this.gih() != fqu_0.sTq) {
                    return "";
                }
                bsj_0 bsj_06 = bgt_02.dkZ();
                if (bsj_06 == null) {
                    return "";
                }
                bgy bgy8 = cul_2.eST().eSH();
                bgy bgy9 = bgy8 != null ? bgy8 : aue_0.cVJ().cVK();
                bmx_0 bmx_04 = bgy9.jr(this.LV());
                if (bmx_04 == null) {
                    return "";
                }
                if (!((bmt_0)bmx_04.giP()).cvP()) {
                    fqH fqH4 = bgy9.fgh().c(bgy9, bmx_04, bsj_06.dGQ().bhJ());
                    if (fqH4 == fqH.sUS) {
                        return "";
                    }
                    if (fqH4 == fqH.sVg) {
                        int n = bgy9.fgh().b(bgy9, bmx_04, bsj_06.dGQ().bhJ());
                        if (n > 0) {
                            return String.valueOf(n);
                        }
                        return String.valueOf('\u221e');
                    }
                    if (fqH4 == fqH.sVf) {
                        return "1";
                    }
                    return "";
                }
                ffV ffV6 = bgy9.dmL().a(bgt_02.dnP(), ffS.gj(((bmt_0)bmx_04.giP()).giM()));
                fqH fqH5 = bsj_06.a((exP)bgy9, ffV6, bmx_04, null);
                if (fqH5 == fqH.sUS) {
                    return "";
                }
                if (fqH5 == fqH.sVg) {
                    return String.valueOf(bgy9.fgh().b(bgy9, bmx_04, bsj_06.dGQ().bhJ()));
                }
                if (fqH5 == fqH.sVf) {
                    return "1";
                }
                return "";
            }
            if (string.equals(kty)) {
                try {
                    return String.format(auc_0.cVq().bS("shortcutBackgroundPath"), ktJ[this.bZe]);
                }
                catch (Exception exception) {
                    sSX.error((Object)exception);
                }
            } else {
                if (string.equals(ktz)) {
                    fqu_0 fqu_02 = this.gih();
                    if (fqu_02 == fqu_0.sTs || fqu_02 == fqu_0.sTr) {
                        long l = this.ecP();
                        if (l > 99999L) {
                            ahv_2 ahv_22 = new ahv_2();
                            ahv_22.ceC().c("99").ceu().c("k+").cev().ceD();
                            return ahv_22.ceL();
                        }
                        if (l > 999L) {
                            ahv_2 ahv_23 = new ahv_2();
                            ahv_23.ceC().hY(l / 1000L).ceu().c("k").cev().ceD();
                            return ahv_23.ceL();
                        }
                        if (l == 0L) {
                            return null;
                        }
                        return l;
                    }
                    if (fqu_02 == fqu_0.sTv) {
                        eIj eIj2 = bgt_02.dnK().PR((byte)this.LV());
                        if (eIj2 == null) {
                            return null;
                        }
                        if (eIj2.tL() == -1) {
                            return aum_0.cWf().c("real", new Object[0]);
                        }
                        return eIj2.tL();
                    }
                    return null;
                }
                if (string.equals(ktB)) {
                    return this.ecO();
                }
            }
        }
        return null;
    }

    private String ecO() {
        return null;
    }

    private static String HW(int n) {
        return n + ".xps";
    }

    @Override
    public boolean a(yi_2 yi_22) {
        bmt_0 bmt_02;
        this.sSY = fqu_0.ho(yi_22.Us);
        this.sTa = yi_22.alv;
        this.sSZ = yi_22.alw;
        this.sTb = yi_22.alx;
        if (this.sTb == -1 && this.sSY == fqu_0.sTq && (bmt_02 = bmb_0.eeV().If(this.sSZ)) != null) {
            this.sTb = bmt_02.aVt();
        }
        return this.sSY != null;
    }

    @Override
    public void b(fqu_0 fqu_02, long l, int n, int n2) {
        super.b(fqu_02, l, n, n2);
        fse_1.gFu().a((aef_2)this, ktu, ktt, ktw, kty, ktv);
    }

    @Override
    protected void a(int n, long l, int n2) {
        super.a(n, l, n2);
        fse_1.gFu().a((aef_2)this, ktu, ktt, ktv);
    }

    @Override
    public void HX(int n) {
        super.HX(n);
        fse_1.gFu().a((aef_2)this, ktv);
    }

    @Override
    public void ak(short s) {
        super.ak(s);
        fse_1.gFu().a((aef_2)this, ktz);
        fse_1.gFu().a((aef_2)this, ktx);
    }

    @Override
    public void al(short s) {
        super.al(s);
        fse_1.gFu().a((aef_2)this, ktz, ktx);
    }

    @Override
    public String[] bxk() {
        return ktK;
    }

    private RT lK(long l) {
        blb_2 blb_22 = blb_2.a(this.gih(), l, this.avr(), this.gii());
        blb_22.bi(this.bZe);
        blb_22.setUsable(this.bmh);
        blb_22.ak(this.bfd());
        return blb_22;
    }

    @Override
    public RT bff() {
        return this.lK(aym_2.bSE());
    }

    @Override
    public RT bfg() {
        return this.lK(this.LV());
    }

    public long ecP() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (this.gih() == fqu_0.sTr || this.gih() == fqu_0.sTs) {
            int n;
            long l = 0L;
            ArrayList<ffV> arrayList = bgt_02.dno().UM(this.sSZ);
            if (arrayList != null) {
                for (n = arrayList.size() - 1; n >= 0; --n) {
                    l += (long)arrayList.get(n).bfd();
                }
            }
            if (this.gih() == fqu_0.sTs && (arrayList = bgt_02.dnP().pd(this.sSZ)) != null) {
                for (n = arrayList.size() - 1; n >= 0; --n) {
                    l += (long)arrayList.get(n).bfd();
                }
            }
            return l;
        }
        return 1L;
    }

    @Override
    public short bfd() {
        return GC.cu(this.ecP());
    }

    public byte dij() {
        return this.bZe;
    }

    public void bi(byte by) {
        this.bZe = by;
        fse_1.gFu().a((aef_2)this, kty);
    }

    public boolean beB() {
        if (this.gih() == fqu_0.sTq) {
            return true;
        }
        if (this.gih() == fqu_0.sTt) {
            return true;
        }
        if (this.gih() == fqu_0.sTs) {
            switch (this.dij()) {
                case 0: 
                case 1: 
                case 3: {
                    return false;
                }
                case 2: 
                case 4: 
                case 5: {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean isUsable() {
        return this.bmh;
    }

    public void setUsable(boolean bl) {
        this.bmh = bl;
        fse_1.gFu().a((aef_2)this, ktx);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.bmh = true;
        this.bZe = 0;
        this.ktM.clear();
    }

    @Override
    public /* synthetic */ boolean b(Object object) {
        return this.a((yi_2)object);
    }
}

