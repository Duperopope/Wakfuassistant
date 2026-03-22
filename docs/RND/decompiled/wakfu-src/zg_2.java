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
 * Renamed from zg
 */
public final class zg_2 {
    static final Descriptors.Descriptor ant;
    static final GeneratedMessageV3.FieldAccessorTable anu;
    static final Descriptors.Descriptor anv;
    static final GeneratedMessageV3.FieldAccessorTable anw;
    private static Descriptors.FileDescriptor M;

    private zg_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        zg_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u0012fight/spells.proto\"*\n\u000fSpellsInventory\u0012\u0017\n\u0006spells\u0018\u0001 \u0003(\u000b2\u0007.Spells\":\n\u0006Spells\u0012\u0010\n\buniqueId\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007spellId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0003 \u0002(\u0005B2\n com.ankama.wakfu.protocol.spellsB\u000eProtobufSpells"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        ant = (Descriptors.Descriptor)zg_2.j().getMessageTypes().get(0);
        anu = new GeneratedMessageV3.FieldAccessorTable(ant, new String[]{"Spells"});
        anv = (Descriptors.Descriptor)zg_2.j().getMessageTypes().get(1);
        anw = new GeneratedMessageV3.FieldAccessorTable(anv, new String[]{"UniqueId", "SpellId", "Level"});
    }
}

