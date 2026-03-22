/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sA
 */
public class sa_2
extends go_0
implements gs_0 {
    public long YR = 0L;
    public long YS = 0L;
    private final fi_1 YT = new sb_1(this);
    public static final int YU = 16;

    @Override
    public fi_1 DM() {
        return this.YT;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.YR);
        byteBuffer.putLong(this.YS);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.YR = byteBuffer.getLong();
        this.YS = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.YR = 0L;
        this.YS = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 16;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aQ(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aQ(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("controllerId=").append(this.YR).append('\n');
        stringBuilder.append(string).append("companionId=").append(this.YS).append('\n');
    }
}

