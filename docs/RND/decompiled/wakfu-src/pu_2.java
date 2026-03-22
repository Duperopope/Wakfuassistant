/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pU
 */
public class pu_2
extends go_0
implements gs_0 {
    public long TL = 0L;
    public long TM = 0L;
    public long TN = 0L;
    public byte TO = 0;
    private final fi_1 TP = new pv_2(this);
    public static final int TQ = 25;

    @Override
    public fi_1 DM() {
        return this.TP;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.TL);
        byteBuffer.putLong(this.TM);
        byteBuffer.putLong(this.TN);
        byteBuffer.put(this.TO);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.TL = byteBuffer.getLong();
        this.TM = byteBuffer.getLong();
        this.TN = byteBuffer.getLong();
        this.TO = byteBuffer.get();
        return true;
    }

    @Override
    public void clear() {
        this.TL = 0L;
        this.TM = 0L;
        this.TN = 0L;
        this.TO = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 25;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.G(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void G(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("guildId=").append(this.TL).append('\n');
        stringBuilder.append(string).append("fightXp=").append(this.TM).append('\n');
        stringBuilder.append(string).append("jobXP=").append(this.TN).append('\n');
        stringBuilder.append(string).append("rank=").append(this.TO).append('\n');
    }
}

