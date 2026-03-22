/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wl
 */
public class wl_2
implements gs_0 {
    public int abq = 0;
    public static final int ahd = 4;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.abq);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.abq = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.abq = 0;
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
        this.dl(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dl(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("cash=").append(this.abq).append('\n');
    }
}

