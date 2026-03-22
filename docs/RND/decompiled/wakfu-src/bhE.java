/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

final class bhE
extends eyj_0 {
    private final pn_2 ihc;
    final /* synthetic */ bhx_0 ihd;

    bhE(bhx_0 bhx_02, pn_2 pn_22) {
        this.ihd = bhx_02;
        this.ihc = pn_22;
        this.ihc.DM().a(this);
    }

    @Override
    public void zl() {
        bhx_0.aGR().error((Object)"Le client ne devrait pas s\u00e9rialiser le chemin courant du NPC");
    }

    @Override
    public void zm() {
        ByteBuffer byteBuffer;
        abj_2 abj_22;
        if (this.ihc.SC != null && (abj_22 = abj_2.eV(byteBuffer = ByteBuffer.wrap(this.ihc.SC.SH))) != null) {
            this.ihd.ddI().b(abj_22);
        }
    }
}

