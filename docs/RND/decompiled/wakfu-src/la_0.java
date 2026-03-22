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
 * Renamed from lA
 */
public final class la_0
extends GeneratedMessageV3.Builder<la_0>
implements lB {
    private int an;
    private int HZ;
    private Object bs = "";
    private int Im;
    private int Io;
    private int Iq;
    private int Is;
    private long Iu;
    private long Iw;
    private int Iy;
    private long IA;

    public static final Descriptors.Descriptor ahb() {
        return kF.FQ;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.FR.ensureFieldAccessorsInitialized(ly_1.class, la_0.class);
    }

    la_0() {
        this.D();
    }

    la_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ly_1.fa()) {
            // empty if block
        }
    }

    public la_0 ahc() {
        super.clear();
        this.HZ = 0;
        this.an &= 0xFFFFFFFE;
        this.bs = "";
        this.an &= 0xFFFFFFFD;
        this.Im = 0;
        this.an &= 0xFFFFFFFB;
        this.Io = 0;
        this.an &= 0xFFFFFFF7;
        this.Iq = 0;
        this.an &= 0xFFFFFFEF;
        this.Is = 0;
        this.an &= 0xFFFFFFDF;
        this.Iu = 0L;
        this.an &= 0xFFFFFFBF;
        this.Iw = 0L;
        this.an &= 0xFFFFFF7F;
        this.Iy = 0;
        this.an &= 0xFFFFFEFF;
        this.IA = 0L;
        this.an &= 0xFFFFFDFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kF.FQ;
    }

    public ly_1 aha() {
        return ly_1.agZ();
    }

    public ly_1 ahd() {
        ly_1 ly_12 = this.ahe();
        if (!ly_12.isInitialized()) {
            throw la_0.newUninitializedMessageException((Message)ly_12);
        }
        return ly_12;
    }

    public ly_1 ahe() {
        ly_1 ly_12 = new ly_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            ly_12.HZ = this.HZ;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            n2 |= 2;
        }
        ly_12.bs = this.bs;
        if ((n & 4) != 0) {
            ly_12.Im = this.Im;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            ly_12.Io = this.Io;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            ly_12.Iq = this.Iq;
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            ly_12.Is = this.Is;
            n2 |= 0x20;
        }
        if ((n & 0x40) != 0) {
            ly_12.Iu = this.Iu;
            n2 |= 0x40;
        }
        if ((n & 0x80) != 0) {
            ly_12.Iw = this.Iw;
            n2 |= 0x80;
        }
        if ((n & 0x100) != 0) {
            ly_12.Iy = this.Iy;
            n2 |= 0x100;
        }
        if ((n & 0x200) != 0) {
            ly_12.IA = this.IA;
            n2 |= 0x200;
        }
        ly_12.an = n2;
        this.onBuilt();
        return ly_12;
    }

    public la_0 ahf() {
        return (la_0)super.clone();
    }

    public la_0 ey(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (la_0)super.setField(fieldDescriptor, object);
    }

    public la_0 bM(Descriptors.FieldDescriptor fieldDescriptor) {
        return (la_0)super.clearField(fieldDescriptor);
    }

    public la_0 bM(Descriptors.OneofDescriptor oneofDescriptor) {
        return (la_0)super.clearOneof(oneofDescriptor);
    }

    public la_0 bM(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (la_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public la_0 ez(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (la_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public la_0 bM(Message message) {
        if (message instanceof ly_1) {
            return this.e((ly_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public la_0 e(ly_1 ly_12) {
        if (ly_12 == ly_1.agZ()) {
            return this;
        }
        if (ly_12.age()) {
            this.hl(ly_12.agf());
        }
        if (ly_12.wq()) {
            this.an |= 2;
            this.bs = ly_12.bs;
            this.onChanged();
        }
        if (ly_12.agH()) {
            this.hm(ly_12.agI());
        }
        if (ly_12.agJ()) {
            this.hn(ly_12.agK());
        }
        if (ly_12.agL()) {
            this.ho(ly_12.agM());
        }
        if (ly_12.pe()) {
            this.hp(ly_12.agN());
        }
        if (ly_12.agO()) {
            this.aZ(ly_12.agP());
        }
        if (ly_12.agQ()) {
            this.ba(ly_12.agR());
        }
        if (ly_12.agS()) {
            this.hq(ly_12.agT());
        }
        if (ly_12.agU()) {
            this.bb(ly_12.agV());
        }
        this.ez(ly_1.d(ly_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.age()) {
            return false;
        }
        if (!this.wq()) {
            return false;
        }
        if (!this.agH()) {
            return false;
        }
        if (!this.agJ()) {
            return false;
        }
        if (!this.agL()) {
            return false;
        }
        if (!this.pe()) {
            return false;
        }
        if (!this.agO()) {
            return false;
        }
        if (!this.agQ()) {
            return false;
        }
        if (!this.agS()) {
            return false;
        }
        return this.agU();
    }

    public la_0 hm(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ly_1 ly_12 = null;
        try {
            ly_12 = (ly_1)ly_1.IC.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ly_12 = (ly_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ly_12 != null) {
                this.e(ly_12);
            }
        }
        return this;
    }

    @Override
    public boolean age() {
        return (this.an & 1) != 0;
    }

    @Override
    public int agf() {
        return this.HZ;
    }

    public la_0 hl(int n) {
        this.an |= 1;
        this.HZ = n;
        this.onChanged();
        return this;
    }

    public la_0 ahg() {
        this.an &= 0xFFFFFFFE;
        this.HZ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean wq() {
        return (this.an & 2) != 0;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.bs = string;
            }
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

    public la_0 Q(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.bs = string;
        this.onChanged();
        return this;
    }

    public la_0 ahh() {
        this.an &= 0xFFFFFFFD;
        this.bs = ly_1.agZ().getName();
        this.onChanged();
        return this;
    }

    public la_0 cW(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.bs = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean agH() {
        return (this.an & 4) != 0;
    }

    @Override
    public int agI() {
        return this.Im;
    }

    public la_0 hm(int n) {
        this.an |= 4;
        this.Im = n;
        this.onChanged();
        return this;
    }

    public la_0 ahi() {
        this.an &= 0xFFFFFFFB;
        this.Im = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean agJ() {
        return (this.an & 8) != 0;
    }

    @Override
    public int agK() {
        return this.Io;
    }

    public la_0 hn(int n) {
        this.an |= 8;
        this.Io = n;
        this.onChanged();
        return this;
    }

    public la_0 ahj() {
        this.an &= 0xFFFFFFF7;
        this.Io = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean agL() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int agM() {
        return this.Iq;
    }

    public la_0 ho(int n) {
        this.an |= 0x10;
        this.Iq = n;
        this.onChanged();
        return this;
    }

    public la_0 ahk() {
        this.an &= 0xFFFFFFEF;
        this.Iq = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean pe() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public int agN() {
        return this.Is;
    }

    public la_0 hp(int n) {
        this.an |= 0x20;
        this.Is = n;
        this.onChanged();
        return this;
    }

    public la_0 ahl() {
        this.an &= 0xFFFFFFDF;
        this.Is = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean agO() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public long agP() {
        return this.Iu;
    }

    public la_0 aZ(long l) {
        this.an |= 0x40;
        this.Iu = l;
        this.onChanged();
        return this;
    }

    public la_0 ahm() {
        this.an &= 0xFFFFFFBF;
        this.Iu = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean agQ() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public long agR() {
        return this.Iw;
    }

    public la_0 ba(long l) {
        this.an |= 0x80;
        this.Iw = l;
        this.onChanged();
        return this;
    }

    public la_0 ahn() {
        this.an &= 0xFFFFFF7F;
        this.Iw = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean agS() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public int agT() {
        return this.Iy;
    }

    public la_0 hq(int n) {
        this.an |= 0x100;
        this.Iy = n;
        this.onChanged();
        return this;
    }

    public la_0 aho() {
        this.an &= 0xFFFFFEFF;
        this.Iy = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean agU() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public long agV() {
        return this.IA;
    }

    public la_0 bb(long l) {
        this.an |= 0x200;
        this.IA = l;
        this.onChanged();
        return this;
    }

    public la_0 ahp() {
        this.an &= 0xFFFFFDFF;
        this.IA = 0L;
        this.onChanged();
        return this;
    }

    public final la_0 ey(UnknownFieldSet unknownFieldSet) {
        return (la_0)super.setUnknownFields(unknownFieldSet);
    }

    public final la_0 ez(UnknownFieldSet unknownFieldSet) {
        return (la_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ez(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ey(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ez(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bM(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bM(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bM(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ey(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.ahc();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.ahf();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ez(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hm(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bM(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.ahc();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bM(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.ahf();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ez(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ey(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ez(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bM(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bM(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bM(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ey(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hm(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.ahf();
    }

    public /* synthetic */ Message buildPartial() {
        return this.ahe();
    }

    public /* synthetic */ Message build() {
        return this.ahd();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bM(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.ahc();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hm(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.ahf();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.ahe();
    }

    public /* synthetic */ MessageLite build() {
        return this.ahd();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.ahc();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aha();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aha();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hm(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.ahf();
    }

    public /* synthetic */ Object clone() {
        return this.ahf();
    }
}

