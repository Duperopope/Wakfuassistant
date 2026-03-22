/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from feE
 */
public class fee_0 {
    private static final Logger sex = Logger.getLogger(fee_0.class);
    private final fec_0 sey;
    private final xw_1 sez;
    private final ffk seA;

    public fee_0(fec_0 fec_02, xw_1 xw_12, ffk ffk2) {
        this.sey = fec_02;
        this.sez = xw_12;
        this.seA = ffk2;
    }

    void fUE() {
        this.sey.a(new fef_0(this.sez));
    }

    public static xx_2 h(ffm ffm2) {
        xx_2 xx_22 = new xx_2();
        xx_22.aaQ = ffm2.acs();
        xx_22.aaa = ffm2.bfd();
        return xx_22;
    }

    public void fUF() {
        fec_0 fec_02 = this.sey;
        fec_02.clear();
        int n = this.sez.ajV.size();
        for (int i = 0; i < n; ++i) {
            xx_2 xx_22 = this.sez.ajV.get(i);
            try {
                ffm ffm2 = fee_0.a(xx_22, this.seA);
                if (ffm2 == null) continue;
                fec_02.c(ffm2);
                continue;
            }
            catch (ffq ffq2) {
                sex.error((Object)("Probl\u00e8me \u00e0 la d\u00e9-serialisation de l'item " + String.valueOf(xx_22)), (Throwable)ffq2);
            }
        }
    }

    @Nullable
    public static ffm a(xx_2 xx_22, ffk ffk2) {
        fhc_0 fhc_02 = (fhc_0)ffk2.UF(xx_22.aaQ);
        if (fhc_02 == null) {
            throw new ffq("Impossible de trouver le refItem " + xx_22.aaQ);
        }
        if (!fhc_02.c(fgg_0.sia)) {
            if (fhc_02.c(fgg_0.sit)) {
                return null;
            }
            throw new ffq("Item " + fhc_02.d() + " / " + fhc_02.getName() + " should not be in quest inventory");
        }
        feg_0 feg_02 = new feg_0(fhc_02);
        feg_02.ak(GC.b(fhc_02.bfe(), xx_22.aaa));
        return feg_02;
    }

    public String toString() {
        return "QuestInventorySerializer{m_inventory=" + String.valueOf(this.sey) + "}";
    }
}

