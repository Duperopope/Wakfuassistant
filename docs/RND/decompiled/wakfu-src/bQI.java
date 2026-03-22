/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class bQI
implements aeh_2 {
    public static final String kWx = "iconUrl";
    public static final String kWy = "name";
    public static final String kWz = "surface";
    public static final String kWA = "description";
    public static final String kWB = "effects";
    public static final String kWC = "sidoaNeed";
    public static final String kWD = "buildDelay";
    public static final String kWE = "conditions";
    public static final String kWF = "ressourcesCost";
    public static final String kWG = "kamasCost";
    public static final String kWH = "canBeDestroyed";
    public static final String[] kWI = new String[]{"iconUrl", "name", "surface", "description", "effects", "sidoaNeed", "buildDelay", "conditions", "ressourcesCost", "kamasCost", "canBeDestroyed"};
    private final fbk_0 kWJ;
    private final cal_1 kWK;

    public bQI(fbk_0 fbk_02, cal_1 cal_12) {
        this.kWJ = fbk_02;
        this.kWK = cal_12;
    }

    @Override
    public String[] bxk() {
        return kWI;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kWx)) {
            return this.ejS();
        }
        if (string.equals(kWy)) {
            return this.getName();
        }
        if (string.equals(kWG)) {
            fbk_0 fbk_02 = this.ejT();
            if (fbk_02 == null) {
                return null;
            }
            long l = fsl_0.a(fbk_02, bRb.kYS.ekv());
            return aum_0.cWf().cQ(l);
        }
        if (string.equals(kWz)) {
            cal_2 cal_22 = (cal_2)cam_2.lHu.aag(this.kWJ.conn());
            if (cal_22 == null) {
                return "Mod\u00e8le de batiment inconnu";
            }
            return cal_22.getWidth() + "x" + cal_22.getHeight();
        }
        if (string.equals(kWA)) {
            fby_0 fby_02 = fbo_0.eD(this.kWJ.aIi());
            return aum_0.cWf().a(123, (long)fby_02.fSr(), new Object[0]);
        }
        if (string.equals(kWB)) {
            return this.dqX();
        }
        if (string.equals(kWC)) {
            if (this.kWJ == null) {
                return 0;
            }
            return this.kWJ.fSc();
        }
        if (string.equals(kWD)) {
            ua_0 ua_02 = this.ejQ();
            if (ua_02.aJG()) {
                return null;
            }
            int n = ua_02.bjR();
            int n2 = ua_02.bjE();
            int n3 = ua_02.bjF();
            return aum_0.cWf().c("remainingDurationShort", n, n2, n3, ua_02);
        }
        if (string.equals(kWF)) {
            if (this.kWJ.coy()) {
                return null;
            }
            int n = fsl_0.b(this.kWJ, bRb.kYS.ekv());
            return aum_0.cWf().cQ(n);
        }
        if (string.equals(kWH)) {
            return this.kWJ.bcI();
        }
        return null;
    }

    public ArrayList<String> dqX() {
        if (this.kWJ.coy()) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList2 = fbo_0.h(this.kWJ);
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return arrayList.isEmpty() ? null : arrayList;
    }

    private ua_0 ejQ() {
        if (this.kWJ.coy()) {
            return uz_0.bwa;
        }
        return fbo_0.c(this.kWJ);
    }

    public ua_0 ejR() {
        if (this.kWJ.coy()) {
            return uz_0.bwa;
        }
        return fbo_0.d(this.kWJ);
    }

    public String getName() {
        return aum_0.cWf().a(126, (long)this.kWJ.aIi(), new Object[0]);
    }

    public int conn() {
        fbk_0 fbk_02 = this.ejT();
        if (fbk_02 == null) {
            return -1;
        }
        return fbk_02.conn();
    }

    public awk_1 ejS() {
        fbk_0 fbk_02 = this.ejT();
        if (fbk_02 == null) {
            return null;
        }
        return this.kWK.JZ(fbk_02.conn());
    }

    private fbk_0 ejT() {
        return fbo_0.e(this.kWJ);
    }

    public fbk_0 ejU() {
        return this.kWJ;
    }
}

