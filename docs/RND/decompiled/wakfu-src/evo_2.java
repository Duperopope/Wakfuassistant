/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TShortProcedure
 */
import gnu.trove.procedure.TShortProcedure;

/*
 * Renamed from evo
 */
class evo_2
implements TShortProcedure {
    private final short ovw;

    evo_2(short s) {
        this.ovw = s;
    }

    public boolean execute(short s) {
        return this.ovw != s;
    }

    public String toString() {
        return "RightFromCommandFinder{m_command=" + this.ovw + "} " + super.toString();
    }
}

