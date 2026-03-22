/*
 * Decompiled with CFR 0.152.
 */
public class bfN
extends bYQ {
    private static final bfN hVY = new bfN();
    private boolean bVZ = true;

    private bfN() {
        super(10, 5, "tutorialMessageDialog");
    }

    public static bfN dhv() {
        return hVY;
    }

    @Override
    public void fm(long l) {
        this.a(l, ue_0.bjV().bjc());
    }

    public void a(long l, ux_0 ux_02) {
        uz_0 uz_02 = ux_02.l(ue_0.bjV().bjc());
        uz_0 uz_03 = uz_0.fo(l);
        uz_03.h(uz_02);
        if (!uz_03.aYI()) {
            return;
        }
        super.fm((int)uz_03.bjS());
        this.bVZ = false;
    }

    @Override
    public void bhk() {
        this.bVZ = true;
        super.bhk();
        this.clean();
    }

    @Override
    protected void fY(long l) {
        if (this.epz() == l) {
            return;
        }
        super.fY(l);
        if (!this.bVZ && l >= 1L && l <= 5L) {
            cAY.eHc().nP(600128L);
        }
        if (l == 0L) {
            if (!this.bVZ) {
                cAY.eHc().nP(600129L);
            }
            this.clean();
        }
    }

    @Override
    protected String dhw() {
        long l = this.epz();
        long l2 = l / 3600L;
        long l3 = (l %= 3600L) / 60L;
        long l4 = l %= 60L;
        return aum_0.cWf().c("durationFormat.yearMonthDayHourMinuteSecond.short", 0, 0, 0, l2, l3, l4);
    }

    private void clean() {
    }
}

