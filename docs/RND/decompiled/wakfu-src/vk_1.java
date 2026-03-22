/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vk
 */
public class vk_1
implements gs_0 {
    public final wg_2 afd = new wg_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.afd.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.afd.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.afd.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10048000) {
            vl_2 vl_22 = new vl_2(this);
            boolean bl = vl_22.b(byteBuffer, n);
            if (bl) {
                vl_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.afd.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cF(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cF(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawPet=...\n");
        this.afd.dv(stringBuilder, string + "  ");
    }
}

