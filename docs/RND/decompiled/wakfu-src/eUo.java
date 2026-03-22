/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class eUo {
    private static final Logger rup = Logger.getLogger(eUo.class);
    private static final acd_1 ruq = new acd_1();
    private static final acd_1 rur = new acd_1();
    private static final int rus = 6;
    public static final float rut = 0.8f;

    public static boolean a(anu_1 anu_12, etu_0 etu_02, int n, int n2, short s) {
        return eUo.a(anu_12, etu_02.bag(), n, n2, s, etu_02.dy(n, n2));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean a(anu_1 anu_12, rh_0 rh_02, int n, int n2, short s, anu_1 anu_13) {
        boolean bl;
        if (anu_12 == null) {
            return false;
        }
        int n3 = anu_12.bcC();
        int n4 = anu_12.bcD();
        short s2 = anu_12.bcE();
        int n5 = 6;
        if (anu_13 != null) {
            n5 = (short)Math.max((float)anu_13.bcN() * 0.8f, 6.0f);
        }
        if (anu_12 instanceof rj_0) {
            rh_02.d((rj_0)((Object)anu_12));
        }
        try {
            bl = eUo.a(n3, n4, s2, anu_12.bcN(), n, n2, s, n5, rh_02);
        }
        catch (Exception exception) {
            rup.error((Object)"Exception levee", (Throwable)exception);
            bl = false;
        }
        finally {
            rh_02.bdH();
        }
        return bl;
    }

    public static boolean a(int n, int n2, short s, int n3, int n4, int n5, short s2, wz_0 wz_02) {
        return eUo.a(n, n2, s, n3, n4, n5, s2, 6, wz_02);
    }

    public static boolean a(int n, int n2, short s, int n3, int n4, int n5, short s2, int n6, wz_0 wz_02) {
        short s3 = (short)((float)n3 * 0.8f);
        if (s3 < 0) {
            return true;
        }
        ruq.Q(n, n2, s);
        ruq.aM((short)(ruq.bdi() + s3));
        rur.Q(n4, n5, s2);
        rur.aM((short)(rur.bdi() + n6));
        sj_0 sj_02 = sj_0.bfS();
        sj_02.a(wz_02);
        sj_02.k(ruq.getX(), ruq.getY(), ruq.bdi());
        sj_02.l(n4, n5, s2);
        boolean bl = sj_02.bfV();
        if (bl) {
            sj_02.aZp();
            return true;
        }
        if (n6 == 0) {
            sj_02.aZp();
            return false;
        }
        sj_02.l(rur.getX(), rur.getY(), rur.bdi());
        boolean bl2 = sj_02.bfV();
        sj_02.aZp();
        return bl2;
    }
}

