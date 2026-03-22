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
 * Renamed from zp
 */
public final class zp_2 {
    static final Descriptors.Descriptor anK;
    static final GeneratedMessageV3.FieldAccessorTable anL;
    static final Descriptors.Descriptor anM;
    static final GeneratedMessageV3.FieldAccessorTable anN;
    static final Descriptors.Descriptor anO;
    static final GeneratedMessageV3.FieldAccessorTable anP;
    private static Descriptors.FileDescriptor M;

    private zp_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        zp_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u0011stele/stele.proto\"w\n\u0010SteleInformation\u0012\u000f\n\u0007steleId\u0018\u0001 \u0002(\u0005\u0012%\n\u0010steleRewardTiers\u0018\u0002 \u0003(\u000b2\u000b.RewardTier\u0012\u001b\n\u0013enabledDifficulties\u0018\u0003 \u0003(\u0005\u0012\u000e\n\u0006active\u0018\u0004 \u0002(\b\"\u007f\n\nRewardTier\u0012\u000e\n\u0006tierId\u0018\u0001 \u0002(\u0005\u0012#\n\rstaticRewards\u0018\u0002 \u0003(\u000b2\f.SteleReward\u0012$\n\u000edynamicRewards\u0018\u0003 \u0003(\u000b2\f.SteleReward\u0012\u0016\n\u000erequiredWeight\u0018\u0004 \u0002(\u0005\"R\n\u000bSteleReward\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006itemId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bquantity\u0018\u0003 \u0002(\u0005\u0012\u000f\n\u0007enabled\u0018\u0004 \u0002(\bB7\n\u001fcom.ankama.wakfu.protocol.steleB\u0014ProtobufSteleContent"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        anK = (Descriptors.Descriptor)zp_2.j().getMessageTypes().get(0);
        anL = new GeneratedMessageV3.FieldAccessorTable(anK, new String[]{"SteleId", "SteleRewardTiers", "EnabledDifficulties", "Active"});
        anM = (Descriptors.Descriptor)zp_2.j().getMessageTypes().get(1);
        anN = new GeneratedMessageV3.FieldAccessorTable(anM, new String[]{"TierId", "StaticRewards", "DynamicRewards", "RequiredWeight"});
        anO = (Descriptors.Descriptor)zp_2.j().getMessageTypes().get(2);
        anP = new GeneratedMessageV3.FieldAccessorTable(anO, new String[]{"RewardId", "ItemId", "Quantity", "Enabled"});
    }
}

