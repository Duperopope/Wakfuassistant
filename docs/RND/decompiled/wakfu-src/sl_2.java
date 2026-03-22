/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sL
 */
public class sl_2
implements gs_0 {
    public short RO = 0;
    public short Xr = 0;
    public static final int Zm = 4;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.RO);
        byteBuffer.putShort(this.Xr);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.RO = byteBuffer.getShort();
        this.Xr = byteBuffer.getShort();
        return true;
    }

    @Override
    public void clear() {
        this.RO = 0;
        this.Xr = 0;
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
        this.aW(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aW(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("breedId=").append(this.RO).append('\n');
        stringBuilder.append(string).append("level=").append(this.Xr).append('\n');
    }
}

