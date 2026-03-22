/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Ts
 */
public class ts_0<Rated extends tk_0>
implements tr_0<Rated> {
    public static final int bsE = 1000;
    public static final int bsF = 2000;
    private int bsG = 1000;
    private int bsH = 2000;

    @Override
    public void pr(int n) {
        this.bsG = n;
    }

    @Override
    public void ps(int n) {
        this.bsH = n;
    }

    @Override
    public int bhf() {
        return this.bsG;
    }

    @Override
    public int bhg() {
        return this.bsH;
    }

    private int pt(int n) {
        if (n < 1400) {
            return 48;
        }
        if (n < 1600) {
            return 36;
        }
        return 24;
    }

    private double an(int n, int n2) {
        return 1.0 / (1.0 + Math.pow(10.0, (double)(n2 - n) / 400.0));
    }

    @Override
    public void b(@NotNull tm_0<Rated> tm_02) {
        tk_0[] tk_0Array = tm_02.bgO();
        double[] dArray = new double[2];
        double d2 = tm_02.bgR() == tk_0Array[0] ? 1.0 : (dArray[0] = tm_02.bgQ() ? 0.5 : 0.0);
        dArray[1] = tm_02.bgR() == tk_0Array[1] ? 1.0 : (tm_02.bgQ() ? 0.5 : 0.0);
        double[] dArray2 = dArray;
        int n = tk_0Array[0].bgK();
        int n2 = tk_0Array[1].bgK();
        int n3 = this.pt(n) < this.pt(n2) ? this.pt(n) : this.pt(n2);
        int n4 = n + (int)Math.round((double)n3 * (dArray2[0] - this.an(n, n2)));
        int n5 = n4 > this.bsG ? n4 : this.bsG;
        tk_0Array[0].pp(n5 < this.bsH ? n5 : this.bsH);
        n4 = n2 + (int)Math.round((double)n3 * (dArray2[1] - this.an(n2, n)));
        n5 = n4 > this.bsG ? n4 : this.bsG;
        tk_0Array[1].pp(n5 < this.bsH ? n5 : this.bsH);
    }

    @Override
    public void b(tq_0<Rated> tq_02) {
        int n;
        int n2;
        double[] dArray;
        Collection<Rated> collection;
        Collection<Rated> collection2;
        if (tq_02.bgQ()) {
            collection2 = tq_02.bgU();
            collection = tq_02.bgV();
            dArray = new double[]{0.5, 0.5};
        } else {
            collection2 = tq_02.bhb();
            collection = tq_02.bhc();
            dArray = new double[]{1.0, 0.0};
        }
        int n3 = 0;
        for (Object object : collection2) {
            n3 += object.bgK();
        }
        n3 /= collection2.size();
        int n4 = 0;
        for (Iterator<Rated> iterator : collection) {
            n4 += iterator.bgK();
        }
        int n5 = this.pt(n3) < this.pt(n4 /= collection2.size()) ? this.pt(n3) : this.pt(n4);
        for (tk_0 tk_02 : collection2) {
            n2 = tk_02.bgK() + (int)Math.round((double)n5 * (dArray[0] - this.an(n3, n4)));
            n = n2 > this.bsG ? n2 : this.bsG;
            tk_02.pp(n < this.bsH ? n : this.bsH);
        }
        for (tk_0 tk_02 : collection) {
            n2 = tk_02.bgK() + (int)Math.round((double)n5 * (dArray[1] - this.an(n3, n4)));
            n = n2 > this.bsG ? n2 : this.bsG;
            tk_02.pp(n < this.bsH ? n : this.bsH);
        }
    }

    @Override
    public void b(to_0<Rated> to_02) {
        if (to_02 == null || to_02.bgT() == 0) {
            return;
        }
        ArrayList<tk_0> arrayList = new ArrayList<tk_0>();
        for (tm_0<Object> object : to_02.bgS()) {
            for (tk_0 tk_02 : object.bgO()) {
                if (arrayList.contains(tk_02)) continue;
                arrayList.add(tk_02);
            }
        }
        for (tk_0 tk_03 : arrayList) {
            int n = to_02.j(tk_03);
            double d2 = 0.0;
            double d3 = 0.0;
            int n2 = 1024;
            for (tm_0<Object> tm_02 : to_02.bgS()) {
                if (!tm_02.app() || !tm_02.h(tk_03)) continue;
                int n3 = to_02.j(tm_02.i(tk_03));
                d2 += tm_02.bgR() == tk_03 ? 1.0 : (tm_02.bgQ() ? 0.5 : 0.0);
                d3 += this.an(n, n3);
                int n4 = this.pt(n) < this.pt(n3) ? this.pt(n) : this.pt(n3);
                n2 = n2 < n4 ? n2 : n4;
            }
            int n5 = n + (int)Math.round((double)n2 * (d2 - d3));
            int n6 = n5 > this.bsG ? n5 : this.bsG;
            tk_03.pp(this.bsH < n6 ? this.bsH : n6);
        }
    }
}

