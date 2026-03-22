/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xc
 */
public class xc_2
implements gs_0 {
    public int ajj = 0;
    public static final int ajk = 4;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.ajj);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.ajj = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.ajj = 0;
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
        this.dM(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dM(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("fightStake=").append(this.ajj).append('\n');
    }
}

