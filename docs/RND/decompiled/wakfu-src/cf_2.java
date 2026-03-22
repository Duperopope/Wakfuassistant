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
 * Renamed from cf
 */
public final class cf_2
extends GeneratedMessageV3.Builder<cf_2>
implements cg_1 {
    private long fG;
    private long fI;

    public static final Descriptors.Descriptor lA() {
        return ae_1.fm;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fn.ensureFieldAccessorsInitialized(cd_2.class, cf_2.class);
    }

    cf_2() {
        this.D();
    }

    cf_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (cd_2.lz()) {
            // empty if block
        }
    }

    public cf_2 lB() {
        super.clear();
        this.fG = 0L;
        this.fI = 0L;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.fm;
    }

    public cd_2 ly() {
        return cd_2.lx();
    }

    public cd_2 lC() {
        cd_2 cd_22 = this.lD();
        if (!cd_22.isInitialized()) {
            throw cf_2.newUninitializedMessageException((Message)cd_22);
        }
        return cd_22;
    }

    public cd_2 lD() {
        cd_2 cd_22 = new cd_2(this);
        cd_22.fG = this.fG;
        cd_22.fI = this.fI;
        this.onBuilt();
        return cd_22;
    }

    public cf_2 lE() {
        return (cf_2)super.clone();
    }

    public cf_2 as(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cf_2)super.setField(fieldDescriptor, object);
    }

    public cf_2 J(Descriptors.FieldDescriptor fieldDescriptor) {
        return (cf_2)super.clearField(fieldDescriptor);
    }

    public cf_2 J(Descriptors.OneofDescriptor oneofDescriptor) {
        return (cf_2)super.clearOneof(oneofDescriptor);
    }

    public cf_2 J(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (cf_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public cf_2 at(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cf_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public cf_2 J(Message message) {
        if (message instanceof cd_2) {
            return this.c((cd_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public cf_2 c(cd_2 cd_22) {
        if (cd_22 == cd_2.lx()) {
            return this;
        }
        if (cd_22.fD() != 0L) {
            this.y(cd_22.fD());
        }
        if (cd_22.fE() != 0L) {
            this.z(cd_22.fE());
        }
        this.at(cd_2.b(cd_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public cf_2 bd(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        cd_2 cd_22 = null;
        try {
            cd_22 = (cd_2)cd_2.hN.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            cd_22 = (cd_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (cd_22 != null) {
                this.c(cd_22);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public cf_2 y(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public cf_2 lF() {
        this.fG = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public long fE() {
        return this.fI;
    }

    public cf_2 z(long l) {
        this.fI = l;
        this.onChanged();
        return this;
    }

    public cf_2 lG() {
        this.fI = 0L;
        this.onChanged();
        return this;
    }

    public final cf_2 as(UnknownFieldSet unknownFieldSet) {
        return (cf_2)super.setUnknownFields(unknownFieldSet);
    }

    public final cf_2 at(UnknownFieldSet unknownFieldSet) {
        return (cf_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.at(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.as(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.at(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.J(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.J(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.J(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.as(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.lB();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.lE();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.at(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bd(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.J(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.lB();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.J(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.lE();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.at(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.as(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.at(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.J(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.J(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.J(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.as(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bd(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.lE();
    }

    public /* synthetic */ Message buildPartial() {
        return this.lD();
    }

    public /* synthetic */ Message build() {
        return this.lC();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.J(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.lB();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bd(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.lE();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.lD();
    }

    public /* synthetic */ MessageLite build() {
        return this.lC();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.lB();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ly();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ly();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bd(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.lE();
    }

    public /* synthetic */ Object clone() {
        return this.lE();
    }
}

