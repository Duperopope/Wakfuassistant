/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ccy
 */
public class ccy_1
implements adi_1 {
    protected static final Logger lOZ = Logger.getLogger(ccy_1.class);
    public static final ccy_1 lPa = new ccy_1();

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 23121: {
                czc czc2 = (czc)aam_22;
                long l = System.currentTimeMillis() - czc2.bUh();
                ue_0.bjV().fk(czc2.bji() + l);
                ue_0.bjV().fm(1000L);
                ue_0.bjV().run();
                return false;
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
}

