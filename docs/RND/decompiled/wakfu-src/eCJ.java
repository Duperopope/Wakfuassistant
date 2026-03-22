/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 */
import gnu.trove.iterator.TIntObjectIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class eCJ
extends eak_0 {
    private static final List<amz_1[]> pzr = new ArrayList<amz_1[]>();
    private amu_1 pzs;

    @Override
    protected List<amz_1[]> bDC() {
        return Collections.unmodifiableList(pzr);
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public eCJ(List<amx_1> list) {
        this.r(list);
        if (list.size() == 1) {
            this.pzs = (amu_1)list.get(0);
        }
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        int n = (int)this.pzs.d(object, object2, object3, object4);
        TIntObjectIterator<fjo_0> tIntObjectIterator = fjt.syH.eCu();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fjo_0 fjo_02 = (fjo_0)tIntObjectIterator.value();
            fnf_0 fnf_02 = fjo_02.gbC();
            fnd_0 fnd_02 = fnf_02.Xd(n);
            if (fnd_02 == null) continue;
            return this.fny() * (long)fjo_02.Xt();
        }
        throw new amf_2("protecteur non trouv\u00e9 dans le NationManager : protectorId=" + n);
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKr;
    }

    public String toString() {
        return "GetProtectorNationId{m_protectorId=" + String.valueOf(this.pzs) + "}";
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pzr.add(amz_1Array);
    }
}

