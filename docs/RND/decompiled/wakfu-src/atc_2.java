/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.cg.CGparameter
 */
import com.jogamp.opengl.cg.CGparameter;

/*
 * Renamed from atc
 */
class atc_2 {
    public final CGparameter dbb;
    public final String dbc;
    private float dbd;
    private float[] dbe;

    atc_2(String string, CGparameter cGparameter) {
        this.dbc = string;
        this.dbb = cGparameter;
    }

    public boolean cV(float f2) {
        return this.dbd == f2;
    }

    public void cW(float f2) {
        this.dbd = f2;
    }

    public boolean a(float[] fArray, int n, int n2) {
        if (this.dbe == null) {
            return false;
        }
        for (int i = 0; i < n2; ++i) {
            if (this.dbe[i] == fArray[n + i]) continue;
            return false;
        }
        return true;
    }

    public void b(float[] fArray, int n, int n2) {
        if (this.dbe == null) {
            this.dbe = new float[n2];
        }
        System.arraycopy(fArray, n, this.dbe, 0, n2);
    }
}

