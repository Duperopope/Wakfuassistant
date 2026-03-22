/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yk
 */
public class yk_2
implements gs_0 {
    public short adx = 0;
    public final yi_2 alA = new yi_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.adx);
        boolean bl = this.alA.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.alA.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.adx = 0;
        this.alA.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        return n += this.alA.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.eA(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eA(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("position=").append(this.adx).append('\n');
        stringBuilder.append(string).append("shortcut=...\n");
        this.alA.ey(stringBuilder, string + "  ");
    }
}

