/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class biJ
implements aeh_2 {
    private static final Logger iml = Logger.getLogger(biJ.class);
    public static final biJ imm = new biJ();

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        try {
            return auk_0.kN(string);
        }
        catch (fu_0 fu_02) {
            iml.error((Object)("Error when displaying icon with name : " + string), (Throwable)fu_02);
            return null;
        }
    }

    public static String f(exx_2 exx_22) {
        try {
            return auk_0.kN(exx_22.name());
        }
        catch (fu_0 fu_02) {
            iml.error((Object)("Error when retrieving icon url of charac : " + String.valueOf(exx_22)), (Throwable)fu_02);
            return null;
        }
    }
}

