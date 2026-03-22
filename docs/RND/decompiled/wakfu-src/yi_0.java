/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from YI
 */
public class yi_0
extends yo_0<zz_1, Float> {
    float[] bUh;
    private int bUi;
    private int bUj;

    public yi_0(zz_1 zz_12) {
        super(zz_12);
    }

    protected Float bou() {
        return Float.valueOf(this.bTC[this.bUj + 1].floatValue());
    }

    @Override
    public void qF(int n) {
        super.qF(n);
        this.bUi += n;
        int n2 = this.box();
        if (this.bUi > n2) {
            this.bUi -= n2;
            int n3 = this.bUh.length;
            float f2 = GC.b(0.0f, this.bUh[n3 - 1]);
            for (int i = 0; i < n3; ++i) {
                if (!(f2 < this.bUh[i])) continue;
                this.bUj = i;
                break;
            }
        }
    }

    private int box() {
        if (this.bTC[this.bUj + 1] instanceof YW) {
            return (int)((YW)this.bTC[this.bUj + 1]).boC();
        }
        return this.bTC[0].intValue();
    }

    @Override
    public float floatValue() {
        return ((Float)this.boq()).floatValue();
    }

    @Override
    public int intValue() {
        return ((Float)this.boq()).intValue();
    }

    @Override
    public String bor() {
        return null;
    }

    @Override
    public int bom() {
        return this.bUh.length + 1;
    }

    @Override
    protected /* synthetic */ Object getValue() {
        return this.bou();
    }
}

