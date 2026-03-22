/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.io.IOException;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bTf {
    private static final Logger lmX = Logger.getLogger(bTf.class);

    @Nullable
    public static ZC Jw(int n) {
        ZG zG = new ZG(aym_2.bSE(), 0.0f, 0.0f, 0.0f);
        String string = n + ".anm";
        try {
            zG.k(auc_0.cVq().bS("ANMGUIPath") + string, true);
        }
        catch (IOException iOException) {
            lmX.warn((Object)iOException.getMessage());
            return null;
        }
        catch (fu_0 fu_02) {
            lmX.warn((Object)fu_02.getMessage());
            return null;
        }
        zG.dP(string);
        return zG;
    }

    public static void a(@NotNull ZC zC, @NotNull bkr_0 bkr_02) {
        zC.dV(bkr_02.bkI());
        zC.dT(bkr_02.bkI());
    }

    public static void j(ZC zC) {
        bTf.a(zC, bkr_0.kny);
    }
}

