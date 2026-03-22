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
 * Renamed from hF
 */
public final class hf_0
extends GeneratedMessageV3.Builder<hf_0>
implements hg_0 {
    private int an;
    private int dL;

    public static final Descriptors.Descriptor JN() {
        return hc_0.vs;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hc_0.vt.ensureFieldAccessorsInitialized(hd_0.class, hf_0.class);
    }

    hf_0() {
        this.D();
    }

    hf_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (hd_0.aJ()) {
            // empty if block
        }
    }

    public hf_0 JO() {
        super.clear();
        this.dL = 0;
        this.an &= 0xFFFFFFFE;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return hc_0.vs;
    }

    public hd_0 JM() {
        return hd_0.JL();
    }

    public hd_0 JP() {
        hd_0 hd_02 = this.JQ();
        if (!hd_02.isInitialized()) {
            throw hf_0.newUninitializedMessageException((Message)hd_02);
        }
        return hd_02;
    }

    public hd_0 JQ() {
        hd_0 hd_02 = new hd_0(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            hd_02.dL = this.dL;
            n2 |= 1;
        }
        hd_02.an = n2;
        this.onBuilt();
        return hd_02;
    }

    public hf_0 JR() {
        return (hf_0)super.clone();
    }

    public hf_0 cG(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hf_0)super.setField(fieldDescriptor, object);
    }

    public hf_0 aQ(Descriptors.FieldDescriptor fieldDescriptor) {
        return (hf_0)super.clearField(fieldDescriptor);
    }

    public hf_0 aQ(Descriptors.OneofDescriptor oneofDescriptor) {
        return (hf_0)super.clearOneof(oneofDescriptor);
    }

    public hf_0 aQ(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (hf_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public hf_0 cH(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hf_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public hf_0 aQ(Message message) {
        if (message instanceof hd_0) {
            return this.c((hd_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public hf_0 c(hd_0 hd_02) {
        if (hd_02 == hd_0.JL()) {
            return this;
        }
        if (hd_02.oN()) {
            this.dL(hd_02.d());
        }
        this.cH(hd_0.b(hd_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.oN();
    }

    public hf_0 ey(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        hd_0 hd_02 = null;
        try {
            hd_02 = (hd_0)hd_0.vz.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            hd_02 = (hd_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (hd_02 != null) {
                this.c(hd_02);
            }
        }
        return this;
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public int d() {
        return this.dL;
    }

    public hf_0 dL(int n) {
        this.an |= 1;
        this.dL = n;
        this.onChanged();
        return this;
    }

    public hf_0 JS() {
        this.an &= 0xFFFFFFFE;
        this.dL = 0;
        this.onChanged();
        return this;
    }

    public final hf_0 cG(UnknownFieldSet unknownFieldSet) {
        return (hf_0)super.setUnknownFields(unknownFieldSet);
    }

    public final hf_0 cH(UnknownFieldSet unknownFieldSet) {
        return (hf_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cH(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cG(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cH(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aQ(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aQ(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aQ(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cG(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.JO();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.JR();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cH(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ey(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aQ(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.JO();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aQ(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.JR();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cH(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cG(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cH(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aQ(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aQ(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aQ(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cG(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ey(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.JR();
    }

    public /* synthetic */ Message buildPartial() {
        return this.JQ();
    }

    public /* synthetic */ Message build() {
        return this.JP();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aQ(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.JO();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ey(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.JR();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.JQ();
    }

    public /* synthetic */ MessageLite build() {
        return this.JP();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.JO();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.JM();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.JM();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ey(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.JR();
    }

    public /* synthetic */ Object clone() {
        return this.JR();
    }
}

