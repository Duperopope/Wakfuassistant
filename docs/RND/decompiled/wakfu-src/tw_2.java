/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tw
 */
final class tw_2 {
    private int aaF = 0;
    private boolean aaG = true;
    private int aaH = 0;
    private int aaL = 0;
    private int aaI = 0;
    private short aaJ = 0;
    private int[] aaK = null;
    final /* synthetic */ tv_1 aaM;

    tw_2(tv_1 tv_12) {
        this.aaM = tv_12;
    }

    public void avW() {
        this.aaM.aaF = this.aaF;
        this.aaM.aaG = this.aaG;
        this.aaM.aaH = this.aaH;
        this.aaM.aaI = this.aaI;
        this.aaM.aaJ = this.aaJ;
        this.aaM.aaK = this.aaK;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        this.aaF = byteBuffer.getInt();
        return true;
    }

    private boolean db(ByteBuffer byteBuffer) {
        this.aaF = byteBuffer.getInt();
        this.aaG = byteBuffer.get() == 1;
        return true;
    }

    private boolean dc(ByteBuffer byteBuffer) {
        this.aaF = byteBuffer.getInt();
        this.aaG = byteBuffer.get() == 1;
        this.aaH = byteBuffer.getInt();
        this.aaL = byteBuffer.getInt();
        this.aaI = byteBuffer.getInt();
        return true;
    }

    private boolean dd(ByteBuffer byteBuffer) {
        this.aaF = byteBuffer.getInt();
        this.aaG = byteBuffer.get() == 1;
        this.aaH = byteBuffer.getInt();
        this.aaL = byteBuffer.getInt();
        this.aaI = byteBuffer.getInt();
        this.aaJ = byteBuffer.getShort();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 10075002) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        if (n < 10076001) {
            boolean bl = this.db(byteBuffer);
            return bl;
        }
        if (n < 10079000) {
            boolean bl = this.dc(byteBuffer);
            return bl;
        }
        if (n < 10084000) {
            boolean bl = this.dd(byteBuffer);
            return bl;
        }
        return false;
    }
}

