/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.GLAutoDrawable
 */
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

/*
 * Renamed from axQ
 */
public class axq_1
implements axu_1 {
    public static final int drx = 1320;
    public static final int dry = 950;
    public static final int drz = 1920;
    public static final int drA = 1080;
    private final axv_1 drB = new axv_1(0, 0, 0, 0);
    protected GLAutoDrawable drC;
    protected float drD;
    protected float drE;
    protected float azQ = 1.0f;
    private float drF = 1.0f;
    protected float drG = 1.0f;
    protected boolean bmg;
    private boolean bXs;

    public axq_1() {
        this.setVisible(false);
    }

    public final axv_1 bRp() {
        return this.drB;
    }

    public float bRq() {
        return this.drD;
    }

    public float bRr() {
        return this.drE;
    }

    @Override
    public void bb(int n, int n2) {
        this.drD = n;
        this.drE = n2;
        this.drB.w(0, 0, n, n2);
        float f2 = this.cn(n, this.bRs());
        float f3 = this.cn(n2, this.bRt());
        this.setScale(Math.min(f2, f3));
        float f4 = this.cn(n, 1320);
        float f5 = this.cn(n2, 950);
        this.drF = Math.min(f4, f5) / this.azQ;
    }

    private float cn(int n, int n2) {
        return (n < n2 ? (float)n / (float)n2 : 1.0f) * this.drG;
    }

    protected int bRs() {
        return 1320;
    }

    protected int bRt() {
        return 950;
    }

    public void setScale(float f2) {
        this.azQ = f2;
    }

    public float getScale() {
        return this.azQ;
    }

    public float bRu() {
        return this.drF;
    }

    public boolean isScaled() {
        return this.azQ != 1.0f && this.drG != 1.0f;
    }

    public float bRv() {
        return this.drG;
    }

    @Override
    public void init(GLAutoDrawable gLAutoDrawable) {
        this.drC = gLAutoDrawable;
        this.bb(gLAutoDrawable.getSurfaceWidth(), gLAutoDrawable.getSurfaceHeight());
    }

    @Override
    public void qy(int n) {
    }

    @Override
    public void b(GL2 gL2) {
    }

    public void bqO() {
        this.dw(false);
        this.bmg = true;
    }

    public boolean isInitialized() {
        return this.bXs;
    }

    public void dw(boolean bl) {
        this.bXs = bl;
    }

    public void setVisible(boolean bl) {
        this.bmg = bl;
    }

    public boolean isVisible() {
        return this.bmg;
    }

    public void aVI() {
        if (!this.isInitialized()) {
            this.dw(true);
            this.bmg = true;
        }
    }

    public void aVH() {
        if (this.isInitialized()) {
            this.bqO();
        }
    }
}

