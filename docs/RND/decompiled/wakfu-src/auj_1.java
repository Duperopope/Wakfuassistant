/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from auJ
 */
public class auj_1 {
    private float ayP;
    private float deY;
    private float deZ;
    public float aPY;
    public float aPZ;
    public float aQa;
    private final float[] dfa = new float[9];

    public void y(float f2, float f3, float f4) {
        this.ayP = f2;
        this.deY = f3;
        this.deZ = f4;
        float f5 = (float)Math.sin(this.ayP);
        float f6 = (float)Math.sin(this.deY);
        float f7 = (float)Math.sin(this.deZ);
        float f8 = (float)Math.cos(this.ayP);
        float f9 = (float)Math.cos(this.deY);
        float f10 = (float)Math.cos(this.deZ);
        this.dfa[0] = f8 * f9;
        this.dfa[1] = f8 * f6 * f7 - f5 * f10;
        this.dfa[2] = f8 * f6 * f10 + f5 * f7;
        this.dfa[3] = f5 * f9;
        this.dfa[4] = f5 * f6 * f7 + f8 * f10;
        this.dfa[5] = f5 * f6 * f10 - f8 * f7;
        this.dfa[6] = -f6;
        this.dfa[7] = f9 * f7;
        this.dfa[8] = f9 * f10;
    }

    public void b(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f2 - f5;
        float f9 = f3 - f6;
        float f10 = f4 - f7;
        this.aPY = this.dfa[0] * f8 + this.dfa[1] * f9 + this.dfa[2] * f10;
        this.aPZ = this.dfa[3] * f8 + this.dfa[4] * f9 + this.dfa[5] * f10;
        this.aQa = this.dfa[6] * f8 + this.dfa[7] * f9 + this.dfa[8] * f10;
        this.aPY += f5;
        this.aPZ += f6;
        this.aQa += f7;
    }
}

