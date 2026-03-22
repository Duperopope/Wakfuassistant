/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vn
 */
public class vn_1
implements gs_0 {
    public static final int afk = 0;

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
        if (n < 10066001) {
            vo_1 vo_12 = new vo_1(this);
            boolean bl = vo_12.b(byteBuffer, n);
            if (bl) {
                vo_12.avW();
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
        this.cG(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cG(StringBuilder stringBuilder, String string) {
    }
}

