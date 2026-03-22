/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Optional;

/*
 * Renamed from eEm
 */
@Criterion(description="Is there a resource satisfaction on the protector of the current zone?", signatures={@Signature(description="Check satisfaction for specific resource family", params={@Parameter(name="familyId", type=VarType.NUMBER)})})
public class eem_0
extends eAH {
    private static final ArrayList<amz_1[]> pBz = new ArrayList();
    private final amu_1 pBA;

    public eem_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pBA = (amu_1)arrayList.get(0);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        Optional<foM> optional = eAs.l(object, object2, object4, object3);
        long l = this.pBA.d(object, object2, object3, object4);
        if (optional.isPresent()) {
            foP foP2 = optional.get().doW();
            if (foP2 == null) {
                return -1;
            }
            return Optional.of(foP2).map(arg_0 -> eAs.pvY.apply(arg_0)).map(arg_0 -> eAs.pwa.apply(arg_0)).map(tIntObjectHashMap -> new een_0(l).e((TIntObjectHashMap<abm_1>)tIntObjectHashMap)).orElse(false) != false ? 0 : -1;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMZ;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pBz.add(amz_1Array);
    }
}

