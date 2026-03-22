/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pl
 */
public class pl_2
implements gs_0 {
    public boolean Sw = false;
    public boolean Sx = false;
    public short Sy = 0;
    public boolean Sz = false;
    public static final int SA = 5;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.Sw ? (byte)1 : 0);
        byteBuffer.put(this.Sx ? (byte)1 : 0);
        byteBuffer.putShort(this.Sy);
        byteBuffer.put(this.Sz ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Sw = byteBuffer.get() == 1;
        this.Sx = byteBuffer.get() == 1;
        this.Sy = byteBuffer.getShort();
        this.Sz = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void clear() {
        this.Sw = false;
        this.Sx = false;
        this.Sy = 0;
        this.Sz = false;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10047003) {
            pm_2 pm_22 = new pm_2(this);
            boolean bl = pm_22.b(byteBuffer, n);
            if (bl) {
                pm_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 5;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.r(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void r(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("newCharacter=").append(this.Sw).append('\n');
        stringBuilder.append(string).append("needsRecustom=").append(this.Sx).append('\n');
        stringBuilder.append(string).append("recustomValue=").append(this.Sy).append('\n');
        stringBuilder.append(string).append("needInitialXp=").append(this.Sz).append('\n');
    }
}

