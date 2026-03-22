/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fcT
 */
public final class fct_0 {
    private static final Logger rUE = Logger.getLogger(fct_0.class);

    public static fcx_0 eK(short s) {
        switch (s) {
            case 1: {
                return new fcv_0();
            }
            case 2: {
                return new fcw_0();
            }
            case 3: {
                return new fcy_0();
            }
            case 4: {
                return new fcz_0();
            }
        }
        rUE.error((Object)("Type d'action inconnue " + s));
        return null;
    }
}

