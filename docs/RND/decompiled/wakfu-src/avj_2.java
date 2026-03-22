/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from avj
 */
public class avj_2
implements avi_2 {
    protected static final Logger dhI = Logger.getLogger(avj_2.class);
    public static final avj_2 dhJ = new avj_2();
    private final ArrayList<avi_2> dhK = new ArrayList();

    private avj_2() {
    }

    public void a(avi_2 avi_22) {
        if (!this.dhK.contains(avi_22)) {
            this.dhK.add(avi_22);
        }
    }

    @Override
    public void aPg() {
        dhI.info((Object)"Initializing hardware tests...");
        for (avi_2 avi_22 : this.dhK) {
            try {
                avi_22.aPg();
            }
            catch (Throwable throwable) {
                dhI.error((Object)("Erreur \u00e0 l'initialisation du test hardware " + avi_22.bMW().bMQ()), throwable);
            }
        }
    }

    @Override
    public boolean bMV() {
        dhI.info((Object)"Testing supported features...");
        for (avi_2 avi_22 : this.dhK) {
            avg_2 avg_22 = avi_22.bMW();
            boolean bl = false;
            try {
                bl = avi_22.bMV();
            }
            catch (Throwable throwable) {
                dhI.error((Object)("Erreur pendant le test hardware " + avg_22.bMQ()), throwable);
            }
            dhI.info((Object)("\t* " + avg_22.bMQ() + "..." + (bl ? " supported !" : " not supported !")));
            avh_2.dhF.a(avg_22, bl);
        }
        return true;
    }

    @Override
    public void bmX() {
        dhI.info((Object)"Cleaning up hardware tests...");
        for (avi_2 avi_22 : this.dhK) {
            try {
                avi_22.bmX();
            }
            catch (Throwable throwable) {
                dhI.error((Object)("Erreur pendant le cleanup du test hardware " + avi_22.bMW().bMQ()), throwable);
            }
        }
    }

    @Override
    public avg_2 bMW() {
        return null;
    }
}

