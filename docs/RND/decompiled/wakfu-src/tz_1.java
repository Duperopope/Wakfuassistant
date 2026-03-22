/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from tZ
 */
final class tz_1 {
    private final ArrayList<ua_1> acc = new ArrayList(0);
    private boolean abX = false;
    private final ArrayList<tx_2> acd = new ArrayList(0);
    private final ArrayList<ty_1> ace = new ArrayList(0);
    final /* synthetic */ tw_1 acf;

    tz_1(tw_1 tw_12) {
        this.acf = tw_12;
    }

    public void avW() {
        this.acf.abX = this.abX;
        this.acf.abY.clear();
        this.acf.abY.ensureCapacity(this.acd.size());
        this.acf.abY.addAll(this.acd);
        this.acf.abZ.clear();
        this.acf.abZ.ensureCapacity(this.ace.size());
        this.acf.abZ.addAll(this.ace);
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.acc.clear();
        this.acc.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ua_1 ua_12 = new ua_1();
            boolean bl = ua_12.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.acc.add(ua_12);
        }
        this.abX = byteBuffer.get() == 1;
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 1) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        if (n < 10014) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

