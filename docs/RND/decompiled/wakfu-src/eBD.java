/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 */
import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.List;

public class eBD
extends eag_0 {
    public eBD(ArrayList<amx_1> arrayList) {
        super(arrayList);
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        List<Integer> list = this.i(object, object2, object3, object4);
        if (list == null || list.isEmpty()) {
            return -1L;
        }
        return ((Integer)Ordering.natural().min(list)).intValue();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMM;
    }
}

