/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bZz
 */
final class bzz_1 {
    private static final awx_2 lDx = new awx_2(0.8f, 0.4f, 0.5f, 0.8f);
    private static final String lDy = "snow.tga";

    bzz_1() {
    }

    static void c(agf agf2) {
        abd_0 abd_02 = bzz_1.q(lDx);
        abd_0 abd_03 = bzz_1.q(lDx);
        bzz_1.a(abd_02, abd_03);
        bzz_1.a((abb_0)abd_02, (abb_0)abd_03);
        bzz_1.eqb();
    }

    private static void eqb() {
        bza_1 bza_12 = new bza_1();
        bza_12.bY(true);
        bza_12.a(bzy_1.lDt.eqa());
        ast_1.bJG().a(bza_12);
    }

    private static void a(abd_0 abd_02, abd_0 abd_03) {
        abd_02.c(lDx.aIU(), lDx.aIV(), lDx.aIW(), 1.0f);
        abd_03.c(lDx.aIU(), lDx.aIV(), lDx.aIW(), 0.2f);
    }

    private static abd_0 q(axb_2 axb_22) {
        return bzz_1.r(axb_22);
    }

    @NotNull
    private static abd_0 r(axb_2 axb_22) {
        abd_0 abd_02 = new abd_0();
        abd_02.eh(lDy);
        abd_02.a(auw_2.dfL, auw_2.dfI);
        abd_02.c(axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), axb_22.aIX());
        float f2 = 4.0f;
        float f3 = 0.0f;
        float f4 = 1.0f;
        abd_02.aw(0.0f, 1.0f);
        abd_02.aG(4.0f, 4.0f);
        return abd_02;
    }

    private static void a(abb_0 abb_02, abb_0 abb_03) {
        abb_02.a(bzy_1.lDu.eqa());
        abb_03.a(bzy_1.lDv.eqa());
    }

    private static void d(ass_1 ass_12) {
        ast_1.bJG().a(ass_12);
    }

    private static void d(agf agf2) {
        aba_0 aba_02 = new aba_0();
        aba_02.b(agf2);
        aba_02.bX(true);
        aba_02.aF(70.0f, -2.0f);
        aba_02.a(bzy_1.lDw.eqa());
        ast_1.bJG().a(aba_02);
    }

    private static void eqc() {
        cAY.eHc().a(new cCx(cCw.mAc));
    }
}

