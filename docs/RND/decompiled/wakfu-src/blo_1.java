/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from blo
 */
public class blo_1
extends bli_0 {
    public blo_1(bld_0 bld_02) {
        super(bld_02);
    }

    @Override
    public Object eu(String string) {
        if (string.equals("content")) {
            ArrayList<ffV> arrayList = new ArrayList<ffV>();
            Iterator<ffV> iterator = ((blg_0)this.dtn().djj()).dtm().iterator();
            while (iterator.hasNext()) {
                arrayList.add(iterator.next());
            }
            return arrayList;
        }
        if (string.equals("kama")) {
            return this.dtp();
        }
        if (string.equals("freeBagSlotsSize")) {
            return this.dty();
        }
        return super.eu(string);
    }

    private int dty() {
        RS<ffV> rS = ((blg_0)this.dtn().djj()).dtm();
        return rS.bfa();
    }

    @Override
    protected boolean isValid() {
        return false;
    }

    @Override
    public void dto() {
    }

    @Override
    public long dtp() {
        return this.dtn().djj().exS();
    }
}

