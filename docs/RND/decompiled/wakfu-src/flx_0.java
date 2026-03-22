/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from flx
 */
public abstract class flx_0 {
    private static final Logger sEG = Logger.getLogger(flx_0.class);
    protected final fjm sEH;

    protected flx_0(fjm fjm2) {
        this.sEH = fjm2;
    }

    public fjm elp() {
        return this.sEH;
    }

    public List<flv_0> gdj() {
        exP exP2 = (exP)this.sEH;
        fjo_0 fjo_02 = exP2.ffL();
        return fjo_02.gbo().c(this);
    }

    public void gdk() {
        exP exP2 = (exP)this.sEH;
        fjo_0 fjo_02 = exP2.ffL();
        if (fjo_02 == null) {
            return;
        }
        try {
            fjo_02.gbo().b(this);
        }
        catch (Exception exception) {
            sEG.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    public abstract fly_0 gdl();
}

