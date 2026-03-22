/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wQ
 */
public class wq_2
implements gs_0 {
    public int aiD = 0;
    public static final int aiF = 4;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.aiD);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aiD = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.aiD = 0;
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
        this.dD(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dD(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("familyId=").append(this.aiD).append('\n');
    }
}

