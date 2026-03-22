/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yt
 */
final class yt_1 {
    private final ArrayList<yr_1> alL = new ArrayList(0);
    final /* synthetic */ yq_1 alM;

    yt_1(yq_1 yq_12) {
        this.alM = yq_12;
    }

    public void avW() {
        this.alM.alH.clear();
        this.alM.alH.ensureCapacity(this.alL.size());
        this.alM.alH.addAll(this.alL);
    }

    private boolean cx(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alL.clear();
        this.alL.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yr_1 yr_12 = new yr_1();
            boolean bl = yr_12.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.alL.add(yr_12);
        }
        return true;
    }

    private boolean dt(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alL.clear();
        this.alL.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yr_1 yr_12 = new yr_1();
            boolean bl = yr_12.b(byteBuffer, 10048002);
            if (!bl) {
                return false;
            }
            this.alL.add(yr_12);
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

