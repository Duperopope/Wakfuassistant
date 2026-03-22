/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 */
import com.google.common.base.Strings;

class aYB
implements aqg_1<aLU> {
    aYB(aYA aYA2) {
    }

    public void a(aLU aLU2) {
        qb_0 qb_02 = new qb_0(aLU2.d());
        String string = aLU2.cmH();
        String string2 = aLU2.cmG();
        if (!Strings.isNullOrEmpty((String)string)) {
            qb_02.df(string);
        }
        if (!Strings.isNullOrEmpty((String)string2)) {
            qb_02.dg(string2);
        }
        qd_0.bfh.a(qb_02);
        for (aLV aLV2 : aLU2.cmI()) {
            ang_2 ang_22;
            int n = aLV2.d();
            try {
                ang_22 = ehu_0.rY(aLV2.aGr());
            }
            catch (Exception exception) {
                aYA.hxL.error((Object)("[LD] Impossible de compiler le crit\u00e8re " + aLV2.aGr() + " sur la r\u00e9ponse " + n + " du dialog " + aLU2.d()), (Throwable)exception);
                continue;
            }
            qc_0 qc_02 = new qc_0(n, ang_22, (byte)aLV2.aeV(), aLV2.aZu());
            qb_02.a(qc_02);
        }
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((aLU)aqz_22);
    }
}

