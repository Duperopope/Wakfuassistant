/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TShortObjectProcedure
 */
import gnu.trove.procedure.TShortObjectProcedure;

class WZ
implements TShortObjectProcedure<short[]> {
    final /* synthetic */ WY bQL;

    WZ(WY wY) {
        this.bQL = wY;
    }

    public boolean a(short s, short[] sArray) {
        this.bQL.a(s, sArray, true);
        return true;
    }

    public /* synthetic */ boolean execute(short s, Object object) {
        return this.a(s, (short[])object);
    }
}

