/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import java.util.ArrayList;

@Criterion(description="Return true if the user is in an Haven Bag (AbstractDimensionalBag.DIMENSIONAL_BAG_INSTANCE_ID)", signatures={@Signature})
public final class eFM
extends eAH {
    public eFM() {
    }

    public eFM(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.m(object, object2, object4, object3);
        if (!(eyo_02 instanceof exP)) {
            return -1;
        }
        if (((exP)eyo_02).aqZ() == 9L) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNR;
    }
}

