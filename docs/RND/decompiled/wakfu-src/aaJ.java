/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.procedure.TLongObjectProcedure;

class aaJ
implements TLongObjectProcedure<aai_0> {
    int caW;
    final TLongArrayList caX = new TLongArrayList();
    final /* synthetic */ aah_0 caY;

    aaJ(aah_0 aah_02) {
        this.caY = aah_02;
    }

    public boolean a(long l, aai_0 aai_02) {
        if (aai_02.rl(this.caW)) {
            this.caX.add(l);
        }
        return true;
    }

    void clean() {
        for (int i = this.caX.size() - 1; i >= 0; --i) {
            this.caY.caO.remove(this.caX.getQuick(i));
        }
        this.caX.clear();
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (aai_0)object);
    }
}

