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
 * Renamed from Md
 */
public final class md_2
extends GeneratedMessageV3.Builder<md_2>
implements me_2 {
    private int an;
    private Object aRJ = "";
    private Object aRL = "";
    private int ni;

    public static final Descriptors.Descriptor aTR() {
        return ma_2.aRD;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ma_2.aRE.ensureFieldAccessorsInitialized(mb_2.class, md_2.class);
    }

    md_2() {
        this.D();
    }

    md_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (mb_2.aJ()) {
            // empty if block
        }
    }

    public md_2 aTS() {
        super.clear();
        this.aRJ = "";
        this.an &= 0xFFFFFFFE;
        this.aRL = "";
        this.an &= 0xFFFFFFFD;
        this.ni = 0;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ma_2.aRD;
    }

    public mb_2 aTQ() {
        return mb_2.aTP();
    }

    public mb_2 aTT() {
        mb_2 mb_22 = this.aTU();
        if (!mb_22.isInitialized()) {
            throw md_2.newUninitializedMessageException((Message)mb_22);
        }
        return mb_22;
    }

    public mb_2 aTU() {
        mb_2 mb_22 = new mb_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            n2 |= 1;
        }
        mb_22.aRJ = this.aRJ;
        if ((n & 2) != 0) {
            n2 |= 2;
        }
        mb_22.aRL = this.aRL;
        if ((n & 4) != 0) {
            mb_22.ni = this.ni;
            n2 |= 4;
        }
        mb_22.an = n2;
        this.onBuilt();
        return mb_22;
    }

    public md_2 aTV() {
        return (md_2)super.clone();
    }

    public md_2 gI(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (md_2)super.setField(fieldDescriptor, object);
    }

    public md_2 cR(Descriptors.FieldDescriptor fieldDescriptor) {
        return (md_2)super.clearField(fieldDescriptor);
    }

    public md_2 cR(Descriptors.OneofDescriptor oneofDescriptor) {
        return (md_2)super.clearOneof(oneofDescriptor);
    }

    public md_2 cR(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (md_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public md_2 gJ(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (md_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public md_2 cR(Message message) {
        if (message instanceof mb_2) {
            return this.c((mb_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public md_2 c(mb_2 mb_22) {
        if (mb_22 == mb_2.aTP()) {
            return this;
        }
        if (mb_22.aTG()) {
            this.an |= 1;
            this.aRJ = mb_22.aRJ;
            this.onChanged();
        }
        if (mb_22.aTJ()) {
            this.an |= 2;
            this.aRL = mb_22.aRL;
            this.onChanged();
        }
        if (mb_22.vX()) {
            this.nA(mb_22.vY());
        }
        this.gJ(mb_2.b(mb_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.aTG()) {
            return false;
        }
        if (!this.aTJ()) {
            return false;
        }
        return this.vX();
    }

    public md_2 kB(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mb_2 mb_22 = null;
        try {
            mb_22 = (mb_2)mb_2.aRO.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mb_22 = (mb_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mb_22 != null) {
                this.c(mb_22);
            }
        }
        return this;
    }

    @Override
    public boolean aTG() {
        return (this.an & 1) != 0;
    }

    @Override
    public String aTH() {
        Object object = this.aRJ;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.aRJ = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString aTI() {
        Object object = this.aRJ;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.aRJ = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public md_2 cF(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 1;
        this.aRJ = string;
        this.onChanged();
        return this;
    }

    public md_2 aTW() {
        this.an &= 0xFFFFFFFE;
        this.aRJ = mb_2.aTP().aTH();
        this.onChanged();
        return this;
    }

    public md_2 ex(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 1;
        this.aRJ = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aTJ() {
        return (this.an & 2) != 0;
    }

    @Override
    public String aTK() {
        Object object = this.aRL;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.aRL = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString aTL() {
        Object object = this.aRL;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.aRL = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public md_2 cG(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.aRL = string;
        this.onChanged();
        return this;
    }

    public md_2 aTX() {
        this.an &= 0xFFFFFFFD;
        this.aRL = mb_2.aTP().aTK();
        this.onChanged();
        return this;
    }

    public md_2 ey(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.aRL = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean vX() {
        return (this.an & 4) != 0;
    }

    @Override
    public int vY() {
        return this.ni;
    }

    public md_2 nA(int n) {
        this.an |= 4;
        this.ni = n;
        this.onChanged();
        return this;
    }

    public md_2 aTY() {
        this.an &= 0xFFFFFFFB;
        this.ni = 0;
        this.onChanged();
        return this;
    }

    public final md_2 gI(UnknownFieldSet unknownFieldSet) {
        return (md_2)super.setUnknownFields(unknownFieldSet);
    }

    public final md_2 gJ(UnknownFieldSet unknownFieldSet) {
        return (md_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gJ(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gI(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gJ(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cR(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cR(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cR(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gI(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aTS();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aTV();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gJ(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kB(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cR(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aTS();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cR(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aTV();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gJ(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gI(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gJ(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cR(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cR(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cR(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gI(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kB(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aTV();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aTU();
    }

    public /* synthetic */ Message build() {
        return this.aTT();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cR(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aTS();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kB(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aTV();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aTU();
    }

    public /* synthetic */ MessageLite build() {
        return this.aTT();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aTS();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aTQ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aTQ();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kB(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aTV();
    }

    public /* synthetic */ Object clone() {
        return this.aTV();
    }
}

