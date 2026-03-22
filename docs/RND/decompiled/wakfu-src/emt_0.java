/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eMt
 */
public class emt_0
extends emr_0 {
    @Override
    protected String a(enk_0 enk_02, String string, Object[] objectArray, boolean bl, eLO eLO2) {
        Object object;
        QQ<enk_0, etj_0> qQ = emt_0.c(enk_02.avZ(), objectArray);
        ahv_2 ahv_22 = eLL.qJd.ceG();
        short s = eLO2.cmL();
        if (qQ != null) {
            boolean bl2;
            boolean bl3 = bl2 = !eLO2.fzY() && !eLO2.fzX() && enk_02.avZ() != eLL.qIV;
            if (bl2) {
                String string2;
                object = eLL.imR.a(eLL.qJi, (long)((short)qQ.bcw()), new Object[0]);
                ahv_22.c((CharSequence)object);
                if (!this.qMM && (string2 = eLL.p(enk_02)) != null && string2.length() > 0) {
                    ahv_22.c(" ").c(string2);
                }
                ahv_22.c(emt_0.r(enk_02));
                if (enk_02.avZ() == enf_0.qTQ.d() || enk_02.avZ() == enf_0.qTX.d()) {
                    int n = (int)(qQ.oO(0) + qQ.oO(1) * (float)s);
                    ahv_22.c("\n").c(eLL.qJb);
                    ahv_22.c(eLL.imR.c(enk_02.avZ() == enf_0.qTX.d() ? eLL.gTk : eLL.gTj, n));
                }
            }
            if (eLO2.fzY()) {
                ahv_22.c(eLL.a((eSS)qQ, objectArray.length > 1 ? ((Number)objectArray[1]).shortValue() : (short)1, false));
            } else if (enk_02.avZ() != eLL.qIU && ((ArrayList)(object = eLL.a(new eLW(qQ, s, eLO2.fzW())))).size() != 0) {
                if (bl2) {
                    ahv_22.c("\n").c(eLL.b((ArrayList<String>)object, !string.contains("\n")));
                } else {
                    ahv_22.c(eLL.b((ArrayList<String>)object, false));
                }
            }
        }
        if (eLO2.fzY()) {
            return ahv_22.ceL();
        }
        if (objectArray == null || objectArray.length == 0) {
            return Bz.a(string, ahv_22.ceL());
        }
        Object object2 = objectArray[0];
        objectArray[0] = ahv_22.ceL();
        object = Bz.a(string, objectArray);
        objectArray[0] = object2;
        return object;
    }

    public static QQ<enk_0, etj_0> c(int n, Object[] objectArray) {
        if (n == enf_0.qTO.d()) {
            return eTo.fIZ().iP(((Number)objectArray[0]).intValue());
        }
        if (n == enf_0.qTT.d()) {
            return eTo.fIZ().iR(((Number)objectArray[0]).intValue());
        }
        if (n == enf_0.qTR.d() || n == enf_0.qTS.d()) {
            return eTo.fIZ().iT(((Number)objectArray[0]).intValue());
        }
        if (n == enf_0.qTW.d()) {
            return eTo.fIZ().iY(((Number)objectArray[0]).intValue());
        }
        if (n == enf_0.qTX.d()) {
            return eTo.fIZ().iY(((Number)objectArray[0]).intValue());
        }
        if (n == enf_0.qTQ.d()) {
            return eTo.fIZ().iS(((Number)objectArray[0]).intValue());
        }
        if (n == enf_0.qTP.d()) {
            return eTo.fIZ().iV(((Number)objectArray[0]).intValue());
        }
        if (n == enf_0.qTV.d()) {
            return eTo.fIZ().iY(((Number)objectArray[0]).intValue());
        }
        if (n == enf_0.qTU.d()) {
            return eTo.fIZ().iZ(((Number)objectArray[0]).intValue());
        }
        return null;
    }
}

