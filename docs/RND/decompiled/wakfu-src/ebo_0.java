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
 * Renamed from eBo
 */
public final class ebo_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pxr = new ArrayList();

    public ebo_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    protected ArrayList<amz_1[]> fnC() {
        return pxr;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNZ;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        ero_0 ero_02 = (ero_0)object3;
        if (ero_02 == null) {
            return 0L;
        }
        return ero_02.fHf();
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pxr.add(eAC.pwq);
    }
}

