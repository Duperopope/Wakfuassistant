/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class afU
implements WQ,
afW {
    private float bVz;
    private float bVA;
    private float bVB;
    private int bVF = Integer.MIN_VALUE;
    private int bVG = Integer.MIN_VALUE;
    private int bVH;
    private ArrayList<WR> bVI;

    public afU() {
    }

    public afU(float f2, float f3, float f4) {
        this.bVz = f2;
        this.bVA = f3;
        this.bVB = f4;
    }

    public afU(afW afW2) {
        this(afW2.getWorldX(), afW2.getWorldY(), afW2.getAltitude());
    }

    @Override
    public float bpZ() {
        return 0.0f;
    }

    @Override
    public short bcE() {
        return (short)GC.B(this.bVB);
    }

    @Override
    public float getAltitude() {
        return this.bVB;
    }

    @Override
    public int bcC() {
        return GC.A(this.bVz);
    }

    @Override
    public int bcD() {
        return GC.A(this.bVA);
    }

    @Override
    public float getWorldX() {
        return this.bVz;
    }

    @Override
    public float getWorldY() {
        return this.bVA;
    }

    @Override
    public void aB(float f2, float f3) {
        this.bVz = f2;
        this.bVA = f3;
    }

    @Override
    public void e(float f2, float f3, float f4) {
        this.bVz = f2;
        this.bVA = f3;
        this.bVB = f4;
    }

    @Override
    public int getScreenX() {
        return this.bVF;
    }

    @Override
    public int getScreenY() {
        return this.bVG;
    }

    @Override
    public void qu(int n) {
        if (this.bVF == n) {
            return;
        }
        this.bVF = n;
        this.bqm();
    }

    @Override
    public void qv(int n) {
        if (this.bVG == n) {
            return;
        }
        this.bVG = n;
        this.bqm();
    }

    @Override
    public void qw(int n) {
        if (this.bVH == n) {
            return;
        }
        this.bVH = n;
        this.bqm();
    }

    @Override
    public int bng() {
        return this.bVH;
    }

    @Override
    public boolean bnh() {
        return this.bVF != Integer.MIN_VALUE && this.bVG != Integer.MIN_VALUE;
    }

    @Override
    public void a(WR wR) {
        if (this.bVI == null) {
            this.bVI = new ArrayList(1);
        }
        this.bVI.add(wR);
    }

    @Override
    public void b(WR wR) {
        if (this.bVI == null) {
            return;
        }
        this.bVI.remove(wR);
        if (this.bVI.isEmpty()) {
            this.bVI = null;
            this.bVF = Integer.MIN_VALUE;
            this.bVG = Integer.MIN_VALUE;
        }
    }

    protected void bqm() {
        if (this.bVI != null) {
            for (int i = 0; i < this.bVI.size(); ++i) {
                this.bVI.get(i).a(this, this.bVF, this.bVG, this.bVH);
            }
        }
    }

    @Override
    public boolean isVisible() {
        return true;
    }
}

