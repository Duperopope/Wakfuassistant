/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eHz
 */
public class ehz_0 {
    private boolean cHn;
    private boolean mnm;
    private final uw_0 qsi = new uw_0(uw_0.bvJ);
    private final uz_0 qsj = new uz_0(ua_0.bwa);

    public void bjt() {
        if (!this.cHn) {
            return;
        }
        ux_0 ux_02 = ue_0.bjV().bjc();
        uz_0 uz_02 = this.qsi.l(ux_02);
        if (this.mnm) {
            this.qsj.g(uz_02);
        }
        if (!this.qsj.aYI()) {
            this.qsj.c(ua_0.bwa);
        }
        this.qsi.f(ux_02);
    }

    public void jJ(boolean bl) {
        this.mnm = bl;
    }

    public boolean isEnabled() {
        return this.cHn;
    }

    public void setEnabled(boolean bl) {
        this.cHn = bl;
    }

    public void q(ua_0 ua_02) {
        this.qsj.c(ua_02);
    }

    public void N(ux_0 ux_02) {
        this.qsi.f(ux_02);
    }

    public ua_0 fvL() {
        return this.qsj;
    }

    public ux_0 fvM() {
        return this.qsi;
    }

    public void reset() {
        this.cHn = false;
        this.mnm = false;
        this.qsi.f(uw_0.bvJ);
        this.qsj.c(ua_0.bwa);
    }

    public String toString() {
        return "AntiAddictionDataHandler{m_currentUsedQuota=" + String.valueOf(this.qsj) + ", m_enabled=" + this.cHn + ", m_lastConnectionDate=" + String.valueOf(this.qsi) + "}";
    }
}

