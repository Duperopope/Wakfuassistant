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
 * Renamed from yW
 */
public final class yw_2
extends GeneratedMessageV3.Builder<yw_2>
implements yx_2 {
    private int an;
    private int amL;
    private int xX;
    private int xZ;

    public static final Descriptors.Descriptor awu() {
        return yp_2.amF;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return yp_2.amG.ensureFieldAccessorsInitialized(yu_2.class, yw_2.class);
    }

    yw_2() {
        this.D();
    }

    yw_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (yu_2.pT()) {
            // empty if block
        }
    }

    public yw_2 awv() {
        super.clear();
        this.amL = 0;
        this.an &= 0xFFFFFFFE;
        this.xX = 0;
        this.an &= 0xFFFFFFFD;
        this.xZ = 0;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return yp_2.amF;
    }

    public yu_2 awt() {
        return yu_2.aws();
    }

    public yu_2 aww() {
        yu_2 yu_22 = this.awx();
        if (!yu_22.isInitialized()) {
            throw yw_2.newUninitializedMessageException((Message)yu_22);
        }
        return yu_22;
    }

    public yu_2 awx() {
        yu_2 yu_22 = new yu_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            yu_22.amL = this.amL;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            yu_22.xX = this.xX;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            yu_22.xZ = this.xZ;
            n2 |= 4;
        }
        yu_22.an = n2;
        this.onBuilt();
        return yu_22;
    }

    public yw_2 awy() {
        return (yw_2)super.clone();
    }

    public yw_2 fM(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (yw_2)super.setField(fieldDescriptor, object);
    }

    public yw_2 ct(Descriptors.FieldDescriptor fieldDescriptor) {
        return (yw_2)super.clearField(fieldDescriptor);
    }

    public yw_2 ct(Descriptors.OneofDescriptor oneofDescriptor) {
        return (yw_2)super.clearOneof(oneofDescriptor);
    }

    public yw_2 ct(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (yw_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public yw_2 fN(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (yw_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public yw_2 ct(Message message) {
        if (message instanceof yu_2) {
            return this.c((yu_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public yw_2 c(yu_2 yu_22) {
        if (yu_22 == yu_2.aws()) {
            return this;
        }
        if (yu_22.avY()) {
            this.jX(yu_22.avZ());
        }
        if (yu_22.NK()) {
            this.jY(yu_22.getX());
        }
        if (yu_22.NL()) {
            this.jZ(yu_22.getY());
        }
        this.fN(yu_2.b(yu_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.avY()) {
            return false;
        }
        if (!this.NK()) {
            return false;
        }
        return this.NL();
    }

    public yw_2 jh(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        yu_2 yu_22 = null;
        try {
            yu_22 = (yu_2)yu_2.amV.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            yu_22 = (yu_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (yu_22 != null) {
                this.c(yu_22);
            }
        }
        return this;
    }

    @Override
    public boolean avY() {
        return (this.an & 1) != 0;
    }

    @Override
    public int avZ() {
        return this.amL;
    }

    public yw_2 jX(int n) {
        this.an |= 1;
        this.amL = n;
        this.onChanged();
        return this;
    }

    public yw_2 awz() {
        this.an &= 0xFFFFFFFE;
        this.amL = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean NK() {
        return (this.an & 2) != 0;
    }

    @Override
    public int getX() {
        return this.xX;
    }

    public yw_2 jY(int n) {
        this.an |= 2;
        this.xX = n;
        this.onChanged();
        return this;
    }

    public yw_2 awA() {
        this.an &= 0xFFFFFFFD;
        this.xX = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean NL() {
        return (this.an & 4) != 0;
    }

    @Override
    public int getY() {
        return this.xZ;
    }

    public yw_2 jZ(int n) {
        this.an |= 4;
        this.xZ = n;
        this.onChanged();
        return this;
    }

    public yw_2 awB() {
        this.an &= 0xFFFFFFFB;
        this.xZ = 0;
        this.onChanged();
        return this;
    }

    public final yw_2 fM(UnknownFieldSet unknownFieldSet) {
        return (yw_2)super.setUnknownFields(unknownFieldSet);
    }

    public final yw_2 fN(UnknownFieldSet unknownFieldSet) {
        return (yw_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fN(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fM(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fN(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ct(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ct(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ct(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fM(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.awv();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.awy();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fN(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jh(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ct(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.awv();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ct(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.awy();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fN(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fM(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fN(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ct(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ct(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ct(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fM(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jh(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.awy();
    }

    public /* synthetic */ Message buildPartial() {
        return this.awx();
    }

    public /* synthetic */ Message build() {
        return this.aww();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ct(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.awv();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jh(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.awy();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.awx();
    }

    public /* synthetic */ MessageLite build() {
        return this.aww();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.awv();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.awt();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.awt();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jh(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.awy();
    }

    public /* synthetic */ Object clone() {
        return this.awy();
    }
}

