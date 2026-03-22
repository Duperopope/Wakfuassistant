/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from bBp
 */
public class bbp_1
extends bCA {
    private fdI jGc;

    @Override
    public void dNq() {
        this.jGc = (fdI)fda_0.rWI.a(fdv_0.rZw, Integer.parseInt(this.baB));
    }

    @Override
    public rw_0[] dNf() {
        return (rw_0[])this.jGc.fTS().toArray(rw_0[]::new);
    }

    @Override
    protected rw_0 dNn() {
        return rw_0.bkR;
    }

    @Override
    public cpm_1[] dNh() {
        bgt_0 bgt_02 = aie_0.cfo().cVK();
        return (cpm_1[])this.jGc.fTT().entrySet().stream().filter(entry -> ((fdJ)entry.getValue()).fTV().map(ang_22 -> ang_22.b(bgt_02, null, null, bgt_02.bdV())).orElse(true)).map(entry -> {
            boolean bl;
            cra_2 cra_22 = (cra_2)cps_1.njT.eLI();
            cra_22.f((rw_0)entry.getKey());
            cra_22.a((fdJ)entry.getValue());
            boolean bl2 = ((fdJ)entry.getValue()).fTW().map(ang_22 -> ang_22.b(bgt_02, null, null, bgt_02.bdV())).orElse(true);
            ftj_0 ftj_02 = ((fdJ)entry.getValue()).fTU();
            if (ftj_02.glQ().isPresent()) {
                int n = ftj_02.glQ().get();
                Optional<feb_0> optional = evx_2.feo().b(aie_0.cfo().cVO().xl(), eva_1.owu);
                bl = optional.map(feb_02 -> feb_02.fUd().containsKey(n)).orElse(false);
            } else {
                bl = true;
            }
            cra_22.setEnabled(bl2 && bl);
            return cra_22;
        }).toArray(cpm_1[]::new);
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        Optional<fdJ> optional = this.jGc.g(rw_02);
        if (optional.isEmpty()) {
            return false;
        }
        this.c(rw_02);
        return true;
    }

    @Override
    public void aZp() {
        this.aVH();
    }
}

