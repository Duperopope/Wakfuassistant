/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from czF
 */
public class czf_0
implements aaq_2<cph> {
    @Override
    public boolean a(cph cph2) {
        fiu_1.uCW.N("heroBuildLock", true);
        if (cph2.exf().aHz()) {
            String string = "build.error.save." + cph2.exf().d();
            if (aum_0.cWf().cO(string)) {
                byi_1.a(byh_1.lAv, string, new Object[0]);
            } else {
                byi_1.a(byh_1.lAv, "build.error.save.generic", new Object[0]);
            }
        }
        if (cph2.exf() == eIg.quY) {
            byi_1.b(byh_1.lAv, "build.save.invalid.items", new Object[0]);
        } else if (!cph2.exf().aHz()) {
            byi_1.c(byh_1.lAv, "build.saved", new Object[0]);
        }
        if (cph2.ewY()) {
            czf_0.a(cph2.KU(), cph2.exe(), cph2.exg(), cph2.dmL(), cph2.dMT(), cph2.dMx());
        }
        return false;
    }

    public static void a(long l, int n, @NotNull eIj eIj2, @Nullable fhk fhk2, @Nullable frd frd2, @Nullable ehy_0 ehy_02) {
        cvu_2.eTO().b(l, n, eIj2, fhk2, frd2, ehy_02);
        if (ctb_2.eQx()) {
            ctb_2.eQy();
        }
        if (cui_1.eQx()) {
            cui_1.eRw().dBN();
        }
    }

    @Override
    public int bkq() {
        return 12675;
    }
}

