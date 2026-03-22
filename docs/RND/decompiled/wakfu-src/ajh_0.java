/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aJh
 */
public class ajh_0
implements aex {
    private static final int eag = 3;
    private final aji_0 eah;
    private final ajj_0 eai;

    public ajh_0(ajf_0 ajf_02) {
        this.eah = new aji_0(ajf_02);
        this.eai = new ajj_0(ajf_02);
    }

    @Override
    public aed_0 c(adx_0 adx_02, int n) {
        if (adx_02.bvN()) {
            return this.eai;
        }
        return n < adx_02.bvM() ? this.eai : this.eah;
    }

    @Override
    public aed_0 bws() {
        return this.eai;
    }

    @Override
    public aed_0 bwt() {
        return this.eah;
    }

    @Override
    public void i(adx_0 adx_02) {
    }

    @Override
    public void j(adx_0 adx_02) {
    }

    public String toString() {
        return "MountMovementSelector{, m_mountRunMovementStyle=" + String.valueOf(this.eah) + ", m_mountWalkMovementStyle=" + String.valueOf(this.eai) + "}";
    }
}

