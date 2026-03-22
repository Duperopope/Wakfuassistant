/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;

/*
 * Renamed from fEr
 */
public class fer_1
implements xa_0 {
    private int atn;
    public final int ukg = -1;
    private int bMn = -1;
    private int bRl = 0;
    private int o;
    private float bRL = 1.0f;
    final /* synthetic */ feq_1 ukh;

    fer_1(feq_1 feq_12) {
        this.ukh = feq_12;
    }

    @Override
    public anz_1 bnp() {
        return this.ukh.ujX;
    }

    @Override
    public void a(anz_1 anz_12) {
    }

    @Override
    public int getXOffset() {
        return this.ukh.getXOffset();
    }

    @Override
    public void setXOffset(int n) {
        this.ukh.bRf = n;
    }

    @Override
    public int getYOffset() {
        return this.ukh.getYOffset();
    }

    @Override
    public void setYOffset(int n) {
        this.ukh.bRg = n;
    }

    @Override
    public float getWorldX() {
        return this.ukh.getWorldX();
    }

    @Override
    public float getWorldY() {
        return this.ukh.getWorldY();
    }

    @Override
    public float getAltitude() {
        if (this.ukh.ujX != null) {
            return this.ukh.ujX.getAltitude();
        }
        return 0.0f;
    }

    @Override
    public void b(float f2, float f3, float f4, float f5) {
        this.ukh.a(null, this.ukh.ujX.getScreenX(), this.ukh.ujX.getScreenY(), 0);
    }

    @Override
    public int getDuration() {
        return this.bMn;
    }

    @Override
    public boolean bnq() {
        if (this.bMn == -1) {
            return true;
        }
        return this.bRl <= this.bMn;
    }

    @Override
    public void a(aaj_0 aaj_02, int n) {
        this.bRL = aaj_02.bqL().getZoomFactor();
        this.qy(n);
        this.ukh.f(n, this.bRL);
    }

    @Override
    public void qy(int n) {
        this.bRl += n;
    }

    @Override
    public int d() {
        return this.o;
    }

    @Override
    public void lK(int n) {
        this.o = n;
    }

    @Override
    public int aHp() {
        return this.atn;
    }

    @Override
    public void ma(int n) {
        this.atn = n;
    }

    @Override
    public Entity getEntity() {
        return null;
    }

    @Override
    public void bmX() {
        this.ukh.gss();
    }

    @Override
    public boolean bnr() {
        return false;
    }

    public void aaK(int n) {
        this.bRl = n;
    }

    public int bnA() {
        return this.bRl;
    }

    public void setDuration(int n) {
        this.bMn = n;
    }

    public float getZoomFactor() {
        return this.bRL;
    }
}

