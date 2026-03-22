/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class aPu
implements Comparator<apn_0> {
    final /* synthetic */ aPt eyT;

    aPu(aPt aPt2) {
        this.eyT = aPt2;
    }

    public int a(apn_0 apn_02, apn_0 apn_03) {
        int n = this.eyT.d(apn_02) - this.eyT.d(apn_03);
        return n == 0 ? apn_02.getName().compareTo(apn_03.getName()) : n;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((apn_0)object, (apn_0)object2);
    }
}

