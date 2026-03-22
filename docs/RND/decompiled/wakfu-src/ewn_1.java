/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Objects;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eWn
 */
public abstract class ewn_1<F extends exP, TFight extends Uh & eub_0<F>, TTimeline extends ewk_1<F>> {
    private static final Logger rBn = Logger.getLogger(ewn_1.class);
    @NotNull
    protected final TFight rBo;

    protected ewn_1(@NotNull TFight TFight) {
        this.rBo = TFight;
    }

    @NotNull
    protected TI a(TF tF) {
        return new TJ(tF);
    }

    @NotNull
    protected TF a(ewt_2 ewt_22) {
        return new ewo_1((eub_0)this.rBo, ewt_22);
    }

    @NotNull
    protected ewt_2 fNR() {
        return new ewr_2((euc_0)this.rBo);
    }

    @NotNull
    protected ewm_1 fNS() {
        return new ewn_2();
    }

    @NotNull
    public TTimeline fNT() {
        TTimeline TTimeline = this.dIK();
        ((TA)TTimeline).eo(Objects.requireNonNullElseGet(((eub_0)this.rBo).dGo().fKO(), () -> ewo_0.oBF.j(ewr_0.oDS)));
        ((TA)TTimeline).ep(Objects.requireNonNullElseGet(((eub_0)this.rBo).dGo().fKP(), () -> ewo_0.oBF.j(ewr_0.oDU)));
        ((TA)TTimeline).eq(Objects.requireNonNullElseGet(((eub_0)this.rBo).dGo().fKQ(), () -> ewo_0.oBF.j(ewr_0.oDV)));
        ((TA)TTimeline).er(Objects.requireNonNullElseGet(((eub_0)this.rBo).dGo().fKS(), () -> ewo_0.oBF.j(ewr_0.oDW)));
        ((TA)TTimeline).es(Objects.requireNonNullElseGet(((eub_0)this.rBo).dGo().fKR(), () -> ewo_0.oBF.j(ewr_0.oDT)));
        return TTimeline;
    }

    @NotNull
    protected abstract TTimeline dIK();
}

