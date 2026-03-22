/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class cAX {
    private final Map<String, List<aix_2>> mpX = new HashMap<String, List<aix_2>>();

    cAX() {
    }

    public void a(aix_2 aix_22, String string2) {
        List list = this.mpX.computeIfAbsent(string2, string -> new ArrayList());
        list.add(aix_22);
    }

    public aix_2 oS(String string) {
        List<aix_2> list = this.mpX.get(string);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(new Random().nextInt(list.size()));
    }
}

