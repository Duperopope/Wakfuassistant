/*
 * Decompiled with CFR 0.152.
 */
public class eMC
extends emr_0 {
    @Override
    protected String a(enk_0 enk_02, String string, Object[] objectArray, boolean bl, eLO eLO2) {
        if (enk_02.avZ() == enf_0.qUE.d()) {
            int n = ((Number)objectArray[0]).intValue();
            fqD fqD2 = eLL.qJe.bb((short)n);
            ahv_2 ahv_22 = eLL.qJd.ceG();
            eLL.qJe.a(ahv_22, fqD2);
            objectArray[0] = ahv_22.ceL();
        } else if (enk_02.avZ() == enf_0.qUJ.d()) {
            int n = ((Number)objectArray[2]).intValue();
            fqD fqD3 = eLL.qJe.bb((short)n);
            ahv_2 ahv_23 = eLL.qJd.ceG();
            eLL.qJe.a(ahv_23, fqD3);
            objectArray[2] = ahv_23.ceL();
        }
        return Bz.a(string, objectArray);
    }
}

