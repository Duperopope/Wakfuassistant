/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wL
 */
public class wl_1
implements gs_0 {
    public int ait = 0;
    public long aiu = 0L;
    public static final int aiv = 12;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.ait);
        byteBuffer.putLong(this.aiu);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.ait = byteBuffer.getInt();
        this.aiu = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.ait = 0;
        this.aiu = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 12;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dz(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dz(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("monsterCrewId=").append(this.ait).append('\n');
        stringBuilder.append(string).append("monterId=").append(this.aiu).append('\n');
    }
}

