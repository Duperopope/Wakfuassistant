/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aRU
 */
public class aru_0
extends aRY {
    @Nullable
    private final Long eMq;
    private final aRV eMr;

    public aru_0(aRV aRV2) {
        this(aRV2, null);
    }

    public aru_0(aRV aRV2, @Nullable Long l) {
        this.eMr = aRV2;
        this.eMq = l;
    }

    @Override
    public boolean isValid() {
        return switch (this.eMr.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0, 4 -> true;
            case 1, 2, 3 -> this.eMq != null;
        };
    }

    @Override
    public void bGy() {
        switch (this.eMr.ordinal()) {
            case 0: {
                aru_0.cBS();
                break;
            }
            case 1: {
                ns_0 ns_02 = new ns_0();
                ns_02.C((byte)3);
                ns_02.Q((short)453);
                ns_02.cX(this.eMq);
                aue_0.cVJ().etu().d(ns_02);
                break;
            }
            case 2: 
            case 3: {
                ns_0 ns_03 = new ns_0();
                ns_03.C((byte)2);
                ns_03.Q((short)315);
                ns_03.cX(this.eMq);
                ns_03.aN(this.eMr == aRV.eMu);
                aue_0.cVJ().etu().d(ns_03);
                break;
            }
            case 4: {
                ns_0 ns_04 = new ns_0();
                ns_04.C((byte)3);
                ns_04.Q((short)109);
                aue_0.cVJ().etu().d(ns_04);
                break;
            }
        }
    }

    public static void cBS() {
        aru_0.jF("help | h : show full documentation");
        aru_0.jF("status <IEId> : show status specific IE");
        aru_0.jF("lock <IEId> : lock specific IE");
        aru_0.jF("unlock <IEId> : unlock specific IE");
        aru_0.jF("list : display the locked IEs");
    }
}

