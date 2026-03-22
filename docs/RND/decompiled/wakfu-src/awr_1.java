/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 */
import com.jogamp.opengl.GL;
import java.nio.ByteBuffer;

/*
 * Renamed from awR
 */
public abstract class awr_1 {
    protected final int dnp = -1;
    private awk_1 bXx;
    private axj_2 dnq;
    private long dnr = -1L;
    private float aAt = 0.0f;
    private float aAr = 1.0f;
    private float aAs = 0.0f;
    private float aAu = 1.0f;

    protected void aPg() {
        this.bXx = new ati_2(arv_2.bIx(), 32, 32, false);
        this.dnq = this.bXx.ve(0);
        this.dnq.aC(this.bPK());
        this.bPM();
        this.dnr = -1L;
    }

    public abstract byte bPK();

    public void n(GL gL) {
        long l = this.bPL();
        if (l == this.dnr || l == -1L) {
            return;
        }
        ByteBuffer byteBuffer = this.bPJ();
        if (byteBuffer == null) {
            return;
        }
        this.dnq.a(byteBuffer, this.bwN(), this.bwO());
        this.bXx.c(gL);
        this.bPM();
        this.dnr = l;
    }

    protected abstract int bwN();

    protected abstract int bwO();

    protected abstract long bPL();

    protected abstract ByteBuffer bPJ();

    private void bPM() {
        acc_1 acc_12 = this.bXx.vf(0);
        float f2 = this.bwN();
        float f3 = this.bwO();
        this.aAt = 0.0f;
        this.aAr = f3 / (float)acc_12.bWy();
        this.aAs = 0.0f;
        this.aAu = f2 / (float)acc_12.bWx();
    }

    public boolean bPN() {
        return this.bXx != null;
    }

    public awk_1 bHg() {
        return this.bXx;
    }

    public float aKr() {
        return this.aAt;
    }

    public float aKp() {
        return this.aAr;
    }

    public float aKq() {
        return this.aAs;
    }

    public float aKs() {
        return this.aAu;
    }

    public int bPO() {
        return this.bwN();
    }

    public int bPP() {
        return this.bwO();
    }
}

