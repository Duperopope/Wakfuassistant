/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TShortObjectProcedure
 */
import gnu.trove.procedure.TShortObjectProcedure;

class bop
implements TShortObjectProcedure<bos> {
    final /* synthetic */ boo iOX;

    bop(boo boo2) {
        this.iOX = boo2;
    }

    public boolean a(short s, bos bos2) {
        byte by = bos2.dAR();
        if (!this.iOX.iOW.containsKey(by)) {
            this.iOX.iOW.put(by, s);
        } else {
            boo.iOP.error((Object)"Plusieurs tutorials sont mapp\u00e9s sur le m\u00eame eventId");
        }
        return true;
    }

    public /* synthetic */ boolean execute(short s, Object object) {
        return this.a(s, (bos)object);
    }
}

