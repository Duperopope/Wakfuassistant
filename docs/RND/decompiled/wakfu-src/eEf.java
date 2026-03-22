/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import java.util.ArrayList;

@Criterion(description="Check if a Mentor is in the same fight team")
public final class eEf
extends eAH {
    public eEf(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.m(object, object2, object4, object3);
        etu_0<?> etu_02 = eAs.m(object, object4);
        byte by = eyo_02.bcP();
        if (etu_02 == null) {
            return -1;
        }
        boolean bl = etu_02.dGs().stream().filter(exP2 -> exP2.bcP() == by).anyMatch(exP2 -> !eIA.pH(exP2.Xi()));
        return bl ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKq;
    }
}

