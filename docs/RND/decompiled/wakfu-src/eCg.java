/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eCg
extends eak_0 {
    private static final ArrayList<amz_1[]> pyJ = new ArrayList();

    @Deprecated
    public eCg() {
    }

    public eCg(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pyJ;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJe;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.m(object, object2, object3, object4);
        if (!(eyo_02 instanceof fad)) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer la cible du crit\u00e8re");
        }
        fad fad2 = (fad)((Object)eyo_02);
        return fad2.dpZ().cmL();
    }

    static {
        pyJ.add(amz_1.cJI);
    }
}

