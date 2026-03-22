/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import java.util.ArrayList;

/*
 * Renamed from eDH
 */
@Criterion(description="Return true if the target has the specified cosmetic item and it's activated", signatures={@Signature(description="Per category", params={@Parameter(name="type", type=VarType.NUMBER), @Parameter(name="itemRefId", type=VarType.NUMBER)})})
public final class edh_0
extends eAH {
    private final amu_1 pAB;
    private final amu_1 pAC;

    public edh_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pAC = (amu_1)arrayList.get(0);
        this.pAB = (amu_1)arrayList.get(1);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof exP)) {
            return -1;
        }
        exP exP2 = (exP)object;
        long l = this.pAB.d(object, object2, object3, object4);
        fm_1 fm_12 = fm_1.ce((int)this.pAC.d(object, object2, object3, object4));
        if (fm_12 == null) {
            return -1;
        }
        fo_2 fo_22 = ekj_0.a(exP2.Xi(), exP2.Sn(), fm_12);
        for (fb_2 fb_22 : fo_22.zy()) {
            if ((long)fb_22.AK() != l) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNY;
    }
}

