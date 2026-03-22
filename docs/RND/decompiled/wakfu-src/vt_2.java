/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vt
 */
public class vt_2
implements gs_0 {
    public final vr_2 afr = new vr_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.afr.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.afr.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.afr.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.afr.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cJ(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cJ(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawXp=...\n");
        this.afr.cW(stringBuilder, string + "  ");
    }
}

