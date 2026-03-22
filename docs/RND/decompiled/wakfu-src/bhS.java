/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

final class bhS
extends eyj_0 {
    private final pn_2 ijz;
    final /* synthetic */ bhJ ijA;

    bhS(bhJ bhJ2, pn_2 pn_22) {
        this.ijA = bhJ2;
        this.ijz = pn_22;
        this.ijz.DM().a(this);
    }

    @Override
    public void zl() {
        bhJ.dog().error((Object)"Le chemin en cours ne devrait pas \u00e9tre envoy\u00e9 par le client");
    }

    @Override
    public void zm() {
        ByteBuffer byteBuffer;
        abj_2 abj_22;
        this.ijA.gj(this.ijz.SD);
        this.ijA.gh(this.ijz.SD);
        if (this.ijz.SC != null && (abj_22 = abj_2.eV(byteBuffer = ByteBuffer.wrap(this.ijz.SC.SH))) != null && this.ijA.ddI() != null) {
            this.ijA.ddI().b(abj_22);
        }
    }
}

