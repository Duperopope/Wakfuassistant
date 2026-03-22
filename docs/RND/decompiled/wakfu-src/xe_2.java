/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xE
 */
public class xe_2
implements gs_0 {
    public static final int akj = 0;

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
            xf_2 xf_22 = new xf_2(this);
            boolean bl = xf_22.b(byteBuffer, n);
            if (bl) {
                xf_22.avW();
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
        this.eg(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eg(StringBuilder stringBuilder, String string) {
    }
}

