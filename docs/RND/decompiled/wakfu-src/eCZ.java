/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eCZ
extends eak_0 {
    private amu_1 pzG;
    private static final ArrayList<amz_1[]> pzH = new ArrayList();

    public int dDF() {
        if (this.pzG.bDp() && this.pzG.bDo()) {
            return (int)this.pzG.d(null, null, null, null);
        }
        return -1;
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pzH;
    }

    public eCZ(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pzG = (amu_1)arrayList.get(0);
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        Iterable<fqE<Object>> iterable;
        if (!this.pzG.bDo()) {
            throw new amf_2("L'id n'est pas un entier");
        }
        int n = this.dDF();
        if (object instanceof exP) {
            iterable = ((exP)object).dkB();
        } else if (object instanceof Iterable) {
            iterable = (Iterable)object;
        } else {
            throw new amf_2("CriterionUser is neither a BasicCharacterInfo nor a SpellInventory");
        }
        int n2 = 0;
        for (fqE<Object> fqE2 : iterable) {
            if (!(fqE2 instanceof fqE)) {
                throw new amf_2("Inventory is not a spell inventory");
            }
            fqE<Object> fqE3 = fqE2;
            if (((fqD)fqE3.giP()).giG() != n) continue;
            n2 += fqE3.cmL();
        }
        return super.fny() * (long)n2;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGg;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pzH.add(amz_1Array);
    }
}

