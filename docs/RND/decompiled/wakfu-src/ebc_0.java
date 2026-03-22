/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from eBc
 */
public class ebc_0
extends eAH {
    private static final List<amz_1[]> pwY = List.of(new amz_1[]{amz_1.cJx});
    private String cpF = null;

    @Override
    protected List<amz_1[]> bDC() {
        return pwY;
    }

    public ebc_0(List<amx_1> list) {
        this.r(list);
        this.cpF = ((anh_2)list.get(0)).getValue();
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        ewr_0 ewr_02 = ewr_0.rJ(this.cpF);
        if (ewr_02 == null) {
            return -1;
        }
        return ewo_0.oBF.k(ewr_02) ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLL;
    }
}

