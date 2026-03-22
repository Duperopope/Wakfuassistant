/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xG
 */
public class xg_1
implements gs_0 {
    public static final int akm = 0;

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
            xh_2 xh_22 = new xh_2(this);
            boolean bl = xh_22.b(byteBuffer, n);
            if (bl) {
                xh_22.avW();
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
        this.eh(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eh(StringBuilder stringBuilder, String string) {
    }
}

