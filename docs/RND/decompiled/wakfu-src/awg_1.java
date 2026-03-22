/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from awG
 */
public final class awg_1 {
    private int brs;
    private int brt;
    public float aAs;
    public float aAu;
    public float aAt;
    public float aAr;
    private awk_1 bXx;
    private int bap;
    private int baq;
    private boolean dmn;
    private boolean dmo;
    private boolean dmp = false;
    private boolean dmq = false;
    private asp_1 dmr = asp_1.dac;
    private final ArrayList<awh_1> dms = new ArrayList();

    public awg_1() {
        this.bap = 0;
        this.baq = 0;
        this.brs = -1;
        this.brt = -1;
        this.dmo = true;
    }

    public awg_1(awk_1 awk_12) {
        assert (awk_12 != null);
        this.bXx = awk_12;
        this.bXx.bGY();
        this.bap = 0;
        this.baq = 0;
        this.brs = -1;
        this.brt = -1;
        this.dmo = true;
        this.bOY();
    }

    public awg_1(awk_1 awk_12, int n, int n2, int n3, int n4) {
        assert (awk_12 != null);
        this.bXx = awk_12;
        this.bXx.bGY();
        this.bap = n;
        this.baq = n2;
        this.brs = n3;
        this.brt = n4;
        this.dmo = false;
        this.bOY();
    }

    public void a(awh_1 awh_12) {
        assert (awh_12 != null) : "Client can't be null";
        assert (!this.dms.contains(awh_12)) : "Client already registered for this pixmap";
        this.dms.add(awh_12);
    }

    public void b(awh_1 awh_12) {
        assert (awh_12 != null) : "Client can't be null";
        this.dms.remove(awh_12);
    }

    public awk_1 bHg() {
        return this.bXx;
    }

    public int bOS() {
        return this.brt;
    }

    public int bOT() {
        return this.brs;
    }

    public int getHeight() {
        return this.dmr.bKt() ? this.brs : this.brt;
    }

    public int getWidth() {
        return this.dmr.bKt() ? this.brt : this.brs;
    }

    public int getX() {
        return this.bap;
    }

    public int getY() {
        return this.baq;
    }

    public float aKq() {
        return this.aAs;
    }

    public float aKs() {
        return this.aAu;
    }

    public float aKr() {
        return this.aAt;
    }

    public float aKp() {
        return this.aAr;
    }

    public void setTexture(awk_1 awk_12) {
        if (awk_12 != null) {
            awk_12.bGY();
        }
        if (this.bXx != null) {
            this.bXx.bsI();
        }
        this.bXx = awk_12;
        this.dmn = false;
    }

    public void setX(int n) {
        this.bap = n;
        this.dmn = false;
    }

    public void setY(int n) {
        this.baq = n;
        this.dmn = false;
    }

    public void setWidth(int n) {
        this.brs = n;
        this.dmn = false;
    }

    public void setHeight(int n) {
        this.brt = n;
        this.dmn = false;
    }

    public void setFlipVerticaly(boolean bl) {
        this.dmq = bl;
        this.dmn = false;
    }

    public void setFlipHorizontaly(boolean bl) {
        this.dmp = bl;
        this.dmn = false;
    }

    public boolean bOU() {
        return this.dmp;
    }

    public boolean bOV() {
        return this.dmq;
    }

    public asp_1 getRotation() {
        return this.dmr;
    }

    public void setRotation(asp_1 asp_12) {
        if (asp_12 != this.dmr) {
            this.dmr = asp_12;
            this.dmn = false;
        }
    }

    public void dl(boolean bl) {
        this.dmo = bl;
        this.dmn = false;
    }

    public boolean bOW() {
        return this.dmo;
    }

    public boolean bOX() {
        return !this.dmn;
    }

    public void bOY() {
        if (this.bXx == null) {
            return;
        }
        if (this.dmo) {
            var1_1 = this.bXx.bQs();
            acc_1 acc_12 = this.bXx.bQt();
            var3_7 = acc_12.bWx();
            float f2 = acc_12.bWy();
            this.bap = 0;
            this.baq = 0;
            this.brs = var1_1.bWx();
            this.brt = var1_1.bWy();
            this.aAr = 0.0f;
            this.aAs = 0.0f;
            this.aAt = (float)this.brt / f2;
            this.aAu = (float)this.brs / var3_7;
        } else {
            var1_1 = this.bXx.bQt();
            float f3 = var1_1.bWx();
            var3_7 = var1_1.bWy();
            this.aAs = (float)this.bap / f3;
            this.aAu = (float)(this.bap + this.brs) / f3;
            this.aAr = (float)this.baq / var3_7;
            this.aAt = (float)(this.baq + this.brt) / var3_7;
        }
        if (this.dmp) {
            float f4 = this.aAs;
            this.aAs = this.aAu;
            this.aAu = f4;
        }
        if (this.dmq) {
            float f5 = this.aAr;
            this.aAr = this.aAt;
            this.aAt = f5;
        }
        this.dmn = true;
        for (int i = this.dms.size() - 1; i >= 0; --i) {
            this.dms.get(i).a(this);
        }
    }
}

