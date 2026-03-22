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

public final class eO {
    static final Descriptors.Descriptor nM;
    static final GeneratedMessageV3.FieldAccessorTable nN;
    static final Descriptors.Descriptor nO;
    static final GeneratedMessageV3.FieldAccessorTable nP;
    static final Descriptors.Descriptor nQ;
    static final GeneratedMessageV3.FieldAccessorTable nR;
    static final Descriptors.Descriptor nS;
    static final GeneratedMessageV3.FieldAccessorTable nT;
    private static Descriptors.FileDescriptor M;

    private eO() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        eO.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\nchat.proto\"v\n\u0010ProtoFriendLists\u0012\u001d\n\u0007friends\u0018\u0001 \u0003(\u000b2\f.ProtoFriend\u0012$\n\u0016uselessFieldToSeparate\u0018\u0002 \u0001(\b:\u0004true\u0012\u001d\n\u0007ignored\u0018\u0003 \u0003(\u000b2\f.ProtoFriend\"b\n\u000bProtoFriend\u0012\u0011\n\taccountId\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000baccountName\u0018\u0002 \u0002(\t\u0012\u000b\n\u0003tag\u0018\u0003 \u0001(\t\u0012\r\n\u0005flags\u00182 \u0001(\u0005\u0012\u000f\n\u0007comment\u00183 \u0001(\t\"s\n\u0019ProtoFriendListsForClient\u0012*\n\u0007friends\u0018\u0001 \u0003(\u000b2\u0019.ProtoFriendInfoForClient\u0012*\n\u0007ignored\u0018\u0002 \u0003(\u000b2\u0019.ProtoFriendInfoForClient\"\u00c7\u0001\n\u0018ProtoFriendInfoForClient\u0012\u0011\n\taccountId\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000baccountName\u0018\u0002 \u0002(\t\u0012\u0010\n\bisOnline\u0018\u0004 \u0002(\b\u0012\u0017\n\rcharacterName\u00182 \u0001(\t:\u0000\u0012\u000e\n\u0006notify\u00183 \u0001(\b\u0012\u0013\n\u0007breedId\u00184 \u0001(\u0005:\u0002-1\u0012\u000f\n\u0003sex\u00185 \u0001(\u0005:\u0002-1\u0012\u0012\n\ncommentary\u00186 \u0001(\t\u0012\u000e\n\u0002xp\u00187 \u0001(\u0003:\u0002-1B.\n\u001ecom.ankama.wakfu.protocol.chatB\fProtobufChat"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        nM = (Descriptors.Descriptor)eO.j().getMessageTypes().get(0);
        nN = new GeneratedMessageV3.FieldAccessorTable(nM, new String[]{"Friends", "UselessFieldToSeparate", "Ignored"});
        nO = (Descriptors.Descriptor)eO.j().getMessageTypes().get(1);
        nP = new GeneratedMessageV3.FieldAccessorTable(nO, new String[]{"AccountId", "AccountName", "Tag", "Flags", "Comment"});
        nQ = (Descriptors.Descriptor)eO.j().getMessageTypes().get(2);
        nR = new GeneratedMessageV3.FieldAccessorTable(nQ, new String[]{"Friends", "Ignored"});
        nS = (Descriptors.Descriptor)eO.j().getMessageTypes().get(3);
        nT = new GeneratedMessageV3.FieldAccessorTable(nS, new String[]{"AccountId", "AccountName", "IsOnline", "CharacterName", "Notify", "BreedId", "Sex", "Commentary", "Xp"});
    }
}

