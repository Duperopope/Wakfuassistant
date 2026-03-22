/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xr
 */
public class xr_1
implements gs_0 {
    public int Th = 0;
    public int ajM = -1;
    public static final int ajN = 8;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.Th);
        byteBuffer.putInt(this.ajM);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Th = byteBuffer.getInt();
        this.ajM = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.Th = 0;
        this.ajM = -1;
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
        this.dX(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dX(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("referenceId=").append(this.Th).append('\n');
        stringBuilder.append(string).append("remainingDuration=").append(this.ajM).append('\n');
    }
}

