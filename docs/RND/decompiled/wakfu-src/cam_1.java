/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from cam
 */
class cam_1 {
    private final TIntObjectHashMap<acc_1> lGb = new TIntObjectHashMap();
    private final TIntObjectHashMap<acc_1> lGc = new TIntObjectHashMap();
    private final TIntObjectHashMap<awk_1> lGd = new TIntObjectHashMap();
    private final String lGe;
    private final String lGf;
    private float azQ;
    static final /* synthetic */ boolean lGg;

    cam_1(String string, String string2) {
        this.lGe = string;
        this.lGf = string2;
    }

    awk_1 qW(int n) {
        if (!lGg && this.lGb.isEmpty()) {
            throw new AssertionError((Object)"appeller initialize avant");
        }
        awk_1 awk_12 = (awk_1)this.lGd.get(n);
        if (awk_12 != null) {
            return awk_12;
        }
        acc_1 acc_12 = this.Kd(n);
        if (acc_12 == null) {
            cal_1.lFX.error((Object)("pas de texture " + n));
            return null;
        }
        String string = null;
        try {
            string = fo_0.bB(auc_0.cVq().bS(this.lGe) + n + ".tga");
        }
        catch (fu_0 fu_02) {
            cal_1.lFX.error((Object)"", (Throwable)fu_02);
        }
        long l = arn_2.fX(string);
        awk_12 = awm_1.bPn().b((art_1)aru_2.cVG.bIv(), l, string, false);
        if (awk_12 == null) {
            cal_1.lFX.error((Object)("la texture " + string + " n'existe pas?"));
            return null;
        }
        if (awk_12.bPc() != null) {
            awk_12.dm(true);
        }
        awk_12.bGY();
        this.lGd.put(n, (Object)awk_12);
        awk_12.ve(0).A((short)acc_12.bWx(), (short)acc_12.bWy());
        return awk_12;
    }

    acc_1 Kc(int n) {
        return (acc_1)this.lGc.get(n);
    }

    public acc_1 Kd(int n) {
        return (acc_1)this.lGb.get(n);
    }

    float getScale() {
        return this.azQ;
    }

    void erg() {
        this.lGd.forEachValue((TObjectProcedure)new can_1(this));
        this.lGd.clear();
    }

    void aPg() {
        String string = auc_0.kG(this.lGf);
        aqr_2 aqr_22 = aqr_2.bGR();
        aqr_22.ex(string);
        aqs_2 aqs_22 = aqr_22.bGS();
        aqr_22.a(aqs_22, new ape_1[0]);
        aqt_2 aqt_22 = aqs_22.bGT();
        for (apd_1 apd_12 : aqt_22.fo("offset")) {
            int n = apd_12.fq("id").bCo();
            int n2 = apd_12.fq("x").bCo();
            int n3 = apd_12.fq("y").bCo();
            this.lGb.put(n, (Object)new acc_1(n2, n3));
            int n4 = apd_12.fq("cell_x").bCo();
            int n5 = apd_12.fq("cell_y").bCo();
            this.lGc.put(n, (Object)new acc_1(n4, n5));
        }
        this.lGc.compact();
        this.lGb.compact();
        this.azQ = aqt_22.fq("scale").bCs();
        aqr_22.close();
    }

    static {
        lGg = !cal_1.class.desiredAssertionStatus();
    }
}

