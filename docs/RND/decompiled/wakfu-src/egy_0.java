/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eGY
 */
public class egy_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pFe = new ArrayList();
    private boolean pvJ = true;
    private amx_1 pFf;

    @Override
    protected List<amz_1[]> bDC() {
        return pFe;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public egy_0(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
        if (s == 0) {
            this.pvJ = false;
        }
        if (s == 1) {
            this.pvJ = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        }
        if (s == 2) {
            this.pvJ = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
            this.pFf = arrayList.get(1);
        }
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (object4 == null) {
            throw new amf_2("Pas de contexte...");
        }
        boolean bl = object4 instanceof etu_0;
        boolean bl2 = object4 instanceof ent_0;
        if (!bl && !bl2) {
            throw new amf_2("On essaie de compter les invocations en dehors d'un combat..." + (String)(this.pFf == null ? "" : " summonId = " + (int)((amu_1)this.pFf).d(null, null, null, null)));
        }
        eyo_0 eyo_02 = eAs.b(this.pvJ, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1L;
        }
        long l = this.a(eyo_02);
        return this.fny() * l;
    }

    protected int a(eyo_0 eyo_02) {
        int n = this.pFf == null ? eyo_02.dOm() : eyo_02.Gc((int)((amu_1)this.pFf).d(null, null, null, null));
        return n;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFS;
    }

    static {
        pFe.add(eAC.pwq);
        pFe.add(eAC.pwr);
        pFe.add(new amz_1[]{amz_1.cJx, amz_1.cJy});
    }
}

