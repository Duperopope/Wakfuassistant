/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.debug.FlyingImageCommand;
import java.util.HashSet;

public class aTR
implements Runnable {
    public aTR(FlyingImageCommand flyingImageCommand) {
    }

    @Override
    public void run() {
        fes_2 fes_22 = (fes_2)fyw_0.gqw().gqC().uR("minimapDialog").uH("window");
        if (fes_22 == null) {
            return;
        }
        bdj_2 bdj_22 = aue_0.cVJ().cVK().ddI();
        xr_0 xr_02 = new xr_0(aie_0.cfn().bmC(), new fsr_1(fes_22));
        afh_0 afh_02 = afh_0.bxU();
        xo_0 xo_02 = new xo_0(auc_0.cVq().a("challengeFlyingImagePath", "defaultIconPath", "challengeProposal"), 32, 32, (xu_0)xr_02, 2000);
        xo_02.a(bdj_22);
        HashSet<xa_0> hashSet = xd_0.bnv().b(bdj_22);
        xo_02.qC((hashSet != null ? hashSet.size() : 0) * 600);
        xd_0.bnv().a(xo_02);
    }
}

