/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yi
 */
public class yi_2
implements gs_0 {
    public byte Us = 0;
    public long alv = 0L;
    public int alw = 0;
    public int alx = 0;
    public static final int aly = 17;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.Us);
        byteBuffer.putLong(this.alv);
        byteBuffer.putInt(this.alw);
        byteBuffer.putInt(this.alx);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Us = byteBuffer.get();
        this.alv = byteBuffer.getLong();
        this.alw = byteBuffer.getInt();
        this.alx = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.Us = 0;
        this.alv = 0L;
        this.alw = 0;
        this.alx = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 17;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ey(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ey(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("type=").append(this.Us).append('\n');
        stringBuilder.append(string).append("targetUniqueId=").append(this.alv).append('\n');
        stringBuilder.append(string).append("targetReferenceId=").append(this.alw).append('\n');
        stringBuilder.append(string).append("targetGfxId=").append(this.alx).append('\n');
    }
}

