/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fil
 */
public class fil_0 {
    private final fiq_0 srH;

    public fil_0(fiq_0 fiq_02) {
        this.srH = fiq_02;
    }

    public void ij(long l) {
        if (!this.srH.pe()) {
            throw new fio_0("pas d'xp sur l'item");
        }
        fir_0 fir_02 = (fir_0)this.srH.fVV();
        fir_02.ij(l);
    }

    public fiq_0 fZH() {
        return this.srH;
    }

    public String toString() {
        return "ItemXpController{m_xpHolder=" + String.valueOf(this.srH) + "}";
    }
}

