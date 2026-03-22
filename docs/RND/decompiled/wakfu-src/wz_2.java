/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wz
 */
public class wz_2
extends ox_1
implements gs_0 {
    public final ui_1 ahE = new ui_1();
    public static final byte ahF = 2;

    @Override
    public byte avV() {
        return 2;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.ahE.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.ahE.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.ahE.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            wa_1 wa_12 = new wa_1(this);
            boolean bl = wa_12.b(byteBuffer, n);
            if (bl) {
                wa_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.ahE.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    @Override
    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("content=...\n");
        this.ahE.bU(stringBuilder, string + "  ");
    }
}

