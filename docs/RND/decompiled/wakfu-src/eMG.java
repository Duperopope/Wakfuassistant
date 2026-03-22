/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;

public class eMG
extends emr_0 {
    @Override
    protected String a(enk_0 enk_02, String string, Object[] objectArray, boolean bl, eLO eLO2) {
        fgy_0 fgy_02;
        emf_0 emf_02 = (emf_0)eLO2;
        ffV ffV2 = emf_02.fAg();
        fgy_0 fgy_03 = fgy_02 = ffV2 == null ? null : ffV2.eAX();
        if (fgy_02 == null || fgy_02.aJG()) {
            return Bz.a(string, objectArray);
        }
        HashSet<eNd> hashSet = fgy_02.Vi(enk_02.avZ());
        if (hashSet == null || hashSet.isEmpty()) {
            return Bz.a(string, objectArray);
        }
        ahv_2 ahv_22 = eLL.qJd.ceG();
        int n = 0;
        for (eNd eNd2 : fgy_0.d(hashSet)) {
            ahv_22.c(eLL.qJe.a(eLL.qJd.ceG(), eNd2).ceL());
            if (n < hashSet.size() - 1) {
                ahv_22.c(" ");
            }
            ++n;
        }
        Object[] objectArray2 = new Object[objectArray.length + 1];
        System.arraycopy(objectArray, 0, objectArray2, 0, objectArray.length);
        objectArray2[objectArray2.length - 1] = ahv_22.ceL();
        return Bz.a(string, objectArray2);
    }
}

