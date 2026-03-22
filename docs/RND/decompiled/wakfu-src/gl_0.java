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
 * Renamed from gL
 */
public final class gl_0 {
    static final Descriptors.Descriptor sQ;
    static final GeneratedMessageV3.FieldAccessorTable sR;
    static final Descriptors.Descriptor sS;
    static final GeneratedMessageV3.FieldAccessorTable sT;
    static final Descriptors.Descriptor sU;
    static final GeneratedMessageV3.FieldAccessorTable sV;
    private static Descriptors.FileDescriptor M;

    private gl_0() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        gl_0.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u0015dungeon/dungeon.proto\"\u00d8\u0001\n\fProtoDungeon\u0012\u0010\n\bmaxLevel\u0018\u0001 \u0002(\u0005\u0012\u0017\n\u000fdifficultyLevel\u0018\u0002 \u0002(\u0005\u0012\u001d\n\u0015isDifficultyAvailable\u0018\u0003 \u0002(\b\u0012\u001d\n\u0015canIncreaseDifficulty\u0018\u0004 \u0002(\b\u0012\u0019\n\u0011isfightInProgress\u0018\u0005 \u0002(\b\u0012\u001e\n\u0016isCompetitiveCancelled\u0018\u0006 \u0002(\b\u0012\u0012\n\nallowedIds\u0018\u0007 \u0003(\u0003\u0012\u0010\n\bminLevel\u0018\b \u0002(\u0005\"E\n\u0016ProtoPartyInstanceInfo\u0012+\n\u0005entry\u0018\u0001 \u0003(\u000b2\u001c.ProtoPartyInstanceInfoEntry\"P\n\u001bProtoPartyInstanceInfoEntry\u0012\r\n\u0005index\u0018\u0001 \u0002(\u0003\u0012\"\n\u000bdungeonInfo\u0018\u0002 \u0002(\u000b2\r.ProtoDungeonB4\n!com.ankama.wakfu.protocol.dungeonB\u000fProtobufDungeon"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        sQ = (Descriptors.Descriptor)gl_0.j().getMessageTypes().get(0);
        sR = new GeneratedMessageV3.FieldAccessorTable(sQ, new String[]{"MaxLevel", "DifficultyLevel", "IsDifficultyAvailable", "CanIncreaseDifficulty", "IsfightInProgress", "IsCompetitiveCancelled", "AllowedIds", "MinLevel"});
        sS = (Descriptors.Descriptor)gl_0.j().getMessageTypes().get(1);
        sT = new GeneratedMessageV3.FieldAccessorTable(sS, new String[]{"Entry"});
        sU = (Descriptors.Descriptor)gl_0.j().getMessageTypes().get(2);
        sV = new GeneratedMessageV3.FieldAccessorTable(sU, new String[]{"Index", "DungeonInfo"});
    }
}

