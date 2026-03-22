/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.display.ShowNameAndHighlightElementsCommand;

/*
 * Renamed from cGo
 */
class cgo_2
implements cgz_1 {
    final /* synthetic */ bsn_1 mYi;
    final /* synthetic */ bsb_1 mYj;
    final /* synthetic */ bsb_1 mYk;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cgo_2(bsn_1 bsn_12, bsb_1 bsb_12, bsb_1 bsb_13) {
        this.mYi = bsn_12;
        this.mYj = bsb_12;
        this.mYk = bsb_13;
    }

    @Override
    public void eKD() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mYi, this.mYj.d());
        if (ShowNameAndHighlightElementsCommand.apo()) {
            cxq_1.eWO().eWT();
        }
        aPt.cAg().cAz();
        aPw aPw2 = apd_0.cAO().cAQ();
        for (apc_0 aeh_22 : aPw2) {
            fse_1.gFu().a((aef_2)aeh_22, "characterNameWithLanguages");
        }
        for (bvj bvj2 : bvk.dJZ().dKo()) {
            fse_1.gFu().a((aef_2)bvj2, "name");
        }
    }

    @Override
    public void cancel() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mYi, this.mYk.d());
    }
}

