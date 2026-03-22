/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class eCh
extends eak_0 {
    private static final ArrayList<amz_1[]> pyK = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pyK;
    }

    public eCh(ArrayList<amx_1> arrayList) {
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        eyo_0 eyo_02 = eAs.m(object, object2, object3, object4);
        etu_0<?> etu_02 = eAs.m(object, object4);
        if (etu_02 == null) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer le combat");
        }
        if (!(eyo_02 instanceof fad)) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer la cible du crit\u00e8re");
        }
        fad fad2 = (fad)((Object)eyo_02);
        long l = fad2.dpZ().Ya();
        if (l == 0L) {
            return 0L;
        }
        Collection collection = etu_02.bL(eyo_02.bcP());
        int n = -1;
        for (exP exP2 : collection) {
            fad fad3;
            if (!(exP2 instanceof fad) || (fad3 = (fad)((Object)exP2)).dpZ().Ya() != l) continue;
            ++n;
        }
        assert (n >= 0);
        return n;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLG;
    }

    static {
        pyK.add(amz_1.cJI);
    }
}

