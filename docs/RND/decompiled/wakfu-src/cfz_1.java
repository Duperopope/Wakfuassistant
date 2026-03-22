/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.display.AlphaMaskCommand;

/*
 * Renamed from cFZ
 */
class cfz_1
implements cgz_1 {
    final /* synthetic */ bsn_1 mXF;
    final /* synthetic */ boolean mXG;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cfz_1(bsn_1 bsn_12, boolean bl) {
        this.mXF = bsn_12;
        this.mXG = bl;
    }

    @Override
    public void eKD() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mXF, this.mXG);
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), this.mXF.getKey());
    }

    @Override
    public void cancel() {
        boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(this.mXF);
        AlphaMaskCommand.eT(bl);
    }
}

