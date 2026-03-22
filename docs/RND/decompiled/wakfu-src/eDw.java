/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class eDw
extends eak_0 {
    private static final ArrayList<amz_1[]> pAq = new ArrayList();
    private long pAo;

    public eDw(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pAo = 1L;
        if (arrayList.size() >= 1) {
            this.pAo = ((amu_1)arrayList.get(0)).d(null, null, null, null);
        }
    }

    protected ArrayList<amz_1[]> fnC() {
        return pAq;
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
        return ero_02.aZH();
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKQ;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pAq.add(eAC.pwq);
        pAq.add(eAC.pwt);
    }
}

