/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pP
 */
final class pp_2 {
    private final vy_1 TB = new vy_1();
    final /* synthetic */ po_1 TC;

    pp_2(po_1 po_12) {
        this.TC = po_12;
    }

    public void avW() {
        this.TC.TA.afz = this.TB.afz;
        this.TC.TA.Vk = this.TB.Vk;
        this.TC.TA.afA = this.TB.afA;
        this.TC.TA.afB = this.TB.afB;
        this.TC.TA.Xr = this.TB.Xr;
        this.TC.TA.Tv = this.TB.Tv;
        this.TC.TA.afC = this.TB.afC;
        this.TC.TA.afD = this.TB.afD;
        this.TC.TA.afE = this.TB.afE;
        this.TC.TA.afF = this.TB.afF;
        this.TC.TA.afG = this.TB.afG;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl = this.TB.b(byteBuffer, 1);
        return bl;
    }

    private boolean ds(ByteBuffer byteBuffer) {
        boolean bl = this.TB.b(byteBuffer, 0x992323);
        return bl;
    }

    private boolean dt(ByteBuffer byteBuffer) {
        boolean bl = this.TB.b(byteBuffer, 10048002);
        return bl;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 1) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        if (n < 0x992323) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10048002) {
            boolean bl = this.ds(byteBuffer);
            return bl;
        }
        if (n < 10056001) {
            boolean bl = this.dt(byteBuffer);
            return bl;
        }
        return false;
    }
}

