/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public final class eBn
extends eak_0 {
    private static final ArrayList<amz_1[]> pxq = new ArrayList();

    public eBn(ArrayList<amx_1> arrayList) {
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pxq;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        eyo_0 eyo_02 = (eyo_0)object;
        if (eyo_02 == null) {
            return -1L;
        }
        Object t = fcL.rUh.sw(eyo_02.Sn());
        if (t == null) {
            return -1L;
        }
        Optional<evv_2> optional = evx_2.feo().a(((exP)t).Xi(), eva_1.owr);
        if (optional.isEmpty()) {
            return -1L;
        }
        eKd eKd2 = (eKd)optional.get();
        return eKi.pZ(eKd2.fxH()).d();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMD;
    }

    static {
        pxq.add(eAC.pwq);
    }
}

