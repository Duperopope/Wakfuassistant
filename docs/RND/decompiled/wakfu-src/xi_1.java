/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xI
 */
final class xi_1 {
    private final ArrayList<xe_2> akn = new ArrayList(0);
    private final ArrayList<xg_1> ako = new ArrayList(0);

    xi_1(xd_2 xd_22) {
    }

    public void avW() {
    }

    private boolean cF(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.akn.clear();
        this.akn.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            xe_2 xe_22 = new xe_2();
            boolean bl = xe_22.b(byteBuffer, 0);
            if (!bl) {
                return false;
            }
            this.akn.add(xe_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.ako.clear();
        this.ako.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xg_1 xg_12 = new xg_1();
            boolean bl = xg_12.b(byteBuffer, 0);
            if (!bl) {
                return false;
            }
            this.ako.add(xg_12);
        }
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.akn.clear();
        this.akn.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            xe_2 xe_22 = new xe_2();
            boolean bl = xe_22.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.akn.add(xe_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.ako.clear();
        this.ako.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xg_1 xg_12 = new xg_1();
            boolean bl = xg_12.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.ako.add(xg_12);
        }
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

