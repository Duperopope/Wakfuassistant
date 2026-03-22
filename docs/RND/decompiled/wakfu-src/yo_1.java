/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yo
 */
public class yo_1
implements gs_0 {
    public static final int alF = 0;

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
        if (n < 10056001) {
            yp_1 yp_12 = new yp_1(this);
            boolean bl = yp_12.b(byteBuffer, n);
            if (bl) {
                yp_12.avW();
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
        this.eC(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eC(StringBuilder stringBuilder, String string) {
    }
}

