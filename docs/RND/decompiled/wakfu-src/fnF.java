/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class fnF
implements Comparator<fnD> {
    fnF() {
    }

    public int a(fnD fnD2, fnD fnD3) {
        String string = fnD2.getName().toUpperCase();
        String string2 = fnD3.getName().toUpperCase();
        return string.compareTo(string2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((fnD)object, (fnD)object2);
    }
}

