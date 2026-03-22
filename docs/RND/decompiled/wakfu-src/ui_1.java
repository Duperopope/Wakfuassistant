/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ui
 */
public class ui_1
implements gs_0 {
    public int acC = 0;
    public final uy_1 acD = new uy_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.acC);
        boolean bl = this.acD.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        boolean bl = this.acD.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.acC = 0;
        this.acD.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            uj_2 uj_22 = new uj_2(this);
            boolean bl = uj_22.b(byteBuffer, n);
            if (bl) {
                uj_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 4;
        return n += this.acD.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bU(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bU(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("setPackId=").append(this.acC).append('\n');
        stringBuilder.append(string).append("item=...\n");
        this.acD.cy(stringBuilder, string + "  ");
    }
}

