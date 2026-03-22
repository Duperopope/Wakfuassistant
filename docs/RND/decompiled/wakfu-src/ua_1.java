/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ua
 */
public class ua_1
implements gs_0 {
    public static final int acg = 0;

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
            ub_1 ub_12 = new ub_1(this);
            boolean bl = ub_12.b(byteBuffer, n);
            if (bl) {
                ub_12.avW();
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
        this.bO(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bO(StringBuilder stringBuilder, String string) {
    }
}

