/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class eBV
extends eak_0 {
    private static final ArrayList<amz_1[]> pyi = new ArrayList();
    private String pvH;

    public eBV(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pvH = ((anh_2)arrayList.get(0)).getValue();
    }

    public eBV(String string) {
        this.pvH = string;
    }

    protected ArrayList<amz_1[]> fnC() {
        return pyi;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLW;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        eyo_0 eyo_02 = eAs.a(this.pvH, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1L;
        }
        return eyo_02.Sn();
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pyi.add(eAC.pwr);
    }
}

