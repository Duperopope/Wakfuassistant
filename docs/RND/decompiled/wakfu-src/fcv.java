/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public final class fcv {
    private static final Logger rTH = Logger.getLogger(fcv.class);
    private final exP rTI;

    public fcv(@NotNull exP exP2) {
        this.rTI = exP2;
    }

    public void pO(long l) {
        if (!(this.rTI instanceof ftF)) {
            rTH.error((Object)("On ne peut pas ajouter d'xp au h\u00e9ros " + String.valueOf(this.rTI)));
            return;
        }
        ((ftF)((Object)this.rTI)).jG(l);
    }
}

