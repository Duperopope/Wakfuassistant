/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bLs
 */
public class bls_2
implements aeh_2 {
    public static final String ksK = "rewards";
    public static final String ksL = "categories";
    public static final String ksM = "types";
    public static final String ksN = "currentCategory";
    public static final String ksO = "currentType";
    private final ArrayList<blt_2> ksP = new ArrayList();
    private final ArrayList<blu_2> ksQ = new ArrayList();
    private blt_2 ksR;
    private blu_2 ksS;

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(ksK)) {
            an_0 an_02 = aue_0.cVJ().cVO().aCz();
            if (an_02 == null) {
                return null;
            }
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (bgt_02 == null) {
                return null;
            }
            boolean bl = bgt_02.Xt() != 0;
            ArrayList<bsu_0> arrayList = new ArrayList<bsu_0>(5);
            for (AS aS : an_02.aAR()) {
                Object object;
                if (this.ksR.ecG() != null && this.ksR.ecG().d() != aS.aFc().aEd().getNumber()) continue;
                if (this.ksS.ecH() == null || this.ksS.ecH() == blr_2.ksB) {
                    for (aj_0 aj_02 : aS.aFe()) {
                        object = aj_02.aEv();
                        int n = (int)object.aBF();
                        arrayList.add(new bsu_0(new bmj_2(n, (fhc_0)fgD.fXh().Vd(aj_02.acs()), aS, (Ab)object)));
                    }
                }
                for (Ab ab : aS.aFh()) {
                    object = ab.aBE();
                    blr_2 blr_22 = blr_2.HU(((ax_0)((Object)object)).getNumber());
                    if (blr_22 == null || !blr_22.isVisible() || this.ksS.ecH() != null && this.ksS.ecH() != blr_22 || !bl && (blr_22 == blr_2.ksE || blr_22 == blr_2.ksD)) continue;
                    arrayList.add(new bsu_0(new bmj_2(1, (fhc_0)fgD.fXh().Vd(blr_22.AK()), aS, ab)));
                }
            }
            return arrayList;
        }
        if (string.equals(ksL)) {
            return this.ksP;
        }
        if (string.equals(ksM)) {
            return this.ksQ;
        }
        if (string.equals(ksN)) {
            return this.ksR;
        }
        if (string.equals(ksO)) {
            return this.ksS;
        }
        return null;
    }

    public void a(blt_2 blt_22) {
        this.ksR = blt_22;
        fse_1.gFu().a((aef_2)this, ksN, ksK);
    }

    public void a(blu_2 blu_22) {
        this.ksS = blu_22;
        fse_1.gFu().a((aef_2)this, ksO, ksK);
    }

    public blt_2 ecD() {
        return this.ksR;
    }

    public blu_2 ecE() {
        return this.ksS;
    }

    public void ecF() {
        blu_2 blu_22 = new blu_2();
        this.ksQ.add(blu_22);
        this.ksS = blu_22;
        for (blr_2 blr_22 : blr_2.values()) {
            if (!blr_22.isVisible()) continue;
            this.ksQ.add(new blu_2(blr_22));
        }
        blt_2 blt_22 = new blt_2();
        this.ksP.add(blt_22);
        this.ksR = blt_22;
        for (blq_2 blq_22 : blq_2.values()) {
            this.ksP.add(new blt_2(blq_22));
        }
    }
}

