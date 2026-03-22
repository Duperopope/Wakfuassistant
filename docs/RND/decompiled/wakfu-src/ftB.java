/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public class ftB
implements Comparator<ftA> {
    public static final ftB tgh = new ftB();

    public int a(ftA ftA2, ftA ftA3) {
        return Short.compare(ftA3.cmL(), ftA2.cmL());
    }

    public static ftB gmo() {
        return tgh;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ftA)object, (ftA)object2);
    }
}

