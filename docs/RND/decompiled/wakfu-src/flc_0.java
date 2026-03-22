/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from flc
 */
public abstract class flc_0
extends fkx_0<fkC> {
    private static final Logger sDj = Logger.getLogger(flc_0.class);
    private final Set<Long> sDk = new HashSet<Long>();
    private final List<fkC> sDl = new ArrayList<fkC>();

    protected flc_0(fjo_0 fjo_02) {
        super(fjo_02);
    }

    void i(fjm fjm2) {
        for (int i = this.sDl.size() - 1; i >= 0; --i) {
            this.sDl.get(i).c(fjm2);
        }
    }

    void j(fjm fjm2) {
        for (int i = this.sDl.size() - 1; i >= 0; --i) {
            this.sDl.get(i).a(this.ems(), fjm2);
        }
    }

    @Override
    public void gbf() {
    }

    @Nullable
    public fjm tV(long l) {
        if (!this.sDk.contains(l)) {
            return null;
        }
        return this.mi(l);
    }

    protected abstract fjm mi(long var1);

    public void c(fkC fkC2) {
        if (fkC2 == null) {
            return;
        }
        this.sDl.add(fkC2);
    }

    public void d(fkC fkC2) {
        this.sDl.remove(fkC2);
    }

    public boolean d(fjm fjm2) {
        return this.sDk.contains(fjm2.Sn());
    }

    @Override
    public abstract void a(@NotNull fjm var1);

    public abstract void mj(long var1);

    public void a(long l, fkK fkK2) {
        throw new UnsupportedOperationException();
    }

    public void b(long l, fkK fkK2) {
        throw new UnsupportedOperationException();
    }

    public void e(@NotNull fjm fjm2) {
        fjn_0 fjn_02 = fjm2.ffF();
        if (!fjo_0.a(fjn_02.ems(), this.ems())) {
            sDj.error((Object)("[NATION] Registering " + String.valueOf(fjm2) + " to nation " + String.valueOf(this.ems()) + " but he is in " + String.valueOf(fjn_02.ems())));
            return;
        }
        if (this.sDk.contains(fjm2.Sn())) {
            sDj.error((Object)("[NATION] Registering " + String.valueOf(fjm2) + " to nation " + String.valueOf(this.ems()) + " but he's already in it"));
            return;
        }
        this.sDk.add(fjm2.Sn());
        this.i(fjm2);
    }

    public boolean k(@NotNull fjm fjm2) {
        fjn_0 fjn_02 = fjm2.ffF();
        fjo_0 fjo_02 = fjn_02.ems();
        if (fjo_02 != this.ems()) {
            boolean bl;
            boolean bl2 = bl = !fjo_02.f(fjm2);
            if (bl) {
                sDj.error((Object)("[NATION] Impossible d'ajouter le joueur " + String.valueOf(fjm2) + " \u00e0 la nation " + String.valueOf(this.ems()) + " car on ne peut pas l'enlever \u00e0 sa nation courante (" + String.valueOf(fjo_02) + ")"));
                return false;
            }
        }
        this.sDk.add(fjm2.Sn());
        fjn_02.i(this.ems());
        this.i(fjm2);
        return true;
    }

    public boolean f(@NotNull fjm fjm2) {
        boolean bl = this.sDk.remove(fjm2.Sn());
        if (!bl && !fjo_0.a(fjo_0.sys, this.ems())) {
            sDj.error((Object)("[NATION] Trying to remove " + fjm2.Sn() + " from nation " + String.valueOf(this.ems()) + " but he is not in it."));
            return false;
        }
        this.j(fjm2);
        return true;
    }

    public void Z(TObjectProcedure<fjm> tObjectProcedure) {
        this.sDk.forEach(l -> tObjectProcedure.execute((Object)this.mi((long)l)));
    }

    public void uf(long l) {
        boolean bl = this.sDk.remove(l);
        if (!bl) {
            sDj.info((Object)("[NATION] Trying to remove " + l + " from " + String.valueOf(this.ems()) + " after a disconnection but he's not in it"));
        }
    }

    public int gbO() {
        return this.sDk.size();
    }

    @Override
    public /* synthetic */ void a(fkA fkA2) {
        this.d((fkC)fkA2);
    }

    @Override
    public /* synthetic */ void b(fkA fkA2) {
        this.c((fkC)fkA2);
    }
}

