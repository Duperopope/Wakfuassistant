/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vB
 */
public class vb_2
implements gs_0 {
    public final us_1 afK = new us_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.afK.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.afK.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.afK.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0x992323) {
            vc_2 vc_22 = new vc_2(this);
            boolean bl = vc_22.b(byteBuffer, n);
            if (bl) {
                vc_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.afK.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cO(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cO(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("imagedata=...\n");
        this.afK.cv(stringBuilder, string + "  ");
    }
}

