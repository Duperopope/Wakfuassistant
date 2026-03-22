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
 * Renamed from ge
 */
public final class ge_2 {
    static final Descriptors.Descriptor rK;
    static final GeneratedMessageV3.FieldAccessorTable rL;
    static final Descriptors.Descriptor rM;
    private static final GeneratedMessageV3.FieldAccessorTable rN;
    static final Descriptors.Descriptor rO;
    static final GeneratedMessageV3.FieldAccessorTable rP;
    private static Descriptors.FileDescriptor M;

    private ge_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        ge_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u0017craft/secureCraft.proto\u001a accountData/craftInventory.proto\"\u00ba\u0001\n\u001cProtoSecureCraftInformations\u00129\n\u0006crafts\u0018\u0001 \u0003(\u000b2).ProtoSecureCraftInformations.CraftsEntry\u0012\u001d\n\u0004fees\u0018\u0002 \u0001(\u000b2\u000f.ProtoCraftFees\u001a@\n\u000bCraftsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012 \n\u0005value\u0018\u0002 \u0001(\u000b2\u0011.ProtoPublicCraft:\u00028\u0001\"G\n\u0010ProtoPublicCraft\u0012\r\n\u0005level\u0018\u0001 \u0002(\u0005\u0012$\n\u000elearnedRecipes\u0018\u0002 \u0003(\u000b2\f.ProtoRecipeB6\n\u001fcom.ankama.wakfu.protocol.craftB\u0013ProtobufSecureCraft"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{df_2.j()});
        rK = (Descriptors.Descriptor)ge_2.j().getMessageTypes().get(0);
        rL = new GeneratedMessageV3.FieldAccessorTable(rK, new String[]{"Crafts", "Fees"});
        rM = (Descriptors.Descriptor)rK.getNestedTypes().get(0);
        rN = new GeneratedMessageV3.FieldAccessorTable(rM, new String[]{"Key", "Value"});
        rO = (Descriptors.Descriptor)ge_2.j().getMessageTypes().get(1);
        rP = new GeneratedMessageV3.FieldAccessorTable(rO, new String[]{"Level", "LearnedRecipes"});
        df_2.j();
    }
}

