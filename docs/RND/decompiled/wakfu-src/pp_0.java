/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Pp
 */
public class pp_0
extends Pf {
    private static final Logger bdL = Logger.getLogger(pp_0.class);
    private short bdM;

    @Override
    protected boolean da(@NotNull String string) {
        try {
            String[] stringArray = BH.a(string, ';');
            if (stringArray.length != 1) {
                bdL.error((Object)("Unable to initialize " + this.getClass().getName() + ", not enough or too much parameters, only 1 is needed (newHeight): " + string));
                return false;
            }
            this.bdM = Short.parseShort(stringArray[0]);
            return true;
        }
        catch (Exception exception) {
            bdL.error((Object)("Unable to initialize " + this.getClass().getName() + ", invalid parameters: " + string));
            return false;
        }
    }

    @Override
    public ph_0 aXu() {
        return ph_0.bdm;
    }

    public short aXQ() {
        return this.bdM;
    }
}

