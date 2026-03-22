/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.display.ShowNameAndHighlightElementsCommand;

final class bih
extends eyj_0 {
    private final rh_1 ike;
    final /* synthetic */ bhJ ikf;

    bih(bhJ bhJ2, rh_1 rh_12) {
        this.ikf = bhJ2;
        this.ike = rh_12;
        this.ike.DM().a(this);
    }

    @Override
    public void zl() {
        throw new UnsupportedOperationException("Les informations de compte de sont pas s\u00e9rialis\u00e9s par le client");
    }

    @Override
    public void zm() {
        Object object;
        this.ikf.iiY.a(evt_1.Oq(this.ike.QV));
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (this.ikf == bgt_02 && (object = aue_0.cVJ().cVO()) != null) {
            ((euv_1)object).Ok(this.ike.QV);
        }
        this.ikf.iiY.fdO().clear();
        if (this.ike.Ra != null) {
            for (int i = 0; i < this.ike.Ra.length; ++i) {
                this.ikf.iiY.c(evv_1.Or(this.ike.Ra[i]));
            }
        }
        this.ikf.iiZ = this.ike.Xk;
        this.ikf.iiY.fdE().a(new eup_1(euq_1.orT, this.ike.Xl));
        object = this.ikf.ffF();
        object.c(fpu_0.YK(this.ike.VK));
        object.ix(this.ike.Xm);
        this.ikf.iiY.et(this.ike.Re);
        this.ikf.iiY.b(vb_0.pS(this.ike.Rf));
        if (ShowNameAndHighlightElementsCommand.apo()) {
            cxq_1.eWO().cg(this.ikf);
        }
    }
}

