/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from eNI
 */
public class eni_0 {
    private static final Logger qZD = Logger.getLogger(eni_0.class);
    private static final eni_0 qZE = new eni_0();
    private final TIntObjectHashMap<eNB> qZF = new TIntObjectHashMap();

    public static eni_0 fBA() {
        return qZE;
    }

    private eni_0() {
        this.a(eng_0.fBz());
        this.a(eNK.fBC());
        this.a(enl_0.fBD());
        this.a(eNM.fBE());
        this.a(eNF.fBy());
        this.a(eno_0.fBG());
        this.a(eNP.fBH());
        this.a(eNQ.fBI());
        this.a(enr_0.fBK());
        this.a(ens_0.fBL());
        this.a(eNT.fBM());
        this.a(enj_0.fBB());
        this.a(eNN.fBF());
    }

    void a(eNB eNB2) {
        if (this.qZF.containsKey(eNB2.aZH())) {
            throw new IllegalArgumentException("On ne peut pas ajouter un defaultEffect alors qu'un autre est deja enregistr\u00e9 avec le meme id");
        }
        this.qZF.put(eNB2.aZH(), (Object)eNB2);
    }

    public boolean RW(int n) {
        return this.qZF.containsKey(n);
    }

    public eNB RX(int n) {
        return (eNB)this.qZF.get(n);
    }
}

