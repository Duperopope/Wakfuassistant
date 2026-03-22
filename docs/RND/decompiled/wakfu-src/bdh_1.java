/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bdh
 */
public class bdh_1 {
    public static final int hKh = 1000000;
    public static final int hKi = 990000;

    public static int BA(int n) {
        return n % 10;
    }

    public static int BB(int n) {
        return n / 10;
    }

    public static boolean BC(int n) {
        return n >= 1000000;
    }

    public static boolean BD(int n) {
        return n >= 990000 && !bdh_1.BC(n);
    }

    public static bdj_2 a(eIz eIz2) {
        Object r;
        bdi_1 bdi_12 = new bdi_1();
        bdi_12.c(bfq_2.dge().BO(eIz2.aWP()).dfW());
        bdi_12.aQ(eIz2.aWO());
        dR dR2 = eIz2.fwD();
        bdi_12.v(dR2.sC(), true);
        bdi_12.w(dR2.sE(), true);
        bdi_12.x(dR2.sG(), true);
        bdi_12.dkp();
        bdi_12.a(dR2, true);
        bdi_12.c((byte)dR2.sU(), true);
        bdi_12.d((byte)dR2.sW(), true);
        bdi_12.dkq();
        bdj_2 bdj_22 = bdi_12.ddI();
        if (dR2.tb() && dR2.tc() > 0 && (r = fgD.fXh().Vd(dR2.tc())) != null) {
            bdj_22.a((fhc_0)r, (short)ffS.sgB.shb);
        }
        if (dR2.td() && dR2.te() > 0 && (r = fgD.fXh().Vd(dR2.te())) != null) {
            bdj_22.a((fhc_0)r, (short)ffS.sgE.shb);
        }
        if (dR2.tf() && dR2.tg() > 0 && (r = fgD.fXh().Vd(dR2.tg())) != null) {
            bdj_22.a((fhc_0)r, (short)ffS.sgG.shb);
        }
        bdj_22.dT("AnimStatique");
        bdj_22.dV("AnimStatique");
        return bdi_12.ddI();
    }

    public static String BE(int n) {
        if (bdh_1.BC(n)) {
            return "npcGfxPath";
        }
        if (bdh_1.BD(n)) {
            return "petGfxPath";
        }
        return "playerGfxPath";
    }
}

