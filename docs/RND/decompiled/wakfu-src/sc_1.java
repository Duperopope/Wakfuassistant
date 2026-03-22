/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sC
 */
public class sc_1
extends go_0
implements gs_0 {
    public boolean YW = false;
    private final fi_1 YX = new sd_2(this);
    public static final int YY = 1;

    @Override
    public fi_1 DM() {
        return this.YX;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.YW ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.YW = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void clear() {
        this.YW = false;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 1;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aR(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aR(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("show=").append(this.YW).append('\n');
    }
}

