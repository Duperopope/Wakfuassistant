/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sn
 */
public class sn_1
extends go_0
implements gs_0 {
    public final yq_1 Yo = new yq_1();
    public boolean Yp = false;
    public boolean Yq = false;
    private final fi_1 Yr = new so_2(this);

    @Override
    public fi_1 DM() {
        return this.Yr;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.Yo.aF(byteBuffer);
        if (!bl) {
            return false;
        }
        byteBuffer.put(this.Yp ? (byte)1 : 0);
        byteBuffer.put(this.Yq ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.Yo.aG(byteBuffer);
        if (!bl) {
            return false;
        }
        this.Yp = byteBuffer.get() == 1;
        this.Yq = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void clear() {
        this.Yo.clear();
        this.Yp = false;
        this.Yq = false;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10056001) {
            sp_1 sp_12 = new sp_1(this);
            boolean bl = sp_12.b(byteBuffer, n);
            if (bl) {
                sp_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += this.Yo.DN();
        ++n;
        return ++n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aK(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aK(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("spellInventory=...\n");
        this.Yo.eD(stringBuilder, string + "  ");
        stringBuilder.append(string).append("needSpellRestat=").append(this.Yp).append('\n');
        stringBuilder.append(string).append("needSpellAutoRestat=").append(this.Yq).append('\n');
    }
}

