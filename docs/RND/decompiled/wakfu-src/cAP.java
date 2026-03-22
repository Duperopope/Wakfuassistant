/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

final class cAP
extends cAO {
    cAP(String string2) {
    }

    @Override
    protected ahg_2 oN(String string) {
        try {
            ahi_2 ahi_22 = new ahi_2("snd", "ogg");
            ahi_22.a(new apm_1(string));
            return ahi_22;
        }
        catch (IOException iOException) {
            cAO.mpH.error((Object)"Impossible de charger le fichier de pak de son", (Throwable)iOException);
            return null;
        }
    }
}

