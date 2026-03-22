/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bTA
 */
public class bta_2
implements aeh_2 {
    public static final String lpv = "isSelected";
    public static final String lpw = "name";
    public static final String lpx = "charactersCountText";
    public static final String lpy = "displayCharactersCount";
    public static final String lpz = "communityStyle";
    public static final String lpA = "communityText";
    public static final String lpB = "statusStyle";
    public static final String lpC = "statusText";
    public static final String lpD = "isOnline";
    public static final String lpE = "isSingleAccount";
    public static final String lpF = "description";
    public static final String lpG = "populationStyle";
    public static final String lpH = "populationText";
    public static final String lpI = "playButtonText";
    public static final String lpJ = "canForceAccount";
    public static final String lpK = "TileIllustrationUrl";
    public static final String[] lpL = new String[]{"isSelected", "name", "charactersCountText", "displayCharactersCount", "communityStyle", "communityText", "statusStyle", "statusText", "isOnline", "isSingleAccount", "description", "populationStyle", "populationText", "playButtonText", "canForceAccount", "TileIllustrationUrl"};
    public static final String lpM = "flag";
    private static final String lpN = "gauge";
    private static final String lpO = "tileIllustration";
    private final bty_1 lpP;
    @NotNull
    private final ezt_0 lpQ;
    @Nullable
    private final ezy_0 lpR;
    private final Logger lpS = Logger.getLogger(bta_2.class);

    public bta_2(@NotNull bty_1 bty_12, @NotNull ezt_0 ezt_02, @Nullable ezy_0 ezy_02) {
        this.lpP = bty_12;
        this.lpQ = ezt_02;
        this.lpR = ezy_02;
    }

    @NotNull
    public ezt_0 enY() {
        return this.lpQ;
    }

    @Nullable
    public ezy_0 enZ() {
        return this.lpR;
    }

    public bty_1 eoa() {
        return this.lpP;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case lpv -> {
                bta_2 var5_4 = this.lpP.enR().enB().enL();
                Boolean var4_11 = var5_4 != null && var5_4.lpQ.d() == this.lpQ.d();
                yield var4_11;
            }
            case lpw -> {
                String var4_12 = this.getName();
                yield var4_12;
            }
            case lpx -> {
                if (this.eob().isEmpty()) {
                    Object var4_13 = null;
                    yield var4_13;
                }
                if (this.lpP.enR().enC() != ezx_0.pvi) {
                    String var4_14 = this.eob().map(s -> s + "/" + bib_0.ilf.dqp()).orElse(null);
                    yield var4_14;
                }
                Short var4_15 = this.eob().get();
                yield var4_15;
            }
            case lpy -> {
                Boolean var4_16 = this.eob().isPresent();
                yield var4_16;
            }
            case lpz -> {
                String var4_17 = lpM + this.lpQ.cWk().name();
                yield var4_17;
            }
            case lpA -> {
                String var4_18 = aum_0.cWf().c("worldCommunity." + this.lpQ.cWk().getName(), new Object[0]);
                yield var4_18;
            }
            case lpB -> {
                String var4_19 = this.eod().lpY;
                yield var4_19;
            }
            case lpC -> {
                String var4_20 = aum_0.cWf().c(this.eod().lpZ, new Object[0]);
                yield var4_20;
            }
            case lpD -> {
                Boolean var4_21 = this.cBt();
                yield var4_21;
            }
            case lpE -> {
                Boolean var4_22 = this.lpQ.fnj();
                yield var4_22;
            }
            case lpF -> {
                String var5_5 = "server.description.%s.%s".formatted(this.lpQ.enC().aJr(), this.lpQ.fnj());
                String var4_23 = aum_0.cWf().c(var5_5, new Object[0]);
                yield var4_23;
            }
            case lpG -> {
                vg_0 var5_6 = this.lpQ.fnk();
                if (var5_6 == null || var5_6 == vg_0.bJu) {
                    Object var4_24 = null;
                    yield var4_24;
                }
                String var4_25 = lpN + var5_6.name();
                yield var4_25;
            }
            case lpH -> {
                vg_0 var5_7 = this.lpQ.fnk();
                if (var5_7 == null || var5_7 == vg_0.bJu) {
                    Object var4_26 = null;
                    yield var4_26;
                }
                String var4_27 = aum_0.cWf().c("population." + var5_7.bkC(), new Object[0]);
                yield var4_27;
            }
            case lpI -> {
                btb_2 var5_8 = this.eod();
                if (var5_8 == btb_2.lpX) {
                    String var4_28 = aum_0.cWf().c("play", new Object[0]);
                    yield var4_28;
                }
                String var4_29 = aum_0.cWf().c(var5_8.lpZ, new Object[0]);
                yield var4_29;
            }
            case lpJ -> {
                Optional<evk_2> var5_9 = aup_0.cWm();
                evp_2 var6_34 = evq_2.a(var5_9, this.lpQ.d());
                Boolean var4_30 = evm_2.b(var6_34.fee(), evn_2.ouX);
                yield var4_30;
            }
            case lpK -> {
                String var5_10;
                try {
                    var5_10 = auc_0.cVq().bS("serverTilesPath");
                }
                catch (fu_0 var6_35) {
                    this.lpS.warn((Object)("Error retrieving server background illustration at path : " + var6_35.getMessage()));
                    aaw_1.bUq().h(new dae_0(17273));
                    Object var4_31 = null;
                    yield var4_31;
                }
                String var4_32 = String.format(var5_10, this.lpQ.eog());
                yield var4_32;
            }
            default -> {
                String var4_33 = null;
                yield var4_33;
            }
        };
    }

    public String getName() {
        return this.lpQ.A(aum_0.cWf().aUXX()).orElse(this.lpQ.getName());
    }

    public int d() {
        return this.lpQ.d();
    }

    private Optional<Short> eob() {
        return btc_2.eoi().JC(this.lpQ.d());
    }

    public boolean eoc() {
        Optional<Short> optional = this.eob();
        return optional.isPresent() && optional.get() == 0;
    }

    private btb_2 eod() {
        if (this.lpR == null) {
            return btb_2.lpT;
        }
        if (this.lpR.bfb()) {
            return btb_2.lpU;
        }
        if (this.eof()) {
            return btb_2.lpV;
        }
        if (!exH.er(this.lpR.fnr())) {
            return btb_2.lpW;
        }
        return btb_2.lpX;
    }

    public boolean cBt() {
        return this.eod() == btb_2.lpX || this.eod() == btb_2.lpU && this.eoe();
    }

    private boolean eoe() {
        Optional<evk_2> optional = aup_0.cWm();
        evp_2 evp_22 = evq_2.a(optional, this.lpQ.d());
        return evm_2.b(evp_22.fee(), evn_2.ova);
    }

    private boolean eof() {
        if (this.lpR != null && !this.lpR.fns().k(ewr_0.oCg)) {
            return false;
        }
        String string = aup_0.cWn().c(euq_1.orS.fds(), "0");
        return Integer.parseInt(string) != exH.pdx;
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    public String toString() {
        return "ServerView{m_proxy=" + String.valueOf(this.lpQ) + ", m_worldInfo=" + String.valueOf(this.lpR) + "}";
    }

    public int eog() {
        return this.lpQ.eog();
    }
}

