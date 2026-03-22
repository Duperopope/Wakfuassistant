/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TShortArrayList
 *  gnu.trove.procedure.TShortObjectProcedure
 */
import gnu.trove.list.array.TShortArrayList;
import gnu.trove.procedure.TShortObjectProcedure;

class aaK
implements TShortObjectProcedure<aai_0> {
    int caW;
    final TShortArrayList caZ = new TShortArrayList();
    final /* synthetic */ aah_0 cba;

    aaK(aah_0 aah_02) {
        this.cba = aah_02;
    }

    public boolean a(short s, aai_0 aai_02) {
        if (aai_02.rl(this.caW)) {
            this.caZ.add(s);
        }
        return true;
    }

    void clean() {
        for (int i = this.caZ.size() - 1; i >= 0; --i) {
            this.cba.caP.remove(this.caZ.getQuick(i));
        }
        this.caZ.clear();
    }

    public /* synthetic */ boolean execute(short s, Object object) {
        return this.a(s, (aai_0)object);
    }
}

