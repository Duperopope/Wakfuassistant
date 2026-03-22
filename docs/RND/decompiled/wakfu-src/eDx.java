/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class eDx
extends eak_0 {
    private static final ArrayList<amz_1[]> pAr = new ArrayList();

    public eDx(List<amx_1> list) {
        this.r(list);
    }

    protected ArrayList<amz_1[]> fnC() {
        return pAr;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        qu_0 qu_02 = eAs.aR(object3);
        if (qu_02 == null) {
            return -1L;
        }
        if (!(qu_02 instanceof exP)) {
            return -1L;
        }
        return qu_02.Sn();
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKT;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pAr.add(amz_1.cJI);
    }
}

