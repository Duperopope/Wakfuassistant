/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bkw
 */
public class bkw_1
extends bkb_0 {
    private static final Logger irc = Logger.getLogger(bkw_1.class);
    private final bal_0 ird;

    public bkw_1(bal_0 bal_02) {
        this.ird = bal_02;
    }

    @Override
    public short dsm() {
        return 19;
    }

    @Override
    public boolean dsn() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bdj_2 bdj_22 = bgt_02.ddI();
        return this.ird.T(bdj_22.bqg());
    }

    @Override
    public void bIH() {
        irc.info((Object)("Lancement de l'occupation MARKET sur la board " + String.valueOf(this.ird)));
        this.iqd.i(false, true);
        this.ird.a(rw_0.bkV, aue_0.cVJ().cVK());
        if (aue_0.cVJ().c(cwl_1.eVl())) {
            aue_0.cVJ().b(cwl_1.eVl());
        }
        aue_0.cVJ().a(cwl_1.eVl());
        aue_0.cVJ().a(cha_0.evc());
        this.iqd.a(this);
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        irc.info((Object)("On annule l'occupation MARKET sur la board " + String.valueOf(this.ird) + " (fromServer=" + bl + ", sendMessage=" + bl2 + ")"));
        aue_0.cVJ().b(cwl_1.eVl());
        aue_0.cVJ().b(cha_0.evc());
        if (bl2) {
            this.ird.a(rw_0.bkW, aue_0.cVJ().cVK());
        }
        return true;
    }

    @Override
    public boolean dsd() {
        irc.info((Object)("On arr\u00eate l'occupation MARKET sur la board " + String.valueOf(this.ird)));
        aue_0.cVJ().b(cha_0.evc());
        this.ird.a(rw_0.bkW, aue_0.cVJ().cVK());
        return true;
    }

    @Override
    public boolean dsj() {
        return false;
    }
}

