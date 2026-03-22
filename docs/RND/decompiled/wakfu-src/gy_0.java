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
 * Renamed from gY
 */
public final class gy_0 {
    static final Descriptors.Descriptor tC;
    static final GeneratedMessageV3.FieldAccessorTable tD;
    static final Descriptors.Descriptor tE;
    static final GeneratedMessageV3.FieldAccessorTable tF;
    private static Descriptors.FileDescriptor M;

    private gy_0() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        gy_0.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n!dungeon/dungeon_progression.proto\":\n\u0017ProtoDungeonProgression\u0012\u001f\n\u0003map\u0018\u0001 \u0003(\u000b2\u0012.ProtoDungeonEntry\"6\n\u0011ProtoDungeonEntry\u0012\r\n\u0005index\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ndifficulty\u0018\u0002 \u0002(\u0005B?\n!com.ankama.wakfu.protocol.dungeonB\u001aProtobufDungeonProgression"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        tC = (Descriptors.Descriptor)gy_0.j().getMessageTypes().get(0);
        tD = new GeneratedMessageV3.FieldAccessorTable(tC, new String[]{"Map"});
        tE = (Descriptors.Descriptor)gy_0.j().getMessageTypes().get(1);
        tF = new GeneratedMessageV3.FieldAccessorTable(tE, new String[]{"Index", "Difficulty"});
    }
}

