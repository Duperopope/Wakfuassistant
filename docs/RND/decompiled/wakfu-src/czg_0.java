/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

/*
 * Renamed from czG
 */
public class czg_0
implements aaq_2<cpw> {
    @Override
    public boolean a(cpw cpw2) {
        fiu_1.uCW.N("heroBuildLock", true);
        if (cpw2.exo() && cpw2.exp() == null) {
            byi_1.a(byh_1.lAv, "build.error.companion.cannot.save", new Object[0]);
            return false;
        }
        if (cpw2.exo()) {
            byi_1.a(byh_1.lAv, "build.error.companion.save.incomplete", new Object[0]);
        } else {
            byi_1.c(byh_1.lAv, "build.companion.saved", new Object[0]);
        }
        eJS eJS2 = eJN.qAF.pR(cpw2.doL());
        if (cpw2.exp() != null && eJS2 != null) {
            Map<Integer, ffV> map = eJW.B(eJS2);
            eJS2.dme().b(cpw2.exp().Tl);
            cts_1.a(eJS2, eJW.a(map, eJS2.dme()));
        }
        cvu_2.eTO().ou(cpw2.doL());
        return false;
    }

    @Override
    public int bkq() {
        return 12452;
    }
}

