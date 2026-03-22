/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public abstract class fqF<Spell extends fqD> {
    protected static fqF sUM = null;
    protected static final Logger sUN = Logger.getLogger(fqF.class);
    protected final TIntObjectHashMap<Spell> sUO = new TIntObjectHashMap();
    protected final TLongObjectHashMap<fqE<Spell>> sUP = new TLongObjectHashMap();

    protected fqF() {
    }

    public static fqF giR() {
        if (sUM == null) {
            throw new IllegalStateException("m_instance == null : pas d'instance de SpellManager concret");
        }
        return sUM;
    }

    public void c(Spell Spell) {
        this.sUO.put(((fqD)Spell).d(), Spell);
    }

    protected TIntObjectHashMap<Spell> giS() {
        return this.sUO;
    }

    @Nullable
    public Spell Ig(int n) {
        return (Spell)((fqD)this.sUO.get(n));
    }

    public boolean aJG() {
        return this.sUO.isEmpty();
    }

    public abstract fqE<Spell> i(int var1, short var2);

    public fqE uE(long l) {
        return (fqE)this.sUP.get(l);
    }
}

