/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntIntHashMap;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bOD
 */
public class bod_1
extends frs_0
implements aeh_2 {
    protected static final Logger kMm = Logger.getLogger(bod_1.class);
    private static final String kMn = "resourceFamilyRatios";
    private static final String[] kMo = new String[]{"resourceFamilyRatios"};
    private static final bod_1 kMp = new bod_1();
    private final ArrayList<boz_2> kMq = new ArrayList();

    private bod_1() {
    }

    public void dS(byte[] byArray) {
        this.kMq.clear();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        TIntIntHashMap tIntIntHashMap = new TIntIntHashMap();
        int n = byteBuffer.getInt();
        bzr_2 bzr_22 = boa_2.ehn().ehq();
        if (bzr_22 == null) {
            kMm.warn((Object)"R\u00e9ception d'information de ressources dans une zone inconnue du client");
            return;
        }
        wo_0 wo_02 = bzr_22.eqE();
        bJr bJr2 = bTj.eno().doD();
        bJB bJB2 = bJr2 != null ? bJr2.eaE() : null;
        for (int i = 0; i < n; ++i) {
            int n2 = byteBuffer.getInt();
            int n3 = byteBuffer.getInt();
            abm_1 abm_12 = null;
            if (bJB2 != null) {
                abm_12 = bJB2.HH(n2);
            }
            int n4 = wo_02.bNi;
            tIntIntHashMap.put(n2, n3);
            ejj_0 ejj_02 = ejj_0.dG((short)n2);
            if (ejj_02 == null || !ejj_02.fxc()) continue;
            this.kMq.add(new boz_2(bow_2.IA(i), n2, abm_12, n3, n4));
        }
        if (bJB2 != null) {
            bJB2.Yc(-1);
            bJB2.d(tIntIntHashMap);
        }
        fse_1.gFu().a((aef_2)this, kMo);
    }

    public boz_2 IF(int n) {
        int n2 = this.kMq.size();
        for (int i = 0; i < n2; ++i) {
            boz_2 boz_22 = this.kMq.get(i);
            if (boz_22.cqy() != n) continue;
            return boz_22;
        }
        return null;
    }

    public ArrayList<boz_2> ehv() {
        return this.kMq;
    }

    public float ehb() {
        float f2 = 0.0f;
        for (boz_2 boz_22 : this.kMq) {
            f2 += boz_22.ehb();
        }
        return f2 / (float)this.kMq.size();
    }

    public static bod_1 ehw() {
        return kMp;
    }

    @Override
    public String[] bxk() {
        return kMo;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kMn)) {
            return this.kMq.size() > 0 ? this.kMq : null;
        }
        return null;
    }

    public void clear() {
        this.kMq.clear();
    }

    public void ehu() {
        kMm.info((Object)"#################################################");
        int n = this.kMq.size();
        for (int i = 0; i < n; ++i) {
            boz_2 boz_22 = this.kMq.get(i);
            kMm.info((Object)boz_22);
        }
        kMm.info((Object)"#################################################");
    }
}

