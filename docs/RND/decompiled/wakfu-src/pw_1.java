/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pW
 */
public class pw_1
extends go_0
implements gs_0 {
    public long TS = 0L;
    private final fi_1 TT = new px_1(this);
    public static final int TU = 8;

    @Override
    public fi_1 DM() {
        return this.TT;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.TS);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.TS = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.TS = 0L;
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
        this.H(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void H(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("guildBlazon=").append(this.TS).append('\n');
    }
}

