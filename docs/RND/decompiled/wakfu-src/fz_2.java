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
 * Renamed from fZ
 */
public final class fz_2 {
    static final Descriptors.Descriptor rz;
    static final GeneratedMessageV3.FieldAccessorTable rA;
    private static Descriptors.FileDescriptor M;

    private fz_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        fz_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u0018craft/artisansBook.proto\u001a accountData/craftInventory.proto\u001a\u0017craft/secureCraft.proto\"{\n\u0018ProtoArtisanInformations\u00126\n\u000fsecureCraftInfo\u0018\u0001 \u0002(\u000b2\u001d.ProtoSecureCraftInformations\u0012'\n\u000bserviceInfo\u0018\u0002 \u0001(\u000b2\u0012.ProtoCraftServiceB7\n\u001fcom.ankama.wakfu.protocol.craftB\u0014ProtobufArtisansBook"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{df_2.j(), ge_2.j()});
        rz = (Descriptors.Descriptor)fz_2.j().getMessageTypes().get(0);
        rA = new GeneratedMessageV3.FieldAccessorTable(rz, new String[]{"SecureCraftInfo", "ServiceInfo"});
        df_2.j();
        ge_2.j();
    }
}

