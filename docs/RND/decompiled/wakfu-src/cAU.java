/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class cAU
implements aif_2,
cBg {
    public static final byte mpN = 0;
    public static final byte mpO = 1;
    private final aah_1<cAV> mpP = new aah_1();
    private String mpL;
    private float mpQ = 1.0f;

    @Override
    public aix_2 e(byte by, byte by2) {
        cAV cAV2 = this.mpP.vK(by);
        if (cAV2 == null) {
            return null;
        }
        return cAV2.dS(by2);
    }

    @Override
    public float bBj() {
        return this.mpQ;
    }

    public void aUI() {
        this.oR(this.mpL);
    }

    public void oR(String string) {
        this.mpL = string;
        aqr_2 aqr_22 = new aqr_2();
        aqs_2 aqs_22 = new aqs_2();
        aqr_22.ex(string);
        aqr_22.a(aqs_22, new ape_1[0]);
        aqr_22.close();
        this.mpP.clear();
        aqt_2 aqt_22 = aqs_22.bGT();
        ArrayList<apd_1> arrayList = aqt_22.fp("fightFspGain");
        if (arrayList != null) {
            for (apd_1 apd_12 : arrayList) {
                apd_1 apd_13 = apd_12.fq("value");
                if (apd_13 == null) continue;
                this.mpQ = apd_13.bCs();
                break;
            }
        }
        for (apd_1 apd_12 : aqt_22.fp("ground")) {
            int n = 0;
            apd_1 apd_14 = apd_12.fq("type");
            if (apd_14 != null) {
                n = apd_14.bCo();
            }
            cAV cAV2 = new cAV();
            apd_1 apd_15 = apd_12.fn("walk");
            for (apd_1 apd_13 : apd_15.fp("sound")) {
                Object object = this.n(apd_13);
                if (object == null) continue;
                cAV2.a((aix_2)object, (byte)0);
            }
            apd_1 apd_16 = apd_12.fn("run");
            for (Object object : apd_16.fp("sound")) {
                aix_2 aix_22 = this.n((apd_1)object);
                if (aix_22 == null) continue;
                cAV2.a(aix_22, (byte)1);
            }
            this.mpP.b(n, cAV2);
        }
    }
}

