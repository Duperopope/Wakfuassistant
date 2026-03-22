/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UninitializedMessageException
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from ly
 */
public final class ly_1
extends GeneratedMessageV3
implements lB {
    private static final long Ii = 0L;
    int an;
    public static final int Ij = 1;
    int HZ;
    public static final int Ik = 2;
    volatile Object bs;
    public static final int Il = 3;
    int Im;
    public static final int In = 4;
    int Io;
    public static final int Ip = 5;
    int Iq;
    public static final int Ir = 6;
    int Is;
    public static final int It = 7;
    long Iu;
    public static final int Iv = 8;
    long Iw;
    public static final int Ix = 9;
    int Iy;
    public static final int Iz = 10;
    long IA;
    private byte Y = (byte)-1;
    private static final ly_1 IB = new ly_1();
    @Deprecated
    public static final Parser<ly_1> IC = new lz();

    ly_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ly_1() {
        this.bs = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ly_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ly_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block20: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block20;
                    }
                    case 8: {
                        this.an |= 1;
                        this.HZ = codedInputStream.readInt32();
                        continue block20;
                    }
                    case 18: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 2;
                        this.bs = byteString;
                        continue block20;
                    }
                    case 24: {
                        this.an |= 4;
                        this.Im = codedInputStream.readInt32();
                        continue block20;
                    }
                    case 32: {
                        this.an |= 8;
                        this.Io = codedInputStream.readInt32();
                        continue block20;
                    }
                    case 40: {
                        this.an |= 0x10;
                        this.Iq = codedInputStream.readInt32();
                        continue block20;
                    }
                    case 48: {
                        this.an |= 0x20;
                        this.Is = codedInputStream.readInt32();
                        continue block20;
                    }
                    case 56: {
                        this.an |= 0x40;
                        this.Iu = codedInputStream.readInt64();
                        continue block20;
                    }
                    case 64: {
                        this.an |= 0x80;
                        this.Iw = codedInputStream.readInt64();
                        continue block20;
                    }
                    case 72: {
                        this.an |= 0x100;
                        this.Iy = codedInputStream.readInt32();
                        continue block20;
                    }
                    case 80: {
                        this.an |= 0x200;
                        this.IA = codedInputStream.readInt64();
                        continue block20;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl2 = true;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (UninitializedMessageException uninitializedMessageException) {
            throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor agG() {
        return kF.FQ;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.FR.ensureFieldAccessorsInitialized(ly_1.class, la_0.class);
    }

    @Override
    public boolean age() {
        return (this.an & 1) != 0;
    }

    @Override
    public int agf() {
        return this.HZ;
    }

    @Override
    public boolean wq() {
        return (this.an & 2) != 0;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.bs = string;
        }
        return string;
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

    @Override
    public boolean agH() {
        return (this.an & 4) != 0;
    }

    @Override
    public int agI() {
        return this.Im;
    }

    @Override
    public boolean agJ() {
        return (this.an & 8) != 0;
    }

    @Override
    public int agK() {
        return this.Io;
    }

    @Override
    public boolean agL() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int agM() {
        return this.Iq;
    }

    @Override
    public boolean pe() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public int agN() {
        return this.Is;
    }

    @Override
    public boolean agO() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public long agP() {
        return this.Iu;
    }

    @Override
    public boolean agQ() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public long agR() {
        return this.Iw;
    }

    @Override
    public boolean agS() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public int agT() {
        return this.Iy;
    }

    @Override
    public boolean agU() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public long agV() {
        return this.IA;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.age()) {
            this.Y = 0;
            return false;
        }
        if (!this.wq()) {
            this.Y = 0;
            return false;
        }
        if (!this.agH()) {
            this.Y = 0;
            return false;
        }
        if (!this.agJ()) {
            this.Y = 0;
            return false;
        }
        if (!this.agL()) {
            this.Y = 0;
            return false;
        }
        if (!this.pe()) {
            this.Y = 0;
            return false;
        }
        if (!this.agO()) {
            this.Y = 0;
            return false;
        }
        if (!this.agQ()) {
            this.Y = 0;
            return false;
        }
        if (!this.agS()) {
            this.Y = 0;
            return false;
        }
        if (!this.agU()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.HZ);
        }
        if ((this.an & 2) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.bs);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.Im);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(4, this.Io);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeInt32(5, this.Iq);
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeInt32(6, this.Is);
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeInt64(7, this.Iu);
        }
        if ((this.an & 0x80) != 0) {
            codedOutputStream.writeInt64(8, this.Iw);
        }
        if ((this.an & 0x100) != 0) {
            codedOutputStream.writeInt32(9, this.Iy);
        }
        if ((this.an & 0x200) != 0) {
            codedOutputStream.writeInt64(10, this.IA);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.HZ);
        }
        if ((this.an & 2) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.bs);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.Im);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.Io);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeInt32Size((int)5, (int)this.Iq);
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeInt32Size((int)6, (int)this.Is);
        }
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeInt64Size((int)7, (long)this.Iu);
        }
        if ((this.an & 0x80) != 0) {
            n += CodedOutputStream.computeInt64Size((int)8, (long)this.Iw);
        }
        if ((this.an & 0x100) != 0) {
            n += CodedOutputStream.computeInt32Size((int)9, (int)this.Iy);
        }
        if ((this.an & 0x200) != 0) {
            n += CodedOutputStream.computeInt64Size((int)10, (long)this.IA);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ly_1)) {
            return super.equals(object);
        }
        ly_1 ly_12 = (ly_1)object;
        if (this.age() != ly_12.age()) {
            return false;
        }
        if (this.age() && this.agf() != ly_12.agf()) {
            return false;
        }
        if (this.wq() != ly_12.wq()) {
            return false;
        }
        if (this.wq() && !this.getName().equals(ly_12.getName())) {
            return false;
        }
        if (this.agH() != ly_12.agH()) {
            return false;
        }
        if (this.agH() && this.agI() != ly_12.agI()) {
            return false;
        }
        if (this.agJ() != ly_12.agJ()) {
            return false;
        }
        if (this.agJ() && this.agK() != ly_12.agK()) {
            return false;
        }
        if (this.agL() != ly_12.agL()) {
            return false;
        }
        if (this.agL() && this.agM() != ly_12.agM()) {
            return false;
        }
        if (this.pe() != ly_12.pe()) {
            return false;
        }
        if (this.pe() && this.agN() != ly_12.agN()) {
            return false;
        }
        if (this.agO() != ly_12.agO()) {
            return false;
        }
        if (this.agO() && this.agP() != ly_12.agP()) {
            return false;
        }
        if (this.agQ() != ly_12.agQ()) {
            return false;
        }
        if (this.agQ() && this.agR() != ly_12.agR()) {
            return false;
        }
        if (this.agS() != ly_12.agS()) {
            return false;
        }
        if (this.agS() && this.agT() != ly_12.agT()) {
            return false;
        }
        if (this.agU() != ly_12.agU()) {
            return false;
        }
        if (this.agU() && this.agV() != ly_12.agV()) {
            return false;
        }
        return this.unknownFields.equals((Object)ly_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ly_1.agG().hashCode();
        if (this.age()) {
            n = 37 * n + 1;
            n = 53 * n + this.agf();
        }
        if (this.wq()) {
            n = 37 * n + 2;
            n = 53 * n + this.getName().hashCode();
        }
        if (this.agH()) {
            n = 37 * n + 3;
            n = 53 * n + this.agI();
        }
        if (this.agJ()) {
            n = 37 * n + 4;
            n = 53 * n + this.agK();
        }
        if (this.agL()) {
            n = 37 * n + 5;
            n = 53 * n + this.agM();
        }
        if (this.pe()) {
            n = 37 * n + 6;
            n = 53 * n + this.agN();
        }
        if (this.agO()) {
            n = 37 * n + 7;
            n = 53 * n + Internal.hashLong((long)this.agP());
        }
        if (this.agQ()) {
            n = 37 * n + 8;
            n = 53 * n + Internal.hashLong((long)this.agR());
        }
        if (this.agS()) {
            n = 37 * n + 9;
            n = 53 * n + this.agT();
        }
        if (this.agU()) {
            n = 37 * n + 10;
            n = 53 * n + Internal.hashLong((long)this.agV());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ly_1 bQ(ByteBuffer byteBuffer) {
        return (ly_1)IC.parseFrom(byteBuffer);
    }

    public static ly_1 bM(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ly_1)IC.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ly_1 cV(ByteString byteString) {
        return (ly_1)IC.parseFrom(byteString);
    }

    public static ly_1 bM(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ly_1)IC.parseFrom(byteString, extensionRegistryLite);
    }

    public static ly_1 bN(byte[] byArray) {
        return (ly_1)IC.parseFrom(byArray);
    }

    public static ly_1 bM(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ly_1)IC.parseFrom(byArray, extensionRegistryLite);
    }

    public static ly_1 ey(InputStream inputStream) {
        return (ly_1)GeneratedMessageV3.parseWithIOException(IC, (InputStream)inputStream);
    }

    public static ly_1 ey(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ly_1)GeneratedMessageV3.parseWithIOException(IC, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ly_1 ez(InputStream inputStream) {
        return (ly_1)GeneratedMessageV3.parseDelimitedWithIOException(IC, (InputStream)inputStream);
    }

    public static ly_1 ez(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ly_1)GeneratedMessageV3.parseDelimitedWithIOException(IC, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ly_1 bM(CodedInputStream codedInputStream) {
        return (ly_1)GeneratedMessageV3.parseWithIOException(IC, (CodedInputStream)codedInputStream);
    }

    public static ly_1 hk(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ly_1)GeneratedMessageV3.parseWithIOException(IC, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public la_0 agW() {
        return ly_1.agX();
    }

    public static la_0 agX() {
        return IB.agY();
    }

    public static la_0 c(ly_1 ly_12) {
        return IB.agY().e(ly_12);
    }

    public la_0 agY() {
        return this == IB ? new la_0() : new la_0().e(this);
    }

    protected la_0 bM(GeneratedMessageV3.BuilderParent builderParent) {
        la_0 la_02 = new la_0(builderParent);
        return la_02;
    }

    public static ly_1 agZ() {
        return IB;
    }

    public static Parser<ly_1> z() {
        return IC;
    }

    public Parser<ly_1> getParserForType() {
        return IC;
    }

    public ly_1 aha() {
        return IB;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bM(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.agY();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.agW();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.agY();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.agW();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aha();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aha();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(ly_1 ly_12) {
        return ly_12.unknownFields;
    }
}

