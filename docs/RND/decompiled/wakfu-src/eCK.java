/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;

@Criterion(description="Return the pvp state of a player : -1 = invalid target, 0 = disabled, 1 = prudent, 2 = opportunistic")
public class eCK
extends eak_0 {
    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof exP)) {
            return -1L;
        }
        fpu_0 fpu_02 = ((exP)object).ffF().dkC();
        if (fpu_02 == null) {
            return -1L;
        }
        return fpu_02.aJr();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pOc;
    }
}

