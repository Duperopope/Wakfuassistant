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
 * Renamed from eDo
 */
public final class edo_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pAh = new ArrayList();

    public edo_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    protected ArrayList<amz_1[]> fnC() {
        return pAh;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        int n = 0;
        ero_0 ero_02 = eAs.aQ(object3);
        while (ero_02 != null) {
            ++n;
            ero_0 ero_03 = eAs.aQ(ero_02);
            if (ero_03 != ero_02) {
                ero_02 = ero_03;
                continue;
            }
            ero_02 = null;
        }
        return n;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKR;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pAh.add(amz_1.cJI);
    }
}

