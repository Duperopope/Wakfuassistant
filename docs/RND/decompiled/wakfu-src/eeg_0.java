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
import java.util.List;
import java.util.Optional;

/*
 * Renamed from eEg
 */
@Criterion(description="Is there a monster satisfaction on the protector of the current zone?", signatures={@Signature(description="Check satisfaction for specific monster family", params={@Parameter(name="familyId", type=VarType.NUMBER)})})
public class eeg_0
extends eAH {
    private static final ArrayList<amz_1[]> pBs = new ArrayList();
    private final amu_1 pBt;

    @Override
    protected List<amz_1[]> bDC() {
        return pBs;
    }

    public eeg_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pBt = (amu_1)arrayList.get(0);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        Optional<foM> optional = eAs.l(object, object2, object4, object3);
        long l = this.pBt.d(object, object2, object3, object4);
        return optional.map(arg_0 -> eAs.pwd.apply(arg_0)).map(arg_0 -> eAs.pvY.apply(arg_0)).map(arg_0 -> eAs.pvZ.apply(arg_0)).map(tIntObjectHashMap -> new eeh_0(l).e((TIntObjectHashMap<abm_1>)tIntObjectHashMap)).orElse(false) != false ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMY;
    }

    static {
        pBs.add(eAC.pwt);
    }
}

