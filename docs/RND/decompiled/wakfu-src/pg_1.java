/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pG
 */
public class pg_1
implements gs_0 {
    public byte Tg = 0;
    public int Th = 0;
    public int Ti = 0;
    public static final int Tj = 9;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.Tg);
        byteBuffer.putInt(this.Th);
        byteBuffer.putInt(this.Ti);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Tg = byteBuffer.get();
        this.Th = byteBuffer.getInt();
        this.Ti = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.Tg = 0;
        this.Th = 0;
        this.Ti = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10040007) {
            ph_2 ph_22 = new ph_2(this);
            boolean bl = ph_22.b(byteBuffer, n);
            if (bl) {
                ph_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 9;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.A(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void A(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("position=").append(this.Tg).append('\n');
        stringBuilder.append(string).append("referenceId=").append(this.Th).append('\n');
        stringBuilder.append(string).append("skinId=").append(this.Ti).append('\n');
    }
}

