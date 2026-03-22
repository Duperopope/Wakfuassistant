/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import java.util.ArrayList;
import java.util.Optional;

@Criterion(description="Is there a protector in the current zone?")
public class eEk
extends eAH {
    @Deprecated
    public eEk() {
    }

    public eEk(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        Optional<foM> optional = eAs.l(object, object2, object4, object3);
        return optional.map(arg_0 -> eAs.pwe.apply(arg_0)).orElse(false) != false ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMX;
    }
}

