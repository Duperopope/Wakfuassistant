/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tf
 */
public class tf_2
implements gs_0 {
    public int ZX = 0;
    public static final int ZY = 4;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.ZX);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.ZX = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.ZX = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bj(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bj(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("bookRefId=").append(this.ZX).append('\n');
    }
}

