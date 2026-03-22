/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;
import java.util.Map;

public class cfE
extends ceK<cqx_0, bsj_0> {
    public boolean a(cqx_0 cqx_02) {
        ((bsj_0)this.jkR).dGZ();
        EnumMap<eVi, acd_1> enumMap = cqx_02.eyC();
        if (enumMap.isEmpty()) {
            return false;
        }
        for (Map.Entry<eVi, acd_1> entry : enumMap.entrySet()) {
            ((bsj_0)this.jkR).a(entry.getValue(), entry.getKey());
        }
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqx_0)aam_22);
    }
}

