/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;

public abstract class RB<T extends RH, C extends RC<T>> {
    protected static final Logger blP = Logger.getLogger(RB.class);
    protected C blQ;
    protected final TLongObjectHashMap<RE> blR = new TLongObjectHashMap();

    public final void a(C c2) {
        this.blQ = c2;
    }

    public C beg() {
        return this.blQ;
    }

    public final boolean dt(long l) {
        return this.blR.containsKey(l);
    }

    public final RE du(long l) {
        return (RE)this.blR.get(l);
    }

    public final void a(RE rE) {
        this.blR.put(rE.Sn(), (Object)rE);
    }

    public final void dv(long l) {
        this.blR.remove(l);
    }

    public T dw(long l) {
        return this.a(l, false);
    }

    public T a(long l, boolean bl) {
        try {
            RE rE = (RE)this.blR.get(l);
            if (rE == null) {
                blP.error((Object)("Aucune d\u00e9finition trouv\u00e9e pour l'instance d'\u00e9lement interactif " + l));
                return null;
            }
            T t = this.a(l, rE.blY, rE.blZ, bl);
            this.a(t, rE);
            return t;
        }
        catch (RuntimeException runtimeException) {
            blP.error((Object)("Exception lors de InteractiveElementFactory.createInteractiveElement(" + l + ")"), (Throwable)runtimeException);
            return null;
        }
    }

    public T a(long l, short s, byte[] byArray) {
        return this.a(l, s, byArray, true);
    }

    private T a(long l, short s, byte[] byArray, boolean bl) {
        ayw_2 ayw_22 = ((RC)this.blQ).ab(s);
        if (ayw_22 == null) {
            blP.error((Object)("Aucune factory d'enregistr\u00e9e pour un \u00e9l\u00e9ment interactif de type " + s));
            return null;
        }
        RH rH = (RH)ayw_22.baw();
        if (bl) {
            rH.beC();
        }
        rH.dC(l);
        rH.ad(s);
        rH.as(byArray);
        return (T)rH;
    }

    protected abstract void a(T var1, RE var2);
}

