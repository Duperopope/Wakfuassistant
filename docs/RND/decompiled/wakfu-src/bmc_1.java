/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bMc
 */
public final class bmc_1
implements aeh_2 {
    private static final Logger kvF = Logger.getLogger(bmc_1.class);
    private ezn_0 kvs;
    private static final bmc_1 kvG = new bmc_1(null);
    public static final String kvH = "capturedCreatures";
    public static final String kvI = "maxSize";
    public static final String kvJ = "selectedCreature";
    public static final String kvK = "selectedCreatureIndex";
    public static final String[] kvL = new String[]{"capturedCreatures", "maxSize", "selectedCreature", "selectedCreatureIndex"};

    public static bmc_1 eeg() {
        return kvG;
    }

    public void a(ezn_0 ezn_02) {
        this.kvs = ezn_02;
    }

    public bmc_1(ezn_0 ezn_02) {
        this.kvs = ezn_02;
    }

    @Override
    public String[] bxk() {
        return kvL;
    }

    @Override
    public Object eu(String string) {
        if (this.kvs == null) {
            return null;
        }
        if (string.equals(kvH)) {
            ezw[] ezwArray = new ezw[10];
            int n = 0;
            for (byte by = 0; by < (byte)ezwArray.length; by = (byte)(by + 1)) {
                ezwArray[n++] = this.kvs.Pm(by);
            }
            return ezwArray;
        }
        if (string.equals(kvI)) {
            return 10;
        }
        if (string.equals(kvJ)) {
            return this.kvs.fmP();
        }
        if (string.equals(kvK)) {
            return this.kvs.fmR();
        }
        return null;
    }

    public void eea() {
        fse_1.gFu().a((aef_2)this, kvH);
    }

    public void eeb() {
        try {
            fse_1.gFu().a((aef_2)this, kvJ, kvK);
        }
        catch (Exception exception) {
            kvF.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    public void eeh() {
        if (!fyw_0.gqw().to("osamodasSymbiotDialog")) {
            cty_1.ePV().ePY();
        }
        fse_1.gFu().f("osamodasSymbiotCreatureCapturedState", true);
    }
}

