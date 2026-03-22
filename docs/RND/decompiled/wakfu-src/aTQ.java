/*
 * Decompiled with CFR 0.152.
 */
public class aTQ
extends acf {
    float gvc;
    float gvd;
    boolean gve;
    boolean gvf;
    final float gvg;
    final float gvh;

    public aTQ(afW afW2, float f2, float f3) {
        super(afW2);
        this.gvc = f2;
        this.gvd = f3;
        this.gvg = afW2.bcC();
        this.gvh = afW2.bcD();
    }

    @Override
    public void qF(int n) {
        super.qF(n);
        afW afW2 = this.btr();
        afW2.aB(afW2.getWorldX() + this.gvc, afW2.getWorldY() + this.gvd);
        int n2 = 12;
        if ((float)afW2.bcC() > this.gvg + 12.0f) {
            this.gvc = -this.gvc;
        }
        if ((float)afW2.bcC() < this.gvg - 12.0f) {
            this.gvc = -this.gvc;
        }
        if ((float)afW2.bcD() > this.gvh + 12.0f) {
            this.gvd = -this.gvd;
        }
        if ((float)afW2.bcD() < this.gvh - 12.0f) {
            this.gvd = -this.gvd;
        }
    }
}

