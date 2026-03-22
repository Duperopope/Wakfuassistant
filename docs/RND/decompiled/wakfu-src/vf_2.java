/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vf
 */
public class vf_2
implements gs_0 {
    public static final int aeW = 0;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        return true;
    }

    @Override
    public void clear() {
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            vg_1 vg_12 = new vg_1(this);
            boolean bl = vg_12.b(byteBuffer, n);
            if (bl) {
                vg_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cC(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cC(StringBuilder stringBuilder, String string) {
    }
}

