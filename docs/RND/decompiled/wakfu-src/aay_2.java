/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAY
 */
class aay_2
extends Thread {
    protected boolean btq;

    aay_2(Runnable runnable, String string) {
        super(runnable, string);
    }

    public boolean bhl() {
        return this.btq;
    }

    public void cL(boolean bl) {
        this.btq = bl;
    }

    @Override
    public String toString() {
        return "WorkerThread{m_running=" + this.btq + "}";
    }
}

