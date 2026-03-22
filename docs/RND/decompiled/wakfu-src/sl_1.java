/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sl
 */
public class sl_1
implements gs_0 {
    public static final int Yj = 0;

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
        if (n < 10056000) {
            sm_2 sm_22 = new sm_2(this);
            boolean bl = sm_22.b(byteBuffer, n);
            if (bl) {
                sm_22.avW();
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
        this.aJ(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aJ(StringBuilder stringBuilder, String string) {
    }
}

