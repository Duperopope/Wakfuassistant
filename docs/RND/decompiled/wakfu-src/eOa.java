/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

abstract class eOa
extends ero_0 {
    eOa() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected final void c(QD qD, boolean bl) {
        fqB fqB2 = fqC.giD().Za(this.aZH());
        if (fqB2 == null) {
            return;
        }
        if (!this.bbt()) {
            return;
        }
        enq_0 enq_02 = this.g((ero_0)qD);
        try {
            for (enk_0 enk_02 : fqB2) {
                enk_02.a((Qk)this.bbf(), this.bgE, this.bbh(), enf_0.fBb(), this.bgG.getX(), this.bgG.getY(), this.bgG.bdi(), this.bgF, enq_02, false);
            }
        }
        catch (Exception exception) {
            bgA.error((Object)("Exception levee lors de l'execution d'un RunningEffectGroupRandomContainerLevel id " + this.aZH()), (Throwable)exception);
        }
        finally {
            enq_02.aZp();
        }
    }

    @NotNull
    protected abstract enq_0 g(ero_0 var1);

    @Override
    public final boolean bbA() {
        return true;
    }

    @Override
    public final boolean bbB() {
        return false;
    }

    @Override
    public final boolean bbC() {
        return true;
    }
}

