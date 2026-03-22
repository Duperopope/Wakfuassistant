/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eDC
 */
@Criterion(description="Count the number of fighters in zone with the specified world property", signatures={@Signature(description="With range min and range max", params={@Parameter(name="minRange", type=VarType.NUMBER), @Parameter(name="maxRange", type=VarType.NUMBER), @Parameter(name="targetType", type=VarType.STRING), @Parameter(name="propertyId", type=VarType.NUMBER)})})
public class edc_0
extends eak_0 {
    private amu_1 pxE;
    private amu_1 pxK;
    private final long pAw;
    private String pxi;

    public edc_0(List<amx_1> list) {
        this.r(list);
        this.pxK = (amu_1)list.get(0);
        this.pxE = (amu_1)list.get(1);
        this.pxi = ((anh_2)list.get(2)).getValue();
        this.pAw = ((amu_1)list.get(3)).d(null, null, null, null);
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        acd_1 acd_12;
        if (object4 == null) {
            throw new amf_2("Pas de contexte...");
        }
        etu_0<?> etu_02 = eAs.m(object, object4);
        if (etu_02 == null) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer le combat");
        }
        ezj_0 ezj_02 = ezj_0.Pl((int)this.pAw);
        if (ezj_02 == null) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer la world property " + this.pAw);
        }
        eyo_0 eyo_02 = eAs.a(this.pxi, object, object2, object4, object3);
        acd_1 acd_13 = "target".equals(this.pxi) && object2 instanceof acd_1 ? (acd_1)object2 : (acd_12 = eyo_02 != null ? eyo_02.aZw() : null);
        if (acd_12 == null) {
            return 0L;
        }
        Collection<? extends qu_0> collection = this.a(etu_02);
        long l = this.pxE.d(object, object2, object3, object4);
        long l2 = this.pxK.d(object, object2, object3, object4);
        long l3 = 0L;
        for (qu_0 qu_02 : collection) {
            if (qu_02.a(exe_1.rDQ) || !qu_02.a(ezj_02)) continue;
            int n = amf_1.c((amg_1)qu_02, acd_12);
            if (l >= 0L && ((long)n > l || (long)n < l2)) continue;
            ++l3;
        }
        return this.fny() * l3;
    }

    protected Collection<? extends qu_0> a(etu_0<?> etu_02) {
        Object object2;
        if (etu_02 == null) {
            return Collections.emptyList();
        }
        Collection collection = etu_02.fKc();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (Object object2 : collection) {
            if (((exP)object2).a(exe_1.rDQ)) continue;
            arrayList.add(object2);
        }
        Collection<QQ> collection2 = etu_02.bai().bdh();
        object2 = collection2.iterator();
        while (object2.hasNext()) {
            QQ qQ = (QQ)object2.next();
            ers_0 ers_02 = (ers_0)qQ.baz();
            if (ers_02 == null || qQ.a(exe_1.rDQ)) continue;
            arrayList.add(qQ);
        }
        return arrayList;
    }

    public long fnH() {
        return this.pAw;
    }

    public long fnB() {
        return this.pxE == null ? -1L : this.pxE.d(null, null, null, null);
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNM;
    }
}

