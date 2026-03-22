/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import gnu.trove.iterator.TIntObjectIterator;
import java.util.ArrayList;

/*
 * Renamed from eFN
 */
@Criterion(description="Return true if the user is in a Nation Jail", signatures={@Signature})
public final class efn_0
extends eAH {
    public efn_0() {
    }

    public efn_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.m(object, object2, object4, object3);
        if (!(eyo_02 instanceof exP)) {
            return -1;
        }
        TIntObjectIterator<fjo_0> tIntObjectIterator = fjt.syH.eCu();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fjo_0 fjo_02 = (fjo_0)tIntObjectIterator.value();
            if ((long)fjo_02.gbp() != ((exP)eyo_02).aqZ()) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNP;
    }
}

