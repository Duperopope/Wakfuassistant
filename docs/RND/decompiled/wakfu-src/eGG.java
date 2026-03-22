/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import java.util.ArrayList;

@Criterion(description="Return true if the triggering effect is a MELEE effect", signatures={@Signature})
public class eGG
extends eAH {
    public eGG(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        ero_0 ero_02 = eAs.aQ(object3);
        if (ero_02 == null) {
            return -1;
        }
        enk_0 enk_02 = (enk_0)ero_02.bba();
        if (enk_02 == null) {
            return -1;
        }
        if (eqb_0.b(ero_02.bbc(), ero_02.bbd(), enk_02)) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNO;
    }
}

