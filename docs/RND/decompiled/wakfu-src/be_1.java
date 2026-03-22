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
 * Renamed from bE
 */
public final class be_1
extends GeneratedMessageV3.Builder<be_1>
implements bf_2 {
    private long fG;

    public static final Descriptors.Descriptor jv() {
        return ae_1.eE;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eF.ensureFieldAccessorsInitialized(bc_2.class, be_1.class);
    }

    be_1() {
        this.D();
    }

    be_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (bc_2.ju()) {
            // empty if block
        }
    }

    public be_1 jw() {
        super.clear();
        this.fG = 0L;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.eE;
    }

    public bc_2 jt() {
        return bc_2.js();
    }

    public bc_2 jx() {
        bc_2 bc_22 = this.jy();
        if (!bc_22.isInitialized()) {
            throw be_1.newUninitializedMessageException((Message)bc_22);
        }
        return bc_22;
    }

    public bc_2 jy() {
        bc_2 bc_22 = new bc_2(this);
        bc_22.fG = this.fG;
        this.onBuilt();
        return bc_22;
    }

    public be_1 jz() {
        return (be_1)super.clone();
    }

    public be_1 ae(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (be_1)super.setField(fieldDescriptor, object);
    }

    public be_1 C(Descriptors.FieldDescriptor fieldDescriptor) {
        return (be_1)super.clearField(fieldDescriptor);
    }

    public be_1 C(Descriptors.OneofDescriptor oneofDescriptor) {
        return (be_1)super.clearOneof(oneofDescriptor);
    }

    public be_1 C(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (be_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public be_1 af(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (be_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public be_1 C(Message message) {
        if (message instanceof bc_2) {
            return this.c((bc_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public be_1 c(bc_2 bc_22) {
        if (bc_22 == bc_2.js()) {
            return this;
        }
        if (bc_22.fD() != 0L) {
            this.r(bc_22.fD());
        }
        this.af(bc_2.b(bc_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public be_1 aI(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bc_2 bc_22 = null;
        try {
            bc_22 = (bc_2)bc_2.gY.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bc_22 = (bc_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bc_22 != null) {
                this.c(bc_22);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public be_1 r(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public be_1 jA() {
        this.fG = 0L;
        this.onChanged();
        return this;
    }

    public final be_1 ae(UnknownFieldSet unknownFieldSet) {
        return (be_1)super.setUnknownFields(unknownFieldSet);
    }

    public final be_1 af(UnknownFieldSet unknownFieldSet) {
        return (be_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.af(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ae(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.af(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.C(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.C(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.C(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ae(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.jw();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.jz();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.af(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aI(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.C(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.jw();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.C(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.jz();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.af(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ae(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.af(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.C(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.C(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.C(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ae(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aI(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.jz();
    }

    public /* synthetic */ Message buildPartial() {
        return this.jy();
    }

    public /* synthetic */ Message build() {
        return this.jx();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.C(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.jw();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aI(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.jz();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.jy();
    }

    public /* synthetic */ MessageLite build() {
        return this.jx();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.jw();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.jt();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.jt();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aI(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.jz();
    }

    public /* synthetic */ Object clone() {
        return this.jz();
    }
}

