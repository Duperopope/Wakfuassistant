/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 */
import gnu.trove.map.hash.THashMap;
import java.nio.ByteBuffer;

public abstract class YY<T extends Yb> {
    protected static final zb_0[] bUo = new zb_0[0];
    private final int bUp;
    protected final zb_0[] bUq;
    protected final zb_0[] bUr;

    public YY(int n, zb_0[] zb_0Array, zb_0[] zb_0Array2) {
        this.bUp = n;
        this.bUq = zb_0Array;
        this.bUr = zb_0Array2;
    }

    public YY(int n) {
        this(n, bUo, bUo);
    }

    public final int boN() {
        return this.bUp;
    }

    public abstract Yc bol();

    public abstract T boA();

    public final int boO() {
        return this.boR().length;
    }

    public final Yh[] boP() {
        return YY.a(this.bUr);
    }

    public final Yh[] boQ() {
        return YY.a(this.bUq);
    }

    private static Yh[] a(zb_0[] zb_0Array) {
        if (zb_0Array == bUo) {
            return Yh.bTM;
        }
        int n = zb_0Array.length;
        Yh[] yhArray = new Yh[n];
        for (int i = 0; i < n; ++i) {
            yhArray[i] = zb_0Array[i].boU();
        }
        return yhArray;
    }

    public final void a(Yh[] yhArray, ByteBuffer byteBuffer) {
        for (int i = 0; i < this.bUr.length; ++i) {
            this.bUr[i].a(yhArray[i], byteBuffer);
        }
    }

    public final void a(fs_0 fs_02, THashMap<String, String> tHashMap) {
        for (int i = 0; i < this.bUr.length; ++i) {
            this.bUr[i].a(fs_02, (String)tHashMap.get((Object)this.bUr[i].boT()));
        }
    }

    public final zb_0[] boR() {
        return this.bUq;
    }

    public final int dN(String string) {
        zb_0[] zb_0Array = this.boR();
        for (int i = 0; i < zb_0Array.length; ++i) {
            if (!zb_0Array[i].boT().equals(string)) continue;
            return i;
        }
        return -1;
    }

    public void a(Yh[] yhArray) {
        for (int i = 0; i < yhArray.length; ++i) {
            yhArray[i].reset();
        }
    }
}

