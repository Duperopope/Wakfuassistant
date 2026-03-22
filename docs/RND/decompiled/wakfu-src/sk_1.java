/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from sk
 */
final class sk_1 {
    private byte[] SY = null;
    private final ArrayList<sl_1> Yf = new ArrayList(0);
    private int Yg = 0;
    private int Yh = 0;
    final /* synthetic */ si_2 Yi;

    sk_1(si_2 si_22) {
        this.Yi = si_22;
    }

    public void avW() {
        this.Yi.SY = this.SY;
    }

    private boolean dM(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.Yf.clear();
        this.Yf.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            sl_1 sl_12 = new sl_1();
            boolean bl = sl_12.b(byteBuffer, 10043003);
            if (!bl) {
                return false;
            }
            this.Yf.add(sl_12);
        }
        return true;
    }

    private boolean dN(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.Yf.clear();
        this.Yf.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            sl_1 sl_12 = new sl_1();
            boolean bl = sl_12.b(byteBuffer, 10043006);
            if (!bl) {
                return false;
            }
            this.Yf.add(sl_12);
        }
        this.Yg = byteBuffer.getInt();
        return true;
    }

    private boolean dO(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.Yf.clear();
        this.Yf.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            sl_1 sl_12 = new sl_1();
            boolean bl = sl_12.b(byteBuffer, 10047000);
            if (!bl) {
                return false;
            }
            this.Yf.add(sl_12);
        }
        this.Yh = byteBuffer.getInt();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10043003) {
            return false;
        }
        if (n < 10043006) {
            boolean bl = this.dM(byteBuffer);
            return bl;
        }
        if (n < 10047000) {
            boolean bl = this.dN(byteBuffer);
            return bl;
        }
        if (n < 10056000) {
            boolean bl = this.dO(byteBuffer);
            return bl;
        }
        return false;
    }
}

