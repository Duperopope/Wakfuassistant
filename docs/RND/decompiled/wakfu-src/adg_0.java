/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from adg
 */
public class adg_0 {
    private static final Logger ciC = Logger.getLogger(adg_0.class);
    private final TIntObjectHashMap<adc_0> ciD = new TIntObjectHashMap();
    private long brw;
    private String aCH;
    private static final adg_0 ciE = new adg_0();

    public static adg_0 bup() {
        return ciE;
    }

    private adg_0() {
    }

    public String aLM() {
        return this.aCH;
    }

    public void en(String string) {
        this.aCH = string;
    }

    public void fy(long l) {
        this.brw = l;
    }

    public void buq() {
        this.clear();
        if (this.aCH == null) {
            return;
        }
        String string = String.format(this.aCH, this.brw);
        try {
            apl_1 apl_12 = apl_1.dw(fo_0.by(string));
            this.a(apl_12);
            apl_12.close();
        }
        catch (IOException iOException) {
            ciC.error((Object)("Error while loading AmbianceZone file : " + this.aCH + " (world " + this.brw + ") : " + string), (Throwable)iOException);
        }
    }

    public void a(@NotNull apl_1 apl_12) {
        int n = apl_12.aIA();
        this.ciD.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            adc_0 adc_02 = new adc_0();
            adc_02.e(apl_12);
            assert (!this.ciD.contains(adc_02.cis));
            this.ciD.put(adc_02.cis, (Object)adc_02);
        }
    }

    public void b(@NotNull fs_0 fs_02) {
        TIntObjectIterator tIntObjectIterator = this.ciD.iterator();
        fs_02.mz(this.ciD.size());
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((adc_0)tIntObjectIterator.value()).f(fs_02);
        }
    }

    public final void a(adc_0 adc_02) {
        assert (!this.ciD.contains(adc_02.cis));
        this.ciD.put(adc_02.cis, (Object)adc_02);
    }

    public adc_0 rR(int n) {
        return (adc_0)this.ciD.get(n);
    }

    public void clear() {
        this.ciD.clear();
    }
}

