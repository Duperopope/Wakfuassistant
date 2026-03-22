/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fFm
 */
public class ffm_2
implements Comparable<ffm_2> {
    final short upo;
    final short upp;
    float upq;
    float dzg;
    float upr;
    float ups;
    float upt;
    float upu;
    float upv;
    float upw;
    private ffm_2 upx;
    private ffm_2 upy;
    private ffm_2 upz;
    private ffm_2 upA;

    public ffm_2(short s, short s2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.upo = s;
        this.upp = s2;
        this.upq = f2;
        this.dzg = f3;
        this.upr = f4;
        this.ups = f5;
        this.upt = f6;
        this.upu = f7;
        this.upv = f8;
        this.upw = f9;
    }

    public short bsM() {
        return this.upo;
    }

    public short bsN() {
        return this.upp;
    }

    public float gvV() {
        return this.upq;
    }

    public void fF(float f2) {
        this.upq = f2;
    }

    public float gvW() {
        return this.dzg;
    }

    public void fG(float f2) {
        this.dzg = f2;
    }

    public float gvX() {
        return this.upr;
    }

    public void fH(float f2) {
        this.upr = f2;
    }

    public float gvY() {
        return this.ups;
    }

    public void fI(float f2) {
        this.ups = f2;
    }

    public float gvZ() {
        return this.upt;
    }

    public void fJ(float f2) {
        this.upt = f2;
    }

    public float gwa() {
        return this.upu;
    }

    public void fK(float f2) {
        this.upu = f2;
    }

    public float gwb() {
        return this.upv;
    }

    public void fL(float f2) {
        this.upv = f2;
    }

    public float gwc() {
        return this.upw;
    }

    public void fM(float f2) {
        this.upw = f2;
    }

    public int a(@NotNull ffm_2 ffm_22) {
        if (ffm_22.upp != this.upp) {
            return this.upp - ffm_22.upp;
        }
        return this.upo - ffm_22.upo;
    }

    public ffm_2 gwd() {
        return this.upx;
    }

    public void b(ffm_2 ffm_22) {
        this.upx = ffm_22;
    }

    public ffm_2 gwe() {
        return this.upy;
    }

    public void c(ffm_2 ffm_22) {
        this.upy = ffm_22;
    }

    public ffm_2 gwf() {
        return this.upz;
    }

    public void d(ffm_2 ffm_22) {
        this.upz = ffm_22;
    }

    public ffm_2 gwg() {
        return this.upA;
    }

    public void e(ffm_2 ffm_22) {
        this.upA = ffm_22;
    }

    public float[] gvL() {
        return new float[]{this.upq, this.dzg, this.upr, this.ups, this.upt, this.upu, this.upv, this.upw};
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((ffm_2)object);
    }
}

