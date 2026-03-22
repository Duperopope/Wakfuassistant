/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import org.apache.log4j.Logger;

public abstract class RC<T extends RH> {
    protected static final Logger blS = Logger.getLogger(RC.class);
    private final TShortObjectHashMap<ayw_2<T>> blT = new TShortObjectHashMap();

    public final void a(RA<T>[] rAArray) {
        for (RA<T> rA : rAArray) {
            this.blT.put(rA.bee(), rA.bef());
        }
    }

    public final ayw_2<T> ab(short s) {
        return (ayw_2)this.blT.get(s);
    }
}

