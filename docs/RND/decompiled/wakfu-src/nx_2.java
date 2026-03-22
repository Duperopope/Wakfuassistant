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
 * Renamed from nX
 */
public final class nx_2 {
    static final Descriptors.Descriptor PC;
    static final GeneratedMessageV3.FieldAccessorTable PD;
    static final Descriptors.Descriptor PE;
    static final GeneratedMessageV3.FieldAccessorTable PF;
    static final Descriptors.Descriptor PG;
    static final GeneratedMessageV3.FieldAccessorTable PH;
    private static Descriptors.FileDescriptor M;

    private nx_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        nx_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u0016pvp/battleground.proto\"7\n\u0015ProtoBattlegroundTeam\u0012\u000f\n\u0007nations\u0018\u0001 \u0003(\u0005\u0012\r\n\u0005score\u0018\u0002 \u0002(\u0005\"\u00af\u0002\n\u0011ProtoBattleground\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006dataId\u0018\u0003 \u0002(\u0005\u00120\n\u0010attackingNations\u0018\u0004 \u0002(\u000b2\u0016.ProtoBattlegroundTeam\u00120\n\u0010defendingNations\u0018\u0005 \u0002(\u000b2\u0016.ProtoBattlegroundTeam\u0012\u0011\n\tstartTime\u0018\u0006 \u0002(\u0003\u0012\u0010\n\bwinnerId\u0018\u0007 \u0001(\u0005\u0012\r\n\u0005level\u0018\b \u0001(\u0005\u0012\u000f\n\u0007ownerId\u0018\t \u0001(\u0005\u0012\u000f\n\u0007endTime\u0018\n \u0001(\u0003\u0012\u001a\n\u0012attackerPopulation\u0018\u000b \u0001(\u0005\u0012\u001a\n\u0012defenderPopulation\u0018\f \u0001(\u0005\"A\n\u0015ProtoBattlegroundList\u0012(\n\fbattleground\u0018\u0001 \u0003(\u000b2\u0012.ProtoBattlegroundB5\n\u001dcom.ankama.wakfu.protocol.pvpB\u0014ProtobufBattleground"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        PC = (Descriptors.Descriptor)nx_2.j().getMessageTypes().get(0);
        PD = new GeneratedMessageV3.FieldAccessorTable(PC, new String[]{"Nations", "Score"});
        PE = (Descriptors.Descriptor)nx_2.j().getMessageTypes().get(1);
        PF = new GeneratedMessageV3.FieldAccessorTable(PE, new String[]{"Id", "Type", "DataId", "AttackingNations", "DefendingNations", "StartTime", "WinnerId", "Level", "OwnerId", "EndTime", "AttackerPopulation", "DefenderPopulation"});
        PG = (Descriptors.Descriptor)nx_2.j().getMessageTypes().get(2);
        PH = new GeneratedMessageV3.FieldAccessorTable(PG, new String[]{"Battleground"});
    }
}

