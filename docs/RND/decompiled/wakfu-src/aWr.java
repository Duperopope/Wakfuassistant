/*
 * Decompiled with CFR 0.152.
 */
public final class aWr
extends aUV {
    private final long huH;
    private final acd_1 huI;

    public aWr(int n, int n2, int n3, int n4, long l, acd_1 acd_12) {
        super(n, n2, n3, n4);
        this.huH = l;
        this.huI = acd_12;
    }

    @Override
    protected long cbk() {
        bgy bgy2 = this.iD(this.huH);
        if (bgy2 == null) {
            dJP.warn((Object)("[Fight] Reception d'un message de synchronisation de position pour un fighter inconnu du client, qui devrait pourtant etre dans son combat.  FightID = " + this.bha() + ", FighterID = " + this.huH));
            return 0L;
        }
        dJP.info((Object)("Resynchronisation de la position d'un fighter dans notre combat.  FightID = " + this.bha() + ", FighterID = " + this.huH + " \u00e0 la position " + String.valueOf(this.huI)));
        bgy2.b(this.huI);
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

