/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uz
 */
public class uz_1
implements gs_0 {
    public long adv = 0L;
    public static final int adw = 8;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.adv);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.adv = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.adv = 0L;
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
        this.cg(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cg(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("buildingUid=").append(this.adv).append('\n');
    }
}

