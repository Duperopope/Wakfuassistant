/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTm
 */
class ctm_2
implements ahz_2 {
    private final Runnable nIF;

    ctm_2(Runnable runnable) {
        this.nIF = runnable;
    }

    @Override
    public void ceR() {
    }

    @Override
    public void ceP() {
        this.nIF.run();
    }

    @Override
    public void ceQ() {
        this.nIF.run();
    }

    @Override
    public void ej(float f2) {
    }

    public String toString() {
        return "VideoStopOrEndCallback{m_callback=" + String.valueOf(this.nIF) + "}";
    }
}

