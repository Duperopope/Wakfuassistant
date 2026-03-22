/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eNt
 */
public class ent_0<F extends exP>
implements enu_0 {
    protected static final Logger qYr = Logger.getLogger(ent_0.class);
    protected final etu_0<F> qYs;
    private final qg_0<enk_0> qYt;
    private boolean qYu;

    public ent_0(etu_0<F> etu_02, qg_0<enk_0> qg_02) {
        this.qYs = etu_02;
        this.qYt = qg_02;
    }

    @Override
    public byte baj() {
        return 1;
    }

    @Override
    public qq_0 bad() {
        return this.qYs.bad();
    }

    @Override
    public qg_0<enk_0> bac() {
        return this.qYt;
    }

    @Override
    public ano_2<qu_0> bae() {
        return this.qYs;
    }

    @Override
    public TA baf() {
        return this.qYs != null ? this.qYs.dHf() : null;
    }

    @Override
    public rh_0 bag() {
        return this.qYs != null ? this.qYs.bag() : null;
    }

    @Override
    public qv_0 bah() {
        return this.qYs;
    }

    @Override
    public QR bai() {
        return this.qYs != null ? this.qYs.bai() : null;
    }

    public etu_0<F> fBq() {
        return this.qYs;
    }

    @Override
    public int bha() {
        return this.qYs != null ? this.qYs.d() : 0;
    }

    @Override
    public void a(eSS eSS2) {
        this.qYs.a(eSS2);
    }

    @Override
    public qy_0 bak() {
        return this.qYs.bak();
    }

    @Override
    public qx_0 bal() {
        return this.qYs.bal();
    }

    public boolean fBr() {
        return this.qYu;
    }

    public void lT(boolean bl) {
        this.qYu = bl;
    }

    public String toString() {
        return "WakfuFightEffectContext{m_fight=" + String.valueOf(this.qYs) + ", m_extendedEffectExecutionCount=" + this.qYu + "}";
    }
}

