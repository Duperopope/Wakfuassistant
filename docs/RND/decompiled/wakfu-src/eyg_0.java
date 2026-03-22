/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eyg
 */
public abstract class eyg_0<B extends eyp> {
    protected static final Logger phs = Logger.getLogger(eyg_0.class);
    protected final Map<Short, B> pht = new HashMap<Short, B>();
    protected final Map<Integer, List<B>> phu = new HashMap<Integer, List<B>>();

    @Nullable
    public B bD(short s) {
        return (B)((eyp)this.pht.get(s));
    }

    public void e(B b2) {
        if (b2 == null) {
            phs.error((Object)"[esp\u00e8ce ignor\u00e9e] on tente d'ajouter une esp\u00e8ce null");
            return;
        }
        if (this.pht.containsKey(b2.aWP())) {
            phs.error((Object)("[esp\u00e8ce ignor\u00e9e] on tente de rajouter une esp\u00e8ce dont l'id existe d\u00e9j\u00e0 pour une autre " + b2.aWP()));
            return;
        }
        this.pht.put(b2.aWP(), b2);
        int n = b2.cqy();
        List<B> list = this.phu.get(n);
        if (list == null) {
            list = new ArrayList<B>();
            this.phu.put(n, list);
        }
        list.add(b2);
    }

    public List<B> OO(int n) {
        if (!this.phu.containsKey(n)) {
            return Collections.emptyList();
        }
        return this.phu.get(n);
    }
}

