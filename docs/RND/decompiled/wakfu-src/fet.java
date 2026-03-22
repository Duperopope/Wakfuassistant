/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class fet {
    private fet() {
    }

    @Nullable
    public static Gv bS(@Nullable exP exP2) {
        if (exP2 == null) {
            return null;
        }
        return fet.bT(exP2).aNA();
    }

    private static Gw bT(@NotNull exP exP2) {
        Gw gw = Gv.aNr();
        if (exP2.a(eyp_0.pmO) || exP2.a(eyp_0.pmQ)) {
            gw.cv(exP2.getName());
            gw.e(exP2.cmL());
            gw.f(exP2.dnG());
            gw.g(eIA.ap(exP2));
        }
        gw.d(exP2.aWP());
        return gw.p(exP2.Xi()).q(exP2.Sn());
    }

    @Nullable
    public static Gv g(@Nullable exP exP2, long l) {
        if (exP2 == null) {
            return null;
        }
        return fet.bT(exP2).r(l).aNA();
    }

    public static Gv ay(long l, long l2) {
        return Gv.aNr().p(l).q(l2).g(eIA.pG(l).orElse(null)).aNA();
    }

    public static Gv Uz(int n) {
        return Gv.aNr().m(n).aNA();
    }

    public static Gv sF(long l) {
        return Gv.aNr().p(l).g(eIA.pG(l).orElse(null)).aNA();
    }

    public static Gv sG(long l) {
        return Gv.aNr().q(l).aNA();
    }

    public static Gv sH(long l) {
        return Gv.aNr().s(l).aNA();
    }

    public static Gv az(long l, long l2) {
        return Gv.aNr().s(l).t(l2).aNA();
    }

    public static Gv sI(long l) {
        return Gv.aNr().r(l).aNA();
    }

    public static Gv m(long l, String string) {
        return Gv.aNr().p(l).cx(string).g(eIA.pG(l).orElse(null)).aNA();
    }

    public static Gr ce(@NotNull ffV ffV2) {
        return Gr.aMN().c(ffV2.avr()).c(ffV2.LV()).d(ffV2.LV()).cs(ffV2.fWz()).d(Integer.valueOf(ffV2.bfd())).aMT();
    }

    public static Gr c(@NotNull ffV ffV2, long l) {
        return Gr.aMN().c(ffV2.avr()).c(ffV2.LV()).d(l).cs(ffV2.fWz()).d(Integer.valueOf(ffV2.bfd())).aMT();
    }

    public static Gr a(int n, long l, String string, int n2) {
        return Gr.aMN().c(n).c(l).d(l).cs(string).d(n2).aMT();
    }

    public static Gr e(int n, long l, int n2) {
        return Gr.aMN().c(n).c(l).d(l).d(n2).aMT();
    }

    public static Gr a(int n, long l, long l2, int n2) {
        return Gr.aMN().c(n).c(l).d(l2).d(n2).aMT();
    }

    public static Gr a(int n, long l, long l2, String string, int n2) {
        return Gr.aMN().c(n).c(l).d(l2).d(n2).cs(string).aMT();
    }

    public static Gr f(int n, long l, int n2) {
        return Gr.aMN().c(n).d(l).d(n2).aMT();
    }

    public static Gr b(int n, long l, String string, int n2) {
        return Gr.aMN().c(n).d(l).d(n2).cs(string).aMT();
    }

    public static Gr a(RT rT, int n) {
        if (rT instanceof ffV) {
            ffV ffV2 = (ffV)rT;
            return Gr.aMN().c(ffV2.avr()).c(ffV2.LV()).d(ffV2.LV()).cs(ffV2.fWz()).d(n).aMT();
        }
        return fet.e(rT.avr(), rT.LV(), n);
    }

    public static Gr a(int n, String string, int n2) {
        return Gr.aMN().c(n).cs(string).d(n2).aMT();
    }

    public static Gr fP(int n, int n2) {
        return Gr.aMN().c(n).d(n2).aMT();
    }

    public static Gr sJ(long l) {
        return Gr.aMN().e(l).aMT();
    }

    public static Gr c(int n, int n2, long l) {
        return Gr.aMN().c(n).d(n2).e(l).aMT();
    }

    public static Gr a(int n, String string, int n2, long l) {
        return Gr.aMN().c(n).cs(string).d(n2).e(l).aMT();
    }

    public static Gr d(@NotNull ffV ffV2, long l) {
        return fet.a(ffV2, l, (int)ffV2.bfd());
    }

    public static Gr a(@NotNull ffV ffV2, long l, int n) {
        return Gr.aMN().c(ffV2.avr()).c(ffV2.LV()).d(ffV2.LV()).cs(ffV2.fWz()).d(n).e(l).aMT();
    }

    public static Gt sK(long l) {
        return Gt.aMU().g(l).aNq();
    }

    public static Gt sL(long l) {
        return Gt.aMU().h(l).aNq();
    }

    public static Gt sM(long l) {
        return Gt.aMU().o(l).aNq();
    }

    public static Gt aA(long l, long l2) {
        return Gt.aMU().o(l).g(l2).aNq();
    }

    public static Gt ai(long l, int n) {
        return Gt.aMU().g(l).f(n).aNq();
    }

    public static Gt aj(long l, int n) {
        return Gt.aMU().g(l).e(n).aNq();
    }

    public static Gt a(long l, long l2, int n, boolean bl, short s) {
        return Gt.aMU().k(l2).c(s).g(l).l(n).a(bl).aNq();
    }

    public static Gt aB(long l, long l2) {
        return Gt.aMU().g(l).h(l2).aNq();
    }

    public static Gt a(long l, long l2, boolean bl) {
        return Gt.aMU().g(l).h(l2).b(bl).aNq();
    }

    public static Gt n(long l, String string) {
        return Gt.aMU().g(l).ct(string).aNq();
    }

    public static Gt ak(long l, int n) {
        return Gt.aMU().g(l).i(n).aNq();
    }

    public static Gt al(long l, int n) {
        return Gt.aMU().g(l).j(n).aNq();
    }

    public static Gt a(long l, int n, String string, int n2) {
        return Gt.aMU().g(l).j(n).cu(string).h(Long.valueOf(n2)).aNq();
    }

    public static Gt aC(long l, long l2) {
        return Gt.aMU().g(l).m(l2).aNq();
    }

    public static Gt a(long l, long l2, Long l3) {
        return Gt.aMU().g(l).m(l2).n(l3).aNq();
    }

    public static Gt a(long l, Integer n) {
        return Gt.aMU().g(l).h(n).aNq();
    }

    public static Gt d(long l, int n, long l2) {
        return Gt.aMU().g(l).k(n).h(l2).aNq();
    }

    public static Gt q(long l, short s) {
        return Gt.aMU().g(l).b(s).aNq();
    }

    public static Gt am(long l, int n) {
        return Gt.aMU().g(l).g(n).aNq();
    }

    public static Gt aD(long l, long l2) {
        return Gt.aMU().g(l).i(l2).aNq();
    }

    public static Gt sN(long l) {
        return Gt.aMU().i(l).aNq();
    }

    public static Gt aE(long l, long l2) {
        return Gt.aMU().g(l).j(l2).aNq();
    }

    public static Gt aF(long l, long l2) {
        return Gt.aMU().g(l).l(l2).aNq();
    }

    public static Gv sO(long l) {
        return Gv.aNr().t(l).aNA();
    }

    public static Gv D(eJS eJS2) {
        return Gv.aNr().p(eJS2.Xi()).g(eIA.pG(eJS2.Xi()).orElse(null)).q(eJS2.Sn()).cv(eJS2.getName()).d(eJS2.aWP()).aNA();
    }

    public static Gt sF(String string) {
        return Gt.aMU().cu(string).aNq();
    }

    public static void a(String string, Gv gv, Gv gv2, List<ffV> list, Gt gt) {
        for (ffV ffV2 : list) {
            fes.a(string, gv, gv2, fet.ce(ffV2), gt);
        }
    }
}

