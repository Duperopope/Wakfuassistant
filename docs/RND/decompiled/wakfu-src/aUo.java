/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class aUo
implements Comparator<aUl> {
    aUo(aUn aUn2) {
    }

    public int a(aUl aUl2, aUl aUl3) {
        return aUl2.getId().compareTo(aUl3.getId());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((aUl)object, (aUl)object2);
    }
}

