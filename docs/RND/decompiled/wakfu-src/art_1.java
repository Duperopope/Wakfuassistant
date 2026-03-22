/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL2;

/*
 * Renamed from arT
 */
public abstract class art_1 {
    protected GL2 cVy;
    protected Matrix44 cVz;
    protected Matrix44 cVA;
    protected final Matrix44 cVB = (Matrix44)Matrix44.dAb.bSJ();
    protected awk_1 cVC;
    protected int cVD = 1;
    protected int cVE;
    protected int cVF;

    protected art_1() {
    }

    public abstract aru_2 bIm();

    public abstract awk_1 a(long var1, String var3, boolean var4);

    public abstract awk_1 a(long var1, axc_2 var3, boolean var4);

    public abstract awk_1 b(long var1, int var3, int var4, boolean var5);

    public abstract void a(Matrix44 var1);

    public abstract void b(Matrix44 var1);

    public abstract void bIn();

    public final Matrix44 bIo() {
        return this.cVz;
    }

    public final Matrix44 bIp() {
        return this.cVA;
    }

    public abstract void a(awk_1 var1);

    public void a(ars_2 ars_22) {
        ars_22.b(this);
    }

    public void d(GL2 gL2) {
        this.cVy = gL2;
    }

    public final GL2 bIq() {
        return this.cVy;
    }

    public abstract void a(float var1, float var2, float var3, float var4, int var5);

    public abstract boolean bIr();

    public final Matrix44 bIs() {
        return this.cVB;
    }

    public final void bX(int n, int n2) {
        this.cVE = n;
        this.cVF = n2;
    }

    public final int bIt() {
        return this.cVE;
    }

    public final int bIu() {
        return this.cVF;
    }
}

