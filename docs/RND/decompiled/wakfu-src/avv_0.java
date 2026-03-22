/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVV
 */
public class avv_0
extends aft_2 {
    private final Runnable htK;

    public avv_0(Runnable runnable) {
        super(0, 0, 0);
        this.htK = runnable;
    }

    @Override
    public void run() {
        this.htK.run();
        this.caT();
    }

    @Override
    protected void caV() {
    }
}

