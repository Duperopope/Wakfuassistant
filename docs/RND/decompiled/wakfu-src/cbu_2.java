/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Comparator;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cbU
 */
public class cbu_2
implements aeh_2 {
    public static final String lLt = "isOnline";
    public static final String lLu = "onlineWithColor";
    public static final String lLv = "name";
    public static final String lLw = "accountId";
    public static final String lLx = "characterId";
    public static final String lLy = "nameWithoutText";
    public static final String lLz = "subscriptionLevel";
    public static final String lLA = "gameServer";
    public static final String lLB = "position";
    public static final String lLC = "instance";
    public static final String lLD = "ankamaName";
    public static final String lLE = "level";
    public static final String lLF = "race";
    public static final String lLG = "guild";
    public static final String lLH = "guildId";
    public static final String lLI = "respawnCoords";
    public static final String lLJ = "respawnGameServer";
    public static final String lLK = "isMuted";
    public static final String lLL = "isHiddenMuted";
    public static final String lLM = "isLanguageRestricted";
    public static final String lLN = "totalCash";
    public static final String lLO = "craftsLevelPopup";
    public static final String[] lLP = new String[]{"isOnline", "onlineWithColor", "name", "accountId", "characterId", "nameWithoutText", "subscriptionLevel", "gameServer", "position", "instance", "ankamaName", "level", "race", "guild", "guildId", "respawnCoords", "respawnGameServer", "isMuted", "isHiddenMuted", "isLanguageRestricted", "totalCash", "craftsLevelPopup"};
    private nE lLQ;
    private String aFF;

    public cbu_2(String string) {
        this.lLQ = nE.arN().ab(string).bF(0L).bG(0L).arT();
    }

    public cbu_2(nE nE2) {
        this.lLQ = nE2.arO().arV().arT();
    }

    public void d(nE nE2) {
        this.lLQ = nE2;
        fse_1.gFu().a((aef_2)this, lLP);
    }

    public void e(nE nE2) {
        this.lLQ = this.lLQ.arO().X(nE2.arp()).ag(nE2.arr()).Y(nE2.aru()).ah(nE2.arw()).Z(nE2.arz()).arT();
        fse_1.gFu().a((aef_2)this, lLK, lLL, lLM);
    }

    public void my(String string) {
        this.aFF = string;
        fse_1.gFu().a((aef_2)this, lLG);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "isOnline": {
                return this.lLQ.aqh();
            }
            case "onlineWithColor": {
                return cwj_1.kJ(this.lLQ.aqh());
            }
            case "name": 
            case "nameWithoutText": {
                return this.lLQ.getName();
            }
            case "accountId": {
                return String.valueOf(this.lLQ.xl());
            }
            case "characterId": {
                return String.valueOf(this.lLQ.KU());
            }
            case "ankamaName": {
                return this.lLQ.aqN() + (String)(this.lLQ.aqQ().isEmpty() ? "" : "#" + this.lLQ.aqQ());
            }
            case "subscriptionLevel": {
                return cbu_2.i("moderationPanel.subscriptionLevel", this.esI());
            }
            case "race": {
                return cbu_2.i("moderationPanel.race", eym.OR(this.lLQ.xT()).toString());
            }
            case "level": {
                return cbu_2.i("moderationPanel.level", this.lLQ.tL());
            }
            case "guild": {
                return cbu_2.i("moderationPanel.guild", this.aFF);
            }
            case "guildId": {
                return String.valueOf(this.lLQ.Ya());
            }
            case "position": {
                return cbu_2.i("moderationPanel.currentPosition", this.lLQ.aqT() + ", " + this.lLQ.aqV() + ", " + this.lLQ.aqX());
            }
            case "instance": {
                return cbu_2.i("moderationPanel.currentInstance", this.lLQ.aqZ());
            }
            case "gameServer": {
                return cbu_2.i("moderationPanel.currentGameServer", this.lLQ.arb());
            }
            case "respawnCoords": {
                return cbu_2.i("moderationPanel.respawnCoords", this.lLQ.are() + ", " + this.lLQ.arg() + ", " + this.lLQ.ari() + " @ " + this.lLQ.ark());
            }
            case "respawnGameServer": {
                return cbu_2.i("moderationPanel.currentGameServer", this.lLQ.arm());
            }
            case "isMuted": {
                return this.a(this.lLQ.arp(), this.lLQ.arr(), "moderationPanel.isMuted");
            }
            case "isHiddenMuted": {
                return this.a(this.lLQ.aru(), this.lLQ.arw(), "moderationPanel.isHiddenMuted");
            }
            case "isLanguageRestricted": {
                if (!this.lLQ.aqh()) {
                    return cbu_2.i("moderationPanel.isLanguageRestricted", "?");
                }
                return cbu_2.i("moderationPanel.isLanguageRestricted", aum_0.cWf().eZ(this.lLQ.arz()));
            }
            case "totalCash": {
                return aum_0.cWf().c("kama.shortGain", this.lLQ.arH() >= 0L ? Long.valueOf(this.lLQ.arH()) : "?");
            }
            case "craftsLevelPopup": {
                return this.esJ();
            }
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return lLP;
    }

    private String a(boolean bl, String string, String string2) {
        if (!this.lLQ.aqh()) {
            return cbu_2.i(string2, "?");
        }
        String string3 = bl ? String.format("%s - %s", aum_0.cWf().c("yes", new Object[0]), string) : aum_0.cWf().c("no", new Object[0]);
        return cbu_2.i(string2, string3);
    }

    private static String i(String string, Object object) {
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.ceC().ceu().c(aum_0.cWf().c(string, new Object[0])).cev().c(" : " + String.valueOf(object)).ceD();
        return ahv_22.ceL();
    }

    public long Ya() {
        return this.lLQ.Ya();
    }

    public String getName() {
        return this.lLQ.getName();
    }

    public long xl() {
        return this.lLQ.xl();
    }

    public long KU() {
        return this.lLQ.KU();
    }

    public String aqN() {
        return this.lLQ.aqN();
    }

    @NotNull
    public String getTag() {
        return this.lLQ.aqQ();
    }

    private String esI() {
        evt_1 evt_12 = evt_1.Oq(this.lLQ.arF());
        switch (evt_12) {
            case owL: {
                return "No booster";
            }
            case owM: {
                return "Booster";
            }
        }
        return "?";
    }

    private String esJ() {
        return this.lLQ.arL().entrySet().stream().map(entry -> new Bu<String, Integer>(bms_1.Dm((Integer)entry.getKey()), (Integer)entry.getValue())).sorted(Comparator.comparing(bu -> BH.aT((String)bu.getFirst()))).map(bu -> (String)bu.getFirst() + " : " + String.valueOf(bu.aHI())).collect(Collectors.joining("\n"));
    }
}

