/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bGZ
 */
public class bgz_2 {
    public static void bd(ffV ffV2) {
        aPd.e("item.unDeletable", new Object[0]);
    }

    private static String K(ArrayList<ffV> arrayList) {
        Object object = "";
        boolean bl = true;
        for (ffV ffV2 : arrayList) {
            if (!bl) {
                object = (String)object + ", ";
            }
            object = (String)object + aum_0.cWf().c("item.quantity", ffV2.bfd(), aPe.a(ffV2));
            bl = false;
        }
        return object;
    }

    public static void a(ffV ffV2, exP exP2) {
        bgz_2.b(ffV2, exP2);
    }

    public static void b(ffV ffV2, exP exP2) {
        bgz_2.b(ffV2, ffV2.bfd(), exP2);
    }

    public static void a(ffV ffV2, int n, exP exP2) {
        bgz_2.b(ffV2, n, exP2);
    }

    public static void b(ffV ffV2, int n, exP exP2) {
        if (ffV2.bqp()) {
            return;
        }
        String string = aum_0.cWf().c("item.selfLoot", aum_0.cWf().c("item.quantity", n, aPe.a(ffV2)));
        aPh.czg().iZ(string);
        exP exP3 = exP2;
        if (exP3 == null) {
            exP3 = aue_0.cVJ().cVK();
        }
        bgz_2.a(ffV2.avr(), (anz_1)exP3, (fjm)exP3);
    }

    public static void be(ffV ffV2) {
        bgz_2.f(ffV2, ffV2.bfd());
    }

    public static void dK(int n, int n2) {
        ffV ffV2 = fgD.fXh().Ve(n);
        bgz_2.f(ffV2, n2);
    }

    public static void e(ffV ffV2, int n) {
        bgz_2.f(ffV2, n);
    }

    public static void f(ffV ffV2, int n) {
        if (ffV2.bqp()) {
            return;
        }
        String string = aum_0.cWf().c("item.selfDrop", aum_0.cWf().c("item.quantity", n, aPe.a(ffV2)));
        aPh.czg().iZ(string);
    }

    public static void a(int n, anz_1 anz_12, fjm fjm2) {
        Object r = fgD.fXh().Vd(n);
        if (r != null && !((fhc_0)r).bqp() && anz_12 != null) {
            bgz_2.a(r, anz_12, fjm2);
        }
    }

    private static void a(fhc_0 fhc_02, anz_1 anz_12, fjm fjm2) {
        xp_0 xp_02 = new xp_0();
        xo_0 xo_02 = new xo_0(auc_0.cVq().a(fjm2, fhc_02), 32, 32, (xu_0)xp_02, 3000);
        xo_02.a(anz_12);
        int n = xd_0.bnv().b(anz_12, 4);
        xo_02.qC(n * 500);
        xd_0.bnv().a(xo_02);
    }
}

