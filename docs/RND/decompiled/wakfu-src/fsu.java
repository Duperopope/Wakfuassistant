/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class fsu {
    private static final Logger tdk = Logger.getLogger(fsu.class);
    public static final VK tdl = new VK(9, 9, (short)Short.MIN_VALUE);
    public static final VK tdm = new VK(9, 9, 0);
    private static final fsv_0[] tdn = new fsv_0[0];
    public static final short tdo = fsu.gy(1, 0);
    public static final short tdp = 0;
    public static final int tdq = 2;
    public static final int tdr = 2;
    public static final int tds = 9;
    public static final int tdt = 9;
    public static final int tdu = 81;
    public final int tdv;
    private byte[] bOW;
    private VL tdw;
    private VL oyn;
    private VL oyp;
    private VL oyo;
    private fsv_0[] tdx;

    protected fsu(int n) {
        this.tdv = n;
    }

    public boolean ab(int n, int n2) {
        assert (n >= 0 && n < 9);
        assert (n2 >= 0 && n2 < 9);
        if (this.bOW == null) {
            return false;
        }
        return azh_2.i(this.bOW, n2 * 9 + n);
    }

    public boolean gv(int n, int n2) {
        assert (n >= 0 && n < 9);
        assert (n2 >= 0 && n2 < 9);
        this.glh();
        if (this.tdx == tdn) {
            return false;
        }
        for (int i = 0; i < this.tdx.length; ++i) {
            if (this.tdx[i].tdz != n || this.tdx[i].tdA != n2) continue;
            return true;
        }
        return false;
    }

    private void glh() {
        if (this.tdx != null) {
            return;
        }
        ArrayList<fsv_0> arrayList = new ArrayList<fsv_0>();
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                int[] nArray;
                short s = ewt_0.ffh().a(i, j, 0, this.tdw);
                exx_1 exx_12 = exw_1.fPh().Ti(s);
                if (exx_12 == null || exb_0.Ox(s) || (nArray = exx_12.fPi()).length == 0) continue;
                short s2 = fsu.b(this, i, j);
                arrayList.add(new fsv_0((byte)i, (byte)j, s2, nArray[0]));
            }
        }
        if (arrayList.isEmpty()) {
            this.tdx = tdn;
        } else {
            this.tdx = new fsv_0[arrayList.size()];
            arrayList.toArray(this.tdx);
        }
    }

    public void ac(TObjectProcedure<fsv_0> tObjectProcedure) {
        this.glh();
        if (this.tdx == tdn) {
            return;
        }
        for (int i = 0; i < this.tdx.length; ++i) {
            if (tObjectProcedure.execute((Object)this.tdx[i])) continue;
            return;
        }
    }

    public short gw(int n, int n2) {
        return tdm.a(n, n2, 0, this.oyp);
    }

    public short fd(int n, int n2) {
        return tdm.a(n, n2, 0, this.oyo);
    }

    public short gx(int n, int n2) {
        return tdl.a(n, n2, 0, this.oyn);
    }

    public short V(int n, int n2, int n3) {
        return ewt_0.ffh().a(n, n2, n3, this.tdw);
    }

    public void r(apl_1 apl_12) {
        this.I(apl_12);
        this.J(apl_12);
    }

    protected final void I(apl_1 apl_12) {
        byte by = apl_12.aIy();
        if (by <= 0) {
            this.bOW = null;
        } else {
            assert (by == azh_2.vG(81));
            this.bOW = apl_12.mv(by);
        }
        this.oyn = VL.a(apl_12, tdl.bkK());
        this.oyo = VL.a(apl_12, tdm.bkK());
        this.oyp = VL.a(apl_12, tdm.bkK());
    }

    protected void J(apl_1 apl_12) {
        this.tdw = VL.a(apl_12, ewt_0.ffh().bkK());
    }

    public static short gy(int n, int n2) {
        if (n < 0 || n > 15) {
            throw new UnsupportedOperationException("coordon\u00e9e x de patch hors contraintes mapCoordX=" + n);
        }
        if (n2 < 0 || n2 > 4095) {
            throw new UnsupportedOperationException("coordon\u00e9e y de patch hors contraintes mapCoordY=" + n2);
        }
        short s = (short)(n & 0xF);
        short s2 = (short)(n2 & 0xFFF);
        return (short)(s << 12 | s2);
    }

    public static acc_1 aad(int n) {
        int n2 = n >> 12 & 0xF;
        int n3 = n & 0xFFF;
        return new acc_1(n2, n3);
    }

    public static VL b(fsu fsu2, fsu fsu3, fsu fsu4, fsu fsu5) {
        int n;
        int n2;
        short[] sArray = new short[324];
        int n3 = 0;
        for (n2 = 0; n2 < 9; ++n2) {
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fsu.b(fsu2, n, n2);
            }
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fsu.b(fsu3, n, n2);
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fsu.b(fsu4, n, n2);
            }
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fsu.b(fsu5, n, n2);
            }
        }
        try {
            return ewi.oyl.k(sArray);
        }
        catch (VM vM) {
            tdk.error((Object)"", (Throwable)vM);
            return null;
        }
    }

    public static VL c(fsu fsu2, fsu fsu3, fsu fsu4, fsu fsu5) {
        int n;
        int n2;
        short[] sArray = new short[324];
        int n3 = 0;
        for (n2 = 0; n2 < 9; ++n2) {
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fsu.c(fsu2, n, n2);
            }
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fsu.c(fsu3, n, n2);
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fsu.c(fsu4, n, n2);
            }
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fsu.c(fsu5, n, n2);
            }
        }
        try {
            return ewi.oym.k(sArray);
        }
        catch (VM vM) {
            tdk.error((Object)"", (Throwable)vM);
            return null;
        }
    }

    public static VL d(fsu fsu2, fsu fsu3, fsu fsu4, fsu fsu5) {
        int n;
        int n2;
        short[] sArray = new short[324];
        int n3 = 0;
        for (n2 = 0; n2 < 9; ++n2) {
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fsu.d(fsu2, n, n2);
            }
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fsu.d(fsu3, n, n2);
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fsu.d(fsu4, n, n2);
            }
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fsu.d(fsu5, n, n2);
            }
        }
        try {
            return ewi.oym.k(sArray);
        }
        catch (VM vM) {
            tdk.error((Object)"", (Throwable)vM);
            return null;
        }
    }

    private static short b(fsu fsu2, int n, int n2) {
        return fsu2 != null ? fsu2.gx(n, n2) : tdl.bkK();
    }

    private static short c(fsu fsu2, int n, int n2) {
        return fsu2 != null ? fsu2.fd(n, n2) : tdm.bkK();
    }

    private static short d(fsu fsu2, int n, int n2) {
        return fsu2 != null ? fsu2.gw(n, n2) : tdm.bkK();
    }

    private static short e(fsu fsu2, int n, int n2) {
        return fsu2 != null ? fsu2.V(n, n2, 0) : ewt_0.ffg().bkK();
    }

    public static VL e(fsu fsu2, fsu fsu3, fsu fsu4, fsu fsu5) {
        int n;
        int n2;
        short[] sArray = new short[324];
        int n3 = 0;
        for (n2 = 0; n2 < 9; ++n2) {
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fsu.e(fsu2, n, n2);
            }
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fsu.e(fsu3, n, n2);
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fsu.e(fsu4, n, n2);
            }
            for (n = 0; n < 9; ++n) {
                sArray[n3++] = fsu.e(fsu5, n, n2);
            }
        }
        try {
            return ewt_0.ffg().k(sArray);
        }
        catch (VM vM) {
            tdk.error((Object)"", (Throwable)vM);
            return null;
        }
    }

    public static int aae(int n) {
        int n2 = n / 9;
        if (n < 0 && n % 9 != 0) {
            --n2;
        }
        assert ((double)n2 == Math.floor((double)n / 9.0));
        return n2;
    }

    public static int aaf(int n) {
        int n2 = n / 9;
        if (n < 0 && n % 9 != 0) {
            --n2;
        }
        assert ((double)n2 == Math.floor((double)n / 9.0));
        return n2;
    }

    public static boolean fL(short s) {
        int n = fsu.aad(s).bWx();
        return n != 1 && n != 2;
    }
}

