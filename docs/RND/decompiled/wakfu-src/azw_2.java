/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from azW
 */
public class azw_2<K, V> {
    protected K[] dwn;
    private V[] dwo;
    protected int cRf;

    public azw_2() {
        this(10);
    }

    public azw_2(int n) {
        this.dwn = new Object[n];
        this.dwo = new Object[n];
        this.cRf = 0;
    }

    public boolean vS(int n) {
        if (n > this.dwn.length) {
            K[] KArray = this.dwn;
            this.dwn = new Object[n];
            System.arraycopy(KArray, 0, this.dwn, 0, KArray.length);
            V[] VArray = this.dwo;
            this.dwo = new Object[n];
            System.arraycopy(VArray, 0, this.dwo, 0, VArray.length);
            return true;
        }
        return false;
    }

    protected final int W(K k2) {
        for (int i = this.cRf - 1; i >= 0; --i) {
            if (!k2.equals(this.dwn[i])) continue;
            return i;
        }
        return -1;
    }

    protected final int X(K k2) {
        for (int i = this.cRf - 1; i >= 0; --i) {
            if (k2 != this.dwn[i]) continue;
            return -i - 1;
        }
        return this.cRf;
    }

    protected final void bTJ() {
        if (this.cRf == this.dwn.length) {
            this.vS(this.dwn.length * 2);
        }
    }

    public final boolean Y(K k2) {
        return this.W(k2) != -1;
    }

    public final void bTK() {
        this.cRf = 0;
    }

    public void clear() {
        this.cRf = 0;
        int n = this.dwo.length;
        for (int i = 0; i < n; ++i) {
            this.dwo[i] = null;
        }
    }

    public final int bTL() {
        return this.cRf;
    }

    public final K vT(int n) {
        return this.dwn[n];
    }

    public void f(K k2, V v) {
        this.bTJ();
        int n = this.X(k2);
        if (n < 0) {
            n = -n - 1;
        } else {
            ++this.cRf;
            this.dwn[n] = k2;
        }
        this.dwo[n] = v;
    }

    public V P(K k2) {
        if (this.cRf == 0) {
            return null;
        }
        int n = this.W(k2);
        if (n < 0) {
            return null;
        }
        V v = this.dwo[n];
        if (n < this.cRf - 1) {
            this.dwn[n] = this.dwn[this.cRf - 1];
            this.dwo[n] = this.dwo[this.cRf - 1];
            this.dwn[this.cRf - 1] = null;
            this.dwo[this.cRf - 1] = null;
        } else {
            this.dwn[n] = null;
            this.dwo[n] = null;
        }
        --this.cRf;
        return v;
    }

    public V O(K k2) {
        int n = this.W(k2);
        if (n < 0) {
            return null;
        }
        return this.dwo[n];
    }

    public final V vU(int n) {
        return this.dwo[n];
    }

    public final void i(TObjectProcedure<V> tObjectProcedure) {
        for (int i = 0; i < this.cRf; ++i) {
            tObjectProcedure.execute(this.dwo[i]);
        }
    }

    public static void main(String[] stringArray) {
        azw_2<String, Integer> azw_22 = new azw_2<String, Integer>();
        azw_22.f("id", 10);
        azw_22.f("craft_id", 20);
        int n = (Integer)azw_22.O("craft_id");
        System.out.println(n);
    }
}

