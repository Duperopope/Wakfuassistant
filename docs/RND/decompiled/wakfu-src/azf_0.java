/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aZf
 */
class azf_0
implements aqg_1<amq_0> {
    azf_0() {
    }

    public void a(amq_0 amq_02) {
        aLD aLD2 = amq_02.ckt();
        int n = aYY.a(aLD2);
        eIx eIx2 = aYY.b(aLD2);
        fdc_0 fdc_02 = new fdc_0(amq_02.d(), eIx2, n, this.a(amq_02.cnH()));
        fda_0.rWI.a(fdc_02);
    }

    private fdf[] a(amt_0[] amt_0Array) {
        fdf[] fdfArray = new fdf[amt_0Array.length];
        int n = 0;
        int n2 = amt_0Array.length;
        for (int i = 0; i < n2; ++i) {
            amt_0 amt_02 = amt_0Array[i];
            fdfArray[i] = new fdf(amt_02.d(), amt_02.clf(), amt_02.cnM(), amt_02.cnN(), amt_02.cnO(), amt_02.cmP(), this.a(amt_02.cnQ(), n), amt_02.cnP());
            n += fdfArray[i].fTg().length;
        }
        return fdfArray;
    }

    private fde_0[] a(ams_0[] ams_0Array, int n) {
        fde_0[] fde_0Array = new fde_0[ams_0Array.length];
        int n2 = ams_0Array.length;
        for (int i = 0; i < n2; ++i) {
            ams_0 ams_02 = ams_0Array[i];
            fde_0Array[i] = new fde_0(ams_02.d(), n + i, ams_02.cnK(), ams_02.clB(), this.a(ams_02.cnL()));
        }
        return fde_0Array;
    }

    private fdd[] a(aMr[] aMrArray) {
        ArrayList<fdd> arrayList = new ArrayList<fdd>();
        for (aMr aMr2 : aMrArray) {
            fdd fdd2 = new fdd(aMr2.avZ(), aMr2.cnI(), aMr2.clB(), aMr2.cnJ(), false);
            if (fdd2.fTd() == null) continue;
            arrayList.add(fdd2);
        }
        return arrayList.toArray(new fdd[arrayList.size()]);
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((amq_0)aqz_22);
    }
}

