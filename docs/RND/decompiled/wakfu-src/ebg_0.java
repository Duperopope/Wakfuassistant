/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eBg
 */
public class ebg_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pxc = new ArrayList();
    private ebh_0 pxd;

    @Override
    protected List<amz_1[]> bDC() {
        return pxc;
    }

    public ebg_0(ArrayList<amx_1> arrayList) {
        if (this.r(arrayList) == 0) {
            this.pxd = arrayList.size() == 0 ? ebh_0.pxe : ebh_0.valueOf(((anh_2)arrayList.get(0)).getValue().toUpperCase());
        }
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        return super.fny() * (switch (this.pxd.ordinal()) {
            case 0 -> {
                if (object == null || !(object instanceof eyo_0)) {
                    throw new amf_2("Le User du crit\u00e8re n'est pas un CriterionUser");
                }
                yield ((eyo_0)object).Sn();
            }
            case 1 -> {
                if (object2 == null || !(object2 instanceof eyo_0)) {
                    throw new amf_2("La target du crit\u00e8re n'est pas un CriterionUser");
                }
                yield ((eyo_0)object2).Sn();
            }
            default -> throw new amf_2("Impossible de d\u00e9finir la cible du crit\u00e8re");
        });
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGd;
    }

    static {
        pxc.add(new amz_1[]{amz_1.cJx});
        pxc.add(amz_1.cJI);
    }
}

