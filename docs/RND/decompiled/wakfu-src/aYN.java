/*
 * Decompiled with CFR 0.152.
 */
class aYN
implements aqg_1<aMk> {
    aYN(aYM aYM2) {
    }

    public void a(aMk aMk2) {
        ang_2 ang_22;
        int n = aMk2.d();
        short s = (short)aMk2.clO();
        try {
            ang_22 = ehu_0.rY(aMk2.cnu());
        }
        catch (Exception exception) {
            aYM.hxY.error((Object)("Probl\u00e8me \u00e0 la compilation d'un crit\u00e8re dans le challenge d'id " + n + " : " + aMk2.cnu()));
            ang_22 = null;
        }
        if (ang_22 == null) {
            ang_22 = amz_2.cIw;
        }
        int n2 = aMk2.LR();
        int n3 = aMk2.cnv();
        int n4 = aMk2.cnw();
        int n5 = aMk2.aVt();
        boolean bl = aMk2.cnx();
        ews_1 ews_12 = new ews_1(n, s, ang_22, n2, n3, n4, n5, bl);
        ews_12.O(aMk2.cny());
        ews_12.P(aMk2.cnz());
        for (aMl aMl2 : aMk2.cnA()) {
            ang_2 ang_23;
            int n6 = aMl2.d();
            try {
                ang_23 = ehu_0.rY(aMl2.aGr());
            }
            catch (Exception exception) {
                aYM.hxY.error((Object)("Probl\u00e8me \u00e0 la compilation d'un crit\u00e8re dans le challenge d'id " + n + " : " + aMk2.cnu()));
                ang_23 = null;
            }
            if (ang_23 == null) {
                ang_23 = amz_2.cIw;
            }
            short s2 = aMl2.cnB();
            short s3 = aMl2.cnC();
            ews_12.a(n6, ang_23, s2, s3);
        }
        ewu_1.rCG.c(ews_12);
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((aMk)aqz_22);
    }
}

