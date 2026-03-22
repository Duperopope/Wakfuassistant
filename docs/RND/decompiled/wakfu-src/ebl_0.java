/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eBl
 */
public final class ebl_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pxo = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return new ArrayList<amz_1[]>(pxo);
    }

    public ebl_0() {
    }

    public ebl_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.m(object, object2, object4, object3);
        if (!(eyo_02 instanceof exP)) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer le point de reSpawn sur un character inexistant ou qui n'est pas un joueur");
        }
        return this.fny() * ((exP)eyo_02).dnV();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pIc;
    }

    static {
        pxo.add(amz_1.cJI);
    }
}

