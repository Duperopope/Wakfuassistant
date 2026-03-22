/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import org.apache.log4j.Logger;

/*
 * Renamed from axC
 */
public abstract class axc_1 {
    private static final Logger dqt = Logger.getLogger(axc_1.class);
    protected byte[] cOG;

    public acc_1 gL(String string) {
        string = string.replace('\\', '/');
        try {
            return this.dD(fo_0.c(string, this.bQU()));
        }
        catch (IOException iOException) {
            dqt.error((Object)("Erreur au chargement de l'image " + string), (Throwable)iOException);
            return null;
        }
    }

    public acc_1 dD(byte[] byArray) {
        try {
            return this.w(apl_1.dw(byArray));
        }
        catch (IOException iOException) {
            dqt.error((Object)"Erreur au chargement de l'image", (Throwable)iOException);
            return null;
        }
    }

    public axc_2 gM(String string) {
        string = string.replace('\\', '/');
        try {
            return this.dE(fo_0.by(string));
        }
        catch (IOException iOException) {
            dqt.error((Object)("Erreur au chargement de l'image " + string), (Throwable)iOException);
        }
        catch (ClassCastException classCastException) {
            dqt.error((Object)("Erreur au chargement de l'image " + string), (Throwable)classCastException);
        }
        return null;
    }

    public final axc_2 dE(byte[] byArray) {
        try {
            return this.v(apl_1.dw(byArray));
        }
        catch (IOException iOException) {
            dqt.error((Object)"Erreur au chargement de l'image", (Throwable)iOException);
        }
        catch (ClassCastException classCastException) {
            dqt.error((Object)"Erreur au chargement de l'image", (Throwable)classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            dqt.error((Object)"Erreur au chargement de l'image", (Throwable)illegalArgumentException);
        }
        return null;
    }

    protected abstract axc_2 v(apl_1 var1);

    protected abstract acc_1 w(apl_1 var1);

    protected abstract int bQU();

    public final byte[] bQV() {
        return this.cOG;
    }

    protected final byte[] a(apl_1 apl_12, int n, int n2, int n3) {
        int n4 = axc_1.cm(n, n3);
        int n5 = (n4 + 3) / 4 * 4;
        int n6 = n5 - n4;
        byte[] byArray = new byte[n2 * n4];
        for (int i = byArray.length - n4; i >= 0; i -= n4) {
            if (apl_12.c(byArray, i, n4) != n4) {
                dqt.error((Object)"read error");
            }
            if (apl_12.tv(n6) == n6) continue;
            dqt.error((Object)"skip error");
        }
        return byArray;
    }

    protected final byte[] b(apl_1 apl_12, int n, int n2, int n3) {
        int n4 = axc_1.cm(n, n3);
        byte[] byArray = new byte[n2 * n4];
        for (int i = byArray.length - n4; i >= 0; i -= n4) {
            if (apl_12.c(byArray, i, n4) == n4) continue;
            dqt.error((Object)"read error");
        }
        return byArray;
    }

    protected final byte[] u(int n, int n2, int n3, int n4) {
        assert (this.cOG != null);
        int n5 = axc_1.cm(n, n3);
        int n6 = (n5 + 3) / 4 * 4;
        byte[] byArray = new byte[n2 * n5];
        int n7 = n4 + n6 * (n2 - 1);
        for (int i = 0; i < byArray.length; i += n5) {
            System.arraycopy(this.cOG, n7, byArray, i, n5);
            n7 -= n6;
        }
        return byArray;
    }

    protected final byte[] v(int n, int n2, int n3, int n4) {
        assert (this.cOG != null);
        int n5 = axc_1.cm(n, n3);
        byte[] byArray = new byte[n2 * n5];
        int n6 = n4 + n5 * (n2 - 1);
        for (int i = 0; i < byArray.length; i += n5) {
            System.arraycopy(this.cOG, n6, byArray, i, n5);
            n6 -= n5;
        }
        return byArray;
    }

    protected static float vk(int n) {
        return (float)n / 8.0f;
    }

    protected static int cm(int n, int n2) {
        return (int)((float)n * axc_1.vk(n2));
    }
}

