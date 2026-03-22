/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tC
 */
@Deprecated
public class tc_2
implements gs_0 {
    public static final int aaW = 0;

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
        if (n < 10086002) {
            td_2 td_22 = new td_2(this);
            boolean bl = td_22.b(byteBuffer, n);
            if (bl) {
                td_22.avW();
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
        this.by(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void by(StringBuilder stringBuilder, String string) {
    }
}

