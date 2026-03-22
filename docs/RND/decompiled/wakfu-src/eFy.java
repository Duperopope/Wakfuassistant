/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class eFy
extends eAH {
    private static final ArrayList<amz_1[]> pDj = new ArrayList();
    private amu_1 pDk;

    @Override
    protected List<amz_1[]> bDC() {
        return pDj;
    }

    public eFy(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        if (by != 0) {
            cKa.error((Object)("Param\u00e9trage de crit\u00e8re inconnu : " + String.valueOf(this)));
            return;
        }
        this.pDk = (amu_1)arrayList.get(0);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.k(object, object2, object4, object3);
        if (exP2 == null) {
            throw new amf_2("User null");
        }
        long l = this.pDk.d(object, object2, object3, object4);
        Object ItemSet = exP2.dlJ().bX((short)l);
        fgd_0 fgd_02 = exP2.doC();
        boolean bl = true;
        if (fgd_02 != null) {
            Iterator iterator = ((ffa_0)ItemSet).iterator();
            while (iterator.hasNext()) {
                if (fgd_02.pb(((fhc_0)iterator.next()).d())) continue;
                bl = false;
                break;
            }
        } else {
            fhk fhk2 = exP2.dmL();
            fhe fhe2 = exP2.dnP();
            if (fhk2 != null && fhe2 != null) {
                Iterator iterator = ((ffa_0)ItemSet).iterator();
                while (iterator.hasNext()) {
                    if (fhk2.a(fhe2, ((fhc_0)iterator.next()).d()) != null) continue;
                    bl = false;
                    break;
                }
            } else {
                bl = false;
            }
        }
        return bl ? 0 : 1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJn;
    }

    static {
        pDj.add(new amz_1[]{amz_1.cJy});
    }
}

