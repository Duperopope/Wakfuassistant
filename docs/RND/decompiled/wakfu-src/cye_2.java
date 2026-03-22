/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYe
 */
class cye_2
implements Runnable {
    final /* synthetic */ cya_2 nXI;

    cye_2(cya_2 cya_22) {
        this.nXI = cya_22;
    }

    @Override
    public void run() {
        this.nXI.nQc.setX(faa_2.tLO.cf(this.nXI.nQc.getWidth(), fbj_1.getInstance().getWidth()));
        this.nXI.nQc.x(fsb_2.class);
        this.nXI.nQc.a(new fsb_2(this.nXI.nQc.getX(), this.nXI.nQc.getY(), this.nXI.nQc.getX(), fbj_1.getInstance().getHeight() - this.nXI.nQc.getHeight() - 50, this.nXI.nQc, 0, 1000, abn.cdr));
        this.nXI.nQc.setVisible(true);
    }
}

