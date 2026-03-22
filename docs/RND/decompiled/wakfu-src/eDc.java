/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class eDc
extends eak_0 {
    private static final ArrayList<amz_1[]> pzP = new ArrayList();
    private String pxi = "caster";
    private final amu_1 pzQ;

    public eDc(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        this.pzQ = (amu_1)arrayList.get(0);
        if (by == 1) {
            this.pxi = ((anh_2)arrayList.get(1)).getValue();
        }
    }

    protected ArrayList<amz_1[]> fnC() {
        return pzP;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        eyo_0 eyo_02 = eAs.a(this.pxi, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1L;
        }
        long l = this.pzQ.d(object, object2, object3, object4);
        return eyo_02.dh(l);
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLv;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pzP.add(eAC.pwt);
        pzP.add(new amz_1[]{amz_1.cJy, amz_1.cJx});
    }
}

