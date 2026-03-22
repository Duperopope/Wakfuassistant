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

@Criterion(description="Get the minimum protector satisfaction of a resource family", signatures={@Signature(params={@Parameter(name="familyId", type=VarType.NUMBER)})})
public class eCU
extends eak_0 {
    private final amu_1 pzC;

    @Override
    public boolean bDo() {
        return true;
    }

    public eCU(ArrayList<amx_1> arrayList) {
        this.pzC = (amu_1)arrayList.get(0);
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        long l = this.pzC.d(object, object2, object3, object4);
        Optional<foM> optional = eAs.l(object, object2, object3, object4);
        Integer n = optional.map(arg_0 -> eAs.pwd.apply(arg_0)).map(arg_0 -> eAs.pvY.apply(arg_0)).map(arg_0 -> eAs.pwa.apply(arg_0)).map(tIntObjectHashMap -> new ecv_0(l).d((TIntObjectHashMap<abm_1>)tIntObjectHashMap)).map(arg_0 -> eAs.pwb.apply(arg_0)).orElse(0);
        return this.fny() * (long)n.intValue();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHR;
    }
}

