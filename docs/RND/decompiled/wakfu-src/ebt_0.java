/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eBt
 */
public final class ebt_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pxx = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pxx;
    }

    public ebt_0(ArrayList<amx_1> arrayList) {
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        etu_0<?> etu_02 = eAs.m(object, object4);
        if (etu_02 == null) {
            return 0L;
        }
        ewk_1 ewk_12 = etu_02.dHf();
        if (!ewk_12.bhE()) {
            return 0L;
        }
        return ewk_12.bhF();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMw;
    }

    static {
        pxx.add(eAC.pwq);
    }
}

