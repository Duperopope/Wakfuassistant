/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bjh
 */
public final class bjh_1 {
    private static final Logger inP = Logger.getLogger(bjh_1.class);

    private bjh_1() {
    }

    public static void V(bhJ bhJ2) {
        bjh_1.b(bhJ2, bhJ2.doZ());
        bjh_1.b(bhJ2, bhJ2.dpR());
        bhJ2.dpS().forEach(n -> bjh_1.b(bhJ2, n));
        bjh_1.b(bhJ2, bhJ2.dpT());
    }

    private static void b(bhJ bhJ2, int n) {
        if (n == 0) {
            return;
        }
        ffV ffV2 = fgD.fXh().Ve(n);
        if (ffV2 == null) {
            return;
        }
        bhJ2.doc().i(ffV2);
    }

    public static void W(bhJ bhJ2) {
        bjh_1.c(bhJ2, bhJ2.doZ());
        if (bhJ2.dkZ() == null) {
            bjh_1.c(bhJ2, bhJ2.dpR());
        }
        bhJ2.dpS().forEach(n -> bjh_1.c(bhJ2, n));
        bjh_1.c(bhJ2, bhJ2.dpT());
        bjh_1.Y(bhJ2);
        bjh_1.X(bhJ2);
    }

    private static void X(bhJ bhJ2) {
        if (!(bhJ2 instanceof bgt_0)) {
            return;
        }
        if (!aue_0.cVJ().c(cys_2.eXV())) {
            return;
        }
        cys_2.eXV().eXW().deS();
    }

    private static void Y(bhJ bhJ2) {
        int n;
        int n2;
        if (!(bhJ2 instanceof bgt_0)) {
            return;
        }
        if (!aue_0.cVJ().c(cvo_2.eUK())) {
            return;
        }
        fsf_1 fsf_12 = fse_1.gFu().aX("previewDialogActor", cvo_2.eUK().ePj());
        if (fsf_12 == null || fsf_12.aJG()) {
            return;
        }
        bnx_1 bnx_12 = (bnx_1)fsf_12.getValue();
        if (bnx_12.egd().Sn() != bhJ2.Sn()) {
            return;
        }
        bgy bgy2 = ((bdj_2)bnx_12.getAnimatedElement()).dcP();
        if (bgy2 instanceof bhJ) {
            ((bhJ)bgy2).gg(bhJ2.doJ());
        }
        if ((n2 = bhJ2.dpT()) != 0) {
            bjh_1.a(bnx_12, n2, true);
        }
        if ((n = bhJ2.dpR()) != 0) {
            bjh_1.a(bnx_12, n, true);
        }
        bnx_12.deS();
        fse_1.gFu().a((aef_2)bnx_12, "actorDescriptorLibrary");
    }

    public static void Z(bhJ bhJ2) {
        bjh_1.V(bhJ2);
        bjh_1.W(bhJ2);
    }

    private static void c(bhJ bhJ2, int n) {
        ffV ffV2 = fgD.fXh().Ve(n);
        if (ffV2 == null) {
            return;
        }
        for (enk_0 enk_02 : ffV2) {
            try {
                enk_02.a(ffV2, bhJ2, bhJ2.bdV(), enf_0.fBb(), bhJ2.bcC(), bhJ2.bcD(), bhJ2.bcE(), bhJ2, null, false);
            }
            catch (Exception exception) {
                inP.error((Object)"Failed to apply cosmetic effects on PC", (Throwable)exception);
            }
        }
    }

    public static void a(bnx_1 bnx_12, int n, boolean bl) {
        ffV ffV2 = fgD.fXh().Ve(n);
        if (ffV2 == null) {
            return;
        }
        for (enk_0 enk_02 : ffV2) {
            bnx_12.a(enk_02, bl);
        }
    }
}

