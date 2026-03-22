/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eGM
 */
public class egm_0
extends eAH {
    private static final Logger pEO = Logger.getLogger(egm_0.class);
    private static final ArrayList<amz_1[]> pEP = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pEP;
    }

    public egm_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    public egm_0() {
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        int n;
        if (object instanceof foP) {
            n = ((foP)object).gfS().d();
        } else if (object instanceof exP) {
            n = ((exP)object).dlp();
        } else {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer le territoire");
        }
        if (fsk_0.tcp.contains((long)n)) {
            return -1;
        }
        foM foM2 = fpk.sNF.Yn(n);
        if (foM2 == null) {
            return -1;
        }
        Object t = foM2.gfO();
        if (t == null) {
            return -1;
        }
        return ((fpi)t).exj() ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKt;
    }

    static {
        pEP.add(amz_1.cJI);
    }
}

