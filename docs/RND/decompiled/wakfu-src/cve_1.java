/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVE
 */
class cve_1
implements Runnable {
    final /* synthetic */ cva_2 nQh;

    cve_1(cva_2 cva_22) {
        this.nQh = cva_22;
    }

    @Override
    public void run() {
        this.nQh.nQc.setX(faa_2.tLO.cf(this.nQh.nQc.getWidth(), fbj_1.getInstance().getWidth()));
        this.nQh.nQc.x(fsb_2.class);
        this.nQh.nQc.a(new fsb_2(this.nQh.nQc.getX(), this.nQh.nQc.getY(), this.nQh.nQc.getX(), fbj_1.getInstance().getHeight() - this.nQh.nQc.getHeight() - 50, this.nQh.nQc, 0, 1000, abn.cdr));
        this.nQh.nQc.setVisible(true);
    }
}

