/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntByteIterator
 *  gnu.trove.map.hash.TIntByteHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntByteIterator;
import gnu.trove.map.hash.TIntByteHashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bSq
 */
public class bsq_2
implements aeh_2 {
    private static final Logger lgd = Logger.getLogger(bsq_2.class);
    public static final String lge = "nation";
    public static final String lgf = "totalCash";
    public static final String lgg = "populationSize";
    public static final String lgh = "governorName";
    public static final String lgi = "territoriesCount";
    public static final String lgj = "nationAlignments";
    public static final String lgk = "selectionIcon";
    public static final String lgl = "backgroundImage";
    public static final String[] lgm = new String[]{"nation", "totalCash", "populationSize", "governorName", "territoriesCount", "nationAlignments", "selectionIcon", "backgroundImage"};
    private final int lgn;
    private final int lgo;
    private final float lgp;
    private final String lgq;
    private final int lgr;
    private final TIntByteHashMap lgs;

    public bsq_2(int n, int n2, float f2, String string, int n3, TIntByteHashMap tIntByteHashMap) {
        this.lgn = n;
        this.lgo = n2;
        this.lgp = f2;
        this.lgq = string;
        this.lgr = n3;
        this.lgs = tIntByteHashMap;
    }

    @Override
    public String[] bxk() {
        return lgm;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(lge)) {
            return new bso_2(this.lgn);
        }
        if (string.equals(lgf)) {
            return aum_0.cWf().c("kama.shortGain", this.lgo);
        }
        if (string.equals(lgg)) {
            return (int)(this.lgp * 100.0f) + " %";
        }
        if (string.equals(lgh)) {
            return this.lgq == null || this.lgq.length() == 0 ? aum_0.cWf().c("nation.noGovernorDesc", new Object[0]) : this.lgq;
        }
        if (string.equals(lgi)) {
            return this.lgr;
        }
        if (string.equals(lgj)) {
            ahv_2 ahv_22 = new ahv_2();
            TIntByteIterator tIntByteIterator = this.lgs.iterator();
            while (tIntByteIterator.hasNext()) {
                tIntByteIterator.advance();
                ahv_22.c(aum_0.cWf().a(39, (long)tIntByteIterator.key(), new Object[0]));
                ahv_22.c(" - ");
                ahv_22.c(aum_0.cWf().c("nation.alignmentName" + fkc_0.gT(tIntByteIterator.value()).name(), new Object[0]));
                if (!tIntByteIterator.hasNext()) continue;
                ahv_22.ceH();
            }
            return ahv_22.ceL();
        }
        if (string.equals(lgk)) {
            return auc_0.cVq().zH(this.lgn);
        }
        if (string.equals(lgl)) {
            return auc_0.cVq().zQ(beV.hOU.d());
        }
        return null;
    }

    public int Xt() {
        return this.lgn;
    }
}

