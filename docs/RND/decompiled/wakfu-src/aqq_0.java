/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aQQ
 */
public class aqq_0
extends aRY {
    @NotNull
    final aqr_0 eHH;
    @Nullable
    final Long eHI;

    public aqq_0(@NotNull aqr_0 aqr_02) {
        this(aqr_02, null);
    }

    public aqq_0(@NotNull aqr_0 aqr_02, @Nullable Long l) {
        this.eHH = aqr_02;
        this.eHI = l;
    }

    @Override
    public boolean isValid() {
        return switch (this.eHH.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0, 1, 4 -> {
                if (this.eHI == null) {
                    yield true;
                }
                yield false;
            }
            case 2, 3 -> this.eHI != null;
        };
    }

    @Override
    public void bGy() {
        switch (this.eHH.ordinal()) {
            case 1: {
                this.aW((short)61);
                break;
            }
            case 2: {
                this.aW((short)7);
                break;
            }
            case 3: {
                this.aW((short)33);
                break;
            }
            case 4: {
                this.aW((short)99);
                break;
            }
            case 0: {
                aqq_0.cBS();
            }
        }
    }

    public static void cBS() {
        aqq_0.jF("help | h : show full documentation");
        aqq_0.jF("list | show : show current whitelist of the connection queue");
        aqq_0.jF("add [accountId] : add specific account in whitelist of the connection queue");
        aqq_0.jF("remove [accountId] : remove specific account from whitelist of the connection queue");
        aqq_0.jF("clear | removeAll : clear whitelist of the connection queue");
    }

    private void aW(short s) {
        ayf_2 ayf_22;
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)1);
        ns_02.Q(s);
        if (this.eHI != null) {
            ns_02.cX(this.eHI);
        }
        if ((ayf_22 = aue_0.cVJ().etu()) != null) {
            ayf_22.d(ns_02);
        } else {
            aqq_0.jI("Please log in for use current command !");
        }
    }
}

