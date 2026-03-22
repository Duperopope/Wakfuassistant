/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.io.IOException;
import org.apache.log4j.Logger;

public abstract class afn<Partition extends afn>
extends vx_0<Partition> {
    private static final Logger cqc = Logger.getLogger(afn.class);
    private static final TLongObjectProcedure<afb_0> cqd = new afo();
    private final TLongObjectHashMap<afb_0> cqe = new TLongObjectHashMap();

    public void aPg() {
        this.bxK();
    }

    public void bxJ() {
        this.cqe.forEachEntry(cqd);
    }

    protected void clear() {
        this.cqe.clear();
    }

    private void bxK() {
        adh adh2 = adk.buy().x((short)this.getX(), (short)this.getY());
        if (adh2 == null) {
            return;
        }
        adi[] adiArray = adh2.buw();
        for (int i = 0; i < adiArray.length; ++i) {
            adi adi2 = adiArray[i];
            try {
                afb_0 afb_02 = afb_0.a(adh2, adi2);
                afb_02.aPg();
                this.a(afb_02);
                continue;
            }
            catch (IOException iOException) {
                cqc.error((Object)("Impossible de charger le fichier d'animation de l'\u00e9l\u00e9ment dynamic " + String.valueOf(adi2)), (Throwable)iOException);
                continue;
            }
            catch (Exception exception) {
                cqc.error((Object)("Impossible de charger l'\u00e9l\u00e9ment dynamic " + String.valueOf(adi2)), (Throwable)exception);
            }
        }
    }

    public void a(afb_0 afb_02) {
        if (this.cqe.containsKey(afb_02.Sn())) {
            cqc.error((Object)("Impossible d'ajouter un \u00e9l\u00e9ments interactif d'ID=" + afb_02.Sn() + " \u00e0 la partition " + String.valueOf(this) + " qui le contient d\u00e9j\u00e0."));
            return;
        }
        this.cqe.put(afb_02.Sn(), (Object)afb_02);
        ZM.bqw().c(afb_02);
    }

    public void fP(long l) {
        afb_0 afb_02 = (afb_0)this.cqe.remove(l);
        if (afb_02 != null) {
            afb_02.clear();
            ZM.bqw().d(afb_02);
        }
    }

    public boolean c(TObjectProcedure<afb_0> tObjectProcedure) {
        return this.cqe.forEachValue(tObjectProcedure);
    }
}

