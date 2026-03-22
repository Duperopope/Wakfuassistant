/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTA
 */
final class cta_2
implements aeh_2,
Runnable {
    private long nJx = 120000L;
    private final long nJy = 1000L;
    public static final long nJz = 120000L;
    public static final String nJA = "remainingTimeField";
    public final String[] nJB = new String[]{"remainingTimeField"};

    public void start() {
        abg_2.bUP().a((Runnable)this, 1000L, -1);
    }

    public void bhk() {
        fyw_0.gqw().tl("sessionTimerDialog");
        abg_2.bUP().h(this);
    }

    @Override
    public void run() {
        if (this.nJx <= 0L) {
            return;
        }
        this.nJx -= 1000L;
        fbv_2 fbv_22 = (fbv_2)fyw_0.gqw().gqC().uR("sessionTimerDialog").uH("text");
        if (this.nJx <= 30000L) {
            fbv_22.setColor(awx_2.dnJ, "text");
        } else if (this.nJx <= 60000L) {
            fbv_22.setColor(new awx_2(1.0f, 0.5f, 0.0f, 1.0f), "text");
        }
        fse_1.gFu().a((aef_2)this, nJA);
    }

    @Override
    public String[] bxk() {
        return this.nJB;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(nJA)) {
            return this.nJx > 0L ? this.on(this.nJx / 1000L) : null;
        }
        return null;
    }

    private String on(long l) {
        long l2 = l / 60L;
        if (l2 > 0L) {
            long l3 = l - 60L * l2;
            return String.format("%d:%s", l2, l3 > 9L ? Long.valueOf(l3) : "0" + l3);
        }
        return String.valueOf(l > 9L ? Long.valueOf(l) : "0" + l);
    }
}

