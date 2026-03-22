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
 * Renamed from io
 */
public final class io_2
extends GeneratedMessageV3.Builder<io_2>
implements ip_1 {
    private int an;
    private int xX;
    private int xZ;
    private int yb;

    public static final Descriptors.Descriptor NT() {
        return ih_2.wx;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ih_2.wy.ensureFieldAccessorsInitialized(im_2.class, io_2.class);
    }

    io_2() {
        this.D();
    }

    io_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (im_2.fa()) {
            // empty if block
        }
    }

    public io_2 NU() {
        super.clear();
        this.xX = 0;
        this.an &= 0xFFFFFFFE;
        this.xZ = 0;
        this.an &= 0xFFFFFFFD;
        this.yb = 0;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ih_2.wx;
    }

    public im_2 NS() {
        return im_2.NR();
    }

    public im_2 NV() {
        im_2 im_22 = this.NW();
        if (!im_22.isInitialized()) {
            throw io_2.newUninitializedMessageException((Message)im_22);
        }
        return im_22;
    }

    public im_2 NW() {
        im_2 im_22 = new im_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            im_22.xX = this.xX;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            im_22.xZ = this.xZ;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            im_22.yb = this.yb;
            n2 |= 4;
        }
        im_22.an = n2;
        this.onBuilt();
        return im_22;
    }

    public io_2 NX() {
        return (io_2)super.clone();
    }

    public io_2 cW(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (io_2)super.setField(fieldDescriptor, object);
    }

    public io_2 aY(Descriptors.FieldDescriptor fieldDescriptor) {
        return (io_2)super.clearField(fieldDescriptor);
    }

    public io_2 aY(Descriptors.OneofDescriptor oneofDescriptor) {
        return (io_2)super.clearOneof(oneofDescriptor);
    }

    public io_2 aY(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (io_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public io_2 cX(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (io_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public io_2 aY(Message message) {
        if (message instanceof im_2) {
            return this.c((im_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public io_2 c(im_2 im_22) {
        if (im_22 == im_2.NR()) {
            return this;
        }
        if (im_22.NK()) {
            this.es(im_22.getX());
        }
        if (im_22.NL()) {
            this.et(im_22.getY());
        }
        if (im_22.NM()) {
            this.eu(im_22.NN());
        }
        this.cX(im_2.b(im_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.NK()) {
            return false;
        }
        if (!this.NL()) {
            return false;
        }
        return this.NM();
    }

    public io_2 eW(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        im_2 im_22 = null;
        try {
            im_22 = (im_2)im_2.yd.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            im_22 = (im_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (im_22 != null) {
                this.c(im_22);
            }
        }
        return this;
    }

    @Override
    public boolean NK() {
        return (this.an & 1) != 0;
    }

    @Override
    public int getX() {
        return this.xX;
    }

    public io_2 es(int n) {
        this.an |= 1;
        this.xX = n;
        this.onChanged();
        return this;
    }

    public io_2 NY() {
        this.an &= 0xFFFFFFFE;
        this.xX = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean NL() {
        return (this.an & 2) != 0;
    }

    @Override
    public int getY() {
        return this.xZ;
    }

    public io_2 et(int n) {
        this.an |= 2;
        this.xZ = n;
        this.onChanged();
        return this;
    }

    public io_2 NZ() {
        this.an &= 0xFFFFFFFD;
        this.xZ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean NM() {
        return (this.an & 4) != 0;
    }

    @Override
    public int NN() {
        return this.yb;
    }

    public io_2 eu(int n) {
        this.an |= 4;
        this.yb = n;
        this.onChanged();
        return this;
    }

    public io_2 Oa() {
        this.an &= 0xFFFFFFFB;
        this.yb = 0;
        this.onChanged();
        return this;
    }

    public final io_2 cW(UnknownFieldSet unknownFieldSet) {
        return (io_2)super.setUnknownFields(unknownFieldSet);
    }

    public final io_2 cX(UnknownFieldSet unknownFieldSet) {
        return (io_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cX(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cW(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cX(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aY(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aY(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aY(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cW(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.NU();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.NX();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cX(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eW(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aY(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.NU();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aY(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.NX();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cX(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cW(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cX(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aY(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aY(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aY(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cW(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eW(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.NX();
    }

    public /* synthetic */ Message buildPartial() {
        return this.NW();
    }

    public /* synthetic */ Message build() {
        return this.NV();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aY(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.NU();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eW(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.NX();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.NW();
    }

    public /* synthetic */ MessageLite build() {
        return this.NV();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.NU();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.NS();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.NS();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eW(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.NX();
    }

    public /* synthetic */ Object clone() {
        return this.NX();
    }
}

