/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.list.array.TShortArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TShortArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from eyW
 */
public final class eyw_0 {
    protected static final Logger pou = Logger.getLogger(eyw_0.class);
    private long pov;
    private long pow;
    private String pox;
    final TIntArrayList poy = new TIntArrayList(1);
    final TShortArrayList poz = new TShortArrayList(1);
    private long poA;

    public long aay() {
        return this.pov;
    }

    public void po(long l) {
        this.pov = l;
    }

    public long flT() {
        return this.pow;
    }

    public void pp(long l) {
        this.pow = l;
    }

    public String flU() {
        return this.pox;
    }

    public void rQ(String string) {
        this.pox = string;
    }

    public void f(int n, short s) {
        for (int i = this.poy.size() - 1; i >= 0; --i) {
            if (this.poy.getQuick(i) != n) continue;
            this.poz.setQuick(i, (short)(this.poz.getQuick(i) + s));
            return;
        }
        this.poy.add(n);
        this.poz.add(s);
    }

    public Iterator<azx_1<Integer, Short>> flV() {
        return new eyx_0(this);
    }

    public int ov() {
        return this.poy.size();
    }

    public long alI() {
        return this.poA;
    }

    public void pq(long l) {
        this.poA = l;
    }

    public boolean a(eyw_0 eyw_02) {
        if (eyw_02.flT() != this.pow || !eyw_02.flU().equals(this.pox)) {
            return false;
        }
        Iterator<azx_1<Integer, Short>> iterator = eyw_02.flV();
        while (iterator.hasNext()) {
            azx_1<Integer, Short> azx_12 = iterator.next();
            this.f(azx_12.getFirst(), azx_12.aHI());
        }
        this.poA += eyw_02.alI();
        return true;
    }
}

