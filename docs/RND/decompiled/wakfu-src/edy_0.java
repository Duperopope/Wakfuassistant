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
 * Renamed from eDy
 */
public final class edy_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pAs = new ArrayList();

    public edy_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    protected ArrayList<amz_1[]> fnC() {
        return pAs;
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
        return ((exP)qu_02).aWP();
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKP;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pAs.add(amz_1.cJI);
    }
}

