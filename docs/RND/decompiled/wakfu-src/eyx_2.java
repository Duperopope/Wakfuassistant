/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eYx
 */
final class eyx_2
implements ezv_1 {
    private final ArrayList<ezx_1> rJQ = new ArrayList();
    private final int rJR;
    @NotNull
    private final uw_0 rJS = new uw_0(uw_0.bvJ);
    @NotNull
    private final uw_0 rJT = new uw_0(uw_0.bvJ);

    eyx_2(int n) {
        this.rJR = n;
    }

    @Override
    public int tJ() {
        return this.rJR;
    }

    @Override
    @NotNull
    public ux_0 fPJ() {
        return this.rJS;
    }

    @Override
    @NotNull
    public ux_0 fPK() {
        return this.rJT;
    }

    void T(ux_0 ux_02) {
        this.rJS.f(ux_02);
    }

    void U(ux_0 ux_02) {
        this.rJT.f(ux_02);
    }

    @Override
    public boolean fPL() {
        return !uw_0.bju().equals(this.rJT) && ue_0.bjV().e(this.rJT);
    }

    @Override
    public void cCb() {
        this.fPM();
    }

    private void fPM() {
        int n = this.rJQ.size();
        for (int i = 0; i < n; ++i) {
            this.rJQ.get(i).g(this);
        }
    }

    @Override
    public boolean a(ezx_1 ezx_12) {
        return !this.rJQ.contains(ezx_12) && this.rJQ.add(ezx_12);
    }

    @Override
    public boolean b(ezx_1 ezx_12) {
        return this.rJQ.remove(ezx_12);
    }

    public String toString() {
        return "GuildBonusModel{m_buyDate=" + String.valueOf(this.rJS) + "m_activationDate=" + String.valueOf(this.rJT) + ", m_bonusId=" + this.rJR + ", m_buyDate=" + String.valueOf(this.rJS) + "}";
    }
}

