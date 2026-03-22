/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
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
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from bj
 */
public final class bj_2
extends GeneratedMessageV3.Builder<bj_2>
implements bk_1 {
    private Object bs = "";

    public static final Descriptors.Descriptor ie() {
        return ae_1.fw;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fx.ensureFieldAccessorsInitialized(bh_1.class, bj_2.class);
    }

    bj_2() {
        this.D();
    }

    bj_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (bh_1.id()) {
            // empty if block
        }
    }

    public bj_2 if() {
        super.clear();
        this.bs = "";
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.fw;
    }

    public bh_1 ic() {
        return bh_1.ib();
    }

    public bh_1 ig() {
        bh_1 bh_12 = this.ih();
        if (!bh_12.isInitialized()) {
            throw bj_2.newUninitializedMessageException((Message)bh_12);
        }
        return bh_12;
    }

    public bh_1 ih() {
        bh_1 bh_12 = new bh_1(this);
        bh_12.bs = this.bs;
        this.onBuilt();
        return bh_12;
    }

    public bj_2 ii() {
        return (bj_2)super.clone();
    }

    public bj_2 U(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bj_2)super.setField(fieldDescriptor, object);
    }

    public bj_2 x(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bj_2)super.clearField(fieldDescriptor);
    }

    public bj_2 x(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bj_2)super.clearOneof(oneofDescriptor);
    }

    public bj_2 x(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bj_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bj_2 V(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bj_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public bj_2 x(Message message) {
        if (message instanceof bh_1) {
            return this.g((bh_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bj_2 g(bh_1 bh_12) {
        if (bh_12 == bh_1.ib()) {
            return this;
        }
        if (!bh_12.getName().isEmpty()) {
            this.bs = bh_12.bs;
            this.onChanged();
        }
        this.V(bh_1.f(bh_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public bj_2 at(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bh_1 bh_12 = null;
        try {
            bh_12 = (bh_1)bh_1.gE.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bh_12 = (bh_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bh_12 != null) {
                this.g(bh_12);
            }
        }
        return this;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.bs = string;
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString bW() {
        Object object = this.bs;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bs = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public bj_2 s(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.bs = string;
        this.onChanged();
        return this;
    }

    public bj_2 ij() {
        this.bs = bh_1.ib().getName();
        this.onChanged();
        return this;
    }

    public bj_2 Z(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        bh_1.Y(byteString);
        this.bs = byteString;
        this.onChanged();
        return this;
    }

    public final bj_2 U(UnknownFieldSet unknownFieldSet) {
        return (bj_2)super.setUnknownFields(unknownFieldSet);
    }

    public final bj_2 V(UnknownFieldSet unknownFieldSet) {
        return (bj_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.V(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.U(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.V(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.x(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.x(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.x(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.U(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.if();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.ii();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.V(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.at(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.x(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.if();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.x(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.ii();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.V(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.U(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.V(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.x(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.x(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.x(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.U(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.at(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.ii();
    }

    public /* synthetic */ Message buildPartial() {
        return this.ih();
    }

    public /* synthetic */ Message build() {
        return this.ig();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.x(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.if();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.at(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.ii();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.ih();
    }

    public /* synthetic */ MessageLite build() {
        return this.ig();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.if();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ic();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ic();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.at(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.ii();
    }

    public /* synthetic */ Object clone() {
        return this.ii();
    }
}

