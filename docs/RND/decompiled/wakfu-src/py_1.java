/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pY
 */
public class py_1
extends go_0
implements gs_0 {
    public long TL = 0L;
    private final fi_1 TW = new pz_2(this);
    public static final int TX = 8;

    @Override
    public fi_1 DM() {
        return this.TW;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.TL);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.TL = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.TL = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.I(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void I(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("guildId=").append(this.TL).append('\n');
    }
}

