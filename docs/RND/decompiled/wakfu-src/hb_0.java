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
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from hb
 */
public final class hb_0
extends GeneratedMessageV3.Builder<hb_0>
implements hc_1 {
    private int an;
    private int nt;
    private int tJ;

    public static final Descriptors.Descriptor GT() {
        return gy_0.tE;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gy_0.tF.ensureFieldAccessorsInitialized(gz_0.class, hb_0.class);
    }

    hb_0() {
        this.D();
    }

    hb_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (gz_0.oV()) {
            // empty if block
        }
    }

    public hb_0 GU() {
        super.clear();
        this.nt = 0;
        this.an &= 0xFFFFFFFE;
        this.tJ = 0;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return gy_0.tE;
    }

    public gz_0 GS() {
        return gz_0.GR();
    }

    public gz_0 GV() {
        gz_0 gz_02 = this.GW();
        if (!gz_02.isInitialized()) {
            throw hb_0.newUninitializedMessageException((Message)gz_02);
        }
        return gz_02;
    }

    public gz_0 GW() {
        gz_0 gz_02 = new gz_0(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            gz_02.nt = this.nt;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            gz_02.tJ = this.tJ;
            n2 |= 2;
        }
        gz_02.an = n2;
        this.onBuilt();
        return gz_02;
    }

    public hb_0 GX() {
        return (hb_0)super.clone();
    }

    public hb_0 cu(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hb_0)super.setField(fieldDescriptor, object);
    }

    public hb_0 aK(Descriptors.FieldDescriptor fieldDescriptor) {
        return (hb_0)super.clearField(fieldDescriptor);
    }

    public hb_0 aK(Descriptors.OneofDescriptor oneofDescriptor) {
        return (hb_0)super.clearOneof(oneofDescriptor);
    }

    public hb_0 aK(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (hb_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public hb_0 cv(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hb_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public hb_0 aK(Message message) {
        if (message instanceof gz_0) {
            return this.c((gz_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public hb_0 c(gz_0 gz_02) {
        if (gz_02 == gz_0.GR()) {
            return this;
        }
        if (gz_02.wo()) {
            this.dn(gz_02.wp());
        }
        if (gz_02.GM()) {
            this.do(gz_02.GN());
        }
        this.cv(gz_0.b(gz_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.wo()) {
            return false;
        }
        return this.GM();
    }

    public hb_0 eg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        gz_0 gz_02 = null;
        try {
            gz_02 = (gz_0)gz_0.tL.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            gz_02 = (gz_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (gz_02 != null) {
                this.c(gz_02);
            }
        }
        return this;
    }

    @Override
    public boolean wo() {
        return (this.an & 1) != 0;
    }

    @Override
    public int wp() {
        return this.nt;
    }

    public hb_0 dn(int n) {
        this.an |= 1;
        this.nt = n;
        this.onChanged();
        return this;
    }

    public hb_0 GY() {
        this.an &= 0xFFFFFFFE;
        this.nt = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean GM() {
        return (this.an & 2) != 0;
    }

    @Override
    public int GN() {
        return this.tJ;
    }

    public hb_0 do(int n) {
        this.an |= 2;
        this.tJ = n;
        this.onChanged();
        return this;
    }

    public hb_0 GZ() {
        this.an &= 0xFFFFFFFD;
        this.tJ = 0;
        this.onChanged();
        return this;
    }

    public final hb_0 cu(UnknownFieldSet unknownFieldSet) {
        return (hb_0)super.setUnknownFields(unknownFieldSet);
    }

    public final hb_0 cv(UnknownFieldSet unknownFieldSet) {
        return (hb_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cv(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cu(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cv(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aK(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aK(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aK(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cu(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.GU();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.GX();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cv(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eg(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aK(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.GU();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aK(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.GX();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cv(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cu(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cv(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aK(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aK(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aK(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cu(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eg(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.GX();
    }

    public /* synthetic */ Message buildPartial() {
        return this.GW();
    }

    public /* synthetic */ Message build() {
        return this.GV();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aK(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.GU();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eg(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.GX();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.GW();
    }

    public /* synthetic */ MessageLite build() {
        return this.GV();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.GU();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.GS();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.GS();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eg(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.GX();
    }

    public /* synthetic */ Object clone() {
        return this.GX();
    }
}

