/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class RS<C extends RT>
implements Iterable<C> {
    private static final Logger bmO = Logger.getLogger(RS.class);
    public static final short bmP = -1;
    protected short bmQ;
    protected final boolean bmR;
    protected Sj bmS;
    private boolean bmT;
    protected final List<Sp> bmU = new ArrayList<Sp>(1);

    protected RS(boolean bl, short s) {
        this.bmR = bl;
        this.bmQ = GC.c((short)-1, s);
    }

    public boolean beX() {
        return this.bmR;
    }

    public void a(Sp sp) {
        if (sp == null) {
            return;
        }
        if (!this.bmU.contains(sp)) {
            this.bmU.add(sp);
        }
    }

    public void b(Sp sp) {
        if (sp == null) {
            return;
        }
        this.bmU.remove(sp);
    }

    public void beY() {
        this.bmU.clear();
    }

    protected void a(Sl sl) {
        for (Sp sp : new ArrayList<Sp>(this.bmU)) {
            try {
                sp.b(sl);
            }
            catch (Exception exception) {
                bmO.error((Object)("Exception lors de la notification de l'event " + String.valueOf(sl) + " \u00e0 l'observer " + String.valueOf(sp)), (Throwable)exception);
            }
        }
    }

    public void beZ() {
        this.beQ();
        this.beY();
    }

    public boolean ae(short s) {
        if (this.bmQ > 0 && s < this.aVo()) {
            bmO.error((Object)("Can't change the size of the inventory to " + s + " : current size is " + this.aVo()));
            return false;
        }
        this.bmQ = GC.c((short)-1, s);
        return true;
    }

    public short bfa() {
        return this.bmQ;
    }

    public boolean isFull() {
        return this.bmQ != -1 && this.aVo() >= this.bmQ;
    }

    public boolean aJG() {
        return this.aVo() == 0;
    }

    public boolean bfb() {
        return this.bmT;
    }

    public void bl(boolean bl) {
        this.bmT = bl;
    }

    public abstract boolean b(C var1);

    public abstract boolean b(long var1, short var3);

    public abstract short dJ(long var1);

    public abstract boolean c(C var1);

    public abstract boolean d(C var1);

    @Nullable
    public abstract C dL(long var1);

    public abstract int pa(int var1);

    public abstract int a(int var1, int var2, boolean var3);

    public abstract boolean f(C var1);

    public abstract boolean dM(long var1);

    public abstract boolean pb(int var1);

    @Nullable
    public abstract C dN(long var1);

    @Nullable
    public abstract C pc(int var1);

    public abstract C a(int var1, RX<C> var2);

    public abstract ArrayList<C> pd(int var1);

    public abstract ArrayList<C> b(int var1, RX<C> var2);

    public abstract ArrayList<C> b(RX<C> var1);

    public Sj bfc() {
        return this.bmS;
    }

    public RS<C> a(Sj sj) {
        this.bmS = sj;
        return this;
    }

    public abstract int aVo();

    public abstract int beP();

    public abstract int beQ();

    @Override
    @NotNull
    public abstract Iterator<C> iterator();

    public abstract RU<C> beR();

    public abstract void a(RU<C> var1);
}

