/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wT
 */
public class wt_1
implements gs_0 {
    public final xl_1 aiI = new xl_1();
    public final xl_1 aiJ = new xl_1();
    public final xl_1 aiK = new xl_1();
    public final xl_1 aiL = new xl_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.aiI.aF(byteBuffer);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.aiJ.aF(byteBuffer);
        if (!bl2) {
            return false;
        }
        boolean bl3 = this.aiK.aF(byteBuffer);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.aiL.aF(byteBuffer);
        return bl4;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.aiI.aG(byteBuffer);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.aiJ.aG(byteBuffer);
        if (!bl2) {
            return false;
        }
        boolean bl3 = this.aiK.aG(byteBuffer);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.aiL.aG(byteBuffer);
        return bl4;
    }

    @Override
    public void clear() {
        this.aiI.clear();
        this.aiJ.clear();
        this.aiK.clear();
        this.aiL.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            wu_2 wu_22 = new wu_2(this);
            boolean bl = wu_22.b(byteBuffer, n);
            if (bl) {
                wu_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += this.aiI.DN();
        n += this.aiJ.DN();
        n += this.aiK.DN();
        return n += this.aiL.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dG(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dG(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("challengeMerchantInventory=...\n");
        this.aiI.dT(stringBuilder, string + "  ");
        stringBuilder.append(string).append("climateMerchantInventory=...\n");
        this.aiJ.dT(stringBuilder, string + "  ");
        stringBuilder.append(string).append("buffsMerchantInventory=...\n");
        this.aiK.dT(stringBuilder, string + "  ");
        stringBuilder.append(string).append("itemsMerchantInventory=...\n");
        this.aiL.dT(stringBuilder, string + "  ");
    }
}

