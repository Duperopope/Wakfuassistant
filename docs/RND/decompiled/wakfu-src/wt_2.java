/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wt
 */
public class wt_2
implements gs_0 {
    public byte aht = 0;
    public short ahu = 0;
    public static final int ahv = 3;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.aht);
        byteBuffer.putShort(this.ahu);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aht = byteBuffer.get();
        this.ahu = byteBuffer.getShort();
        return true;
    }

    @Override
    public void clear() {
        this.aht = 0;
        this.ahu = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dt(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dt(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("groupId=").append(this.aht).append('\n');
        stringBuilder.append(string).append("permissions=").append(this.ahu).append('\n');
    }
}

