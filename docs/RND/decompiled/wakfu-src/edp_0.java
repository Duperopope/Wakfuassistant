/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import java.util.ArrayList;
import java.util.Optional;

/*
 * Renamed from eDP
 */
@Criterion(description="Return true if the target has the specified cosmetic item", signatures={@Signature(description="itemRefId", params={@Parameter(name="itemRefId", type=VarType.NUMBER)})})
public final class edp_0
extends eAH {
    private final amu_1 pAL;

    public edp_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pAL = (amu_1)arrayList.get(0);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof exP)) {
            return -1;
        }
        exP exP2 = (exP)object;
        Optional<evv_2> optional = evx_2.feo().a(exP2.aZj(), eva_1.owy);
        long l = this.pAL.d(object, object2, object3, object4);
        for (fm_1 fm_12 : ekj_0.qBp) {
            if (!ekj_0.e(fm_12, (int)l)) continue;
            return 0;
        }
        if (optional.isEmpty()) {
            return -1;
        }
        ekn_0 ekn_02 = (ekn_0)optional.get();
        for (fm_1 fm_13 : ekj_0.qBp) {
            if (!ekn_02.a(fm_13, l)) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNX;
    }
}

