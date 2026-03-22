/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import java.util.ArrayList;

/*
 * Renamed from eCH
 */
@Criterion(description="Renvoie la position du caster")
public class ech_0
extends ehf_0 {
    public ech_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = object instanceof exP ? (exP)object : (object2 instanceof exP ? (exP)object2 : (object3 instanceof ehe_0 ? ((ehe_0)object3).fog() : eAs.a(false, object, object2, object4, object3)));
        if (exP2 == null) {
            throw new amf_2("On cherche la position dans un contexte sans Personnage");
        }
        return super.r(object, object2, object3, object4) * anf_2.s(exP2.aZw());
    }

    @Override
    public double e(Object object, Object object2, Object object3, Object object4) {
        return Double.longBitsToDouble(anf_2.s(((exP)object).aZw()));
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGe;
    }
}

