/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from acz
 */
public class acz_0
implements Uu,
acv_0 {
    private static final Logger cgG = Logger.getLogger(acz_0.class);
    public static final acz_0 cgH = new acz_0();
    private static final TByteObjectHashMap<aao_0> cgI = new TByteObjectHashMap();
    private final asr_2 cgJ = new asr_2(0.0f, 0.0f, 0.0f);
    private acb_0 cgK;
    private float caG;
    private float caH;
    private float caI;
    private boolean cgL;
    private float axp;
    private float axq;
    private float axr;
    private boolean cgM;

    public void cb(boolean bl) {
        this.cgM = bl;
    }

    public void a(acb_0 acb_02) {
        this.cgK = acb_02;
    }

    @Override
    public void onCalendarEvent(Uv uv, ut_0 ut_02) {
        switch (uv) {
            case bvz: {
                this.d(ut_02);
            }
        }
    }

    public void btI() {
        this.axp = 1.0f;
        this.caG = 1.0f;
        this.axq = 1.0f;
        this.caH = 1.0f;
        this.axr = 1.0f;
        this.caI = 1.0f;
        this.cgJ.m(1.0f, 1.0f, 1.0f);
    }

    @Override
    public int bpb() {
        return 0;
    }

    @Override
    public boolean bpa() {
        return arn_2.aY(this.axp, 1.0f) && arn_2.aY(this.axq, 1.0f) && arn_2.aY(this.axr, 1.0f);
    }

    @Override
    public boolean btH() {
        return true;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        fArray[0] = fArray[0] * this.axp;
        fArray[1] = fArray[1] * this.axq;
        fArray[2] = fArray[2] * this.axr;
    }

    @Override
    public void qF(int n) {
        this.cgJ.qF(n);
        this.axp = this.cgJ.aIU();
        this.axq = this.cgJ.aIV();
        this.axr = this.cgJ.aIW();
        if (this.cgL) {
            this.cgJ.a(this.caG, this.caH, this.caI, 1000);
            this.cgL = false;
        }
        float f2 = this.btJ();
        acq_0.cge.cj(f2);
    }

    private float btJ() {
        if (!this.cgM) {
            return 1.0f;
        }
        float f2 = 0.3705f;
        float f3 = 2.318223f;
        return 2.318223f * this.btK() * this.btK() + 1.0f - 2.318223f;
    }

    public float btK() {
        return this.axp * 0.212671f + this.axq * 0.71516f + this.axr * 0.072169f;
    }

    public void ek(String string) {
        aqr_2 aqr_22 = aqr_2.bGR();
        aqs_2 aqs_22 = aqr_22.bGS();
        aqr_22.ex(string);
        aqr_22.a(aqs_22, new ape_1[0]);
        aqr_22.close();
        ArrayList<apd_1> arrayList = aqs_22.bGT().fo("season");
        if (arrayList == null) {
            cgG.error((Object)"Unable to find a season node");
            return;
        }
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            apd_1 apd_12 = arrayList.get(i);
            byte by = apd_12.fq("id").bCn();
            ArrayList<apd_1> arrayList2 = apd_12.fo("hour");
            if (arrayList2 == null) {
                cgG.error((Object)"Unable to find hour node");
                return;
            }
            int n2 = arrayList2.size();
            for (int j = 0; j < n2; ++j) {
                apd_1 apd_13 = arrayList2.get(j);
                byte by2 = apd_13.fq("dayPercentage").bCn();
                float f2 = (float)apd_13.fq("red").bCo() / 255.0f;
                float f3 = (float)apd_13.fq("green").bCo() / 255.0f;
                float f4 = (float)apd_13.fq("blue").bCo() / 255.0f;
                acz_0.a(by, by2, f2, f3, f4);
            }
        }
    }

    private static void a(byte by, byte by2, float f2, float f3, float f4) {
        aao_0 aao_02 = (aao_0)cgI.get(by);
        if (aao_02 == null) {
            aao_02 = new aao_0();
            cgI.put(by, (Object)aao_02);
        }
        aao_02.a(by2, f2, f3, f4);
    }

    private float b(ut_0 ut_02) {
        if (this.cgK == null) {
            return ut_02.bjf();
        }
        return this.cgK.e(ut_02);
    }

    public void c(ut_0 ut_02) {
        this.d(ut_02);
        this.cgJ.m(this.caG, this.caH, this.caI);
    }

    public void d(ut_0 ut_02) {
        if (!ut_02.bjo()) {
            return;
        }
        ux_0 ux_02 = ut_02.bjc();
        if (ux_02 == null || ux_02.bjv()) {
            cgG.error((Object)"Pas de date d\u00e9finie dans le calendar");
            return;
        }
        ub_0 ub_02 = ut_02.bjn();
        if (ub_02 == null) {
            cgG.error((Object)"Pas de saison d\u00e9finie dans le calendar");
            return;
        }
        aao_0 aao_02 = (aao_0)cgI.get(ub_02.bjT());
        if (aao_02 == null) {
            cgG.error((Object)("Saison " + String.valueOf((Object)ub_02) + " inconnu du DayLightDefinitionManager"));
            return;
        }
        float f2 = this.b(ut_02);
        aap aap2 = aao_02.rc((int)f2);
        aap aap3 = aao_02.a(aap2);
        byte by = aap2.brh();
        int n = aap3.brh();
        if (f2 < (float)by) {
            f2 += 100.0f;
        }
        if (f2 > (float)n) {
            n += 100;
        }
        float f3 = (f2 - (float)by) / (float)(n - by);
        if (this.cgM) {
            this.caG = GC.a(aap2.aIU(), aap3.aIU(), f3);
            this.caH = GC.a(aap2.aIV(), aap3.aIV(), f3);
            this.caI = GC.a(aap2.aIW(), aap3.aIW(), f3);
            this.cgL = true;
        } else {
            this.caI = 1.0f;
            this.caH = 1.0f;
            this.caG = 1.0f;
            this.cgL = true;
            this.cgJ.m(0.0f, 0.0f, 0.0f);
        }
    }
}

