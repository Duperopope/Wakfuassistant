/*
 * Decompiled with CFR 0.152.
 */
public class eMz
extends emr_0 {
    @Override
    protected String a(enk_0 enk_02, String string, Object[] objectArray, boolean bl, eLO eLO2) {
        if (enk_02.avZ() == enf_0.qUF.d()) {
            int s = ((Number)objectArray[0]).intValue();
            eNd eNd2 = eNd.ff((byte)s);
            ahv_2 ahv_22 = eLL.qJd.ceG();
            eLL.qJe.a(ahv_22, eNd2);
            objectArray[0] = ahv_22.ceL();
        }
        if (objectArray.length == 2) {
            short s = ((Number)objectArray[1]).shortValue();
            objectArray[1] = eLL.qJe.bc(s);
        }
        return Bz.a(string, objectArray);
    }
}

