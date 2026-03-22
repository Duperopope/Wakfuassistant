/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;

public final class fsm
extends Enum<fsm> {
    public static final /* enum */ fsm tcx = new fsm(1);
    public static final /* enum */ fsm tcy = new fsm(2);
    private static final TByteObjectHashMap<fsm> tcz;
    private byte azt;
    private static final /* synthetic */ fsm[] tcA;

    public static fsm[] values() {
        return (fsm[])tcA.clone();
    }

    public static fsm valueOf(String string) {
        return Enum.valueOf(fsm.class, string);
    }

    private fsm(byte by) {
        this.azt = by;
    }

    public byte aJr() {
        return this.azt;
    }

    public static fsm hI(byte by) {
        return (fsm)((Object)tcz.get(by));
    }

    private static /* synthetic */ fsm[] gkX() {
        return new fsm[]{tcx, tcy};
    }

    static {
        tcA = fsm.gkX();
        tcz = new TByteObjectHashMap();
        for (fsm fsm2 : fsm.values()) {
            tcz.put(fsm2.aJr(), (Object)fsm2);
        }
    }
}

