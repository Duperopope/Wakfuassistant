/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bmS
 */
class bms_2
implements Comparator<eKR> {
    bms_2() {
    }

    public int a(eKR eKR2, eKR eKR3) {
        fgj fgj2;
        if (eKR2.dxy() != eKR3.dxy()) {
            return eKR2.dxy() - eKR3.dxy();
        }
        int n = eKR2.fyZ().azv();
        int n2 = eKR3.fyZ().azv();
        fgj fgj3 = fgD.fXh().Vf(n);
        if (fgj3 != (fgj2 = fgD.fXh().Vf(n2))) {
            byte by = fgj3 != null ? fgj3.fWK() : fgj.siA.fWK();
            byte by2 = fgj2 != null ? fgj2.fWK() : fgj.siA.fWK();
            return by < by2 ? -1 : 1;
        }
        if (eKR2.dxG() != eKR3.dxG()) {
            return eKR2.dxG() ? 1 : -1;
        }
        String string = bms_2.Dm(n);
        String string2 = bms_2.Dm(n2);
        return BH.i(string, string2);
    }

    public static String Dm(int n) {
        return aum_0.cWf().a(15, (long)n, new Object[0]);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((eKR)object, (eKR)object2);
    }
}

