/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wX
 */
public class wx_1
implements gs_0 {
    public final xp_1 aiW = new xp_1();
    public final xp_1 aiX = new xp_1();
    public final xp_1 aiY = new xp_1();
    public final xp_1 aiZ = new xp_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.aiW.aF(byteBuffer);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.aiX.aF(byteBuffer);
        if (!bl2) {
            return false;
        }
        boolean bl3 = this.aiY.aF(byteBuffer);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.aiZ.aF(byteBuffer);
        return bl4;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.aiW.aG(byteBuffer);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.aiX.aG(byteBuffer);
        if (!bl2) {
            return false;
        }
        boolean bl3 = this.aiY.aG(byteBuffer);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.aiZ.aG(byteBuffer);
        return bl4;
    }

    @Override
    public void clear() {
        this.aiW.clear();
        this.aiX.clear();
        this.aiY.clear();
        this.aiZ.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            wy_2 wy_22 = new wy_2(this);
            boolean bl = wy_22.b(byteBuffer, n);
            if (bl) {
                wy_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += this.aiW.DN();
        n += this.aiX.DN();
        n += this.aiY.DN();
        return n += this.aiZ.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dI(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dI(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("challengeReferenceInventory=...\n");
        this.aiW.dV(stringBuilder, string + "  ");
        stringBuilder.append(string).append("climateReferenceInventory=...\n");
        this.aiX.dV(stringBuilder, string + "  ");
        stringBuilder.append(string).append("buffsReferenceInventory=...\n");
        this.aiY.dV(stringBuilder, string + "  ");
        stringBuilder.append(string).append("itemsReferenceInventory=...\n");
        this.aiZ.dV(stringBuilder, string + "  ");
    }
}

