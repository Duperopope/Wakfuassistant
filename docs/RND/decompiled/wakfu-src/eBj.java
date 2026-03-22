/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eBj
extends eak_0
implements ehm_0 {
    private exx_2 pxh;
    private boolean pvJ;
    private static final List<amz_1[]> pxk = new ArrayList<amz_1[]>();

    @Override
    protected List<amz_1[]> bDC() {
        return pxk;
    }

    @Override
    public boolean bDo() {
        return false;
    }

    public eBj(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
        if (s == 0) {
            this.pxh = ebi_0.rS(((anh_2)arrayList.get(0)).getValue());
        }
        if (s == 1) {
            this.pxh = ebi_0.rS(((anh_2)arrayList.get(0)).getValue());
            this.pvJ = ((anh_2)arrayList.get(1)).getValue().equalsIgnoreCase("target");
        }
    }

    @Override
    public double e(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(this.pvJ, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1.0;
        }
        if (eyo_02.a(this.pxh)) {
            int n = eyo_02.c(this.pxh);
            int n2 = eyo_02.d(this.pxh);
            long l = GC.B((float)n / (float)n2 * 100.0f);
            return this.fny() * l;
        }
        pwx.error((Object)("Trying to get GetCharacteristicInPct for a character without this charac. Charac=" + String.valueOf(this.pxh) + " criterionUser=" + String.valueOf(object) + " criterionTarget=" + String.valueOf(object2) + " criterionContent=" + String.valueOf(object3)));
        return -1.0;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        throw new UnsupportedOperationException("Can't get Long value of a double");
    }

    public exx_2 fnE() {
        return this.pxh;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFB;
    }

    @Override
    public boolean fnF() {
        return this.pvJ;
    }

    static {
        pxk.add(eAC.pwr);
        pxk.add(new amz_1[]{amz_1.cJx, amz_1.cJx});
    }
}

