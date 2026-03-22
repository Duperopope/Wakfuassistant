/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCs
 */
public class acs_1 {
    private static double dBb = 4.0;
    private static double dBc = 4.0;
    private final act_1 dBd = new act_1(0.0, 0.0);
    private act_1 dBe;
    private act_1 dBf;

    public acs_1() {
    }

    public acs_1(double d2, double d3) {
        this.dBd.dBg = d2;
        this.dBd.dBh = d3;
    }

    public static void L(double d2) {
        dBb = d2;
    }

    public static void M(double d2) {
        dBc = d2;
    }

    public void N(double d2) {
        this.dBd.dBg = d2;
    }

    public void O(double d2) {
        this.dBd.dBh = d2;
    }

    public acs_1 a(double d2, double d3) {
        this.dBd.dBg = d2;
        this.dBd.dBh = d3;
        return this;
    }

    public double bXl() {
        return this.dBd.dBg;
    }

    public double bXm() {
        return this.dBd.dBh;
    }

    public double bXn() {
        return this.dBe == null ? this.dBd.dBg : this.dBe.dBg;
    }

    public double bXo() {
        return this.dBe == null ? this.dBd.dBh : this.dBe.dBh;
    }

    public double bXp() {
        return this.dBf == null ? this.dBd.dBg : this.dBf.dBg;
    }

    public double bXq() {
        return this.dBf == null ? this.dBd.dBh : this.dBf.dBh;
    }

    public void bXr() {
        this.dBe = null;
    }

    public acs_1 b(double d2, double d3) {
        this.dBe = Math.abs(this.bXl() - d2) < dBb && Math.abs(this.bXm() - d3) < dBc ? null : new act_1(d2, d3);
        return this;
    }

    public boolean bXs() {
        return this.dBe != null;
    }

    public boolean bXt() {
        return this.dBf != null;
    }

    public void bXu() {
        this.dBf = null;
    }

    public acs_1 c(double d2, double d3) {
        this.dBf = Math.abs(this.bXl() - d2) < dBb && Math.abs(this.bXm() - d3) < dBc ? null : new act_1(d2, d3);
        return this;
    }

    public void d(double d2, double d3) {
        if (this.bXs()) {
            this.dBe.dBg += d2;
            this.dBe.dBh += d3;
        }
    }

    public void e(double d2, double d3) {
        if (this.bXt()) {
            this.dBf.dBg += d2;
            this.dBf.dBh += d3;
        }
    }

    public acs_1 bXv() {
        acs_1 acs_12 = new acs_1(this.bXl(), this.bXm());
        if (this.bXs()) {
            acs_12.b(this.bXn(), this.bXo());
        }
        if (this.bXt()) {
            acs_12.c(this.bXp(), this.bXq());
        }
        return acs_12;
    }

    public boolean a(acs_1 acs_12) {
        if (this.bXl() != acs_12.bXl() || this.bXm() != acs_12.bXm()) {
            return false;
        }
        if (this.bXn() != acs_12.bXn() || this.bXo() != acs_12.bXo()) {
            return false;
        }
        return this.bXp() == acs_12.bXp() && this.bXq() == acs_12.bXq();
    }

    public /* synthetic */ Object clone() {
        return this.bXv();
    }
}

