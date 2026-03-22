/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class eDp
extends eak_0 {
    private static final ArrayList<amz_1[]> pAi = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pAi;
    }

    public eDp(ArrayList<amx_1> arrayList) {
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        ero_0 ero_02 = eAs.aQ(object3);
        if (ero_02 == null) {
            return -1L;
        }
        if (!(ero_02 instanceof eor_0)) {
            return -1L;
        }
        eor_0 eor_02 = (eor_0)ero_02;
        return eor_02.ecx();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMy;
    }

    static {
        pAi.add(eAC.pwq);
    }
}

