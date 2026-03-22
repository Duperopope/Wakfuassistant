/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uL
 */
public class ul_1
implements gs_0 {
    public final ui_2 adX = new ui_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.adX.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.adX.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.adX.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.adX.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.co(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void co(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("building=...\n");
        this.adX.cl(stringBuilder, string + "  ");
    }
}

