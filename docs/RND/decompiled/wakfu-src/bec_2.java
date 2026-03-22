/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from beC
 */
public class bec_2 {
    private static final Logger hNH = Logger.getLogger(bec_2.class);

    public static void b(ero_0 ero_02, String string, String string2, String string3) {
        bei_2 bei_22 = bei_2.lp(string);
        if (bei_22 == null) {
            hNH.error((Object)("Mauvais param\u00e8tres " + string + "ne correspondant \u00e0 aucun HMIProviderType"), (Throwable)new IllegalArgumentException());
            return;
        }
        bej_2 bej_22 = bej_2.lq(string3);
        if (bej_22 == null) {
            hNH.error((Object)("Mauvais param\u00e8tres " + string3 + "ne correspondant \u00e0 aucun HMIPropertyValueType"), (Throwable)new IllegalArgumentException());
            return;
        }
        Object object = bec_2.a(ero_02, bej_22);
        bec_2.a(bei_22, object);
    }

    private static void a(bei_2 bei_22, Object object) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        switch (bei_22) {
            case hNa: {
                hNH.warn((Object)"TODO prison : refaire le system de HMI Action de prison");
            }
        }
    }

    public static void f(String string, String string2, String string3) {
        bei_2 bei_22 = bei_2.lp(string);
        if (bei_22 == null) {
            hNH.error((Object)("Mauvais param\u00e8tres " + string + "ne correspondant \u00e0 aucun HMIProviderType"), (Throwable)new IllegalArgumentException());
            return;
        }
        bec_2.a(bei_22);
    }

    private static void a(bei_2 bei_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        switch (bei_22) {
            case hNa: {
                hNH.warn((Object)"TODO prison : refaire le system de HMI Action de prison");
            }
        }
    }

    private static Object a(ero_0 ero_02, bej_2 bej_22) {
        Long l = null;
        switch (bej_22) {
            case hNc: {
                l = ero_02.fGm();
            }
        }
        return l;
    }
}

