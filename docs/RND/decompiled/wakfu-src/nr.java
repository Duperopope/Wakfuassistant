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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class nr
extends GeneratedMessageV3
implements nu {
    private static final long Nz = 0L;
    int an;
    public static final int NA = 1;
    long AH;
    public static final int NB = 2;
    volatile Object bs;
    public static final int NC = 3;
    volatile Object DP;
    public static final int ND = 4;
    volatile Object DR;
    public static final int NE = 5;
    int mj;
    public static final int NF = 6;
    long DM;
    public static final int NG = 7;
    List<nz> Ed;
    public static final int NH = 8;
    List<nv> Ef;
    private byte Y = (byte)-1;
    private static final nr NI = new nr();
    @Deprecated
    public static final Parser<nr> NJ = new ns();

    nr(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private nr() {
        this.bs = "";
        this.DP = "";
        this.DR = "";
        this.Ed = Collections.emptyList();
        this.Ef = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new nr();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    nr(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.AH = codedInputStream.readInt64();
                        continue block18;
                    }
                    case 18: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 2;
                        this.bs = byteString;
                        continue block18;
                    }
                    case 26: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 4;
                        this.DP = byteString;
                        continue block18;
                    }
                    case 34: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 8;
                        this.DR = byteString;
                        continue block18;
                    }
                    case 40: {
                        this.an |= 0x10;
                        this.mj = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 48: {
                        this.an |= 0x20;
                        this.DM = codedInputStream.readInt64();
                        continue block18;
                    }
                    case 58: {
                        if ((n & 0x40) == 0) {
                            this.Ed = new ArrayList<nz>();
                            n |= 0x40;
                        }
                        this.Ed.add((nz)codedInputStream.readMessage(nz.NY, extensionRegistryLite));
                        continue block18;
                    }
                    case 66: {
                        if ((n & 0x80) == 0) {
                            this.Ef = new ArrayList<nv>();
                            n |= 0x80;
                        }
                        this.Ef.add((nv)codedInputStream.readMessage(nv.NS, extensionRegistryLite));
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
            if ((n & 0x40) != 0) {
                this.Ed = Collections.unmodifiableList(this.Ed);
            }
            if ((n & 0x80) != 0) {
                this.Ef = Collections.unmodifiableList(this.Ef);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor apK() {
        return nq.Nt;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nq.Nu.ensureFieldAccessorsInitialized(nr.class, nt.class);
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Sn() {
        return this.AH;
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
    public boolean Yd() {
        return (this.an & 4) != 0;
    }

    @Override
    public String getDescription() {
        Object object = this.DP;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.DP = string;
        }
        return string;
    }

    @Override
    public ByteString Ye() {
        Object object = this.DP;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.DP = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean Q() {
        return (this.an & 8) != 0;
    }

    @Override
    public String getMessage() {
        Object object = this.DR;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.DR = string;
        }
        return string;
    }

    @Override
    public ByteString Yf() {
        Object object = this.DR;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.DR = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean tK() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    @Override
    public boolean Yb() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public long Yc() {
        return this.DM;
    }

    @Override
    public List<nz> Yq() {
        return this.Ed;
    }

    @Override
    public List<? extends nc_0> Yr() {
        return this.Ed;
    }

    @Override
    public int Ys() {
        return this.Ed.size();
    }

    @Override
    public nz jb(int n) {
        return this.Ed.get(n);
    }

    @Override
    public nc_0 jc(int n) {
        return this.Ed.get(n);
    }

    @Override
    public List<nv> Yt() {
        return this.Ef;
    }

    @Override
    public List<? extends ny> Yu() {
        return this.Ef;
    }

    @Override
    public int Yv() {
        return this.Ef.size();
    }

    @Override
    public nv jd(int n) {
        return this.Ef.get(n);
    }

    @Override
    public ny je(int n) {
        return this.Ef.get(n);
    }

    public final boolean isInitialized() {
        int n;
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.oN()) {
            this.Y = 0;
            return false;
        }
        if (!this.wq()) {
            this.Y = 0;
            return false;
        }
        if (!this.Yd()) {
            this.Y = 0;
            return false;
        }
        if (!this.Q()) {
            this.Y = 0;
            return false;
        }
        if (!this.tK()) {
            this.Y = 0;
            return false;
        }
        if (!this.Yb()) {
            this.Y = 0;
            return false;
        }
        for (n = 0; n < this.Ys(); ++n) {
            if (this.jb(n).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        for (n = 0; n < this.Yv(); ++n) {
            if (this.jd(n).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.AH);
        }
        if ((this.an & 2) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.bs);
        }
        if ((this.an & 4) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.DP);
        }
        if ((this.an & 8) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)4, (Object)this.DR);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeInt32(5, this.mj);
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeInt64(6, this.DM);
        }
        for (n = 0; n < this.Ed.size(); ++n) {
            codedOutputStream.writeMessage(7, (MessageLite)this.Ed.get(n));
        }
        for (n = 0; n < this.Ef.size(); ++n) {
            codedOutputStream.writeMessage(8, (MessageLite)this.Ef.get(n));
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
            n2 += CodedOutputStream.computeInt64Size((int)1, (long)this.AH);
        }
        if ((this.an & 2) != 0) {
            n2 += GeneratedMessageV3.computeStringSize((int)2, (Object)this.bs);
        }
        if ((this.an & 4) != 0) {
            n2 += GeneratedMessageV3.computeStringSize((int)3, (Object)this.DP);
        }
        if ((this.an & 8) != 0) {
            n2 += GeneratedMessageV3.computeStringSize((int)4, (Object)this.DR);
        }
        if ((this.an & 0x10) != 0) {
            n2 += CodedOutputStream.computeInt32Size((int)5, (int)this.mj);
        }
        if ((this.an & 0x20) != 0) {
            n2 += CodedOutputStream.computeInt64Size((int)6, (long)this.DM);
        }
        for (n = 0; n < this.Ed.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)7, (MessageLite)((MessageLite)this.Ed.get(n)));
        }
        for (n = 0; n < this.Ef.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)8, (MessageLite)((MessageLite)this.Ef.get(n)));
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof nr)) {
            return super.equals(object);
        }
        nr nr2 = (nr)object;
        if (this.oN() != nr2.oN()) {
            return false;
        }
        if (this.oN() && this.Sn() != nr2.Sn()) {
            return false;
        }
        if (this.wq() != nr2.wq()) {
            return false;
        }
        if (this.wq() && !this.getName().equals(nr2.getName())) {
            return false;
        }
        if (this.Yd() != nr2.Yd()) {
            return false;
        }
        if (this.Yd() && !this.getDescription().equals(nr2.getDescription())) {
            return false;
        }
        if (this.Q() != nr2.Q()) {
            return false;
        }
        if (this.Q() && !this.getMessage().equals(nr2.getMessage())) {
            return false;
        }
        if (this.tK() != nr2.tK()) {
            return false;
        }
        if (this.tK() && this.tL() != nr2.tL()) {
            return false;
        }
        if (this.Yb() != nr2.Yb()) {
            return false;
        }
        if (this.Yb() && this.Yc() != nr2.Yc()) {
            return false;
        }
        if (!this.Yq().equals(nr2.Yq())) {
            return false;
        }
        if (!this.Yt().equals(nr2.Yt())) {
            return false;
        }
        return this.unknownFields.equals((Object)nr2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + nr.apK().hashCode();
        if (this.oN()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Sn());
        }
        if (this.wq()) {
            n = 37 * n + 2;
            n = 53 * n + this.getName().hashCode();
        }
        if (this.Yd()) {
            n = 37 * n + 3;
            n = 53 * n + this.getDescription().hashCode();
        }
        if (this.Q()) {
            n = 37 * n + 4;
            n = 53 * n + this.getMessage().hashCode();
        }
        if (this.tK()) {
            n = 37 * n + 5;
            n = 53 * n + this.tL();
        }
        if (this.Yb()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashLong((long)this.Yc());
        }
        if (this.Ys() > 0) {
            n = 37 * n + 7;
            n = 53 * n + this.Yq().hashCode();
        }
        if (this.Yv() > 0) {
            n = 37 * n + 8;
            n = 53 * n + this.Yt().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static nr cj(ByteBuffer byteBuffer) {
        return (nr)NJ.parseFrom(byteBuffer);
    }

    public static nr cf(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (nr)NJ.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static nr du(ByteString byteString) {
        return (nr)NJ.parseFrom(byteString);
    }

    public static nr cf(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (nr)NJ.parseFrom(byteString, extensionRegistryLite);
    }

    public static nr ch(byte[] byArray) {
        return (nr)NJ.parseFrom(byArray);
    }

    public static nr cf(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (nr)NJ.parseFrom(byArray, extensionRegistryLite);
    }

    public static nr fk(InputStream inputStream) {
        return (nr)GeneratedMessageV3.parseWithIOException(NJ, (InputStream)inputStream);
    }

    public static nr fk(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nr)GeneratedMessageV3.parseWithIOException(NJ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static nr fl(InputStream inputStream) {
        return (nr)GeneratedMessageV3.parseDelimitedWithIOException(NJ, (InputStream)inputStream);
    }

    public static nr fl(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nr)GeneratedMessageV3.parseDelimitedWithIOException(NJ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static nr cf(CodedInputStream codedInputStream) {
        return (nr)GeneratedMessageV3.parseWithIOException(NJ, (CodedInputStream)codedInputStream);
    }

    public static nr ip(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nr)GeneratedMessageV3.parseWithIOException(NJ, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public nt apL() {
        return nr.apM();
    }

    public static nt apM() {
        return NI.apN();
    }

    public static nt a(nr nr2) {
        return NI.apN().c(nr2);
    }

    public nt apN() {
        return this == NI ? new nt() : new nt().c(this);
    }

    protected nt cf(GeneratedMessageV3.BuilderParent builderParent) {
        nt nt2 = new nt(builderParent);
        return nt2;
    }

    public static nr apO() {
        return NI;
    }

    public static Parser<nr> z() {
        return NJ;
    }

    public Parser<nr> getParserForType() {
        return NJ;
    }

    public nr apP() {
        return NI;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cf(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.apN();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.apL();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.apN();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.apL();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.apP();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.apP();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(nr nr2) {
        return nr2.unknownFields;
    }
}

