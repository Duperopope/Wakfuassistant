/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FileDescriptor
 *  com.google.protobuf.ExtensionRegistry
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 */
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

/*
 * Renamed from hh
 */
public final class hh_1 {
    static final Descriptors.Descriptor tS;
    static final GeneratedMessageV3.FieldAccessorTable tT;
    static final Descriptors.Descriptor tU;
    static final GeneratedMessageV3.FieldAccessorTable tV;
    static final Descriptors.Descriptor tW;
    private static final GeneratedMessageV3.FieldAccessorTable tX;
    static final Descriptors.Descriptor tY;
    static final GeneratedMessageV3.FieldAccessorTable tZ;
    static final Descriptors.Descriptor ua;
    static final GeneratedMessageV3.FieldAccessorTable ub;
    static final Descriptors.Descriptor uc;
    private static final GeneratedMessageV3.FieldAccessorTable ud;
    private static Descriptors.FileDescriptor M;

    private hh_1() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        hh_1.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u001cdungeon/dungeon_ladder.proto\"\u009b\u0002\n\bTeamInfo\u0012\u0011\n\tdungeonId\u0018\u0001 \u0002(\u0005\u0012\u001f\n\nladderType\u0018\u0002 \u0001(\u000e2\u000b.LadderType\u0012\u000e\n\u0006teamId\u0018\u0003 \u0001(\u0003\u0012\u0013\n\u000bstasisLevel\u0018\u0004 \u0001(\u0005\u0012\u0018\n\u0010registrationDate\u0018\u0005 \u0001(\u0003\u0012\u0018\n\u0010dungeonTurnCount\u0018\u0006 \u0001(\u0005\u0012\u0015\n\rbossTurnCount\u0018\u0007 \u0001(\u0005\u0012)\n\u000fcompositionInfo\u0018\b \u0001(\u000b2\u0010.CompositionInfo\u0012\u0011\n\tteamScore\u0018\t \u0001(\u0003\u0012\u0013\n\u000bwaveReached\u0018\n \u0001(\u0005\u0012\u0018\n\u0010monstersDefeated\u0018\u000b \u0001(\u0005\"\u00a5\u0001\n\u000fCompositionInfo\u0012B\n\u0011infoByCharacterId\u0018\u0001 \u0003(\u000b2'.CompositionInfo.InfoByCharacterIdEntry\u001aN\n\u0016InfoByCharacterIdEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0003\u0012#\n\u0005value\u0018\u0002 \u0001(\u000b2\u0014.CompositionInfoData:\u00028\u0001\"\u007f\n\u0013CompositionInfoData\u0012\u000f\n\u0007breedId\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fisBestRecord\u0018\u0002 \u0001(\b\u0012\f\n\u0004name\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003sex\u0018\u0004 \u0001(\u0005\u0012\u0013\n\u000bguildBlazon\u0018\u0005 \u0001(\u0003\u0012\u0011\n\tguildName\u0018\u0006 \u0001(\t\"\u00b8\u0001\n\u000bRankingInfo\u0012\u0012\n\nstartIndex\u0018\u0001 \u0002(\u0005\u0012\u0017\n\u000ftotalIndexCount\u0018\u0002 \u0002(\u0005\u0012\u001b\n\u0013firstTeamFirstIndex\u0018\u0003 \u0001(\u0005\u0012&\n\u0005teams\u0018\u0004 \u0003(\u000b2\u0017.RankingInfo.TeamsEntry\u001a7\n\nTeamsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012\u0018\n\u0005value\u0018\u0002 \u0001(\u000b2\t.TeamInfo:\u00028\u0001*=\n\nLadderType\u0012\u0011\n\rCURRENT_MONTH\u0010\u0001\u0012\u000e\n\nLAST_MONTH\u0010\u0002\u0012\f\n\bALL_TIME\u0010\u0003BA\n(com.ankama.wakfu.protocol.dungeon.ladderB\u0015ProtobufDungeonLadder"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        tS = (Descriptors.Descriptor)hh_1.j().getMessageTypes().get(0);
        tT = new GeneratedMessageV3.FieldAccessorTable(tS, new String[]{"DungeonId", "LadderType", "TeamId", "StasisLevel", "RegistrationDate", "DungeonTurnCount", "BossTurnCount", "CompositionInfo", "TeamScore", "WaveReached", "MonstersDefeated"});
        tU = (Descriptors.Descriptor)hh_1.j().getMessageTypes().get(1);
        tV = new GeneratedMessageV3.FieldAccessorTable(tU, new String[]{"InfoByCharacterId"});
        tW = (Descriptors.Descriptor)tU.getNestedTypes().get(0);
        tX = new GeneratedMessageV3.FieldAccessorTable(tW, new String[]{"Key", "Value"});
        tY = (Descriptors.Descriptor)hh_1.j().getMessageTypes().get(2);
        tZ = new GeneratedMessageV3.FieldAccessorTable(tY, new String[]{"BreedId", "IsBestRecord", "Name", "Sex", "GuildBlazon", "GuildName"});
        ua = (Descriptors.Descriptor)hh_1.j().getMessageTypes().get(3);
        ub = new GeneratedMessageV3.FieldAccessorTable(ua, new String[]{"StartIndex", "TotalIndexCount", "FirstTeamFirstIndex", "Teams"});
        uc = (Descriptors.Descriptor)ua.getNestedTypes().get(0);
        ud = new GeneratedMessageV3.FieldAccessorTable(uc, new String[]{"Key", "Value"});
    }
}

