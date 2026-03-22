/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Wy
 */
public class wy_0 {
    private static final ThreadLocal<wt_0[]> bOk = ThreadLocal.withInitial(wy_0::bmo);
    private aao_1 bOl;
    private final azh_2 bOm = new azh_2(324);
    private final azh_2 bOn = new azh_2(324);
    private final ww_0 bOo;
    private static final Logger bOp = Logger.getLogger(wy_0.class);

    private static wt_0[] bmo() {
        wt_0[] wt_0Array = new wt_0[32];
        for (int i = 0; i < wt_0Array.length; ++i) {
            wt_0Array[i] = new wt_0();
        }
        return wt_0Array;
    }

    public wy_0(@NotNull ww_0 ww_02) {
        this.bOo = ww_02;
    }

    public boolean aJ(int n, int n2) {
        if (this.bOo.aJ(n, n2)) {
            return true;
        }
        return this.bOm.vE((n2 -= this.bOo.baq) * 18 + (n -= this.bOo.bap));
    }

    public boolean u(int n, int n2, short s) {
        if (this.aJ(n, n2)) {
            return true;
        }
        return this.bOl != null && this.bOl.gR(anf_2.L(n, n2, s));
    }

    public boolean aM(int n, int n2) {
        if (this.aJ(n, n2)) {
            return true;
        }
        if (this.bOl == null) {
            return false;
        }
        for (int i = 0; i < this.bOl.aVo(); ++i) {
            acd_1 acd_12 = anf_2.gn(this.bOl.wt(i));
            if (acd_12.getX() != n || acd_12.getY() != n2) continue;
            return true;
        }
        return false;
    }

    public final int e(int n, int n2, int n3) {
        assert (this.bOo.aK(n, n2));
        int n4 = this.bOo.a(n, n2, bOk.get(), 0);
        if (n4 == 0) {
            return 0;
        }
        for (int i = 0; i < n4; ++i) {
            if (wy_0.bOk.get()[i].ban != n3) continue;
            return bOk.get()[i].blY();
        }
        return 0;
    }

    public boolean f(int n, int n2, int n3) {
        return wt_0.qn(this.e(n, n2, n3));
    }

    public boolean aN(int n, int n2) {
        return this.bOn.vE((n2 -= this.bOo.baq) * 18 + (n -= this.bOo.bap));
    }

    public final ww_0 bmp() {
        return this.bOo;
    }

    public void b(int n, int n2, boolean bl) {
        if (this.aJ(n, n2) == bl) {
            return;
        }
        this.bOm.j((n2 -= this.bOo.baq) * 18 + (n -= this.bOo.bap), bl);
    }

    public void a(int n, int n2, short s, boolean bl) {
        if (this.u(n, n2, s) == bl) {
            return;
        }
        if (this.bmp().a(n, n2, bOk.get(), 0) == 1) {
            this.b(n, n2, bl);
            return;
        }
        if (!bl) {
            if (this.bOl != null) {
                this.bOl.gN(anf_2.L(n, n2, s));
            }
        } else {
            if (this.bOl == null) {
                this.bOl = new aao_1();
            }
            this.bOl.fW(anf_2.L(n, n2, s));
        }
    }

    public void c(int n, int n2, boolean bl) {
        if (this.aN(n, n2) == bl) {
            return;
        }
        if (bl) {
            if (!this.aM(n, n2)) {
                this.bOn.j((n2 -= this.bOo.baq) * 18 + (n -= this.bOo.bap), true);
            }
        } else {
            this.bOn.j((n2 -= this.bOo.baq) * 18 + (n -= this.bOo.bap), false);
        }
    }

    public boolean g(int n, int n2, int n3) {
        try {
            int n4 = this.bOo.a(n, n2, bOk.get(), 0);
            for (int i = 0; i < n4; ++i) {
                wt_0 wt_02 = bOk.get()[i];
                if (wt_02 == null || wt_02.ban != n3 || !wt_02.bmg()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            bOp.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public boolean h(int n, int n2, int n3) {
        try {
            int n4 = this.bOo.a(n, n2, bOk.get(), 0);
            for (int i = 0; i < n4; ++i) {
                wt_0 wt_02 = bOk.get()[i];
                if (wt_02 == null || wt_02.ban != n3 || !wt_02.bmj()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            bOp.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public boolean i(int n, int n2, int n3) {
        try {
            int n4 = this.bOo.a(n, n2, bOk.get(), 0);
            for (int i = 0; i < n4; ++i) {
                wt_0 wt_02 = bOk.get()[i];
                if (wt_02 == null || wt_02.ban != n3 || !wt_02.bmh()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            bOp.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public boolean j(int n, int n2, int n3) {
        try {
            int n4 = this.bOo.a(n, n2, bOk.get(), 0);
            for (int i = 0; i < n4; ++i) {
                wt_0 wt_02 = bOk.get()[i];
                if (wt_02 == null || wt_02.ban != n3 || !wt_02.bmi()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            bOp.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public boolean k(int n, int n2, int n3) {
        try {
            int n4 = this.bOo.a(n, n2, bOk.get(), 0);
            for (int i = 0; i < n4; ++i) {
                wt_0 wt_02 = bOk.get()[i];
                if (wt_02 == null || wt_02.ban != n3 || !wt_02.bml()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            bOp.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }
}

