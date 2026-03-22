/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xD
 */
public class xd_2
implements gs_0 {
    public static final int aki = 0;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        return true;
    }

    @Override
    public void clear() {
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10014) {
            xi_1 xi_12 = new xi_1(this);
            boolean bl = xi_12.b(byteBuffer, n);
            if (bl) {
                xi_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ef(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ef(StringBuilder stringBuilder, String string) {
    }
}

