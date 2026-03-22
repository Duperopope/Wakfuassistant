/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from cQo
 */
public class cqo_2
extends crq_1 {
    public cqo_2 eMe() {
        return new cqo_2();
    }

    @Override
    public boolean isEnabled() {
        boolean bl = super.isEnabled();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bvi_0 bvi_02 = bgt_02.dnQ();
        if (!bvi_02.dfG()) {
            return bl && this.niu.isEmpty();
        }
        if (bvi_02.dKM()) {
            return bl && this.niu.isEmpty();
        }
        Optional<eMW> optional = bvo_0.jvG.FP(this.nmh.bdL());
        if (optional.isEmpty()) {
            this.niu.add(4);
        }
        return bl && this.niu.isEmpty();
    }

    @Override
    protected void a(rw_0 rw_02, RG rG, ni_1 ni_12) {
        if (aue_0.cVJ().c(cyo_2.eXQ())) {
            return;
        }
        if (aue_0.cVJ().cVO().bfb()) {
            bYU.epD();
            return;
        }
        short s = this.nmh.bdL();
        Optional<eIb> optional = eId.quO.pC(s);
        if (optional.isEmpty()) {
            nii.error((Object)("[DUNGEON] No dungeon information found for worldId " + s));
            return;
        }
        eIb eIb2 = optional.get();
        int n = eIb2.d();
        if (eMQ.RD(n)) {
            fdg_0 fdg_02 = new fdg_0(this.nmh);
            ((bCd)ni_12).a((RG)bvz_0.dLl(), fdg_02);
            return;
        }
        if (eIb2.cmT()) {
            cyo_2.eXQ().a(ni_12, this.nmh);
            return;
        }
        fdg_0 fdg_03 = new fdg_0(this.nmh);
        ((bCd)ni_12).a((RG)bvz_0.dLl(), fdg_03);
    }

    @Override
    public /* synthetic */ cpr_1 eLH() {
        return this.eMe();
    }

    @Override
    public /* synthetic */ cpm_1 eLD() {
        return this.eMe();
    }
}

