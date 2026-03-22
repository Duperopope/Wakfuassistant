/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eBk
 */
public class ebk_0
extends eak_0
implements ehm_0 {
    private exx_2 pxl;
    private boolean pxm;
    private static final ArrayList<amz_1[]> pxn = new ArrayList();

    public exx_2 fnE() {
        return this.pxl;
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pxn;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public ebk_0(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
        if (s == 0) {
            this.pxl = ebi_0.rS(((anh_2)arrayList.get(0)).getValue());
        }
        if (s == 1) {
            this.pxl = ebi_0.rS(((anh_2)arrayList.get(0)).getValue());
            this.pxm = ((anh_2)arrayList.get(1)).getValue().equalsIgnoreCase("target");
        }
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        long l = 0L;
        eyo_0 eyo_02 = eAs.b(this.pxm, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1L;
        }
        if (eyo_02.a(this.pxl)) {
            l = eyo_02.d(this.pxl);
            return super.fny() * l;
        }
        pwx.error((Object)("Trying to get GetCharacteristicMax for a character without this charac. Charac=" + String.valueOf(this.pxl) + " criterionUser=" + String.valueOf(object) + " criterionTarget=" + String.valueOf(object2) + " criterionContent=" + String.valueOf(object3)));
        return -1L;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHk;
    }

    @Override
    public boolean fnF() {
        return this.pxm;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJx};
        pxn.add(amz_1Array);
        amz_1Array = new amz_1[]{amz_1.cJx, amz_1.cJx};
        pxn.add(amz_1Array);
    }
}

