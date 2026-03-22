/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vr
 */
public class vr_1
implements gs_0 {
    public static final int afp = 0;

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
        if (n < 10048000) {
            vs_1 vs_12 = new vs_1(this);
            boolean bl = vs_12.b(byteBuffer, n);
            if (bl) {
                vs_12.avW();
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
        this.cI(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cI(StringBuilder stringBuilder, String string) {
    }
}

