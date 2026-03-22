/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.display.DisplayHpBarCommand;

/*
 * Renamed from cGa
 */
class cga_2
implements cgz_1 {
    final /* synthetic */ bsa_1 mXH;
    final /* synthetic */ bsn_1 mXI;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cga_2(bsa_1 bsa_12, bsn_1 bsn_12) {
        this.mXH = bsa_12;
        this.mXI = bsn_12;
    }

    @Override
    public void eKD() {
        DisplayHpBarCommand.aW(this.mXH.emS());
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mXI, this.mXH.emS());
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), this.mXI.getKey());
    }

    @Override
    public void cancel() {
    }
}

