/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wr
 */
public class wr_2
implements gs_0 {
    public byte aho = 0;
    public int ahp = 0;
    public static final int ahq = 5;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.aho);
        byteBuffer.putInt(this.ahp);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aho = byteBuffer.get();
        this.ahp = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.aho = 0;
        this.ahp = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 5;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dr(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dr(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("opinionId=").append(this.aho).append('\n');
        stringBuilder.append(string).append("nbBallots=").append(this.ahp).append('\n');
    }
}

