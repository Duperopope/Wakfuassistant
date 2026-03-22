/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class aXQ
implements Comparator<akw_0> {
    static final aXQ hxm = new aXQ();

    aXQ() {
    }

    public int a(akw_0 akw_02, akw_0 akw_03) {
        return akw_02.aYs() - akw_03.aYs();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((akw_0)object, (akw_0)object2);
    }
}

