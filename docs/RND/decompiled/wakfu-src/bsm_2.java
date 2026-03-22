/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteLongIterator
 */
import gnu.trove.iterator.TByteLongIterator;
import java.text.NumberFormat;

/*
 * Renamed from bSm
 */
class bsm_2
implements aeh_2 {
    public static final String lfs = "nationalFunds";
    public static final String lft = "collectedTaxes";
    public static final String lfu = "totalCost";
    public static final String lfv = "challengeCost";
    public static final String lfw = "climateCost";
    private final fna_0 lfx;

    public bsm_2(fna_0 fna_02) {
        this.lfx = fna_02;
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lfs)) {
            return NumberFormat.getIntegerInstance().format(this.lfx.eCG()) + " \u00a7";
        }
        if (string.equals(lft)) {
            long l = 0L;
            TByteLongIterator tByteLongIterator = this.lfx.gdO().iterator();
            while (tByteLongIterator.hasNext()) {
                tByteLongIterator.advance();
                l += tByteLongIterator.value();
            }
            if (l < 0L) {
                l = Integer.MAX_VALUE;
            }
            return NumberFormat.getIntegerInstance().format(l) + " \u00a7";
        }
        if (string.equals(lfu)) {
            long l = 0L;
            TByteLongIterator tByteLongIterator = this.lfx.gdN().iterator();
            while (tByteLongIterator.hasNext()) {
                tByteLongIterator.advance();
                l += tByteLongIterator.value();
            }
            if (l < 0L) {
                l = Integer.MAX_VALUE;
            }
            return NumberFormat.getIntegerInstance().format(l) + " \u00a7";
        }
        if (string.equals(lfv)) {
            long l = this.lfx.gdN().get(foZ.sNi.aZv());
            return NumberFormat.getIntegerInstance().format(l) + " \u00a7";
        }
        if (string.equals(lfw)) {
            long l = this.lfx.gdN().get(foZ.sNj.aZv());
            return NumberFormat.getIntegerInstance().format(l) + " \u00a7";
        }
        return null;
    }
}

