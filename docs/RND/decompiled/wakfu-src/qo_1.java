/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qo
 */
public class qo_1
extends go_0
implements gs_0 {
    public long UB = 0L;
    private final fi_1 UC = new qp_2(this);
    public static final int UD = 8;

    @Override
    public fi_1 DM() {
        return this.UC;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.UB);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.UB = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.UB = 0L;
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
        this.Q(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void Q(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("instanceId=").append(this.UB).append('\n');
    }
}

