/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vl
 */
final class vl_2 {
    private final wg_2 afe = new wg_2();
    final /* synthetic */ vk_1 aff;

    vl_2(vk_1 vk_12) {
        this.aff = vk_12;
    }

    public void avW() {
        this.aff.afd.WB = this.afe.WB;
        this.aff.afd.Vk = this.afe.Vk;
        this.aff.afd.ahS = this.afe.ahS;
        this.aff.afd.WD = this.afe.WD;
        this.aff.afd.WF = this.afe.WF;
        this.aff.afd.ahT = this.afe.ahT;
        this.aff.afd.ahU = this.afe.ahU;
        this.aff.afd.ahV = this.afe.ahV;
        this.aff.afd.WE = this.afe.WE;
        this.aff.afd.ahW = this.afe.ahW;
    }

    private boolean cG(ByteBuffer byteBuffer) {
        boolean bl = this.afe.b(byteBuffer, 313);
        return bl;
    }

    private boolean cI(ByteBuffer byteBuffer) {
        boolean bl = this.afe.b(byteBuffer, 315);
        return bl;
    }

    private boolean cP(ByteBuffer byteBuffer) {
        boolean bl = this.afe.b(byteBuffer, 10035004);
        return bl;
    }

    private boolean cQ(ByteBuffer byteBuffer) {
        boolean bl = this.afe.b(byteBuffer, 10035007);
        return bl;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 313) {
            return false;
        }
        if (n < 315) {
            boolean bl = this.cG(byteBuffer);
            return bl;
        }
        if (n < 10035004) {
            boolean bl = this.cI(byteBuffer);
            return bl;
        }
        if (n < 10035007) {
            boolean bl = this.cP(byteBuffer);
            return bl;
        }
        if (n < 10048000) {
            boolean bl = this.cQ(byteBuffer);
            return bl;
        }
        return false;
    }
}

