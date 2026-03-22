/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vP
 */
public class vp_1
implements gs_0 {
    public final vr_2 agj = new vr_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.agj.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.agj.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.agj.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10024001) {
            vq_2 vq_22 = new vq_2(this);
            boolean bl = vq_22.b(byteBuffer, n);
            if (bl) {
                vq_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.agj.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cV(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cV(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawXp=...\n");
        this.agj.cW(stringBuilder, string + "  ");
    }
}

