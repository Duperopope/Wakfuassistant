/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yn
 */
final class yn_1 {
    private byte Us = 0;
    private long ZC = 0L;
    private int alB = 0;
    private short Xr = 0;
    private long YH = 0L;
    private final ArrayList<yo_1> alD = new ArrayList(0);
    final /* synthetic */ ym_1 alE;

    yn_1(ym_1 ym_12) {
        this.alE = ym_12;
    }

    public void avW() {
        this.alE.ZC = this.ZC;
        this.alE.alB = this.alB;
        this.alE.Xr = this.Xr;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.Us = byteBuffer.get();
        this.ZC = byteBuffer.getLong();
        this.alB = byteBuffer.getInt();
        this.Xr = byteBuffer.getShort();
        this.YH = byteBuffer.getLong();
        int n = byteBuffer.get() & 0xFF;
        this.alD.clear();
        this.alD.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yo_1 yo_12 = new yo_1();
            boolean bl = yo_12.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.alD.add(yo_12);
        }
        return true;
    }

    private boolean dt(ByteBuffer byteBuffer) {
        this.Us = byteBuffer.get();
        this.ZC = byteBuffer.getLong();
        this.alB = byteBuffer.getInt();
        this.Xr = byteBuffer.getShort();
        int n = byteBuffer.get() & 0xFF;
        this.alD.clear();
        this.alD.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yo_1 yo_12 = new yo_1();
            boolean bl = yo_12.b(byteBuffer, 10048002);
            if (!bl) {
                return false;
            }
            this.alD.add(yo_12);
        }
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10048002) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10056001) {
            boolean bl = this.dt(byteBuffer);
            return bl;
        }
        return false;
    }
}

