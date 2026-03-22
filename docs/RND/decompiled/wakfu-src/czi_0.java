/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;

/*
 * Renamed from czI
 */
public final class czi_0
implements aaq_2<crW> {
    @Override
    public boolean a(crW crW2) {
        TLongArrayList tLongArrayList = crW2.eAv();
        int n = tLongArrayList.size();
        for (int i = 0; i < n; ++i) {
            long l = tLongArrayList.getQuick(i);
            bCA bCA2 = (bCA)bzj_2.eqi().my(l);
            if (bCA2 == null) continue;
            if (bCA2.dQv()) {
                bCA2.dOC();
                for (ng_1 ng_12 : bCA2.aVG()) {
                    if (!(ng_12 instanceof ZC)) continue;
                    ((ZC)((Object)ng_12)).a(new czj_0(this));
                }
                continue;
            }
            czi_0.a(bCA2, false);
            bzj_2.eqi().e(bCA2);
        }
        return false;
    }

    static boolean a(ni_1 ni_12, boolean bl) {
        bCA bCA2;
        bgt_0 bgt_02 = aie_0.cfo().cVK();
        bnv_2 bnv_22 = bgt_02.dnw();
        if (ni_12 == null) {
            return false;
        }
        if (bnv_22 == null) {
            return false;
        }
        fnH fnH2 = null;
        if (ni_12 instanceof fnH) {
            fnH2 = (fnH)((Object)ni_12);
        } else if (ni_12 instanceof bCA && (bCA2 = (bCA)ni_12).bej()) {
            fnH2 = bCA2.dNk();
        }
        if (fnH2 == null) {
            return false;
        }
        if (bl) {
            bnv_22.a(fnH2);
        } else {
            bnv_22.b(fnH2);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13345;
    }
}

