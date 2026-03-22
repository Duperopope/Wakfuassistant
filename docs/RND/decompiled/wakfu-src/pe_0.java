/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from PE
 */
public class pe_0
extends Pf {
    protected static final Logger bez = Logger.getLogger(pe_0.class);
    private long beA;

    @Override
    protected boolean da(@NotNull String string) {
        try {
            this.beA = Long.parseLong(string);
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            bez.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + " : " + string + " n'est pas un id de son valide"));
            return false;
        }
    }

    @Override
    public ph_0 aXu() {
        return ph_0.bcR;
    }

    public long aYj() {
        return this.beA;
    }
}

