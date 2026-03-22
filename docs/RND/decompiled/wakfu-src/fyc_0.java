/*
 * Decompiled with CFR 0.152.
 */
import java.net.MalformedURLException;
import java.net.URL;

/*
 * Renamed from fyC
 */
public class fyc_0 {
    public final Class<? extends fhk_1> tCR;
    public final URL tCS;
    public fhk_1 tCT;

    private fyc_0(Class<? extends fhk_1> clazz) {
        this.tCR = clazz;
        try {
            this.tCT = this.tCR.newInstance();
        }
        catch (InstantiationException instantiationException) {
            fyw_0.tBD.error((Object)"", (Throwable)instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            fyw_0.tBD.error((Object)"", (Throwable)illegalAccessException);
        }
        this.tCS = null;
    }

    private fyc_0(URL uRL) {
        this.tCR = null;
        this.tCS = uRL;
    }

    public static fyc_0 tr(String string) {
        try {
            Class<?> clazz = Class.forName(string);
            return new fyc_0(clazz);
        }
        catch (ClassNotFoundException classNotFoundException) {
            try {
                URL uRL = fo_0.bA(string);
                return new fyc_0(uRL);
            }
            catch (MalformedURLException malformedURLException) {
                fyw_0.tBD.error((Object)("Le chemin '" + string + "' vers le fichier de d\u00e9finition des dialog est invalide !"));
                return null;
            }
        }
    }
}

