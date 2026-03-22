/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;
import java.util.Optional;

/*
 * Renamed from cQm
 */
public class cqm_1
extends cqf_1 {
    private final EnumSet<cqn_1> nkP = EnumSet.noneOf(cqn_1.class);

    @Override
    protected void a(rw_0 rw_02, RG rG, ni_1 ni_12) {
        if (!aue_0.cVJ().c(css_1.eOc())) {
            css_1.eOc().a((bxu)ni_12);
        }
    }

    @Override
    public boolean isEnabled() {
        Optional<fpv> optional;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.Xt() < 1) {
            this.nkP.add(cqn_1.nkQ);
        }
        if (bgt_02.dnQ().dKL() != null && !bgt_02.dnQ().dKL().pP(bgt_02.Xi()).isEmpty()) {
            this.nkP.add(cqn_1.nkT);
        }
        if ((optional = cux_0.mjE.eDF()).isEmpty()) {
            this.nkP.add(cqn_1.nkR);
            return false;
        }
        fpv fpv2 = optional.get();
        Optional<fpt> optional2 = fpu.sOH.FP(fpv2.att());
        if (optional2.isEmpty()) {
            this.nkP.add(cqn_1.nkR);
            return false;
        }
        if (bgt_02.dnU() == null || bgt_02.dnU().d() != optional2.get().clk()) {
            this.nkP.add(cqn_1.nkR);
            return false;
        }
        for (long l : fcL.rUh.sx(bgt_02.Xi())) {
            bgt_0 bgt_03 = (bgt_0)fcL.rUh.sw(l);
            if (bgt_03 == null) continue;
            if (bgt_03.cmL() < fpv2.ggH().ggS()) {
                this.nkP.add(cqn_1.nkS);
                return false;
            }
            if (bgt_03.Xt() >= 1) continue;
            this.nkP.add(cqn_1.nkQ);
            return false;
        }
        bxu bxu2 = (bxu)this.cqO;
        fpx_0 fpx_02 = bxu2.dNA();
        if (!fpx_02.apo()) {
            this.nkP.add(cqn_1.nkR);
            return false;
        }
        return this.nkP.isEmpty() && super.isEnabled();
    }

    @Override
    public String ely() {
        return "mru.battleground.enter";
    }

    @Override
    public String getLabel() {
        ahv_2 ahv_22 = new ahv_2();
        String string = this.eMp();
        ahv_22.c(aum_0.cWf().a(66, (long)aue_0.cVJ().cVK().dnU().d(), new Object[0]));
        Optional<fpv> optional = cux_0.mjE.eDF();
        if (optional.isPresent()) {
            fpv fpv2 = optional.get();
            ahv_22.c(" (");
            ahv_22.ih(this.nkP.contains((Object)cqn_1.nkS) ? nim : nil);
            ahv_22.c(aum_0.cWf().c("stasis.dungeon.level.range", fpv2.ggH().ggS(), fpv2.ggH().ggT())).ceD().k(')');
        }
        if (ahv_22.bXe() > 0) {
            ahv_22.ceH();
        }
        ahv_22.c(string);
        if (this.nkP.contains((Object)cqn_1.nkQ)) {
            ahv_22.ceH().ih(nim).c(aum_0.cWf().c("battleground.error.nation", new Object[0])).ceD();
        }
        if (this.nkP.contains((Object)cqn_1.nkT)) {
            ahv_22.ceH().ih(nim).c(aum_0.cWf().c("battleground.error.companions", new Object[0])).ceD();
        }
        if (this.nkP.contains((Object)cqn_1.nkS)) {
            ahv_22.ceH().ih(nim).c(aum_0.cWf().c("battleground.error.level", new Object[0])).ceD();
        }
        if (this.nkP.contains((Object)cqn_1.nkR)) {
            ahv_22.ceH().ih(nim).c(aum_0.cWf().c("battleground.error.active", new Object[0])).ceD();
        }
        return ahv_22.ceL();
    }

    @Override
    public cpm_1 eLD() {
        return new cqm_1();
    }
}

