/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vL
 */
final class vl_1 {
    private final wg_2 agd = new wg_2();
    final /* synthetic */ vk_2 age;

    vl_1(vk_2 vk_22) {
        this.age = vk_22;
    }

    public void avW() {
        this.age.agc.WB = this.agd.WB;
        this.age.agc.Vk = this.agd.Vk;
        this.age.agc.ahS = this.agd.ahS;
        this.age.agc.WD = this.agd.WD;
        this.age.agc.WF = this.agd.WF;
        this.age.agc.ahT = this.agd.ahT;
        this.age.agc.ahU = this.agd.ahU;
        this.age.agc.ahV = this.agd.ahV;
        this.age.agc.WE = this.agd.WE;
        this.age.agc.ahW = this.agd.ahW;
    }

    private boolean cG(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cI(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean ea(ByteBuffer byteBuffer) {
        boolean bl = this.agd.b(byteBuffer, 10024001);
        return bl;
    }

    private boolean cP(ByteBuffer byteBuffer) {
        boolean bl = this.agd.b(byteBuffer, 10035004);
        return bl;
    }

    private boolean cQ(ByteBuffer byteBuffer) {
        boolean bl = this.agd.b(byteBuffer, 10035007);
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
        if (n < 10024001) {
            boolean bl = this.cI(byteBuffer);
            return bl;
        }
        if (n < 10035004) {
            boolean bl = this.ea(byteBuffer);
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

