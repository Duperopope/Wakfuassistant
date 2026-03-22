/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class adh
extends adb_0 {
    private static final Logger ciG = Logger.getLogger(adh.class);
    private static final int ciH = 255;
    private static final int ciI = 255;
    private static final int ciJ = 4;
    private static final byte ciK = 3;
    public static final int ciL = 255;
    public static final int ciM = (int)Math.ceil(81.0);
    public static final int ciN = 0;
    public static final int ciO = -1;
    private adq[] ciP = null;
    private adi[] ciQ = null;
    private static final adi[] ciR = new adi[0];
    private adC[] ciS = null;
    private adG[] ciT = null;
    int[] ciU;
    byte[] ciV;
    boolean ciW;

    public adh() {
    }

    public adh(short s, short s2) {
        super(s, s2);
    }

    public byte bur() {
        return 0;
    }

    public adC[] bus() {
        return this.ciS;
    }

    public adG[] but() {
        return this.ciT;
    }

    public int[] buu() {
        return this.ciU;
    }

    public int bu(int n, int n2) {
        if (this.ciU == null) {
            return -1;
        }
        if (this.ciV == null) {
            return this.ciU[0];
        }
        n2 -= this.cch * 18;
        assert ((n -= this.ccg * 18) >= 0 && n < 18);
        assert (n2 >= 0 && n2 < 18);
        int n3 = n + n2 * 18;
        int n4 = this.ciV[n3 / 4] >>> n3 % 4 * 2;
        return this.ciU[n4 & 3];
    }

    public adq[] buv() {
        return this.ciP;
    }

    public adi[] buw() {
        return this.ciQ;
    }

    public void a(adG[] adGArray) {
        this.ciT = adGArray;
    }

    public void a(adC[] adCArray) {
        this.ciS = adCArray;
    }

    public void j(int[] nArray) {
        this.ciU = nArray;
        assert (this.ciU.length <= 4) : "Trop d'ambiance diff\u00e9rentes";
        if (this.ciU.length >= 1) {
            this.ciV = new byte[ciM];
        }
    }

    public void x(int n, int n2, int n3) {
        assert (n >= 0 && n < 18);
        assert (n2 >= 0 && n2 < 18);
        assert (this.ciV != null) : "Il faut d'abord appeler setAmbiancesId";
        assert (n3 < this.ciU.length);
        int n4 = n + n2 * 18;
        int n5 = n4 / 4;
        this.ciV[n5] = (byte)(this.ciV[n5] | n3 << n4 % 4 * 2);
    }

    public void a(adq[] adqArray) {
        this.ciP = adqArray;
    }

    public void a(adi[] adiArray) {
        this.ciQ = adiArray;
    }

    @Override
    public void clear() {
        this.ciS = null;
        this.ciT = null;
        this.ciV = null;
        this.ciU = null;
    }

    @Override
    public void a(@NotNull apl_1 apl_12) {
        super.a(apl_12);
        this.f(apl_12);
        this.g(apl_12);
        this.h(apl_12);
        this.i(apl_12);
        this.j(apl_12);
    }

    @Override
    public void b(@NotNull fs_0 fs_02) {
        super.b(fs_02);
        this.g(fs_02);
        this.h(fs_02);
        this.i(fs_02);
        this.j(fs_02);
        this.k(fs_02);
    }

    private void f(apl_1 apl_12) {
        int n = apl_12.aIy() & 0xFF;
        if (n == 0) {
            return;
        }
        this.ciS = new adC[n];
        for (int i = 0; i < n; ++i) {
            adC adC2 = new adC();
            adC2.a(apl_12);
            this.ciS[i] = adC2;
        }
    }

    private void g(fs_0 fs_02) {
        if (this.ciS == null) {
            fs_02.g((byte)0);
            return;
        }
        int n = this.ciS.length;
        if (n >= 255) {
            throw new RuntimeException("trop de particules sur la map (" + this.ccg + " " + this.cch + ")");
        }
        fs_02.g((byte)(n & 0xFF));
        for (int i = 0; i < n; ++i) {
            this.ciS[i].b(fs_02);
        }
    }

    private void g(apl_1 apl_12) {
        int n = apl_12.aIy() & 0xFF;
        if (n == 0) {
            return;
        }
        this.ciT = new adG[n];
        for (int i = 0; i < n; ++i) {
            adG adG2 = new adG();
            adG2.a(apl_12);
            this.ciT[i] = adG2;
        }
    }

    private void h(fs_0 fs_02) {
        if (this.ciT == null) {
            fs_02.g((byte)0);
            return;
        }
        int n = this.ciT.length;
        if (n >= 255) {
            throw new RuntimeException("trop de sons sur la map (" + this.ccg + " " + this.cch + ")");
        }
        fs_02.g((byte)(n & 0xFF));
        for (int i = 0; i < n; ++i) {
            this.ciT[i].b(fs_02);
        }
    }

    private void h(apl_1 apl_12) {
        int n = apl_12.aIy() & 0xFF;
        if (n == 0) {
            this.ciV = null;
            this.ciU = null;
            return;
        }
        this.ciU = apl_12.mx(n);
        int n2 = apl_12.aIy() & 0xFF;
        if (n2 == 0) {
            assert (this.ciU.length == 1);
            this.ciV = null;
            return;
        }
        assert (n2 == ciM);
        this.ciV = apl_12.mv(n2);
    }

    private void i(fs_0 fs_02) {
        if (this.ciU == null) {
            assert (this.ciV == null);
            fs_02.g((byte)0);
            return;
        }
        int n = this.ciU.length;
        assert (this.ciU.length < 4);
        fs_02.g((byte)(n & 0xFF));
        for (int i = 0; i < n; ++i) {
            fs_02.mz(this.ciU[i]);
        }
        if (this.ciV == null) {
            assert (this.ciU.length == 1);
            fs_02.g((byte)0);
            return;
        }
        assert (this.ciV.length == ciM);
        fs_02.g((byte)(this.ciV.length & 0xFF));
        fs_02.di(this.ciV);
    }

    protected void i(apl_1 apl_12) {
        int n = apl_12.aIy() & 0xFF;
        if (n == 0) {
            return;
        }
        this.ciP = new adq[n];
        for (int i = 0; i < n; ++i) {
            adq adq2 = new adq();
            adq2.a(apl_12);
            this.ciP[i] = adq2;
        }
    }

    private void j(fs_0 fs_02) {
        if (this.ciP == null) {
            fs_02.g((byte)0);
            return;
        }
        int n = this.ciP.length;
        if (n >= 255) {
            throw new RuntimeException("trop de interactivs sur la map (" + this.ccg + " " + this.cch + ")");
        }
        fs_02.g((byte)(n & 0xFF));
        for (int i = 0; i < n; ++i) {
            this.ciP[i].b(fs_02);
        }
    }

    protected void j(apl_1 apl_12) {
        int n = apl_12.aIy() & 0xFF;
        if (n == 0) {
            this.ciQ = ciR;
            return;
        }
        this.ciQ = new adi[n];
        for (int i = 0; i < n; ++i) {
            adi adi2 = new adi();
            adi2.a(apl_12);
            this.ciQ[i] = adi2;
        }
    }

    private void k(fs_0 fs_02) {
        if (this.ciQ == null) {
            fs_02.g((byte)0);
            return;
        }
        int n = this.ciQ.length;
        if (n >= 255) {
            throw new RuntimeException("trop de dynamic sur la map (" + this.ccg + " " + this.cch + ")");
        }
        fs_02.g((byte)(n & 0xFF));
        for (int i = 0; i < n; ++i) {
            this.ciQ[i].b(fs_02);
        }
    }
}

