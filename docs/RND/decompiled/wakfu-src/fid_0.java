/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fiD
 */
public class fid_0
implements fif_0 {
    private final int ssw;
    private final int ssx;
    private final int ssy;
    private final ua_0 ssz;
    private final ux_0 ssA;
    private ux_0 ssl;
    private ux_0 mhT = uw_0.bju();
    private ux_0 ssB = uw_0.bju();
    private int mhU;
    private final boolean ssC;

    public fid_0(fie_0 fie_02) {
        this.ssw = fie_02.d();
        this.ssx = fie_02.fZN();
        this.ssy = fie_02.cqm();
        this.ssz = fie_02.fZO();
        this.ssA = fie_02.fZP();
        this.ssl = fie_02.fZQ();
        this.ssC = fie_02.fZR();
    }

    @Override
    public ux_0 eBR() {
        return this.mhT;
    }

    public void W(ux_0 ux_02) {
        this.mhT = ux_02;
    }

    public void X(ux_0 ux_02) {
        this.ssl = ux_02;
    }

    @Override
    public ux_0 fZU() {
        return this.ssB;
    }

    public void VX(int n) {
        this.mhU = n;
    }

    public void Y(ux_0 ux_02) {
        this.ssB = ux_02;
    }

    public void fZV() {
        ++this.mhU;
    }

    public void fZW() {
        this.mhU = 0;
    }

    @Override
    public int eBS() {
        return this.mhU;
    }

    @Override
    public int cqm() {
        return this.ssy;
    }

    @Override
    public int d() {
        return this.ssw;
    }

    @Override
    public int fZN() {
        return this.ssx;
    }

    @Override
    public ux_0 fZP() {
        return this.ssA;
    }

    @Override
    public ua_0 fZO() {
        return this.ssz;
    }

    @Override
    public ux_0 fZQ() {
        return this.ssl;
    }

    @Override
    public boolean fZR() {
        return this.ssC;
    }

    public String toString() {
        return "LockData{m_lockId=" + this.ssw + ", m_lockedItem=" + this.ssx + ", m_lockValue=" + this.ssy + ", m_periodDuration=" + String.valueOf(this.ssz) + ", m_periodStartTime=" + String.valueOf(this.ssA) + ", m_unlockDate=" + String.valueOf(this.ssl) + ", m_lockDate=" + String.valueOf(this.mhT) + ", m_currentLockValueDate=" + String.valueOf(this.ssB) + ", m_currentLockValue=" + this.mhU + ", m_availableToCitizensOnly=" + this.ssC + "}";
    }
}

