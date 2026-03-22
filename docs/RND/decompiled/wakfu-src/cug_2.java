/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cUG
 */
public class cug_2
implements adi_1 {
    private static final Logger nNk = Logger.getLogger(cug_2.class);
    private static final cug_2 nNl = new cug_2();
    private boolean Na = false;

    public static cug_2 eSL() {
        return nNl;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (!this.Na) {
            nNk.warn((Object)"Traitement d'un message alors que la frame n'est plus active");
        }
        switch (aam_22.d()) {
            case 17000: {
                cub_1.eSi().eSr();
                return true;
            }
            case 16902: {
                return true;
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        this.Na = true;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgt_02.a(exx_2.rGj, exx_2.rGi, exx_2.rGk, exx_2.rGl);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        this.Na = false;
        cub_1.eSi().eSs();
    }
}

