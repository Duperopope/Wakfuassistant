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
 * Renamed from bOC
 */
public class boc_2
extends frs_0
implements aeh_2 {
    protected static final Logger kMh = Logger.getLogger(boc_2.class);
    private static final String kMi = "monsterFamilyRatios";
    private static final String[] kMj = new String[]{"monsterFamilyRatios"};
    private static final boc_2 kMk = new boc_2();
    private final ArrayList<boz_2> kMl = new ArrayList();

    private boc_2() {
    }

    public void dS(byte[] byArray) {
        this.kMl.clear();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        TIntIntHashMap tIntIntHashMap = new TIntIntHashMap();
        int n = byteBuffer.getInt();
        bzr_2 bzr_22 = boa_2.ehn().ehq();
        if (bzr_22 == null) {
            kMh.warn((Object)"R\u00e9ception d'information de monstres dans une zone inconnue du client");
            return;
        }
        wn_0 wn_02 = bzr_22.eqF();
        bJr bJr2 = bTj.eno().doD();
        bJB bJB2 = bJr2 != null ? bJr2.eaE() : null;
        for (int i = 0; i < n; ++i) {
            int n2 = byteBuffer.getInt();
            int n3 = byteBuffer.getInt();
            abm_1 abm_12 = null;
            if (bJB2 != null) {
                abm_12 = bJB2.HG(n2);
            }
            int n4 = wn_02.bNf;
            tIntIntHashMap.put(n2, n3);
            this.kMl.add(new boz_2(bow_2.Iz(i), n2, abm_12, n3, n4));
        }
        if (bJB2 != null) {
            bJB2.Yb(-1);
            bJB2.c(tIntIntHashMap);
        }
        fse_1.gFu().a((aef_2)this, kMj);
    }

    public boz_2 IE(int n) {
        int n2 = this.kMl.size();
        for (int i = 0; i < n2; ++i) {
            boz_2 boz_22 = this.kMl.get(i);
            if (boz_22.cqy() != n) continue;
            return boz_22;
        }
        return null;
    }

    public ArrayList<boz_2> ehs() {
        return this.kMl;
    }

    public float ehb() {
        float f2 = 0.0f;
        for (boz_2 boz_22 : this.kMl) {
            f2 += boz_22.ehb();
        }
        return f2 / (float)this.kMl.size();
    }

    public static boc_2 eht() {
        return kMk;
    }

    @Override
    public String[] bxk() {
        return kMj;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kMi)) {
            return this.kMl.size() > 0 ? this.kMl : null;
        }
        return null;
    }

    public void clear() {
        this.kMl.clear();
    }

    public void ehu() {
        kMh.info((Object)"#################################################");
        int n = this.kMl.size();
        for (int i = 0; i < n; ++i) {
            boz_2 boz_22 = this.kMl.get(i);
            kMh.info((Object)boz_22);
        }
        kMh.info((Object)"#################################################");
    }
}

