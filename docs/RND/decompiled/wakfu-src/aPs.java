/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class aPs
implements Comparator<apn_0> {
    aPs(apr_0 apr_02) {
    }

    public int a(apn_0 apn_02, apn_0 apn_03) {
        return Integer.compare(apn_02.cyJ(), apn_03.cyJ());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((apn_0)object, (apn_0)object2);
    }
}

