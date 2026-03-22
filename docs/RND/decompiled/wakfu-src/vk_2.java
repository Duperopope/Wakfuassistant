/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vK
 */
public class vk_2
implements gs_0 {
    public final wg_2 agc = new wg_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.agc.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.agc.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.agc.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10048000) {
            vl_1 vl_12 = new vl_1(this);
            boolean bl = vl_12.b(byteBuffer, n);
            if (bl) {
                vl_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.agc.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cT(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cT(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawPet=...\n");
        this.agc.dv(stringBuilder, string + "  ");
    }
}

