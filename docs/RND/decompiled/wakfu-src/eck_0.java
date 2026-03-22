/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import java.util.ArrayList;

/*
 * Renamed from eCk
 */
@Criterion(description="Retourne la position d'un IE")
public class eck_0
extends ehf_0 {
    public eck_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        RH rH;
        if (object instanceof RH) {
            rH = (RH)object;
        } else if (object2 instanceof RH) {
            rH = (RH)object2;
        } else if (object3 instanceof ehn_0 && ((ehn_0)object3).foj() instanceof RH) {
            rH = (RH)((Object)((ehn_0)object3).foj());
        } else {
            throw new amf_2("On cherche la position dans un contexte sans ie");
        }
        return super.r(object, object2, object3, object4) * anf_2.s(rH.aZw());
    }

    @Override
    public double e(Object object, Object object2, Object object3, Object object4) {
        return Double.longBitsToDouble(anf_2.s(((exP)object).aZw()));
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGf;
    }
}

