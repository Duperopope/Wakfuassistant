/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.jogamp.opengl.GL2;

/*
 * Renamed from auL
 */
class aul_2 {
    final String dfh;
    float[] bdU = null;
    long dfi;
    final auk_2 dfj = new auk_2();
    final auk_2 dfk = new auk_2();
    long dfl;

    aul_2(String string) {
        this.dfh = string;
        this.dfj.gy(aum_2.dfy);
        this.dfk.gy(aum_2.dfy);
    }

    public final void bMx() {
        this.dfk.uG(1);
        this.dfi = System.nanoTime();
    }

    public final void gz(long l) {
        this.dfj.gy(l);
        this.dfk.gy(l);
    }

    public final void gA(long l) {
        this.dfj.uG((int)(l - this.dfi));
    }

    public String gm(String string) {
        return String.format("%15s|% 6.1f|% 6.1f|% 6.1f|% 6.1f|%3d", this.dfh + string, (double)this.dfj.dfb / 1000000.0 / (double)this.dfk.dfb, (double)this.dfj.dfb / 1000000.0, (double)this.dfj.dfd / 1000000.0, (double)this.dfj.dfe / 1000000.0, this.dfk.dfb);
    }

    public void g(GL2 gL2) {
        aul_2.a(gL2, this.dfj, this.bdU, 2.0E-5);
    }

    public static void a(GL2 gL2, auk_2 auk_22, float[] fArray, double d2) {
        if (fArray == null) {
            return;
        }
        gL2.glColor4fv(fArray, 0);
        gL2.glBegin(1);
        int n = (int)Math.min(aum_2.dfy, 500L);
        int[] nArray = auk_22.dfg;
        float f2 = -500.0f;
        int n2 = (int)(aum_2.dfy % 500L);
        for (int i = 0; i < n - 1; ++i) {
            gL2.glVertex2f((float)i * 2.0f + -500.0f, (float)((double)nArray[(i + n2) % 500] * d2) - 300.0f);
            gL2.glVertex2f((float)(i + 1) * 2.0f + -500.0f, (float)((double)nArray[(i + 1 + n2) % 500] * d2) - 300.0f);
        }
        gL2.glEnd();
    }
}

