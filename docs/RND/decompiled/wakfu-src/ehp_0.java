/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eHp
 */
public final class ehp_0
extends eho_0 {
    public ehp_0(ArrayList<amx_1> arrayList) {
        super(arrayList);
    }

    @Override
    protected acd_1 s(Object object, Object object2, Object object3, Object object4) {
        ero_0 ero_02 = eAs.aQ(object3);
        if (ero_02 == null) {
            return null;
        }
        return ero_02.bbe();
    }

    @Override
    protected eNl d(ero_0 ero_02) {
        qm_0 qm_02 = ero_02.bbh();
        qy_0 qy_02 = qm_02.bak();
        if (qy_02 == null) {
            return null;
        }
        return (eNl)qy_02.baS();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMK;
    }
}

