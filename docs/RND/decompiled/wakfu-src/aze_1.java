/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from azE
 */
class aze_1
implements Comparator<String> {
    aze_1() {
    }

    public int h(String string, String string2) {
        return string.compareTo(string2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.h((String)object, (String)object2);
    }
}

