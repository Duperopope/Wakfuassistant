/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fsz
 */
public class fsz_0 {
    private static final Logger tdL = Logger.getLogger(fsz_0.class);
    private static final fam_0[] tdM = new fam_0[0];
    private final TLongObjectHashMap<fam_0> tdN;
    private fam_0[] tdO = tdM;
    private short tdP = (short)Short.MAX_VALUE;
    private short tdQ = (short)Short.MAX_VALUE;

    public fsz_0(TLongObjectHashMap<fam_0> tLongObjectHashMap) {
        this.tdN = tLongObjectHashMap;
    }

    public fam_0[] aj(short s, short s2) {
        if (this.tdP == s && this.tdQ == s2) {
            return this.tdO;
        }
        int n = s * 18;
        int n2 = s2 * 18;
        aci_1 aci_12 = new aci_1(n, n + 18 - 1, n2, n2 + 18 - 1);
        ArrayList arrayList = new ArrayList();
        this.tdN.forEachValue((TObjectProcedure)new fsa_0(this, aci_12, arrayList));
        fam_0[] fam_0Array = arrayList.isEmpty() ? tdM : (fam_0[])arrayList.toArray(new far_0[arrayList.size()]);
        this.tdP = s;
        this.tdQ = s2;
        this.tdO = fam_0Array;
        return fam_0Array;
    }

    public void ehP() {
        this.tdO = tdM;
        this.tdP = (short)Short.MAX_VALUE;
        this.tdQ = (short)Short.MAX_VALUE;
    }
}

