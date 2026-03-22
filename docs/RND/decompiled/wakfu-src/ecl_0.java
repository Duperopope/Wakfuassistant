/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ContiguousSet
 *  com.google.common.collect.DiscreteDomain
 *  com.google.common.collect.Range
 *  gnu.trove.list.array.TLongArrayList
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;

/*
 * Renamed from eCL
 */
@Criterion(description="Returns a pseudorandom, uniformly distributed value between 0 (inclusive) and the specified value (exclusive)", signatures={@Signature(description="Default", params={@Parameter(name="limit", type=VarType.NUMBER)}), @Signature(description="With exclusion", params={@Parameter(name="limit", type=VarType.NUMBER), @Parameter(name="exclusionList", type=VarType.NUMBERLIST)})})
public class ecl_0
extends eak_0 {
    private final amu_1 pzt;
    private final amq_2 pzu;

    public ecl_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pzt = (amu_1)arrayList.get(0);
        this.pzu = arrayList.size() > 1 ? (amq_2)arrayList.get(1) : new amc_2(new ArrayList());
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (!this.pzt.bDo()) {
            throw new amf_2("Limit not an integer");
        }
        long l2 = this.pzt.d(object, object2, object3, object4);
        TLongArrayList tLongArrayList = this.pzu.f(object, object2, object3, object4);
        Long[] longArray = (Long[])ContiguousSet.create((Range)Range.closedOpen((Comparable)Long.valueOf(0L), (Comparable)Long.valueOf(l2)), (DiscreteDomain)DiscreteDomain.longs()).stream().filter(l -> !tLongArrayList.contains(l.longValue())).toArray(Long[]::new);
        if (longArray.length <= 0) {
            throw new amf_2("No number to roll");
        }
        return longArray[GC.mR(longArray.length)];
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHl;
    }
}

