/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;
import java.nio.ByteBuffer;

public class TD {
    private final TLongArrayList btC = new TLongArrayList();
    private final TLongArrayList btD = new TLongArrayList();
    private final TF btE;

    TD(TF tF) {
        this.btE = tF;
    }

    void eW(long l) {
        this.btE.a(this, l);
    }

    void l(long l, int n) {
        this.btE.a(this, l, n);
    }

    void m(long l, int n) {
        this.btE.b(this, l, n);
    }

    void eX(long l) {
        aeb_2.a(this.btD, l);
        aeb_2.a(this.btC, l);
    }

    void n(long l, int n) {
        if (n > this.btC.size() || n < 0) {
            return;
        }
        long l2 = this.btD.get(n);
        if (l2 == l) {
            this.btD.removeAt(n);
        }
    }

    void bhH() {
        this.btE.a(this);
    }

    void bhZ() {
        this.btE.b(this);
    }

    void bhI() {
        this.btE.c(this);
    }

    public TLongArrayList bhD() {
        return this.btD;
    }

    public TLongArrayList bia() {
        return this.btC;
    }

    public int DN() {
        return 1 + 8 * this.btD.size() + 1 + 8 * this.btC.size();
    }

    public void as(ByteBuffer byteBuffer) {
        int n;
        byteBuffer.put((byte)this.btD.size());
        for (n = 0; n < this.btD.size(); ++n) {
            byteBuffer.putLong(this.btD.get(n));
        }
        byteBuffer.put((byte)this.btC.size());
        for (n = 0; n < this.btC.size(); ++n) {
            byteBuffer.putLong(this.btC.get(n));
        }
    }

    public void eO(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.get();
        for (n = 0; n < n2; ++n) {
            long l = byteBuffer.getLong();
            this.btD.add(l);
        }
        n = byteBuffer.get();
        for (int i = 0; i < n; ++i) {
            long l = byteBuffer.getLong();
            this.btC.add(l);
        }
    }

    public void clear() {
        this.btD.clear();
        this.btC.clear();
    }
}

