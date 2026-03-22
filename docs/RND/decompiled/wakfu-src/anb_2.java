/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.Comparator;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from anb
 */
public class anb_2 {
    public static final anb_2 cJO = new anb_2(null);
    public static final Comparator<ana_2> cJP = new and_2();
    public static final Comparator<ana_2> cJQ = new anc_2();
    private final azz_1<ana_2> cJR;

    public anb_2(Comparator<ana_2> comparator) {
        this.cJR = new azz_1<ana_2>(comparator);
    }

    public void h(long l, long l2) {
        ana_2 ana_22 = this.gl(l);
        if (ana_22 == null) {
            ana_22 = new ana_2(l);
            this.cJR.add(ana_22);
        }
        ana_22.fW(l2);
    }

    @Nullable
    public ana_2 gl(long l) {
        for (int i = 0; i < this.cJR.size(); ++i) {
            ana_2 ana_22 = (ana_2)this.cJR.get(i);
            if (ana_22.bDG() != l) continue;
            return ana_22;
        }
        return this.bDJ();
    }

    public int gm(long l) {
        for (int i = 0; i < this.cJR.size(); ++i) {
            ana_2 ana_22 = (ana_2)this.cJR.get(i);
            if (!ana_22.gk(l)) continue;
            return i;
        }
        return -1;
    }

    @Nullable
    public ana_2 th(int n) {
        if (n < 0 || n >= this.cJR.size()) {
            return this.bDJ();
        }
        return (ana_2)this.cJR.get(n);
    }

    private ana_2 bDJ() {
        return null;
    }

    public boolean g(TObjectProcedure<ana_2> tObjectProcedure) {
        for (int i = 0; i < this.cJR.size(); ++i) {
            if (tObjectProcedure.execute((Object)((ana_2)this.cJR.get(i)))) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        return "PlayerRanking{m_ranks=" + this.cJR.size() + "}";
    }

    public int aVo() {
        return this.cJR.size();
    }
}

