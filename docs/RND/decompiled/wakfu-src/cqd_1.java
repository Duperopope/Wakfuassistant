/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

/*
 * Renamed from cQD
 */
public class cqd_1
extends cqf_1 {
    private final EnumSet<cqe_2> nlm = EnumSet.noneOf(cqe_2.class);

    @Override
    protected rw_0 eLF() {
        return rw_0.bkV;
    }

    @Override
    public boolean isEnabled() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return false;
        }
        if (bgt_02.Xt() != bgt_02.dlo()) {
            this.nlm.add(cqe_2.nln);
            return false;
        }
        return super.isEnabled();
    }

    @Override
    public String getLabel() {
        String string = super.getLabel();
        ahv_2 ahv_22 = new ahv_2().c(string);
        if (this.nlm.contains((Object)cqe_2.nln)) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            int n = bgt_02.dlo();
            String string2 = aum_0.cWf().a(39, (long)n, new Object[0]);
            ahv_22.ceH().ih(nim).c(aum_0.cWf().c("critere.getNationId", string2, n)).ceD();
        }
        return ahv_22.ceL();
    }

    @Override
    public String ely() {
        return "desc.mru.lookAt";
    }

    @Override
    protected int eLB() {
        return crc_2.nmA.nnW;
    }

    @Override
    public cpm_1 eLD() {
        return new cqd_1();
    }
}

