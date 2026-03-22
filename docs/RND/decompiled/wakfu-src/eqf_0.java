/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eQf
 */
public final class eqf_0
extends eOa {
    private static final aox_1 rfe = new enz_0(new eny_0("Facteurs sur le nombre de cibles", new enx_0("Niveau par cible", eNA.qYD)));

    @Override
    public aox_1 bEt() {
        return rfe;
    }

    public eqf_0() {
        this.bby();
    }

    public eqf_0 fFl() {
        return new eqf_0();
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        float f2 = ((enk_0)this.bgC).x(0, this.fHf());
        List<qu_0> list = this.a((enk_0)this.bgC, (anu_1)this.bgE, (qm_0<enk_0>)this.bgJ, this.bgG.getX(), this.bgG.getY(), this.bgG.bdi());
        int n = list.size();
        this.aQL = (int)Math.floor((float)n * f2);
    }

    @Override
    @NotNull
    protected enq_0 g(ero_0 ero_02) {
        enq_0 enq_02 = enq_0.a(false, false, ero_02);
        enq_02.RT(this.aQL);
        return enq_02;
    }

    @Override
    public void aVH() {
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFl();
    }
}

