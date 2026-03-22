/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bcE
 */
public class bce_2
implements aeh_2,
fgf_0 {
    private static final Logger hGm = Logger.getLogger(bce_2.class);
    public static final String hGn = "achievement";
    public static final String hGo = "description";
    public static final String hGp = "iconUrl";
    public static final String hGq = "quantity";
    public static final String hGr = "rewardTypePopupVisible";
    public static final String hGs = "boosterDescription";
    public static final String hGt = "boosterQuantity";
    public static final String hGu = "themeItemBorderStyle";
    public static final String hGv = "isAccountRewardCompleted";
    public static final String[] hGw = new String[]{"description", "iconUrl", "quantity", "rewardTypePopupVisible", "boosterDescription", "boosterQuantity", "achievement"};
    private final bcl_1 hGx;
    private final int hGy;
    private final boolean hGz;
    private final bci_1 hGA;

    public bce_2(bcl_1 bcl_12, bci_1 bci_12) {
        this.hGx = bcl_12;
        this.hGy = this.dbQ();
        this.hGz = this.dbR();
        this.hGA = bci_12;
    }

    private int dbQ() {
        if (this.hGx.dbb() == bby_2.hCy) {
            boolean bl;
            bgv_2 bgv_22 = (bgv_2)this.dbY();
            fhy_0 fhy_02 = bew_1.dSk().Gy(649);
            boolean bl2 = bl = bgv_22 != null && bgv_22.dGh().p(fhy_02);
            if (!bl) {
                return this.hGx.dba()[1];
            }
            boolean bl3 = aue_0.cVJ().cVK().dpL().b(evv_1.oxs);
            float f2 = bl3 ? 1.0f : 0.5f;
            return (int)Math.ceil((float)this.hGx.dba()[1] * f2);
        }
        if (this.hGx.dbb() == bby_2.hCu) {
            return this.hGx.dba()[1];
        }
        if (this.hGx.dbb() == bby_2.hCF) {
            return this.hGx.dba()[0];
        }
        return 1;
    }

    private boolean dbR() {
        if (this.hGx.dbb() == bby_2.hCy) {
            fhc_0 fhc_02 = this.dbY();
            return fhc_02 != null && fhc_02.bqp();
        }
        return false;
    }

    @Override
    public String[] bxk() {
        return hGw;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(hGo)) {
            return this.dbU();
        }
        if (string.equals(hGp)) {
            int[] nArray = this.hGx.dba();
            int n = nArray != null && nArray.length > 0 ? nArray[0] : 0;
            bby_2 bby_22 = this.hGx.dbb();
            switch (bby_22) {
                case hCu: 
                case hCy: {
                    bef_0 bef_02 = (bef_0)fgD.fXh().Vd(n);
                    return bef_02.dSz().eu(hGp);
                }
                case hCv: {
                    return auc_0.cVq().zO(n);
                }
                case hCw: {
                    return auc_0.cVq().zL(n);
                }
                case hCx: {
                    return auc_0.cVq().a("pointsOfInterestIconPath", "defaultIconPath", n);
                }
                case hCJ: {
                    return auc_0.cVq().zA(n);
                }
            }
            try {
                return String.format(auc_0.cVq().bS("rewardTypeIconsPath"), bby_22.d());
            }
            catch (fu_0 fu_02) {
                hGm.warn((Object)fu_02.getMessage(), (Throwable)fu_02);
                return null;
            }
        }
        if (string.equals(hGs)) {
            return this.dbS();
        }
        if (string.equals(hGq)) {
            return this.hGy;
        }
        if (string.equals(hGt)) {
            return this.dbT();
        }
        if (string.equals(hGr)) {
            return this.dca();
        }
        if (string.equals(hGu)) {
            fhc_0 fhc_02;
            bby_2 bby_23 = this.hGx.dbb();
            if (bby_23 == bby_2.hCy && (fhc_02 = this.dbY()) != null) {
                return fhc_02.dwg().fWN();
            }
            return "";
        }
        if (string.equals(hGn)) {
            return this.hGA;
        }
        if (string.equals(hGv)) {
            csc_1.eNJ();
            Optional<eAa> optional = csc_1.eNL();
            return optional.isPresent() && optional.get().Pp(this.hGx.d());
        }
        return null;
    }

    @Nullable
    public Object dbS() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        int[] nArray = this.hGx.dba();
        int n = nArray != null && nArray.length > 0 ? nArray[0] : 0;
        bby_2 bby_22 = this.hGx.dbb();
        if (bby_22 == bby_2.hCz) {
            return ftE.ae(n);
        }
        if (bby_22 == bby_2.hCG) {
            long l = bgt_02.dnH().N(bgt_02.dnG());
            long l2 = l * (long)n / 100L;
            return ftE.ae(l2);
        }
        if (bby_22 == bby_2.hCK) {
            long l = Math.round((double)n / 100.0 * (double)me_1.L(bgt_02.dnG()));
            return ftE.ae(l);
        }
        if (bby_22 == bby_2.hCE) {
            return "";
        }
        return this.dbU();
    }

    private int dbT() {
        if (this.hGx.dba().length > 1) {
            return this.hGx.dba()[1] - this.hGy;
        }
        return 0;
    }

    @Nullable
    public Object dbU() {
        bgt_0 bgt_02 = (bgt_0)bvz_0.ju(csc_1.eNJ().KU());
        bgt_0 bgt_03 = bgt_02 != null ? bgt_02 : aue_0.cVJ().cVK();
        int[] nArray = this.hGx.dba();
        int n = nArray != null && nArray.length > 0 ? nArray[0] : 0;
        bby_2 bby_22 = this.hGx.dbb();
        if (bby_22 == bby_2.hCu || bby_22 == bby_2.hCy) {
            Object r = fgD.fXh().Vd(n);
            return ((fhc_0)r).getName();
        }
        if (bby_22 == bby_2.hCv) {
            return aum_0.cWf().c("unlockedTitle", aum_0.cWf().a(34, (long)n, new Object[0]));
        }
        if (bby_22 == bby_2.hCw) {
            return aum_0.cWf().a(80, (long)n, new Object[0]);
        }
        if (bby_22 == bby_2.hCx) {
            return aum_0.cWf().c("landmark.gfx", new Object[0]);
        }
        if (bby_22 == bby_2.hCz) {
            return ftE.a(n, bgt_03);
        }
        if (bby_22 == bby_2.hCG) {
            long l = bgt_03.dnH().N(bgt_03.dnG());
            long l2 = l * (long)n / 100L;
            return ftE.a(l2, bgt_03);
        }
        if (bby_22 == bby_2.hCK) {
            long l = Math.round((double)n / 100.0 * (double)me_1.L(bgt_03.dnG()));
            return ftE.a(l, bgt_03);
        }
        if (bby_22 == bby_2.hCB) {
            return aum_0.cWf().c("reward.spellRestat", new Object[0]);
        }
        if (bby_22 == bby_2.hCC) {
            return aum_0.cWf().a(8, (long)this.hGx.dba()[0], new Object[0]);
        }
        if (bby_22 == bby_2.hCD) {
            return aum_0.cWf().c("reward.learnRecipe", new Object[0]);
        }
        if (bby_22 == bby_2.hCE) {
            return n;
        }
        if (bby_22 == bby_2.hCF) {
            return aum_0.cWf().c("guild.pointsGain", n);
        }
        if (bby_22 == bby_2.hCJ) {
            return aum_0.cWf().a(3, (long)n, new Object[0]);
        }
        if (bby_22 == bby_2.hCI) {
            return aum_0.cWf().a(36, (long)n, new Object[0]);
        }
        return null;
    }

    public bcl_1 dbV() {
        return this.hGx;
    }

    public boolean dbW() {
        return this.dbT() > 0;
    }

    public int dbX() {
        int[] nArray = this.hGx.dba();
        return nArray != null && nArray.length > 0 ? nArray[0] : 0;
    }

    public fhc_0 dbY() {
        return fgD.fXh().Vd(this.dbX());
    }

    public bmx_0 dbZ() {
        long l = csc_1.eNJ().KU();
        bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(l);
        int n = this.dbX();
        bmt_0 bmt_02 = bmb_0.eeV().If(n);
        return new bmx_0(bmt_02, 0, -1L, bgt_02);
    }

    public boolean dca() {
        int n = this.hGx.dbb().d();
        return n != bby_2.hCJ.d() && n != bby_2.hCy.d();
    }

    @Override
    public ffV getItem() {
        if (this.hGx == null || this.hGx.dbb() != bby_2.hCy) {
            return null;
        }
        fhc_0 fhc_02 = this.dbY();
        if (fhc_02 == null) {
            return null;
        }
        return new ffT(fhc_02);
    }

    public boolean bqp() {
        return this.hGz;
    }
}

