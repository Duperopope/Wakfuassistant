/*
 * Decompiled with CFR 0.152.
 */
public class eMA
extends emr_0 {
    @Override
    protected String a(enk_0 enk_02, String string, Object[] objectArray, boolean bl, eLO eLO2) {
        int n;
        etl_0 etl_02;
        if (enk_02.fAn() >= 1 && (enk_02.avZ() == enf_0.qTd.d() || enk_02.avZ() == enf_0.qTe.d())) {
            int n2 = ((Number)objectArray[0]).intValue();
            exe_1 exe_12 = exe_1.Te(n2);
            if (exe_12 != null) {
                objectArray[0] = eLL.qJe.a(exe_12);
            }
        } else if (enk_02.fAn() >= 1 && (enk_02.avZ() == enf_0.qTb.d() || enk_02.avZ() == enf_0.qTc.d())) {
            int n3 = ((Number)objectArray[0]).intValue();
            ezj_0 ezj_02 = ezj_0.Pl(n3);
            if (ezj_02 != null) {
                objectArray[0] = eLL.qJe.b(ezj_02);
            }
        } else if (enk_02.fAn() >= 1 && (enk_02.avZ() == enf_0.qTf.d() || enk_02.avZ() == enf_0.qTg.d()) && (etl_02 = etl_0.Sq(n = ((Number)objectArray[0]).intValue())) != null) {
            objectArray[0] = eLL.qJe.a(etl_02);
        }
        return Bz.a(string, objectArray);
    }
}

