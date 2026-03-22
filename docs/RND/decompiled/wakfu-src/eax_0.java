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
 * Renamed from eAX
 */
public final class eax_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pwU = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pwU;
    }

    public eax_0(ArrayList<amx_1> arrayList) {
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        etu_0<?> etu_02 = eAs.m(object, object4);
        if (etu_02 == null) {
            return -1L;
        }
        if (etu_02.bak() == null) {
            return -1L;
        }
        return etu_02.bak().axA();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMo;
    }

    static {
        pwU.add(eAC.pwq);
    }
}

