/*
 * Decompiled with CFR 0.152.
 */
final class bhf
extends eyj_0 {
    private final qq_2 ifQ;
    final /* synthetic */ bgt_0 ifR;

    bhf(bgt_0 bgt_02, qq_2 qq_22) {
        this.ifR = bgt_02;
        this.ifQ = qq_22;
        this.ifQ.DM().a(this);
    }

    @Override
    public void zl() {
        bgt_0.aGR().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void zm() {
        this.ifR.ieT.b(this.ifQ.UF);
    }

    public String toString() {
        return "LocalPlayerCharacterPartInventories{m_part=" + String.valueOf(this.ifQ) + "} ";
    }
}

