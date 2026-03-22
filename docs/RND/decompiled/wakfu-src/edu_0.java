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
 * Renamed from eDu
 */
public final class edu_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pAn = new ArrayList();
    private long pAo;

    public edu_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pAo = 1L;
        if (arrayList.size() >= 1) {
            this.pAo = ((amu_1)arrayList.get(0)).d(null, null, null, null);
        }
    }

    protected ArrayList<amz_1[]> fnC() {
        return pAn;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        ero_0 ero_02 = null;
        int n = 0;
        while ((long)n < this.pAo) {
            ero_02 = eAs.aQ(object3);
            if (ero_02 == null) {
                return -1L;
            }
            ++n;
        }
        if (ero_02 == null) {
            return -1L;
        }
        enk_0 enk_02 = (enk_0)ero_02.bba();
        return enk_02.avZ();
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNj;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pAn.add(eAC.pwq);
        pAn.add(eAC.pwt);
    }
}

