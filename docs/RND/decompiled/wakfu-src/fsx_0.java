/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fsx
 */
public class fsx_0 {
    private static final Logger tdF = Logger.getLogger(fsx_0.class);
    public static final int tdG = -1;
    private final int tdH;
    private final ewh tdI = new ewh();

    public fsx_0(int n) {
        this.tdH = n;
    }

    public boolean fH(int n, int n2) {
        return this.tdI.aK(n, n2);
    }

    public boolean aK(int n, int n2) {
        return this.tdI.aK(n, n2) && !this.tdI.aV(n, n2);
    }

    public final int b(int n, int n2, wt_0[] wt_0Array, int n3) {
        if (!this.aK(n, n2)) {
            return -1;
        }
        return this.tdI.a(n, n2, wt_0Array, n3);
    }

    public int a(int n, int n2, wu_0[] wu_0Array, int n3) {
        if (!this.aK(n, n2)) {
            return -1;
        }
        return this.tdI.a(n, n2, wu_0Array, n3);
    }

    public int getWidth() {
        return this.tdI.bmm();
    }

    public int getHeight() {
        return this.tdI.bmn();
    }

    public aci_1 gz(int n, int n2) {
        return new aci_1(n + this.tdI.bap, n + this.tdI.bap + this.getWidth() - 1, n2 + this.tdI.baq, n2 + this.tdI.baq + this.getHeight() - 1);
    }

    public void r(apl_1 apl_12) {
        byte by = apl_12.aIy();
        this.tdI.a(apl_12);
    }

    public boolean gA(int n, int n2) {
        return this.aK(n, n2);
    }

    public int vD() {
        return this.tdH;
    }

    public boolean aJ(int n, int n2) {
        assert (this.tdI.aK(n, n2));
        return this.tdI.aJ(n, n2);
    }

    public boolean fI(int n, int n2) {
        assert (this.tdI.aK(n, n2));
        return this.tdI.aV(n, n2) || this.tdI.fb(n, n2);
    }
}

