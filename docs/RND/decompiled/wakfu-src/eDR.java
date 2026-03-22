/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

@Criterion(description="Returns 0 (valid criterion value) if the area of the specified id has a property matching specified areaPropertyId", signatures={@Signature(description="Specify area identifier and property identifier", params={@Parameter(name="areaId", type=VarType.NUMBER), @Parameter(name="areaPropertyId", type=VarType.NUMBER)})})
public class eDR
extends eAH {
    protected static final Logger pAO = Logger.getLogger(eDR.class);
    private static final ArrayList<amz_1[]> pAP = new ArrayList();
    private final amu_1 pAQ;
    private final amu_1 pAR;

    public eDR(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pAQ = (amu_1)arrayList.get(0);
        this.pAR = (amu_1)arrayList.get(1);
    }

    private int fnM() {
        if (this.pAQ.bDp() && this.pAQ.bDo()) {
            return (int)this.pAQ.d(null, null, null, null);
        }
        return -1;
    }

    private long q(Object object, Object object2, Object object3, Object object4) {
        if (this.pAR.bDo()) {
            return (int)this.pAR.d(object, object2, object3, object4);
        }
        return -1L;
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pAP;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (!(object3 instanceof ety_0)) {
            return -1;
        }
        ety_0 ety_02 = (ety_0)object4;
        long l = this.q(object, object2, object3, object4);
        int n = this.fnM();
        if (l == -1L || n == -1) {
            return -1;
        }
        etl_0 etl_02 = etl_0.Sq(n);
        if (etl_02 == null) {
            pAO.error((Object)("Invalid effect area property id: " + n));
            return -1;
        }
        QQ qQ = this.a(ety_02.bai(), l);
        if (qQ == null) {
            return -1;
        }
        if (qQ.b(etl_02) == 1) {
            return 0;
        }
        return -1;
    }

    private QQ a(QR qR, long l) {
        for (QQ qQ : qR.bdh()) {
            if (qQ.bcw() != l) continue;
            return qQ;
        }
        return null;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pOj;
    }
}

