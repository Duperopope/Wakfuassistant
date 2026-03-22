/*
 * Decompiled with CFR 0.152.
 */
class few
implements Runnable {
    final /* synthetic */ feu sel;

    few(feu feu2) {
        this.sel = feu2;
    }

    @Override
    public void run() {
        this.sel.sed.scrollRectToVisible(this.sel.sed.getCellRect(this.sel.sed.getRowCount() - 1, 0, false));
        this.sel.sed.repaint();
    }
}

