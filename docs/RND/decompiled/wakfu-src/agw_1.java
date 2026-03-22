/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aGW
 */
public abstract class agw_1 {
    protected static final Logger dNl = Logger.getLogger(agw_1.class);
    protected final ahk_1 dNm;
    protected final agn_1 dNn;
    private boolean dNo = false;
    protected final float dNp;
    private int dNq = 0;
    private int dNr = 0;
    private boolean aCx = false;
    private long dNs = -1L;
    private boolean dNt = false;
    private boolean dNu = false;
    private boolean dNv = false;
    private float dNw = 0.0f;
    private long dNx = 0L;
    private float dNy = -1.0f;
    private long dxA;
    private final acp_1 dNz = new acp_1();

    public static agw_1 a(ahk_1 ahk_12, agn_1 agn_12, float f2, boolean bl, boolean bl2, float f3) {
        if (bl) {
            return new agy_1(ahk_12, agn_12, f2, bl2, f3);
        }
        return new agv_1(ahk_12, agn_12, f2, bl2, f3);
    }

    public agw_1(ahk_1 ahk_12, agn_1 agn_12, float f2, boolean bl, float f3) {
        this.dNm = ahk_12;
        this.dNn = agn_12;
        this.dNp = f2;
        this.dNt = false;
        this.dNu = true;
        this.dNv = bl;
        this.dNw = f3;
        this.dxA = -1L;
    }

    public void cR(int n, int n2) {
        this.dNq = n * 1000;
        this.dNr = n2 * 1000;
        long l = System.currentTimeMillis();
        this.dNs = l + (long)GC.mR(this.dNr - this.dNq) + (long)this.dNq;
    }

    public ahk_1 ccc() {
        return this.dNm;
    }

    public void a(long l, acp_1 acp_12, float f2, boolean bl, int n) {
        if (bl) {
            this.aCx = bl;
        } else if (!this.aCx) {
            return;
        }
        if (this.dxA == -1L) {
            this.dxA = l;
        }
        if (l - this.dxA > (long)this.dNm.ccG() && !this.dNm.bBD()) {
            this.dS(true);
            return;
        }
        if (this.dNy == -1.0f) {
            this.dNy = this.dNm.bBt();
        }
        this.dNz.m(this.dNn.bpl(), this.dNn.bpm(), this.dNn.bpn());
        if (!this.dNn.bpo()) {
            this.dNz.i(acp_12);
        }
        float f3 = this.dNz.bWY();
        if (this.dNv && f3 > this.dNp || this.dNm.ccD()) {
            this.dS(true);
            return;
        }
        this.dNm.yg(this.dNn.bpp());
        if (f3 <= this.dNp) {
            this.dNt = false;
        } else if (f3 > this.dNp) {
            if (!this.dNt) {
                this.dNt = true;
                if (this.dNm.ccC()) {
                    this.dNm.eb(true);
                    this.dNm.br(0.0f, this.dNw);
                }
            } else if (this.dNm.ccN()) {
                this.dS(true);
            }
            if (this.dNu) {
                return;
            }
        }
        if (this.dNs == -1L) {
            if (this.dNu || !this.dNm.isPlaying()) {
                try {
                    if (this.dNu) {
                        if (!this.dNm.ccv()) {
                            this.dS(true);
                            return;
                        }
                        if (this.dNx > 0L) {
                            this.dNm.hI(this.dNx);
                        }
                        this.dNm.cI(0.0f);
                        this.dNm.br(this.dNy, this.dNw);
                        this.dNu = false;
                    }
                    this.dNm.ccA();
                }
                catch (Exception exception) {
                    dNl.error((Object)"Exception during PositionedSound update", (Throwable)exception);
                }
            }
            this.p(this.dNz);
            switch (this.dNm.hG(l)) {
                case dPC: 
                case dPE: {
                    this.dNx = this.dNm.ccK();
                    break;
                }
                case dPD: {
                    this.dS(true);
                    break;
                }
                case dPF: {
                    this.dNu = true;
                }
            }
        } else if (this.dNs < l) {
            if (this.dNu || !this.dNm.isPlaying()) {
                try {
                    if (this.dNu) {
                        if (!this.dNm.ccv()) {
                            this.dS(true);
                            return;
                        }
                        if (this.dNx != -1L) {
                            this.dNm.hI(this.dNx);
                        }
                        this.dNm.cI(0.0f);
                        this.dNm.br(this.dNy, this.dNw);
                        this.dNu = false;
                    }
                    this.dNm.ccA();
                }
                catch (Exception exception) {
                    dNl.error((Object)"Exception during PositionedSound update", (Throwable)exception);
                }
            }
            this.p(this.dNz);
            switch (this.dNm.hG(l)) {
                case dPC: 
                case dPE: {
                    this.dNx = this.dNm.ccK();
                    break;
                }
                case dPD: {
                    this.dNs = l + (long)GC.mR(this.dNr - this.dNq) + (long)this.dNq;
                    break;
                }
                case dPF: {
                    this.dNu = true;
                    this.dNx = this.dNm.ccK();
                }
            }
        }
    }

    public boolean bYs() {
        return this.dNo;
    }

    public void aZp() {
        this.dNo = true;
    }

    public void dU(float f2) {
        this.dNm.dU(f2);
    }

    public void dV(float f2) {
        this.dNm.dV(f2);
    }

    public void ccd() {
        this.dNm.ccd();
    }

    public void cce() {
        this.dNm.cce();
    }

    public void dM(float f2) {
        this.dNm.dM(f2);
    }

    public void dQ(float f2) {
        this.dNm.dQ(f2);
    }

    public void dR(boolean bl) {
        this.dNm.dO(bl);
    }

    public void dS(boolean bl) {
        this.dNo = bl;
    }

    public abstract void p(acp_1 var1);

    public String toString() {
        return this.dNm.toString();
    }
}

