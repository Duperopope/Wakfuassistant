/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bah
 */
public class bah_0
implements afl {
    private static final Logger hyO = Logger.getLogger(bah_0.class);

    public void a(WL wL) {
        aqb_1.bGD().a(new aoq_0(), new bai(this));
        wL.b(this);
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.resource", new Object[0]);
    }

    public static bKT a(aoq_0 aoq_02) {
        bKT bKT2;
        int n = aoq_02.d();
        HashMap<Long, int[]> hashMap = aoq_02.cuH();
        int n2 = aoq_02.aeV();
        int n3 = aoq_02.cuG();
        boolean bl = aoq_02.cuz();
        short s = aoq_02.aKu();
        int[] nArray = aoq_02.ckm();
        short s2 = aoq_02.cux();
        short s3 = aoq_02.cuy();
        boolean bl2 = aoq_02.cuA();
        fqa_0 fqa_02 = fqa_0.YR(aoq_02.cuw());
        if (aoq_02.cuC()) {
            bKT2 = new bKQ(n, (short)n2, s2, s3, fqa_02, bl, s, hashMap, n3, bl2);
            ((bKQ)bKT2).E(aoq_02.cuE());
            ((bKQ)bKT2).ca(aoq_02.cuD());
        } else {
            bKT2 = new bKT(n, (short)n2, s2, s3, fqa_02, bl, s, hashMap, n3, bl2);
        }
        for (int i = 0; i < nArray.length; ++i) {
            int n4 = nArray[i];
            fqi_0 fqi_02 = fqi_0.YT(n4);
            if (fqi_02 == null) {
                hyO.error((Object)("Impossible de trouver la propri\u00e9t\u00e9 " + n4 + " d\u00e9finie pour la ressource " + n));
                continue;
            }
            bKT2.a(fqi_02);
        }
        bLc bLc2 = new bLc(0, 0, fsi_0.tbX, null, 0.0f);
        bKT2.a(bLc2);
        bKT2.YM(aoq_02.cuF().length);
        for (aOr aOr2 : aoq_02.cuF()) {
            bah_0.a(bKT2, aOr2);
        }
        return bKT2;
    }

    private static void a(bKT bKT2, aOr aOr2) {
        int n = aOr2.cuJ();
        int n2 = aOr2.wp();
        byte by = (byte)aOr2.wp();
        int n3 = aOr2.cuK();
        fsi_0[] fsi_0Array = fsi_0.values();
        float[] fArray = null;
        float f2 = 0.0f;
        int n4 = aOr2.cuM();
        if (n4 != 0) {
            fArray = new awx_2(n4).bQj();
            f2 = aOr2.cuL();
        }
        bLc bLc2 = new bLc(n, by, fsi_0Array[n3], fArray, f2);
        bKT2.a(bLc2);
        bLc2.YO(aOr2.cuI().length);
        for (aos_0 aos_02 : aOr2.cuI()) {
            bmv_2 bmv_22 = bah_0.a(bKT2.d(), n2, aos_02);
            bLc2.b(bmv_22);
        }
    }

    @Nullable
    private static bmv_2 a(int n, int n2, aos_0 aos_02) {
        ang_2 ang_22;
        int n3 = aos_02.d();
        int n4 = aos_02.cuO();
        int n5 = aos_02.cks();
        int n6 = aos_02.csx();
        int n7 = aos_02.csy();
        int n8 = aos_02.cuP();
        int n9 = aos_02.csA();
        int n10 = aos_02.getDuration();
        byte by = (byte)aos_02.cuT();
        String string = aos_02.clB();
        boolean bl = aos_02.cuR();
        int n11 = aos_02.cuQ();
        int n12 = aos_02.aVt();
        int[] nArray = aos_02.cuS();
        boolean bl2 = aos_02.csC();
        float f2 = aos_02.cmu();
        bmt_1 bmt_12 = new bmt_1(n11, n12);
        try {
            ang_22 = ehu_0.rY(string);
        }
        catch (Exception exception) {
            hyO.error((Object)("Erreur de compilation du crit\u00e8rre sur l'action de collecte de ressource " + aos_02.d() + " de la ressource " + n));
            return null;
        }
        return new bmv_2(n3, n2, n5, n6, n8, n10, n9, n7, ang_22, bl, n4, by, bmt_12, bl2, nArray, f2);
    }
}

