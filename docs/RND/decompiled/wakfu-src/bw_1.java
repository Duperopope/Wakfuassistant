/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from bw
 */
public final class bw_1
extends GeneratedMessageV3.Builder<bw_1>
implements bx_1 {
    private long fG;

    public static final Descriptors.Descriptor iV() {
        return ae_1.eO;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eP.ensureFieldAccessorsInitialized(bu_2.class, bw_1.class);
    }

    bw_1() {
        this.D();
    }

    bw_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (bu_2.iU()) {
            // empty if block
        }
    }

    public bw_1 iW() {
        super.clear();
        this.fG = 0L;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.eO;
    }

    public bu_2 iT() {
        return bu_2.iS();
    }

    public bu_2 iX() {
        bu_2 bu_22 = this.iY();
        if (!bu_22.isInitialized()) {
            throw bw_1.newUninitializedMessageException((Message)bu_22);
        }
        return bu_22;
    }

    public bu_2 iY() {
        bu_2 bu_22 = new bu_2(this);
        bu_22.fG = this.fG;
        this.onBuilt();
        return bu_22;
    }

    public bw_1 iZ() {
        return (bw_1)super.clone();
    }

    public bw_1 aa(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bw_1)super.setField(fieldDescriptor, object);
    }

    public bw_1 A(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bw_1)super.clearField(fieldDescriptor);
    }

    public bw_1 A(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bw_1)super.clearOneof(oneofDescriptor);
    }

    public bw_1 A(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bw_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bw_1 ab(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bw_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public bw_1 A(Message message) {
        if (message instanceof bu_2) {
            return this.c((bu_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bw_1 c(bu_2 bu_22) {
        if (bu_22 == bu_2.iS()) {
            return this;
        }
        if (bu_22.fD() != 0L) {
            this.p(bu_22.fD());
        }
        this.ab(bu_2.b(bu_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public bw_1 aC(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bu_2 bu_22 = null;
        try {
            bu_22 = (bu_2)bu_2.gQ.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bu_22 = (bu_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bu_22 != null) {
                this.c(bu_22);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public bw_1 p(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public bw_1 ja() {
        this.fG = 0L;
        this.onChanged();
        return this;
    }

    public final bw_1 aa(UnknownFieldSet unknownFieldSet) {
        return (bw_1)super.setUnknownFields(unknownFieldSet);
    }

    public final bw_1 ab(UnknownFieldSet unknownFieldSet) {
        return (bw_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ab(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aa(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ab(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.A(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.A(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.A(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aa(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.iW();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.iZ();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ab(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aC(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.A(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.iW();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.A(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.iZ();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ab(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aa(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ab(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.A(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.A(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.A(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aa(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aC(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.iZ();
    }

    public /* synthetic */ Message buildPartial() {
        return this.iY();
    }

    public /* synthetic */ Message build() {
        return this.iX();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.A(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.iW();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aC(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.iZ();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.iY();
    }

    public /* synthetic */ MessageLite build() {
        return this.iX();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.iW();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.iT();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.iT();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aC(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.iZ();
    }

    public /* synthetic */ Object clone() {
        return this.iZ();
    }
}

