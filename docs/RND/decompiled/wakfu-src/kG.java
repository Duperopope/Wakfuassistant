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
 *  com.google.protobuf.Internal$LongList
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class kG
extends GeneratedMessageV3
implements kN {
    private static final long Gu = 0L;
    int an;
    public static final int Gv = 1;
    long wX;
    public static final int Gw = 2;
    int Gx;
    public static final int Gy = 3;
    int ws;
    public static final int Gz = 5;
    int GA;
    public static final int GB = 6;
    List<kJ> jj;
    public static final int GC = 7;
    Internal.LongList GD;
    public static final int GE = 8;
    int GF;
    private byte Y = (byte)-1;
    private static final kG GG = new kG();
    @Deprecated
    public static final Parser<kG> GH = new kH();

    kG(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private kG() {
        this.jj = Collections.emptyList();
        this.GD = kG.emptyLongList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new kG();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    kG(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block18: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block18;
                    }
                    case 8: {
                        this.an |= 1;
                        this.wX = codedInputStream.readInt64();
                        continue block18;
                    }
                    case 16: {
                        this.an |= 2;
                        this.Gx = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 24: {
                        this.an |= 4;
                        this.ws = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 40: {
                        this.an |= 8;
                        this.GA = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 50: {
                        if ((n & 0x10) == 0) {
                            this.jj = new ArrayList<kJ>();
                            n |= 0x10;
                        }
                        this.jj.add((kJ)codedInputStream.readMessage(kJ.GM, extensionRegistryLite));
                        continue block18;
                    }
                    case 56: {
                        if ((n & 0x20) == 0) {
                            this.GD = kG.newLongList();
                            n |= 0x20;
                        }
                        this.GD.addLong(codedInputStream.readInt64());
                        continue block18;
                    }
                    case 58: {
                        int n3 = codedInputStream.readRawVarint32();
                        int n4 = codedInputStream.pushLimit(n3);
                        if ((n & 0x20) == 0 && codedInputStream.getBytesUntilLimit() > 0) {
                            this.GD = kG.newLongList();
                            n |= 0x20;
                        }
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.GD.addLong(codedInputStream.readInt64());
                        }
                        codedInputStream.popLimit(n4);
                        continue block18;
                    }
                    case 64: {
                        this.an |= 0x10;
                        this.GF = codedInputStream.readInt32();
                        continue block18;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue;
                bl = true;
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
            if ((n & 0x10) != 0) {
                this.jj = Collections.unmodifiableList(this.jj);
            }
            if ((n & 0x20) != 0) {
                this.GD.makeImmutable();
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor acq() {
        return kF.Gk;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gl.ensureFieldAccessorsInitialized(kG.class, kI.class);
    }

    @Override
    public boolean LU() {
        return (this.an & 1) != 0;
    }

    @Override
    public long LV() {
        return this.wX;
    }

    @Override
    public boolean acr() {
        return (this.an & 2) != 0;
    }

    @Override
    public int acs() {
        return this.Gx;
    }

    @Override
    public boolean Ly() {
        return (this.an & 4) != 0;
    }

    @Override
    public int Lz() {
        return this.ws;
    }

    @Override
    public boolean act() {
        return (this.an & 8) != 0;
    }

    @Override
    public int acu() {
        return this.GA;
    }

    @Override
    public List<kJ> ot() {
        return this.jj;
    }

    @Override
    public List<? extends kM> ou() {
        return this.jj;
    }

    @Override
    public int ov() {
        return this.jj.size();
    }

    @Override
    public kJ gk(int n) {
        return this.jj.get(n);
    }

    @Override
    public kM gl(int n) {
        return this.jj.get(n);
    }

    @Override
    public List<Long> acv() {
        return this.GD;
    }

    @Override
    public int acw() {
        return this.GD.size();
    }

    @Override
    public long gL(int n) {
        return this.GD.getLong(n);
    }

    @Override
    public boolean acx() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int acy() {
        return this.GF;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.LU()) {
            this.Y = 0;
            return false;
        }
        if (!this.acr()) {
            this.Y = 0;
            return false;
        }
        if (!this.Ly()) {
            this.Y = 0;
            return false;
        }
        if (!this.act()) {
            this.Y = 0;
            return false;
        }
        for (int i = 0; i < this.ov(); ++i) {
            if (this.gk(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.wX);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.Gx);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.ws);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(5, this.GA);
        }
        for (n = 0; n < this.jj.size(); ++n) {
            codedOutputStream.writeMessage(6, (MessageLite)this.jj.get(n));
        }
        for (n = 0; n < this.GD.size(); ++n) {
            codedOutputStream.writeInt64(7, this.GD.getLong(n));
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeInt32(8, this.GF);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSize;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.an & 1) != 0) {
            n2 += CodedOutputStream.computeInt64Size((int)1, (long)this.wX);
        }
        if ((this.an & 2) != 0) {
            n2 += CodedOutputStream.computeInt32Size((int)2, (int)this.Gx);
        }
        if ((this.an & 4) != 0) {
            n2 += CodedOutputStream.computeInt32Size((int)3, (int)this.ws);
        }
        if ((this.an & 8) != 0) {
            n2 += CodedOutputStream.computeInt32Size((int)5, (int)this.GA);
        }
        for (n = 0; n < this.jj.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)6, (MessageLite)((MessageLite)this.jj.get(n)));
        }
        n = 0;
        for (int i = 0; i < this.GD.size(); ++i) {
            n += CodedOutputStream.computeInt64SizeNoTag((long)this.GD.getLong(i));
        }
        n2 += n;
        n2 += 1 * this.acv().size();
        if ((this.an & 0x10) != 0) {
            n2 += CodedOutputStream.computeInt32Size((int)8, (int)this.GF);
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof kG)) {
            return super.equals(object);
        }
        kG kG2 = (kG)object;
        if (this.LU() != kG2.LU()) {
            return false;
        }
        if (this.LU() && this.LV() != kG2.LV()) {
            return false;
        }
        if (this.acr() != kG2.acr()) {
            return false;
        }
        if (this.acr() && this.acs() != kG2.acs()) {
            return false;
        }
        if (this.Ly() != kG2.Ly()) {
            return false;
        }
        if (this.Ly() && this.Lz() != kG2.Lz()) {
            return false;
        }
        if (this.act() != kG2.act()) {
            return false;
        }
        if (this.act() && this.acu() != kG2.acu()) {
            return false;
        }
        if (!this.ot().equals(kG2.ot())) {
            return false;
        }
        if (!this.acv().equals(kG2.acv())) {
            return false;
        }
        if (this.acx() != kG2.acx()) {
            return false;
        }
        if (this.acx() && this.acy() != kG2.acy()) {
            return false;
        }
        return this.unknownFields.equals((Object)kG2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + kG.acq().hashCode();
        if (this.LU()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.LV());
        }
        if (this.acr()) {
            n = 37 * n + 2;
            n = 53 * n + this.acs();
        }
        if (this.Ly()) {
            n = 37 * n + 3;
            n = 53 * n + this.Lz();
        }
        if (this.act()) {
            n = 37 * n + 5;
            n = 53 * n + this.acu();
        }
        if (this.ov() > 0) {
            n = 37 * n + 6;
            n = 53 * n + this.ot().hashCode();
        }
        if (this.acw() > 0) {
            n = 37 * n + 7;
            n = 53 * n + this.acv().hashCode();
        }
        if (this.acx()) {
            n = 37 * n + 8;
            n = 53 * n + this.acy();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static kG bF(ByteBuffer byteBuffer) {
        return (kG)GH.parseFrom(byteBuffer);
    }

    public static kG bB(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (kG)GH.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static kG cK(ByteString byteString) {
        return (kG)GH.parseFrom(byteString);
    }

    public static kG bB(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (kG)GH.parseFrom(byteString, extensionRegistryLite);
    }

    public static kG bC(byte[] byArray) {
        return (kG)GH.parseFrom(byArray);
    }

    public static kG bB(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (kG)GH.parseFrom(byArray, extensionRegistryLite);
    }

    public static kG ec(InputStream inputStream) {
        return (kG)GeneratedMessageV3.parseWithIOException(GH, (InputStream)inputStream);
    }

    public static kG ec(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kG)GeneratedMessageV3.parseWithIOException(GH, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kG ed(InputStream inputStream) {
        return (kG)GeneratedMessageV3.parseDelimitedWithIOException(GH, (InputStream)inputStream);
    }

    public static kG ed(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kG)GeneratedMessageV3.parseDelimitedWithIOException(GH, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kG bB(CodedInputStream codedInputStream) {
        return (kG)GeneratedMessageV3.parseWithIOException(GH, (CodedInputStream)codedInputStream);
    }

    public static kG gD(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kG)GeneratedMessageV3.parseWithIOException(GH, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public kI acz() {
        return kG.acA();
    }

    public static kI acA() {
        return GG.acB();
    }

    public static kI a(kG kG2) {
        return GG.acB().c(kG2);
    }

    public kI acB() {
        return this == GG ? new kI() : new kI().c(this);
    }

    protected kI bB(GeneratedMessageV3.BuilderParent builderParent) {
        kI kI2 = new kI(builderParent);
        return kI2;
    }

    public static kG acC() {
        return GG;
    }

    public static Parser<kG> z() {
        return GH;
    }

    public Parser<kG> getParserForType() {
        return GH;
    }

    public kG acD() {
        return GG;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bB(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.acB();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.acz();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.acB();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.acz();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.acD();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.acD();
    }

    static /* synthetic */ boolean nU() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ Internal.LongList acE() {
        return kG.emptyLongList();
    }

    static /* synthetic */ boolean ok() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(kG kG2) {
        return kG2.unknownFields;
    }

    static /* synthetic */ Internal.LongList acF() {
        return kG.emptyLongList();
    }

    static /* synthetic */ Internal.LongList b(Internal.LongList longList) {
        return kG.mutableCopy((Internal.LongList)longList);
    }

    static /* synthetic */ Internal.LongList acG() {
        return kG.emptyLongList();
    }
}

