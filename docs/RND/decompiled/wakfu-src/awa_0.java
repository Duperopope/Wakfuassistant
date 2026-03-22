/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWA
 */
public final class awa_0
extends aUV {
    private final long hvl;
    private final acd_1 hvm;

    public awa_0(int n, int n2, int n3, int n4, long l, acd_1 acd_12) {
        super(n, n2, n3, n4);
        this.hvl = l;
        this.hvm = acd_12;
    }

    @Override
    protected long cbk() {
        bgy bgy2 = this.iD(this.hvl);
        if (bgy2 == null) {
            dJP.warn((Object)("[Fight] Reception d'un message de teleportpour un fighter inconnu du client, qui devrait pourtant etre dans son combat.  FightID = " + this.bha() + ", FighterID = " + this.hvl));
            return 0L;
        }
        bgy2.b(this.hvm.getX(), this.hvm.getY(), this.hvm.bdi());
        return 0L;
    }

    @Override
    protected void caV() {
        bgy bgy2;
        bsS bsS2 = this.cja();
        if (bsS2 instanceof bsj_0 && (bgy2 = ((bsj_0)bsS2).dGQ().dIA()) != null && bgy2.dkQ()) {
            cue_2.eSA().eSF();
            cue_2.eSA().eSE();
        }
        super.caV();
    }
}

