/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bOd
 */
public class bod_2
implements aeh_2 {
    public static final String kJC = "currentPage";
    public static final String kJD = "tutorials";
    public static final String kJE = "hasSearch";
    public static final String kJF = "hasPreviousPage";
    public static final String kJG = "hasNextPage";
    public static final String kJH = "numPages";
    public static final String kJI = "searchResult";
    public static final String kJJ = "searchActive";
    final TIntObjectHashMap<boj_2> kJK = new TIntObjectHashMap();
    private final ArrayList<bog_2> kJL = new ArrayList();
    private String kJM;
    private int hQx = 0;

    public bod_2() {
        boh_2.kJT.b(new boe_2(this));
        this.egE();
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kJC)) {
            return this.kJK.get(this.hQx);
        }
        if (string.equals(kJD)) {
            if (this.kJL.isEmpty()) {
                return null;
            }
            return this.kJL;
        }
        if (string.equals(kJE)) {
            return this.egF();
        }
        if (string.equals(kJF)) {
            return this.hQx > 0;
        }
        if (string.equals(kJG)) {
            return this.hQx < this.kJK.size() - 1;
        }
        if (string.equals(kJI)) {
            return this.kJL.size() > 0 ? aum_0.cWf().c("resultNumber", this.kJL.size()) : aum_0.cWf().c("marketBoard.noResults", new Object[0]);
        }
        if (string.equals(kJJ)) {
            return this.kJM != null && this.kJM.isEmpty();
        }
        if (string.equals(kJH)) {
            if (this.egF()) {
                return null;
            }
            return this.hQx + 1 + "/" + this.kJK.size();
        }
        return null;
    }

    public void dfp() {
        if (this.hQx == 0) {
            return;
        }
        --this.hQx;
        this.egE();
        fse_1.gFu().a((aef_2)this, kJG, kJF, kJH);
    }

    public void dfq() {
        if (this.hQx == this.kJK.size() - 1) {
            return;
        }
        ++this.hQx;
        this.egE();
        fse_1.gFu().a((aef_2)this, kJG, kJF, kJH);
    }

    public void nd(String string) {
        this.kJM = string != null && string.length() > 0 ? string : null;
        this.egE();
        fse_1.gFu().a((aef_2)this, kJE, kJG, kJF, kJH, kJI);
    }

    private void egE() {
        this.kJL.clear();
        if (this.egF()) {
            TIntObjectIterator tIntObjectIterator = this.kJK.iterator();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                for (bog_2 bog_22 : ((boj_2)tIntObjectIterator.value()).egH()) {
                    if (!bog_22.getName().toLowerCase().contains(this.kJM.toLowerCase())) continue;
                    this.kJL.add(bog_22);
                }
            }
        } else {
            for (bog_2 bog_23 : ((boj_2)this.kJK.get(this.hQx)).egH()) {
                this.kJL.add(bog_23);
            }
        }
        fse_1.gFu().a((aef_2)this, kJD);
    }

    private boolean egF() {
        return this.kJM != null;
    }
}

