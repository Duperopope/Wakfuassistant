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
 * Renamed from jE
 */
public final class je_2
extends GeneratedMessageV3.Builder<je_2>
implements jj_2 {
    private int an;
    private int dL;

    public static final Descriptors.Descriptor Wv() {
        return jb_2.CE;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jb_2.CF.ensureFieldAccessorsInitialized(jc_2.class, je_2.class);
    }

    je_2() {
        this.D();
    }

    je_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (jc_2.aJ()) {
            // empty if block
        }
    }

    public je_2 Ww() {
        super.clear();
        this.dL = 0;
        this.an &= 0xFFFFFFFE;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return jb_2.CE;
    }

    public jc_2 Wu() {
        return jc_2.Wt();
    }

    public jc_2 Wx() {
        jc_2 jc_22 = this.Wy();
        if (!jc_22.isInitialized()) {
            throw je_2.newUninitializedMessageException((Message)jc_22);
        }
        return jc_22;
    }

    public jc_2 Wy() {
        jc_2 jc_22 = new jc_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            jc_22.dL = this.dL;
            n2 |= 1;
        }
        jc_22.an = n2;
        this.onBuilt();
        return jc_22;
    }

    public je_2 Wz() {
        return (je_2)super.clone();
    }

    public je_2 dC(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (je_2)super.setField(fieldDescriptor, object);
    }

    public je_2 bo(Descriptors.FieldDescriptor fieldDescriptor) {
        return (je_2)super.clearField(fieldDescriptor);
    }

    public je_2 bo(Descriptors.OneofDescriptor oneofDescriptor) {
        return (je_2)super.clearOneof(oneofDescriptor);
    }

    public je_2 bo(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (je_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public je_2 dD(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (je_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public je_2 bo(Message message) {
        if (message instanceof jc_2) {
            return this.c((jc_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public je_2 c(jc_2 jc_22) {
        if (jc_22 == jc_2.Wt()) {
            return this;
        }
        if (jc_22.oN()) {
            this.fE(jc_22.d());
        }
        this.dD(jc_2.b(jc_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.oN();
    }

    public je_2 fS(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        jc_2 jc_22 = null;
        try {
            jc_22 = (jc_2)jc_2.CL.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            jc_22 = (jc_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (jc_22 != null) {
                this.c(jc_22);
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

    public je_2 fE(int n) {
        this.an |= 1;
        this.dL = n;
        this.onChanged();
        return this;
    }

    public je_2 WA() {
        this.an &= 0xFFFFFFFE;
        this.dL = 0;
        this.onChanged();
        return this;
    }

    public final je_2 dC(UnknownFieldSet unknownFieldSet) {
        return (je_2)super.setUnknownFields(unknownFieldSet);
    }

    public final je_2 dD(UnknownFieldSet unknownFieldSet) {
        return (je_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dD(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dC(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dD(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bo(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bo(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bo(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dC(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Ww();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Wz();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dD(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fS(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bo(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Ww();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bo(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Wz();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dD(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dC(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dD(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bo(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bo(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bo(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dC(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fS(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Wz();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Wy();
    }

    public /* synthetic */ Message build() {
        return this.Wx();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bo(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Ww();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fS(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Wz();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Wy();
    }

    public /* synthetic */ MessageLite build() {
        return this.Wx();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Ww();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Wu();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Wu();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fS(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Wz();
    }

    public /* synthetic */ Object clone() {
        return this.Wz();
    }
}

