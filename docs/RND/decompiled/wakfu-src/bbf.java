/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.THashMap;
import java.util.BitSet;
import org.apache.log4j.Logger;

final class bbf {
    private static final Logger hzT = Logger.getLogger(bbf.class);
    public static final bbf hzU = new bbf();
    private final THashMap<String, bbg> hzV = new THashMap();

    private bbf() {
        this.cZI();
    }

    private void cZI() {
        try {
            this.hzV.put((Object)etm_0.rnt.aXB(), (Object)new bbg(bbq.class));
            this.hzV.put((Object)"OTHER", (Object)new bbg(bbq.class));
            this.hzV.put((Object)etm_0.rnr.aXB(), (Object)new bbg(bbm.class));
            this.hzV.put((Object)etm_0.rns.aXB(), (Object)new bbg(baz_0.class));
            this.hzV.put((Object)etm_0.rnu.aXB(), (Object)new bbg(baw_0.class));
            this.hzV.put((Object)etm_0.rnq.aXB(), (Object)new bbg(bbl.class));
            this.hzV.put((Object)etm_0.rnx.aXB(), (Object)new bbg(bbr.class));
            this.hzV.put((Object)etm_0.rnv.aXB(), (Object)new bbg(bay_0.class));
            this.hzV.put((Object)etm_0.rny.aXB(), (Object)new bbg(bbu.class));
            this.hzV.put((Object)etm_0.rnz.aXB(), (Object)new bbg(bbb_0.class));
            this.hzV.put((Object)etm_0.rnE.aXB(), (Object)new bbg(bax_0.class));
            this.hzV.put((Object)etm_0.rnw.aXB(), (Object)new bbg(bbo.class));
            this.hzV.put((Object)etm_0.rnA.aXB(), (Object)new bbg(bbc_0.class));
            this.hzV.put((Object)etm_0.rnB.aXB(), (Object)new bbg(bbn.class));
            this.hzV.put((Object)etm_0.rnC.aXB(), (Object)new bbg(bbv.class));
            this.hzV.put((Object)etm_0.rnD.aXB(), (Object)new bbg(bbi.class));
            this.hzV.put((Object)etm_0.rnF.aXB(), (Object)new bbg(bba_0.class));
            this.hzV.put((Object)etm_0.rnG.aXB(), (Object)new bbg(bbk.class));
            this.hzV.put((Object)etm_0.rnH.aXB(), (Object)new bbg(bav_0.class));
        }
        catch (NoSuchMethodException noSuchMethodException) {
            hzT.error((Object)"", (Throwable)noSuchMethodException);
        }
    }

    eSS a(ale_0 ale_02) {
        bbg bbg2 = (bbg)this.hzV.get((Object)ale_02.aLZ());
        if (bbg2 == null) {
            hzT.error((Object)("Type d'effet inconnu : " + ale_02.aLZ()));
            return null;
        }
        try {
            eSS eSS2 = bbg2.c(ale_02);
            eSS2.d(bbf.y(ale_02.ckj()));
            eSS2.mz(ale_02.cke());
            eSS2.N(ale_02.ckm());
            return eSS2;
        }
        catch (Exception exception) {
            hzT.error((Object)"", (Throwable)exception);
            return null;
        }
    }

    static aoh_1 b(ale_0 ale_02) {
        aoh_1 aoh_12 = null;
        try {
            aoh_12 = aoi_1.a(ale_02.cka(), ale_02.ckg(), (short)0);
            if (aoh_12 == null) {
                throw new NullPointerException("AOE incorrecte");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            hzT.error((Object)"erreur au chargement des effets statiques : zone d'effet incorrecte");
        }
        return aoh_12;
    }

    static BitSet y(int[] nArray) {
        BitSet bitSet = new BitSet();
        if (nArray != null) {
            for (int n : nArray) {
                bitSet.set(n);
            }
        }
        return bitSet;
    }

    static String lb(String string) {
        if (string == null) {
            return "";
        }
        if (string.endsWith("\n")) {
            return string.substring(0, string.length() - 1);
        }
        return string;
    }
}

