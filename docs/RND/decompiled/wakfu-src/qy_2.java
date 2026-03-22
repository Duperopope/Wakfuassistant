/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qy
 */
public class qy_2
extends go_0
implements gs_0 {
    public final vu_2 UT = new vu_2();
    private final fi_1 UU = new qz_1(this);

    @Override
    public fi_1 DM() {
        return this.UU;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.UT.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.UT.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.UT.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10028001) {
            qa_2 qa_22 = new qa_2(this);
            boolean bl = qa_22.b(byteBuffer, n);
            if (bl) {
                qa_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.UT.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.V(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void V(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("locks=...\n");
        this.UT.cZ(stringBuilder, string + "  ");
    }
}

