/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDR
 */
class fdr_1
implements Runnable {
    final /* synthetic */ fdq_2 uiB;

    fdr_1(fdq_2 fdq_22) {
        this.uiB = fdq_22;
    }

    @Override
    public void run() {
        if (!this.uiB.uiA.isVisible()) {
            return;
        }
        String string = this.uiB.uix + "\n" + this.uiB.uiz;
        this.uiB.uiA.uit.setText(string);
        this.uiB.uiA.uis.b(this.uiB.uiy);
    }
}

