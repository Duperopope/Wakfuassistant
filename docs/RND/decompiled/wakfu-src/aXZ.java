/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;

class aXZ
implements aqg_1<alc_0> {
    aXZ(aXY aXY2) {
    }

    public void a(alc_0 alc_02) {
        int n = alc_02.cjd();
        int[] nArray = alc_02.cjY();
        int[] nArray2 = alc_02.cjZ();
        ehx_0 ehx_02 = new ehx_0(n, new TIntArrayList(nArray));
        for (int i = 0; i < nArray2.length; ++i) {
            int n2 = nArray2[i];
            Object t = eHJ.qsV.Py(n2);
            ehx_02.c((ehw_0)t);
        }
        eHK.qsX.b(ehx_02);
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((alc_0)aqz_22);
    }
}

