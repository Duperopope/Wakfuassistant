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
 * Renamed from eDz
 */
public final class edz_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pAt = new ArrayList();

    public edz_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    protected ArrayList<amz_1[]> fnC() {
        return pAt;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        ero_0 ero_02 = eAs.aQ(object3);
        if (ero_02 == null) {
            return 0L;
        }
        return ero_02.getValue();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLX;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pAt.add(eAC.pwq);
    }
}

