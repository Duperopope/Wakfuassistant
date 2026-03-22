/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVA
 */
class eva_0
extends eVw {
    private final Long rAp;

    eva_0(exP exP2) {
        super((byte)0, false, false, 0L);
        this.rAp = exP2 == null ? null : Long.valueOf(exP2.Sn());
    }

    @Override
    public boolean baH() {
        return false;
    }

    @Override
    public boolean baI() {
        return false;
    }

    @Override
    public byte bcP() {
        return -1;
    }

    @Override
    public boolean fNj() {
        return false;
    }

    @Override
    public boolean fNk() {
        return false;
    }

    @Override
    public void mK(boolean bl) {
        rAh.error((Object)String.format("[FIGHT] setTeamLeader sur un fighter absent %d - %s", this.rAp, adu_1.xg(10)));
    }

    @Override
    public long dOo() {
        return 0L;
    }

    @Override
    public Long fNl() {
        return null;
    }

    @Override
    public void a(Long l, byte by) {
        rAh.error((Object)String.format("[FIGHT] setCurrentControllerId sur un fighter absent %d - %s", this.rAp, adu_1.xg(10)));
    }

    @Override
    boolean a(evv_0 evv_02) {
        rAh.error((Object)String.format("[FIGHT] setPlayState sur un fighter absent %d - %s", this.rAp, adu_1.xg(10)));
        return false;
    }

    @Override
    public boolean qZ(long l) {
        return false;
    }

    @Override
    public boolean ra(long l) {
        return false;
    }
}

