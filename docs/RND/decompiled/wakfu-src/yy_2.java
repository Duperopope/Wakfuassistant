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
 * Renamed from yY
 */
public final class yy_2
extends GeneratedMessageV3
implements zb_1 {
    private static final long amW = 0L;
    int an;
    public static final int amX = 1;
    int Gx;
    public static final int amY = 2;
    int xX;
    public static final int amZ = 3;
    int xZ;
    public static final int ana = 4;
    int yb;
    public static final int anb = 5;
    int anc;
    public static final int and = 6;
    boolean ane;
    public static final int anf = 7;
    long ang;
    public static final int anh = 8;
    int ani;
    private byte Y = (byte)-1;
    private static final yy_2 anj = new yy_2();
    @Deprecated
    public static final Parser<yy_2> ank = new yz_2();

    yy_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private yy_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new yy_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    yy_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block18: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block18;
                    }
                    case 8: {
                        this.an |= 1;
                        this.Gx = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 16: {
                        this.an |= 2;
                        this.xX = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 24: {
                        this.an |= 4;
                        this.xZ = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 32: {
                        this.an |= 8;
                        this.yb = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 40: {
                        this.an |= 0x10;
                        this.anc = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 48: {
                        this.an |= 0x20;
                        this.ane = codedInputStream.readBool();
                        continue block18;
                    }
                    case 56: {
                        this.an |= 0x40;
                        this.ang = codedInputStream.readInt64();
                        continue block18;
                    }
                    case 64: {
                        this.an |= 0x80;
                        this.ani = codedInputStream.readInt32();
                        continue block18;
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

    public static final Descriptors.Descriptor awC() {
        return yp_2.amD;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return yp_2.amE.ensureFieldAccessorsInitialized(yy_2.class, za_1.class);
    }

    @Override
    public boolean acr() {
        return (this.an & 1) != 0;
    }

    @Override
    public int acs() {
        return this.Gx;
    }

    @Override
    public boolean NK() {
        return (this.an & 2) != 0;
    }

    @Override
    public int getX() {
        return this.xX;
    }

    @Override
    public boolean NL() {
        return (this.an & 4) != 0;
    }

    @Override
    public int getY() {
        return this.xZ;
    }

    @Override
    public boolean NM() {
        return (this.an & 8) != 0;
    }

    @Override
    public int NN() {
        return this.yb;
    }

    @Override
    public boolean awD() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int awE() {
        return this.anc;
    }

    @Override
    public boolean awF() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public boolean awG() {
        return this.ane;
    }

    @Override
    public boolean awH() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public long awI() {
        return this.ang;
    }

    @Override
    public boolean awJ() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public int awK() {
        return this.ani;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.acr()) {
            this.Y = 0;
            return false;
        }
        if (!this.NK()) {
            this.Y = 0;
            return false;
        }
        if (!this.NL()) {
            this.Y = 0;
            return false;
        }
        if (!this.NM()) {
            this.Y = 0;
            return false;
        }
        if (!this.awD()) {
            this.Y = 0;
            return false;
        }
        if (!this.awF()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.Gx);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.xX);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.xZ);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(4, this.yb);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeInt32(5, this.anc);
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeBool(6, this.ane);
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeInt64(7, this.ang);
        }
        if ((this.an & 0x80) != 0) {
            codedOutputStream.writeInt32(8, this.ani);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.Gx);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.xX);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.xZ);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.yb);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeInt32Size((int)5, (int)this.anc);
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeBoolSize((int)6, (boolean)this.ane);
        }
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeInt64Size((int)7, (long)this.ang);
        }
        if ((this.an & 0x80) != 0) {
            n += CodedOutputStream.computeInt32Size((int)8, (int)this.ani);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof yy_2)) {
            return super.equals(object);
        }
        yy_2 yy_22 = (yy_2)object;
        if (this.acr() != yy_22.acr()) {
            return false;
        }
        if (this.acr() && this.acs() != yy_22.acs()) {
            return false;
        }
        if (this.NK() != yy_22.NK()) {
            return false;
        }
        if (this.NK() && this.getX() != yy_22.getX()) {
            return false;
        }
        if (this.NL() != yy_22.NL()) {
            return false;
        }
        if (this.NL() && this.getY() != yy_22.getY()) {
            return false;
        }
        if (this.NM() != yy_22.NM()) {
            return false;
        }
        if (this.NM() && this.NN() != yy_22.NN()) {
            return false;
        }
        if (this.awD() != yy_22.awD()) {
            return false;
        }
        if (this.awD() && this.awE() != yy_22.awE()) {
            return false;
        }
        if (this.awF() != yy_22.awF()) {
            return false;
        }
        if (this.awF() && this.awG() != yy_22.awG()) {
            return false;
        }
        if (this.awH() != yy_22.awH()) {
            return false;
        }
        if (this.awH() && this.awI() != yy_22.awI()) {
            return false;
        }
        if (this.awJ() != yy_22.awJ()) {
            return false;
        }
        if (this.awJ() && this.awK() != yy_22.awK()) {
            return false;
        }
        return this.unknownFields.equals((Object)yy_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + yy_2.awC().hashCode();
        if (this.acr()) {
            n = 37 * n + 1;
            n = 53 * n + this.acs();
        }
        if (this.NK()) {
            n = 37 * n + 2;
            n = 53 * n + this.getX();
        }
        if (this.NL()) {
            n = 37 * n + 3;
            n = 53 * n + this.getY();
        }
        if (this.NM()) {
            n = 37 * n + 4;
            n = 53 * n + this.NN();
        }
        if (this.awD()) {
            n = 37 * n + 5;
            n = 53 * n + this.awE();
        }
        if (this.awF()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashBoolean((boolean)this.awG());
        }
        if (this.awH()) {
            n = 37 * n + 7;
            n = 53 * n + Internal.hashLong((long)this.awI());
        }
        if (this.awJ()) {
            n = 37 * n + 8;
            n = 53 * n + this.awK();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static yy_2 eg(ByteBuffer byteBuffer) {
        return (yy_2)ank.parseFrom(byteBuffer);
    }

    public static yy_2 cu(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (yy_2)ank.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static yy_2 dV(ByteString byteString) {
        return (yy_2)ank.parseFrom(byteString);
    }

    public static yy_2 cu(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (yy_2)ank.parseFrom(byteString, extensionRegistryLite);
    }

    public static yy_2 cw(byte[] byArray) {
        return (yy_2)ank.parseFrom(byArray);
    }

    public static yy_2 cu(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (yy_2)ank.parseFrom(byArray, extensionRegistryLite);
    }

    public static yy_2 fO(InputStream inputStream) {
        return (yy_2)GeneratedMessageV3.parseWithIOException(ank, (InputStream)inputStream);
    }

    public static yy_2 fO(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (yy_2)GeneratedMessageV3.parseWithIOException(ank, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static yy_2 fP(InputStream inputStream) {
        return (yy_2)GeneratedMessageV3.parseDelimitedWithIOException(ank, (InputStream)inputStream);
    }

    public static yy_2 fP(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (yy_2)GeneratedMessageV3.parseDelimitedWithIOException(ank, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static yy_2 cu(CodedInputStream codedInputStream) {
        return (yy_2)GeneratedMessageV3.parseWithIOException(ank, (CodedInputStream)codedInputStream);
    }

    public static yy_2 ji(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (yy_2)GeneratedMessageV3.parseWithIOException(ank, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public za_1 awL() {
        return yy_2.awM();
    }

    public static za_1 awM() {
        return anj.awN();
    }

    public static za_1 a(yy_2 yy_22) {
        return anj.awN().c(yy_22);
    }

    public za_1 awN() {
        return this == anj ? new za_1() : new za_1().c(this);
    }

    protected za_1 cu(GeneratedMessageV3.BuilderParent builderParent) {
        za_1 za_12 = new za_1(builderParent);
        return za_12;
    }

    public static yy_2 awO() {
        return anj;
    }

    public static Parser<yy_2> z() {
        return ank;
    }

    public Parser<yy_2> getParserForType() {
        return ank;
    }

    public yy_2 awP() {
        return anj;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cu(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.awN();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.awL();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.awN();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.awL();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.awP();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.awP();
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(yy_2 yy_22) {
        return yy_22.unknownFields;
    }
}

