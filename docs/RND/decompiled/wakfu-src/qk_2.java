/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qk
 */
public class qk_2
extends go_0
implements gs_0 {
    public byte Us = 0;
    public long Ut = 0L;
    private final fi_1 Uu = new ql_1(this);
    public static final int Uv = 9;

    @Override
    public fi_1 DM() {
        return this.Uu;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.Us);
        byteBuffer.putLong(this.Ut);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Us = byteBuffer.get();
        this.Ut = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.Us = 0;
        this.Ut = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 9;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.O(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void O(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("type=").append(this.Us).append('\n');
        stringBuilder.append(string).append("ownerId=").append(this.Ut).append('\n');
    }
}

