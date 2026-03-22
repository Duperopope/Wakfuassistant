/*
 * Decompiled with CFR 0.152.
 */
public class aWB
extends aUV {
    private static final int hvn = 5000;
    private final long hvo;
    private final acd_1 hvp;
    private final String hvq;
    private final String hvr;

    public aWB(int n, int n2, int n3, int n4, long l, acd_1 acd_12) {
        super(n, n2, n3, n4);
        this.hvo = l;
        this.hvp = acd_12;
        this.hvq = "AnimMouvementTeleport-Debut";
        this.hvr = "AnimMouvementTeleport-Fin";
    }

    public aWB(int n, int n2, int n3, int n4, long l, acd_1 acd_12, String string, String string2) {
        super(n, n2, n3, n4);
        this.hvo = l;
        this.hvp = acd_12;
        this.hvq = string;
        this.hvr = string2;
    }

    @Override
    protected long cbk() {
        bgy bgy2 = this.iD(this.hvo);
        if (bgy2 == null) {
            dJP.warn((Object)("[Fight] Reception d'un message de teleportpour un fighter inconnu du client, qui devrait pourtant etre dans son combat.  FightID = " + this.bha() + ", FighterID = " + this.hvo));
            return 0L;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        if (bdj_22.dZ(this.hvq)) {
            bdj_22.a(new awc_0(this, bgy2));
            bdj_22.dT(this.hvq);
            this.a(bdj_22);
        } else {
            this.S(bgy2);
        }
        int n = Math.min(Math.abs(bdj_22.dY(this.hvq) + bdj_22.dY(this.hvr)), 5000);
        return n;
    }

    protected void a(bdj_2 bdj_22) {
    }

    void S(bgy bgy2) {
        bgy2.b(this.hvp.getX(), this.hvp.getY(), this.hvp.bdi());
        bdj_2 bdj_22 = bgy2.ddI();
        if (bdj_22.dZ(this.hvr)) {
            bdj_22.dT(this.hvr);
            this.T(bgy2);
        }
    }

    protected void T(bgy bgy2) {
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

