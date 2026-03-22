/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from btn
 */
public class btn_0 {
    private static final Logger jlg = Logger.getLogger(btn_0.class);
    public static final int jlh = 0;

    public static int b(bdj_2 bdj_22, bth_0 bth_02) {
        bth_02.x(bdj_22);
        return bth_02.w(bdj_22);
    }

    public static int c(bdj_2 bdj_22, bth_0 bth_02) {
        bth_02.u(bdj_22);
        return bth_02.v(bdj_22);
    }

    public static void a(bdj_2 bdj_22, int n, int n2) {
        if (n2 == n) {
            return;
        }
        if (n2 != -1) {
            bdj_22.bg(ffS.sgQ.shb);
            bdj_22.a(n2, (short)ffS.sgQ.shb, n2 != 2192145);
        }
    }

    public static int d(bdj_2 bdj_22, bth_0 bth_02) {
        bth_0 bth_03 = bdj_22.dcX();
        int n = bth_03.v(bdj_22);
        if (n == 0) {
            bth_03.u(bdj_22);
            bdj_22.a(bth_02);
            bth_02.x(bdj_22);
        } else {
            bdj_22.a(new bto_0(bdj_22, bth_02));
            bth_03.u(bdj_22);
        }
        return n + bth_02.w(bdj_22);
    }

    public static void b(int n, int n2, int n3, bgy bgy2) {
        btm_0 btm_02 = new btm_0(bgy2);
        btn_0.a(n, n2, n3, bgy2.Sn(), btm_02);
    }

    public static void a(int n, int n2, int n3, bgy bgy2, fhy_0 fhy_02, int n4) {
        btq_1 btq_12 = new btq_1(fhy_02, n4);
        btn_0.a(n, n2, n3, bgy2.Sn(), btq_12);
    }

    private static void a(int n, int n2, int n3, long l, bth_0 bth_02) {
        auxx_0 auxx_02 = new auxx_0(n, eui_1.rsw.aJr(), n2, n3, l, bth_02);
        aVi.cWF().a(n3, (aft_2)auxx_02);
    }

    public static void bw(bgy bgy2) {
        bth_0 bth_02;
        Object object;
        if (bgy2 instanceof bhJ) {
            Object r;
            fhy_0 fhy_02;
            int n;
            int n2;
            object = bgy2.dkE();
            int n3 = n2 = object != null ? object.get(ffS.sgQ.shb) : 0;
            if (n2 <= 0) {
                n2 = 2145;
            }
            if ((n = btq_1.d(fhy_02 = ((fhc_0)(r = fgD.fXh().Vd(n2))).dGh())) == 237) {
                bth_02 = new btm_0(bgy2);
            } else {
                int n4 = ((fhc_0)r).aVt();
                bth_02 = new btq_1(fhy_02, n4);
                btn_0.a(bgy2.ddI(), -1, n4);
            }
        } else {
            bth_02 = new btm_0(bgy2);
        }
        object = bgy2.ddI();
        ((bdj_2)object).a(bth_02);
    }

    public static int bx(bgy bgy2) {
        int n;
        bgy2.dkL();
        bdj_2 bdj_22 = bgy2.ddI();
        if (bdj_22.bqd() == null) {
            bdj_22.dcX().x(bdj_22);
            return 0;
        }
        if (bdj_22.bqd().aLB()) {
            bth_0 bth_02 = bdj_22.dcX();
            n = bth_02.w(bdj_22);
            bth_02.x(bdj_22);
        } else {
            bdj_22.d(new btp_0(bdj_22));
            n = 0;
        }
        return n;
    }
}

