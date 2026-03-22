/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class abb
implements Comparator<abc> {
    abb() {
    }

    public int a(abc abc2, abc abc3) {
        return (int)(abc2.ccW - abc3.ccW);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((abc)object, (abc)object2);
    }
}

