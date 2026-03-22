/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eEp
 */
public final class eep_0
extends eeo_0 {
    public eep_0(ArrayList<amx_1> arrayList) {
        super(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.a(this.pvH, object, object2, object4, object3);
        if (eyo_02 == null && object3 instanceof ehe_0) {
            eyo_02 = ((ehe_0)object3).fog();
        }
        if (eyo_02 == null) {
            return -1;
        }
        boolean bl = this.pBE == null ? eyo_02.w(this.pBD.d(object, object2, object3, object4), 0L) : eyo_02.w(this.pBD.d(object, object2, object3, object4), this.pBE.d(object, object2, object3, object4));
        if (bl) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKl;
    }
}

